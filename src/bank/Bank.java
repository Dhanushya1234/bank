/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;
import java.util.Scanner;

class ATM{
int no;
String name;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        AccountProcess obj2;
        obj2 = new AccountProcess();
                for(;;){
        System.out.println("Enter the option");
        System.out.println("Enter 1 for account creation");
        System.out.println("Enter 2 for deposit ");
        System.out.println("Enter 3 for withdraw");
        System.out.println("Enter 4 for check current balance");
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
                obj2.accountcreate( name,dob,address,mobileno);
                break;
            case 2:
                {
                    int acc_no,amt;
                    System.out.println("Enter account no");
                    acc_no=in.nextInt();
                    if(obj2.checkAcc(acc_no)){
                        System.out.println("Enter deposit amount");
                        amt=in.nextInt();
                        obj2.deposit(acc_no, amt);
                    }
                    else{
                        System.out.println("Enter valid account number");
                    }       break;
                }
            case 3:
                {
                    int acc_no,amt;
                    System.out.println("Enter account number");
                    acc_no=in.nextInt();
                    if(obj2.checkAcc(acc_no)){
                        System.out.println("Enter Withdraw Amount");
                        amt=in.nextInt();
                        obj2.withdraw(acc_no,amt);
                    }
                    else{
                        System.out.println("Enter valid account number");
                    }       break;
                }
            case 4:
                {
                    int acc_no;
                    System.out.println("Enter accnount number");
                    acc_no=in.nextInt();
                    if(obj2.checkAcc(acc_no)){
                        obj2.current_balance(acc_no);
                    }
                    else{
                        System.out.println("Enter valid account number");
                    }       break;
                }
            default:
                System.out.println("Enter valid option");
                break;
        }
                }
    }
}
