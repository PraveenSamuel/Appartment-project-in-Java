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
public class Dashboard {
    private short input,dashboardInput;
    private final Scanner s = new Scanner(System.in);
    void displayDashboard(int value,String appartmentNo){
        if(value == 1){
            System.out.println("Welcome Admin");
            while(true){
                System.out.println("Enter 1 to add or view people\nEnter 2 to chat\nEnter 3 to view issue\nEnter 4 to post or view announcement\nEnter 0 to exit");
                input = s.nextShort();
                if(input == 1){
                    System.out.println("Before looking people..\nEnter 1 to add people.\nEnter 2 to view people.");
                    dashboardInput = s.nextShort();
                    if(dashboardInput == 1){
                        People people = new People();
                        people.addPeople();
                    }else if(dashboardInput == 2){
                        People people = new People();
                        people.viewPeople(value);
                    }else{
                        System.out.println("Invalid entry");
                    }
                    continue;
                }
                if(input == 2){
                    System.out.println("Before chating..\nEnter 1 to join chat.\nEnter 2 to view chat.");
                    dashboardInput = s.nextShort();
                    if(dashboardInput == 1){
                           Chat chat = new Chat();
                           chat.joinChat(appartmentNo);
                    }else if(dashboardInput == 2){
                           Chat chat = new Chat();
                           chat.viewChat();
                    }else{
                        System.out.println("Invalid entry");
                    }
                    continue;
                }
                if(input == 3){
                    System.out.println("Start viewing issues...");
                    Issue issue = new Issue();
                    issue.viewIssues(value);
                    continue;
                }
                if(input == 4){
                    System.out.println("Before viewing or posting announcement..\nEnter 1 to post announcement.\nEnter 2 to view announcement.");
                    dashboardInput = s.nextShort();
                    if(dashboardInput == 1){
                        Announcement announcement = new Announcement();
                        announcement.postAnnouncement(appartmentNo,value);
                    }else if(dashboardInput == 2){
                        Announcement announcement = new Announcement();
                        announcement.viewAnnouncement();
                    }else{
                        System.out.println("Invalid entry");
                    }
                    continue;
                }
                if(input ==0){
                    System.exit(0);
                }
            }
        }else if (value == 2){
            System.out.println("Welcome Secretary");
            while(true){
                System.out.println("Enter 1 to view people\nEnter 2 to chat\nEnter 3 to view issue\nEnter 4 to post or view announcement\nEnter 0 to exit");
                input = s.nextShort();
                if(input == 1){
                    System.out.println("Start viewing people...");
                    People people = new People();
                    people.viewPeople(value);
                    continue;
                }
                if(input == 2){
                    System.out.println("Before chating..\nEnter 1 to join chat.\nEnter 2 to view chat.");
                    dashboardInput = s.nextShort();
                    if(dashboardInput == 1){
                           Chat chat = new Chat();
                           chat.joinChat(appartmentNo);
                    }else if(dashboardInput == 2){
                           Chat chat = new Chat();
                           chat.viewChat();
                    }else{
                        System.out.println("Invalid entry");
                    }
                    continue;
                }
                if(input == 3){
                    System.out.println("Start viewing issues...");
                    Issue issue = new Issue();
                    issue.viewIssues(value);
                    continue;
                }
                if(input == 4){
                    System.out.println("Before viewing or posting announcement..\nEnter 1 to post announcement.\nEnter 2 to view announcement.");
                    dashboardInput = s.nextShort();
                    if(dashboardInput == 1){
                        Announcement announcement = new Announcement();
                        announcement.postAnnouncement(appartmentNo,value);
                    }else if(dashboardInput == 2){
                        Announcement announcement = new Announcement();
                        announcement.viewAnnouncement();
                    }else{
                        System.out.println("Invalid entry");
                    }
                    continue;
                }
                if(input ==0){
                    System.exit(0);
                }
            }
        }else if(value == 3){
            System.out.println("Welcome People");
            while(true){
                System.out.println("Enter 1 to view people\nEnter 2 to chat\nEnter 3 to post issue\nEnter 4 to view announcement\nEnter 0 to exit");
                input = s.nextShort();
                if(input == 1){
                    System.out.println("Start viewing people...");
                    People people = new People();
                    people.viewPeople(value);
                    continue;
                }
                if(input == 2){
                    System.out.println("Before chating..\nEnter 1 to join chat.\nEnter 2 to view chat.");
                    dashboardInput = s.nextShort();
                    if(dashboardInput == 1){
                           Chat chat = new Chat();
                           chat.joinChat(appartmentNo);
                    }else if(dashboardInput == 2){
                           Chat chat = new Chat();
                           chat.viewChat();
                    }else{
                        System.out.println("Invalid entry");
                    }
                    continue;
                }
                if(input == 3){
                    System.out.println("Start posting issues...");
                    Issue issue = new Issue();
                    issue.postIssues(appartmentNo,value);
                    continue;
                }
                if(input == 4){
                    System.out.println("Start viewing announcement.");
                        Announcement announcement = new Announcement();
                        announcement.viewAnnouncement();
                    continue;
                }
                if(input ==0){
                    System.exit(0);
                }
            }
        }
    }
}