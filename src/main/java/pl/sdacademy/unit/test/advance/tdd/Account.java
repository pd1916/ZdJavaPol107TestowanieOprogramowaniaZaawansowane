package pl.sdacademy.unit.test.advance.tdd;

public class Account {
    private float balance;
    private String accountNumber;
    private Customer customer;

    public Account(float balance, String accountNumber, Customer customer) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.customer = customer;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void transferMoney(Account account, float amount) {
        //if(validateAmount(amount)) {
        if(validateAmount(amount)
            //&& validateAccountNumber(this)
            //&& validateAccountNumber(account)
        ) {
            account.setBalance(account.getBalance() + amount);
            this.setBalance(this.getBalance() - amount);
        }
    }

    private boolean validateAmount(float amount) {
        return amount > 0 && amount <= this.getBalance();
    }
}
