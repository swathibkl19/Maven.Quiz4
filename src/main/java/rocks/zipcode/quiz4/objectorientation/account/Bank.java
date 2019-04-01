package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    List<BankAccount> mylist =new ArrayList<>();

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        mylist.remove(indexNumber);
        return null;
    }

    public void addBankAccount(BankAccount bankAccount) {
        mylist.add(bankAccount);


    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        throw new UnsupportedOperationException("Method not yet implemented");
    }
}
