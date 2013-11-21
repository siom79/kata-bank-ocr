package kata.bank;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class KataBank {
    List<String> content;
    int lineCount;
    List<String> accountNumbers = new LinkedList<String>();
    Parser parser = new Parser();

    public static void main(String... args) {
        KataBank bank = new KataBank();
        bank.parse(args);
    }

    public void parse(String... strings) {
        if (strings.length == 0) {
            throw new KataBankException();
        }

        try {
            content = Files.readAllLines(Paths.get(strings[0]), Charset.defaultCharset());
        } catch (IOException e) {
            throw new KataBankException();
        }

        int line = 1;
        for (String lineContent : content) {
            if (lineContent.length() < 27) {
                throw new KataBankException("Line " + line + " has not length 27, but " + lineContent.length());
            }
            line++;
        }

        lineCount = content.size() / 4;

        for (int entry = 0; entry < lineCount; entry+=4) {
            String currentLine = content.get(entry);
            StringBuilder stringBuilder = new StringBuilder();
            for (int column = 0; column < currentLine.length(); column += 3) {
                char[][] singleAccountNumber = getSingleAccountNumber(content, entry, column);
                stringBuilder.append(parser.parse(singleAccountNumber));
            }
            accountNumbers.add(stringBuilder.toString());
        }
    }

    private static char[][] getSingleAccountNumber(List<String> content, int entry, int column) {
        char[][] lines = new char[3][3];
        for (int i = 0; i < 3; i++) {
            lines[i] = content.get(entry + i).substring(column, column + 3).toCharArray();
        }
        return lines;
    }
}
