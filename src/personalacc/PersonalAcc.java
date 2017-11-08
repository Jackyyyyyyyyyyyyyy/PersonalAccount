/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package personalacc;

/**
 *
 * @author Jaliu7185
 */
/**
 * PersonalAcc class.
 */
public class PersonalAcc {
    private double balance;
   
    	/**
	 * constructor
	 * pre: none
	 * post: An Personal account has been created. Balance has been initialized with parameters.
	 */
    public PersonalAcc(double bal){
       balance = bal;
       
   }
	/** 
	 * Returns the current balance.
	 * pre: none
	 * post: The account balance has been returned.
	 */
    	public double getBalance() {
	 	return(balance);
	}
         /** 
	 * A deposit is made to the account.
	 * pre: none
	 * post: The balance has been increased by the amount of the deposit.
	 */
        public void deposit(double amt) {
	 	balance += amt;
	}
        
        /** 
	 * A withdrawal is made from the account if there is enough money.
	 * pre: none
	 * post: The balance has been decreased by the amount withdrawn.
	 */
        public void withdrawal(double amt) {
	 if (amt <= balance) {
	 	balance -= amt;
                takemoney();
	 }
         else {
	 	System.out.println("Not enough money in account.");
	 }
       
        /** 
	 * A charging is made from the account if balance is less than $100.
	 * pre: none
	 * post: The balance will be charged $2 if the amount is less than $100.
	 */        
	}
         public void takemoney(){
            if(balance <100){
                balance -=2;
                
            }
        }
	
}
