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
public class SavingsAccount extends Account{ 

    public SavingsAccount(String newName, double newBalance) {
        super(newName, newBalance);
        setOverdraft();
    }

    public void withdraw (double w) { 
        if (balance - w < super.overdraft){ 
            System.out.println("Insufficient Funds"); 
        }
        else {
            balance = balance - w; 
        } 
    }

    @Override
    protected void setOverdraft() {
        super.overdraft = 0;
    }
}