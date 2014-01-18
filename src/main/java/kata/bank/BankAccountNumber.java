package kata.bank;

public class BankAccountNumber {
    private final String accountNumber;

    public BankAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @exception  NumberFormatException  if the account number is illegal.
     */
    public int checksumOf() {

        int checksum = 0;
        for (int i = 0; i < 9; i++) {
            int digit = Integer.parseInt(accountNumber.substring(i,i+1));
            checksum = checksum + digit * (9-i) ;
        }

        return checksum % 11;
    }

    public boolean isValid() {
        if(isIllegal()) {
            return false;
        }
        return checksumOf() == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BankAccountNumber that = (BankAccountNumber) o;

        if (!accountNumber.equals(that.accountNumber)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return accountNumber.hashCode();
    }

    public boolean isIllegal() {
        return accountNumber.contains("?");
    }

    @Override
    public String toString() {
        String suffix = "";

        if(!isValid()) {
            suffix = " ERR";
        }

        if(isIllegal()) {
            suffix = " ILL";
        }

        return accountNumber + suffix;
    }
}