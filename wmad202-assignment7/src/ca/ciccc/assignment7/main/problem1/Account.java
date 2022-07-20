package ca.ciccc.assignment7.main.problem1;

public class Account implements Specificable{
    private int AccountNumber;
    private String HoldersName;
    private double Balance;

    public Account(int AccountNumber, String HoldersName, double Balance){
        this.AccountNumber = AccountNumber;
        this.HoldersName = HoldersName;
        this.Balance = Balance;
    }
    @Override
    public boolean hasSpecificProperty() {
        return this.Balance > 100000;
    }
}
