/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *
 * @author Calvin
 */
public class CheckingAccount extends Account { 

    public CheckingAccount(String newName, double newBalance) {
        super(newName, newBalance);
        setOverdraft();
    }
    
    public void checking(double i) { 
    //initializes double variable balance as 0.0 
    double balance = 0.0; 
    if (balance - i < super.overdraft){ 
        System.out.println("Failure: Can't overdraft more than $1,000. A $25 +" + "overdraft fee will be issued to your account. "); 
        balance = balance - 25; 
    } 
    else{
        balance = balance - i;
    } 
    } 

    @Override
    protected void setOverdraft() {
        super.overdraft = -1000;
    }
}

