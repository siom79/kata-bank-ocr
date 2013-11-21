package kata.bank;

import java.util.Arrays;

public class Parser {

    public int parse(char[][] number) {
        if(checkZero(number)) {
            return 0;
        }

        if(checkOne(number)) {
            return 1;
        }

        if(checkTwo(number)) {
            return 2;
        }

        if(checkThree(number)) {
            return 3;
        }

        if(checkFour(number)) {
            return 4;
        }

        if(checkFive(number)){
            return 5;
        }

        if(checkSix(number)) {
            return 6;
        }

        if(checkSeven(number)) {
            return 7;
        }

        if(checkEight(number)) {
            return 8;
        }

        if(checkNine(number)) {
            return 9;
        }

        throw new KataBankException("Input is not a number");
    }

    private boolean checkZero(char [][] input) {
        char[][] zero = new char[][]{{' ', '_', ' '}, {'|', ' ', '|'}, {'|', '_', '|'}};
        return compare(input, zero);
    }

    private boolean checkOne(char [][] input) {
        char [][] one = new char[][]{{' ', ' ', ' '}, {' ', ' ', '|'}, {' ', ' ', '|'}};
        return compare(input, one);
    }

    private boolean checkTwo(char [][] input) {
        char [][] two = new char[][]{{' ', '_', ' '}, {' ', '_', '|'}, {'|', '_', ' '}};
        return compare(input, two);
    }

    private boolean checkThree (char [][] input) {
        char [][] three = new char[][]{{' ', '_', ' '}, {' ', '_', '|'}, {' ', '_', '|'}};
        return compare(input, three);
    }

    private boolean checkFour (char [][] input) {
        char [][] four = new char[][]{{' ', ' ', ' '}, {'|', '_', '|'}, {' ', ' ', '|'}};
        return compare(input, four);
    }

    private boolean checkFive(char [][] input) {
        char [][] five = new char[][]{{' ', '_', ' '}, {'|', '_', ' '}, {' ', '_', '|'}};
        return compare(input, five);
    }

    private boolean checkSix(char [][] input) {
        char [][] six = new char[][]{{' ', '_', ' '}, {'|', '_', ' '}, {'|', '_', '|'}};
        return compare(input, six);
    }

    private boolean checkSeven(char [][] input) {
        char [][] seven = new char[][]{{' ', '_', ' '}, {' ', ' ', '|'}, {' ', ' ', '|'}};
        return compare(input, seven);
    }

    private boolean checkEight(char[][] input) {
        char[][] eight = new char[][]{{' ', '_', ' '}, {'|', '_', '|'}, {'|', '_', '|'}};
        return compare(input, eight);
    }

    private boolean checkNine(char[][] input) {
        char[][] nine = new char[][]{{' ', '_', ' '}, {'|', '_', '|'}, {' ', '_', '|'}};
        return compare(input, nine);
    }

    private boolean compare(char[][] arg1, char[][]  arg2) {
        boolean isEqual = true;
        for (int i = 0; i < 3; i++) {
            isEqual = Arrays.equals(arg1[i], arg2[i]) && isEqual;
        }
        return isEqual;
    }
}
