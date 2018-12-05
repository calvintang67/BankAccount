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
    
    
    
    double overdraftLimit = 0; 
    public void withdraw (double w) { 
    if (balance - w < overdraftLimit){ 
        System.out.println("Insufficient Funds"); 
    }
    else {
        balance = balance - w; 
    } 
}
}