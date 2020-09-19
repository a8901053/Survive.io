package tw.waterball.survive.io.interpreter.impl;

import tw.waterball.survive.io.interpreter.readers.LiteralReader;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Waterball (johnny850807@gmail.com)
 */
public class StreamLiteralReader implements LiteralReader {
    private InputStreamReader in;
    private boolean peeking = false;
    private char currentPeek;
    private char currentChar;
    private int pos = 0;
    private int row = 0;
    private int col = 0;

    public StreamLiteralReader(InputStreamReader in) {
        this.in = in;
    }

    @Override
    public String nextKeyword() throws IOException {
        String nextKeyword = nextTokenThatConformsTheRules(
                Character::isAlphabetic,
                c -> c == '-',
                c -> c == '_'
        );

        nextWhiteSpaces();
        return nextKeyword;
    }

    // TODO
    @Override
    public String nextStartTag() throws IOException {
        return null;
    }

    // TODO
    @Override
    public String nextEndTag() throws IOException {
        return null;
    }

    @Override
    public String nextWhiteSpaces() throws IOException {
        try {
            return nextTokenThatConformsTheRules(Character::isWhitespace);
        } catch (EOFException ignored) {
            return "";
        }
    }

    @Override
    public char nextChar() throws IOException {
        if (peeking) {
            currentChar = getAndClearPeek();
        } else {
            currentChar = consumeNextCharInStream();
        }
        return currentChar;
    }

    private char getAndClearPeek() {
        peeking = false;
        char peek = currentPeek;
        currentPeek = '\0';
        return peek;
    }

    private char consumeNextCharInStream() throws IOException {
        int next = in.read();
        if (next == -1) {
            throw new EOFException();
        }
        pos++;
        col++;
        return (char) next;
    }

    private String nextTokenThatConformsTheRules(Rule... rules) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        try {
            while (isCharConformsRules(peek(), rules)) {
                stringBuilder.append(nextChar());
            }
        } catch (EOFException err) {
            if (stringBuilder.length() == 0) {
                throw err;
            }
        }
        return stringBuilder.toString();
    }

    private boolean isCharConformsRules(char c, Rule... rules) {
        return Arrays.stream(rules).anyMatch(r -> r.conform(c));
    }

    @FunctionalInterface
    public interface Rule {
        boolean conform(char c);
    }

    @Override
    public char peek() throws IOException {
        currentPeek = nextChar();
        peeking = true;
        return currentPeek;
    }

    @Override
    public char getCurrentChar() {
        return currentChar;
    }

    @Override
    public int getCurrentPosition() {
        return pos;
    }

    @Override
    public int getCurrentRow() {
        return row;
    }

    @Override
    public int getCurrentColumn() {
        return col;
    }
}
