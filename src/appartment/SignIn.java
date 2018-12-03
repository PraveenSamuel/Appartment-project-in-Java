/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appartment;


import java.util.Scanner;

/**
 *
 * @author test
 */
public class SignIn{
    private String password;
    private String appartmentNo;
    private final Scanner s = new Scanner(System.in);
    private int choice;
    void setPassword(){
        System.out.println("Enter your appartment no");
        appartmentNo = s.nextLine();
        System.out.println("Set your password");
        password = s.nextLine();
        DatabaseValidator.updatePassword(appartmentNo,password);
        this.signIn();
    }
    void signIn(){
        System.out.println("Enter your appartment no");
        appartmentNo = s.nextLine();
        System.out.println("Enter your password");
        password = s.nextLine();
        int value = DatabaseValidator.signInValidate(appartmentNo,password);
        if(value>0){
                Dashboard dashboard = new Dashboard();
                dashboard.displayDashboard(value,appartmentNo);
        }else{
                while(true){
                    System.out.println("Enter 1 If your are a new user and set your password.");
                    System.out.println("Enter 2 to sign in with your registered appartment number and password");
                    System.out.println("Enter 0 to exit");
                    choice = s.nextInt();
                    s.nextLine();
                    if(choice == 1){
                        this.setPassword();
                    }else if(choice == 2){
                        this.signIn();
                    }else{
                        System.exit(0);
                    }
                }
        }
    }
}

