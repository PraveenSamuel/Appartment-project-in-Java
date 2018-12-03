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
public class People{
    private String name,phoneNo,email,appartmentNo,aadhaarNo,address;
    private int appartmentPrice,maintainanceCharge;
    void addPeople(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter people name");
        name = s.nextLine();
        System.out.println("Enter people phone number");
        phoneNo = s.nextLine();
        System.out.println("Enter people email address");
        email = s.nextLine();
        System.out.println("Enter people appartment number");
        appartmentNo = s.nextLine();
        System.out.println("Enter people appartment price");
        appartmentPrice = s.nextInt();
        System.out.println("Enter people maintainance charge");
        maintainanceCharge = s.nextInt();
        System.out.println("Enter people old address");
        s.nextLine();
        address = s.nextLine();
        System.out.println("Enter people aadhar number");
        aadhaarNo = s.nextLine();
        if(DatabaseValidator.addPeople(name,phoneNo,email,appartmentNo,appartmentPrice,maintainanceCharge,aadhaarNo,address)){
            System.out.println("People data inserted successfully..");
        }else{
            System.out.println("People data not inserted..");
        }
    }
    void viewPeople(int value){
        if(value == 1)
            DatabaseValidator.adminViewPeopleList();
        else
            DatabaseValidator.viewPeopleList();
    }
}
