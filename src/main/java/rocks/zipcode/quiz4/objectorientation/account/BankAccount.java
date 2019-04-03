package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable {

    private double balance = 0.0;

    public void setBalance(Double val) {
        this.balance = val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {

        if (amountToIncreaseBy < 0) {
            throw new IllegalArgumentException();
        } else {
            balance = balance + amountToIncreaseBy;
        }
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        if((amountToDecreaseBy < 0)||(amountToDecreaseBy > balance)) {
            throw new IllegalArgumentException();
        }
       // if (amountToDecreaseBy <= balance) {
            balance = balance - amountToDecreaseBy;
//        } else
//            throw new IllegalArgumentException();


    }

    @Override
    public Double getBalance() {

        return balance;
    }
}
