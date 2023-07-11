import java.util.Random;
public class BankAccount extends Interface {

    private Person person;
    private double accountBalance;
    private int accountPassword, accountNumber;
    private boolean accountOpen = false;

    public BankAccount(Person person) {
        this.person = person;
        this.accountBalance = 0;
        this.setAccountPassword(accountPassword);
        this.setAccountNumber(getAccountNumber());
        this.accountOpen = true;
    }

    Random random = new Random();

    public BankAccount(String personName, String personCpf, String personEmail, int personYearBirth) {
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    private void setAccountNumber(int accountNumber){
        this.accountNumber = random.nextInt(Integer.MAX_VALUE);
    }

    private Person getPerson() {
        return person;
    }

    private void setPerson(Person person) {
        this.person = person;
    }

    private double getAccountBalance() {
        return accountBalance;
    }

    private void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    private int getAccountPassword() {
        return accountPassword;
    }

    private void setAccountPassword(int accountPassword) {
        this.accountPassword = accountPassword;
    }

        @Override
    public void deposit(double value){

        if (accountOpen && value > 0){
            setAccountBalance(getAccountBalance() + value);
            System.out.println("Deposit completed successfully!");
        }else{
            System.out.println("Unable to deposit, enter a positive amount!");
        }
    }

    @Override
    public void withdraw(double value){
        if(accountOpen && value > 0 && getAccountBalance() >= value){
            setAccountBalance(getAccountBalance() - value);
            System.out.println("Deposit completed successfully!");
        }else{
            System.out.println("Unable to withdraw!");
            System.out.println("Check your balance and if your bank account is open and if you entered a positive value!");
        }
    }

    @Override
    public void transfer(BankAccount destinationAccount, double value){
        if(accountOpen && value > 0 && getAccountBalance() >= value){
            setAccountBalance(getAccountBalance() - value);
            destinationAccount.accountBalance = destinationAccount.getAccountBalance() + value;
            System.out.println("Transfer completed successfully!");
        }else{
            System.out.println("Unable to transfer!");
            System.out.println("Check your balance and if your bank account is open and if you entered a positive value!");
        }
    }

}

