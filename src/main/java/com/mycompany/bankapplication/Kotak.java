/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankapplication;

/**
 *
 * @author rssun
 */
public class Kotak implements RBI{
    private String accountNo;
    private Integer balance;
    private String passcode;
    private Integer interest = 6; 

    //constructor
    public Kotak(String accountNo, String passcode, Integer balance){
    this.accountNo = accountNo;
    this.balance = balance;
    this.passcode = passcode;
   
    }
    
    public Integer balance(){
        return this.balance;
    }

    public String accountNo(){
        return this.accountNo;
    }
    
    // money deposit function
    @Override
    public String Deposit(int money){
        if(money > 0){
            balance += money;
            return "Deposited in kotak "+balance;
        }else{
            return "invalid money type";
        }
    }
    // Withdrawal money function
    @Override
    public String Withdrawal(int money, String password){
        if(password.equals(passcode)){
            balance = balance - money;
            return "Withdrawal money "+ balance;
        }else{
            return "invalid password";
        }
    }
    // Check balance function
    
    public String CheckBalance(String password){
         if(password.equals(this.passcode)){
            return "current balance is "+balance;
        }else{
             return "invalid password";
         }
   
    }
     // rate of interest  
    public Integer rateOfInterest(int time){
        balance = (balance*time*interest)/100;
        return balance;

    }
}




