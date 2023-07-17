/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankapplication;

/**
 *
 * @author rssun
 */
public class SBI implements RBI {
    //variables
    private Integer balance;
    private String password;
    private String accountNumber;
    private Integer minBalance = 500;

    // constructor
    public SBI(String accountNumber,String password,Integer balance){
        this.balance = balance;
        this.password = password;
        this.accountNumber = accountNumber;
        
    }

    //getters

    public Integer balance(){
        return this.balance;
    }

    public String accountNumber(){
        return this.accountNumber;
    }

    // money deposit function
    @Override
    public String Deposit(int money){
        if(money > 0){
            balance +=money;
            return "Current balance after deposit is "+balance;
        }else{
           return "-Ve amount";
        }
    }

    // Withdrawal money function
    @Override
    public String Withdrawal(int money, String password){
        if(password.equals(this.password)){
            if(balance - minBalance > money){
                balance = balance - money;
                return "Balance after withdrawal "+balance;
            }else{
                return " insufficient Balance in account";
            }
        }else{
            return "invalid password";
        }
    }
    
    // Check balance function
    @Override
    public String CheckBalance(String password){
        if(password.equals(this.password)){
            return "Balance is "+balance;
        }else{
            return "invalid password";
        }
    }

    
}

