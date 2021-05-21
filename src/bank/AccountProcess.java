/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author lenovo
 */
public class AccountProcess extends Account{
    void deposit(int _acc_no,int amt){
        if(checkAcc(_acc_no)){
            String name=getuserName(_acc_no);
        }
     
        current_balance=current_balance+amt;
        System.out.println("Dear "+name+", Your currenct balance is :"+current_balance);
    }
    void withdraw(int acc_no,int amt){
        if(checkAcc(acc_no)){
            if(amt<current_balance){
                current_balance=current_balance-amt;
                        System.out.println("Dear "+name+", Your currenct balance is :"+current_balance);

            }
        }
        else{
            System.out.println("Enter valid amount");
        }
    }
    void current_balance(int acc_no){
        if(checkAcc(acc_no)){
                   System.out.println("Dear "+name+", Your currenct balance is :"+current_balance);
        }
    }
    
}
