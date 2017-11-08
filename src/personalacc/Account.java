/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package personalacc;

import java.util.Scanner;

/**
 *
 * @author Jaliu7185
 */
public class Account {

    /**
     * @param args the command line arguments
     */
    /**
 * A bank where accounts can be opened and customers can 
 * make transactions.
 */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double Pdata,Bdata;
        PersonalAcc PA = new PersonalAcc(100);
        BussinessAcc BA = new BussinessAcc(500);
        System.out.println("Personal Account balance is : "+(PA.getBalance()));
        System.out.println("Bussiness Account balance is : "+(BA.getBalance()));
        
        
        System.out.println("Enter deposit amount for personal account : ");
        Pdata = input.nextDouble();
	PA.deposit(Pdata);
        System.out.println("Balance is :"+(PA.getBalance()));
        
        System.out.println("Enter withdrow amount for personal account : ");
        Pdata = input.nextDouble();
	PA.withdrawal(Pdata);
        System.out.println("Balance is :"+(PA.getBalance()));
        
        System.out.println("Enter deposit amount for business account : ");
        Bdata = input.nextDouble();
	BA.deposit(Bdata);
        System.out.println("Balance is :"+(BA.getBalance()));
        
        System.out.println("Enter withdrow amount for business account : ");
        Bdata = input.nextDouble();
	BA.withdrawal(Bdata);
        System.out.println("Balance is :"+(BA.getBalance()));
    }
    
}
