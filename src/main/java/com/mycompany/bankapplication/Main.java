/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankapplication;

/**
 *
 * @author rssun
 */
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        System.out.println("In which bank you want to open account?");
        System.out.println("Write 1 to open in SBI. Write 2 to open in Kotak");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        System.out.println("Enter password");
        String password = sc.next();

        System.out.println("Enter deposit amount");
        Integer deposit = sc.nextInt();

        double account = Math.abs(Math.random()*Math.pow(10,9));
        String stringVersion = String.valueOf(account);

        RBI bankAccount;

        if(option == 1){
            bankAccount = new SBI(stringVersion,password,deposit);
        } else{
            bankAccount = new Kotak(stringVersion,password,deposit);
        }

        String result = bankAccount.Deposit(10000);
        System.out.println(result);

        result = bankAccount.Withdrawal(7000,"rahul");
        System.out.println(result);

        System.out.println(bankAccount.CheckBalance("rahul"));

        

        

    }
}
