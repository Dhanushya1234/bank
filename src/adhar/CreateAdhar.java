/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adhar;

/**
 *
 * @author lenovo
 */
public class CreateAdhar extends Enrollment{
    int adharno;
    int password;
    void create(String name,String _dob,String _address,int _mobileno){
        this.name =name;
        dob=_dob;
        address =_address;
        mobileno=_mobileno;
        adharno=123456789;
        password=1234;
        
    }
    boolean checkAdhar(int _adharno){
        if(adharno==_adharno){
            return true;
        }
        else{
            return false;
        }
    }
    boolean checkPassword(int _password){
        if(password==(_password)){
            return true;
        }
        else{
            return false;
        }
    }
    void display(){
        System.out.println("Your name is"+name);
        System.out.println("Your Date of birth"+dob);
        System.out.println("Your address is"+address);
        System.out.println("your mobile number "+mobileno);
        System.out.println("Your adhar number"+adharno);
    }
}
