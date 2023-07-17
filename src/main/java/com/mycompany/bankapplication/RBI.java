/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bankapplication;

/**
 *
 * @author rssun
 */
public interface RBI {
    public String Deposit(int money);

    public String Withdrawal(int money, String password);

    public String CheckBalance(String password);
    
    

    
}

