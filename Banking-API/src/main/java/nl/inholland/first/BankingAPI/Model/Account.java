package nl.inholland.first.BankingAPI.Model;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Account")
public class Account {

    private Iban iban;
    private Accounttype accounttype;
    private double balance;
    private double dailylimit;
    private double trasactionlimit;
    private double Absolutelimit;

    public Account(Iban iban, Accounttype accounttype, double balance, double dailylimit, double trasactionlimit, double absolutelimit) {
        this.iban = iban;
        this.accounttype = accounttype;
        this.balance = balance;
        this.dailylimit = dailylimit;
        this.trasactionlimit = trasactionlimit;
        Absolutelimit = absolutelimit;
    }

    public Iban getIban() {
        return iban;
    }

    public void setIban(Iban iban) {
        this.iban = iban;
    }

    public Accounttype getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(Accounttype accounttype) {
        this.accounttype = accounttype;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDailylimit() {
        return dailylimit;
    }

    public void setDailylimit(double dailylimit) {
        this.dailylimit = dailylimit;
    }

    public double getTrasactionlimit() {
        return trasactionlimit;
    }

    public void setTrasactionlimit(double trasactionlimit) {
        this.trasactionlimit = trasactionlimit;
    }

    public double getAbsolutelimit() {
        return Absolutelimit;
    }

    public void setAbsolutelimit(double absolutelimit) {
        Absolutelimit = absolutelimit;
    }
}
