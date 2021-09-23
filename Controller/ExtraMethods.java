/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ExtraMethods {
    Scanner xD = new Scanner(System.in);
    int buyerpay;
    
    public static void main(String [] args){
        ExtraMethods e = new ExtraMethods();
        Scanner xD = new Scanner(System.in);
        System.out.println("Input the Selling Value of the product");
        int buyerpay= xD.nextInt();
        int profit = e.getProfit(buyerpay);
        int sells = e.SellerGetting(buyerpay);
        System.out.println("Product sold at "+buyerpay+" taka");
        System.out.println("Admin gets "+profit+ " taka as profit.");
        System.out.println("Seller gets "+sells+ " taka");
    }
    
    public int getProfit(int buyerpay){
        //Profit is 5% of the product sold value
        return buyerpay*5/100;
            }
    
    public int SellerGetting(int buyerpay){
        //How much money seller gets after the transaction
        int returnmoney= buyerpay - (buyerpay*5/100);
        return returnmoney;
}
    
}
