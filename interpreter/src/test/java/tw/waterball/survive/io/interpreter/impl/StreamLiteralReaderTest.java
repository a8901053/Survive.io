package tw.waterball.survive.io.interpreter.impl;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.junit.Assert.*;

/**
 * TODO:
 *  - column / row / position calculation isn't strictly tested and implemented
 * @author Waterball (johnny850807@gmail.com)
 */
public class StreamLiteralReaderTest {
    private StreamLiteralReader literalReader;

    @Test
    public void givenText_Apple_whenNextChar3Times_shouldBe_A_p_p_respectively() throws IOException {
        givenText("Apple");

        assertSame('A', literalReader.nextChar());
        assertSame('p', literalReader.nextChar());
        assertSame('p', literalReader.nextChar());
    }

    @Test
    public void givenText_Apple_skip3Chars_whenGetCurrentChar_shouldBe_p() throws IOException {
        givenText("Apple");
        skipChar(3);
        assertSame('p', literalReader.getCurrentChar());
    }


    @Test
    public void givenText_Apple_skip3Chars_whenGetCurrentPosition_shouldBe3() throws IOException {
        givenText("Apple");
        skipChar(3);

        assertSame(3, literalReader.getCurrentPosition());
    }

    @Test
    public void givenText_Apple_skip3Chars_whenGetCurrentColumn_shouldBe3() throws IOException {
        givenText("Apple");
        skipChar(3);

        assertSame(3, literalReader.getCurrentColumn());
    }

    @Test
    public void givenText_Apple_skip3Chars_whenGetCurrentRow_shouldBe0() throws IOException {
        givenText("Apple");
        skipChar(3);

        assertSame(0, literalReader.getCurrentRow());
    }

    @Test
    public void givenText_Apple_whenPeek_andPeek_andNextChar_thenPeek_shouldBe_A_A_A_p_respectively() throws IOException {
        givenText("Apple");

        assertSame('A', literalReader.peek());
        assertSame('A', literalReader.peek());
        assertSame('A', literalReader.nextChar());
        assertSame('p', literalReader.peek());
    }

    @Test
    public void givenText_Apple_whenNextKeyword_shouldBe_Apple() throws IOException {
        givenText("Apple");

        assertEquals("Apple", literalReader.nextKeyword());
    }

    @Test
    public void givenText_A_breakLine_B_breakLine_C_whenNextKeyword3Times_shouldBe_A_B_C_respectively() throws IOException {
        givenText("A\nB\nC");

        assertEquals("A", literalReader.nextKeyword());
        assertEquals("B", literalReader.nextKeyword());
        assertEquals("C", literalReader.nextKeyword());
    }

    @Test(expected = EOFException.class)
    public void givenEmptyText_whenNextKeyword_shouldThrowEOF() throws IOException {
        givenText("");
        literalReader.nextKeyword();
    }

    private void givenText(String text) {
        literalReader = new StreamLiteralReader(
                new InputStreamReader(new ByteArrayInputStream(text.getBytes()))
        );
    }

    private void skipChar(int count) throws IOException {
        for (int i = 0; i < count; i++) {
            literalReader.nextChar();
        }
    }

}