/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adhar;
import java.util.Scanner;
import java.util.*;
public class Adhar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CreateAdhar obj=new CreateAdhar();
        for(;;){
        System.out.println("Enter the option");
        System.out.println("Enter 1 for create adhar");
        System.out.println("Enter 2 for view adhar ");
        Scanner in=new Scanner(System.in);
        int option=in.nextInt();
        switch (option) {
            case 1:
                System.out.println("Enter your name");
                String name=in.next();
                System.out.println("Enter your DOB");
                String dob=in.next();
                System.out.println("Enter your mobile number");
                int mobileno=in.nextInt();
                System.out.println("Enter your address");
                String address=in.next();
                obj.create( name,dob,address,mobileno);
                break;
            case 2:
                int adharno,password;
                System.out.println("Enter your adhar no");
                adharno=in.nextInt();
                if(obj.checkAdhar(adharno))
                System.out.println("Enter your password");
                password=in.nextInt();
                if(obj.checkPassword(password))
                obj.display();
                else{
                    System.out.println("Enter a valid adhar no");
                }       break;
            default:
                System.out.println("Enter a valid option");
                break;
        }
     }
        
    }    
}
