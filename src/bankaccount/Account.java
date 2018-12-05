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
public abstract class Account {
    private String name; 
    double balance;
    double overdraft;
    
    public Account() { 
        name = null;
        balance = 0.0;
    } 
    
    public Account(String newName, double newBalance) { 
        name = newName;
        balance = newBalance;  
    } 
    
    protected abstract void setOverdraft();
    
    public String getName() { 
        return name;
    }
    public double getBalance() { 
        return balance; 
    }
    public void withdraw(double amount) { 
        balance -= amount; 
    } 
    public void deposit(double amount) { 
        balance += amount; 
    } 

}

