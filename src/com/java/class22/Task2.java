package com.java.class22;

public class Task2 {
    /*
    Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.
     */
}

class CreditCard{
    double balance;
    double interest;

    CreditCard(double balance, double interest){ //create constructor
        this.balance=balance;
        this.interest=interest;
    }

    void calculateInterest(){
        double interestAmount=interest*balance/100;
        System.out.println("Interest "+interest);
    }
}

class Visa extends CreditCard{
    Visa(double balance, double interest){
        super(balance, interest); //calling initial constructor
    }

    @Override
    void calculateInterest() {
        double interestAmount=interest*balance/100;
        System.out.println();
        System.out.println("interest Amount "+interestAmount+10);
    }
}

class AX extends CreditCard{

    AX(double balance,double interest){
        super(balance, interest);
    }

    @Override
    void calculateInterest() {
        double interestAmount=interest*balance/100;
        System.out.println();
        System.out.println("Interest Amount "+interestAmount+10);
    }
}