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
public class Issue{
    private String issueMessage;
    private int priority;
    void viewIssues(int value){
        if(value==1 || value==2){
            System.out.println("Issues gets displayed...");
            DatabaseValidator.viewAllIssues();
        }
    }
    void postIssues(String appartmentNo,int value){
        if(value==3){
            Scanner s = new Scanner(System.in);
            System.out.println("Post Issue with priority\nStart typing your Issue");
            issueMessage = s.nextLine();
            System.out.println("Enter the priority from 1 to 10, 1 is normal 10 is critical");
            priority = s.nextInt();
            DatabaseValidator.uploadIssue(appartmentNo,issueMessage,priority);
        }
    }
}
