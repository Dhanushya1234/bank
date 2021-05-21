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
public class Account extends customer{
    int acc_no;
    String acc_type;
    double current_balance;
   
    void accountcreate(String name,String _dob,String _address,int _mobileno){
        this.name=name;
        dob=_dob;
        address=_address;
        mobileno=_mobileno;
        acc_no=1234;
        acc_type="savings";
        current_balance=500;
    }
    boolean checkAcc(int _acc_no){
        if(acc_no==_acc_no){
            return true;
        }
        else{
            return false;
        }
    }
    String getuserName(int _acc_no){
        if(acc_no==_acc_no){
            return name;
        }
        else{
            return null;
        }
    }
    
}
