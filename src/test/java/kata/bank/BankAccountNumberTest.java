package kata.bank;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class BankAccountNumberTest {

    @Test
    public void testChecksum() {
        BankAccountNumber bankAccountNumber = new BankAccountNumber("345882865");
        int checksum = bankAccountNumber.checksumOf();
        assertThat(checksum, is(0));
    }

    @Test
    public void testIsValid() {
        BankAccountNumber bankAccountNumber = new BankAccountNumber("345882865");
        boolean valid = bankAccountNumber.isValid();
        assertTrue(valid);
    }

    @Test
    public void testIsIllegal(){
        BankAccountNumber bankAccountNumber = new BankAccountNumber("3458??865");
        boolean illegal = bankAccountNumber.isIllegal();
        assertTrue(illegal);
    }

    @Test
    public void testIsValidWithIllegalAccountNumber(){
        BankAccountNumber bankAccountNumber = new BankAccountNumber("3458??865");
        boolean valid = bankAccountNumber.isValid();
        assertFalse(valid);
    }
}
