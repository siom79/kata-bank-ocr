package kata.bank;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ParserTest {

    Parser parser = new Parser();

    @Test
    public void testParseZero(){
        char[][] zeroNumber = new char[][]{{' ', '_', ' '}, {'|', ' ', '|'}, {'|', '_', '|'}};
        int zeroInt = parser.parse(zeroNumber);

        assertThat(zeroInt, is(0));
    }

    @Test
    public void testParseOne(){
        char [][] oneNumber = new char[][]{{' ', ' ', ' '}, {' ', ' ', '|'}, {' ', ' ', '|'}};
        int oneInt = parser.parse(oneNumber);
        assertThat(oneInt, is(1));
    }

    @Test
    public void testParseTwo(){
        char [][] twoNumber = new char[][]{{' ', '_', ' '}, {' ', '_', '|'}, {'|', '_', ' '}};
        int oneInt = parser.parse(twoNumber);
        assertThat(oneInt, is(2));
    }

    @Test
    public void testParseThree(){
        char [][] threeNumber = new char[][]{{' ', '_', ' '}, {' ', '_', '|'}, {' ', '_', '|'}};
        int oneInt = parser.parse(threeNumber);
        assertThat(oneInt, is(3));
    }

    @Test
    public void testParseFour(){
        char [][] fourNumber = new char[][]{{' ', ' ', ' '}, {'|', '_', '|'}, {' ', ' ', '|'}};
        int oneInt = parser.parse(fourNumber);
        assertThat(oneInt, is(4));
    }

    @Test
    public void testParseFive(){
        char [][] fiveNumber = new char[][]{{' ', '_', ' '}, {'|', '_', ' '}, {' ', '_', '|'}};
        int oneInt = parser.parse(fiveNumber);
        assertThat(oneInt, is(5));
    }

    @Test
    public void testParseSix(){
        char [][] sixNumber = new char[][]{{' ', '_', ' '}, {'|', '_', ' '}, {'|', '_', '|'}};
        int oneInt = parser.parse(sixNumber);
        assertThat(oneInt, is(6));
    }

    @Test
    public void testParseSeven(){
        char [][] sevenNumber = new char[][]{{' ', '_', ' '}, {' ', ' ', '|'}, {' ', ' ', '|'}};
        int oneInt = parser.parse(sevenNumber);
        assertThat(oneInt, is(7));
    }
}
