package kata.bank;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class KataBankTest {
    private static final String C_TEMP_ACCOUNT_NUMBER_TXT = "c:\\temp\\AccountNumber.txt";

    @Test
    public void testReadFile() {
        KataBank bank = new KataBank();
        bank.parse(new String[]{C_TEMP_ACCOUNT_NUMBER_TXT});
        assertNotNull(bank.file);
    }

    @Test(expected = KataBankException.class)
    public void testNoProgramArgument() {
        KataBank bank = new KataBank();
        bank.parse(new String[]{});
    }

    @Test
    public void testFileContent() {
        KataBank bank = new KataBank();
        bank.parse(C_TEMP_ACCOUNT_NUMBER_TXT);

        assertNotNull(bank.content);
        assertTrue(bank.content.size() > 0);
    }

    @Test
    public void testLineNumbers() {
        KataBank bank = new KataBank();
        bank.parse(C_TEMP_ACCOUNT_NUMBER_TXT);

        assertThat(bank.content.size(), is(44));
        assertThat(bank.lineCount, is(11));
    }

    @Test
    public void testParseZeroNumber(){
        KataBank bank = new KataBank();
        bank.parse(C_TEMP_ACCOUNT_NUMBER_TXT);

        assertThat(bank.accountNumbers, hasItems("000000000"));
        /* assertThat(bank.accountNumbers.size(), is(1)); */
        assertThat(bank.accountNumbers.get(0), is("000000000"));
    }

    @Test
    public void testParseOneNumber(){
        KataBank bank = new KataBank();
        bank.parse(C_TEMP_ACCOUNT_NUMBER_TXT);

        assertThat(bank.accountNumbers, hasItems("111111111"));
        assertThat(bank.accountNumbers.get(1), is("111111111"));
    }

}
