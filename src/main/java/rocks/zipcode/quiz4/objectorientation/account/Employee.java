package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker,Transactable{
    private BankAccount bankAccount;

    double numberOfHours;
    Double hourlyPay;

    public Employee() {
        this.bankAccount = new BankAccount();
        hourlyPay = 35.0;
    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        hourlyPay = 35.0;

    }

    public BankAccount getBankAccount() {
       // return getBalance();
        return this.bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        this.numberOfHours += numberOfHours;

    }

    @Override
    public Double getHoursWorked() {
        return this.numberOfHours;
    }

    @Override
    public Double getHourlyWage() {
        return hourlyPay;
    }

    @Override
    public Double getMoneyEarned() {
        return numberOfHours * hourlyPay;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {

        getBankAccount().deposit(amountToIncreaseBy);

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {

        getBankAccount().withdrawal(amountToDecreaseBy);


    }

    @Override
    public Double getBalance() {
        return getBankAccount().getBalance();
    }
}
