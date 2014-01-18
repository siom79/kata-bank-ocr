package kata.bank;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ParserTest {

    Parser parser = new Parser();

    @Test
    public void testParseZero() throws IllegalDigitException {
        char[][] zeroNumber = new char[][]{{' ', '_', ' '}, {'|', ' ', '|'}, {'|', '_', '|'}};
        int zeroInt = parser.parse(zeroNumber);

        assertThat(zeroInt, is(0));
    }

    @Test
    public void testParseOne() throws IllegalDigitException {
        char [][] oneNumber = new char[][]{{' ', ' ', ' '}, {' ', ' ', '|'}, {' ', ' ', '|'}};
        int oneInt = parser.parse(oneNumber);
        assertThat(oneInt, is(1));
    }

    @Test
    public void testParseTwo() throws IllegalDigitException {
        char [][] twoNumber = new char[][]{{' ', '_', ' '}, {' ', '_', '|'}, {'|', '_', ' '}};
        int oneInt = parser.parse(twoNumber);
        assertThat(oneInt, is(2));
    }

    @Test
    public void testParseThree() throws IllegalDigitException {
        char [][] threeNumber = new char[][]{{' ', '_', ' '}, {' ', '_', '|'}, {' ', '_', '|'}};
        int oneInt = parser.parse(threeNumber);
        assertThat(oneInt, is(3));
    }

    @Test
    public void testParseFour() throws IllegalDigitException {
        char [][] fourNumber = new char[][]{{' ', ' ', ' '}, {'|', '_', '|'}, {' ', ' ', '|'}};
        int oneInt = parser.parse(fourNumber);
        assertThat(oneInt, is(4));
    }

    @Test
    public void testParseFive() throws IllegalDigitException {
        char [][] fiveNumber = new char[][]{{' ', '_', ' '}, {'|', '_', ' '}, {' ', '_', '|'}};
        int oneInt = parser.parse(fiveNumber);
        assertThat(oneInt, is(5));
    }

    @Test
    public void testParseSix() throws IllegalDigitException {
        char [][] sixNumber = new char[][]{{' ', '_', ' '}, {'|', '_', ' '}, {'|', '_', '|'}};
        int oneInt = parser.parse(sixNumber);
        assertThat(oneInt, is(6));
    }

    @Test
    public void testParseSeven() throws IllegalDigitException {
        char [][] sevenNumber = new char[][]{{' ', '_', ' '}, {' ', ' ', '|'}, {' ', ' ', '|'}};
        int oneInt = parser.parse(sevenNumber);
        assertThat(oneInt, is(7));
    }

    @Test
    public void testParseEight() throws IllegalDigitException {
        char [][] eightNumber = new char[][]{{' ', '_', ' '}, {'|', '_', '|'}, {'|', '_', '|'}};
        int oneInt = parser.parse(eightNumber);
        assertThat(oneInt, is(8));
    }

    @Test
    public void testParseNine() throws IllegalDigitException {
        char [][] nineNumber = new char[][]{{' ', '_', ' '}, {'|', '_', '|'}, {' ', '_', '|'}};
        int oneInt = parser.parse(nineNumber);
        assertThat(oneInt, is(9));
    }

    @Test(expected = IllegalDigitException.class)
    public void testParseIllegalDigit() throws IllegalDigitException {
        char [][] illegalDigit = new char[][]{{' ', ' ', ' '}, {' ', ' ', '|'}, {' ', '_', '|'}};
        int oneInt = parser.parse(illegalDigit);
    }
}
