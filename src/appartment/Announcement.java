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
public class Announcement{
    private String announcementMessage;
    void viewAnnouncement(){
        System.out.println("view All Announcements..");
        DatabaseValidator.viewAllAnnouncement();
    }
    void postAnnouncement(String appartmentNo,int value){
        if(value!=3){
            Scanner s = new Scanner(System.in);
            System.out.println("Post Announcement\nStart typing your Announcement..");
            announcementMessage = s.nextLine();
            DatabaseValidator.publishAnnouncement(appartmentNo,announcementMessage);
        }
    }
}
