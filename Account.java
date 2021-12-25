package text1;

import java.util.Date;

public class Account {
    private int id = 0;
    private  double balance = 0.0;
    private  double annualInterestRant = 0.0;
    private Date dataCreated = new Date();

    public Account(int id,double balance){
        this.id = id;
        this.balance = balance;
    }

    public Account(int id,double balance,double annualInterestRant){
        this.id = id;
        this.balance = balance;
        this.annualInterestRant = annualInterestRant;
    }

    public  int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRant() {
        return annualInterestRant;
    }

    public void setAnnualInterestRant(double annualInterestRant) {
        this.annualInterestRant = annualInterestRant;
    }

    public Date getDataCreated() {
        return  dataCreated;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRant/12;
    }

    public void withDraw(double balance){
        this.balance = this.balance-balance;
    }

    public void deposit(double balance){
        this.balance =  this.balance+balance;
    }

}
