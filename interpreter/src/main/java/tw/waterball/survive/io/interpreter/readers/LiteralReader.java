package tw.waterball.survive.io.interpreter.readers;

import java.io.IOException;

/**
 * @author Waterball (johnny850807@gmail.com)
 */
public interface LiteralReader {

    /**
     * A keyword is a continuous string that only consists of following characters:
     * 1. alphabets (e.g. 'a', 'b')
     * 2. dashes ('-')
     * 3. underscores ('_')
     *
     * Example keywords: 'apple', 'apple_juice', 'orange-juice'
     *
     * @return the next keyword
     */
    String nextKeyword() throws IOException;

    /**
     * @return xml-like start tag, e.g. <frame>
     */
    String nextStartTag() throws IOException;

    /**
     * @return xml-like end tag, e.g. <frame/>
     */
    String nextEndTag() throws IOException;

    /**
     * @return white space, e.g. '\n\t  \n\t'
     */
    String nextWhiteSpaces() throws IOException;

    char nextChar() throws IOException;

    char peek() throws IOException;

    char getCurrentChar();

    int getCurrentPosition();

    int getCurrentRow();

    int getCurrentColumn();
}
