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
public class Chat {
    private String chatMessage;
    void joinChat(String appartmentNo){
        Scanner s = new Scanner(System.in);
        System.out.println("Start typing your message...");
        chatMessage = s.nextLine();
        DatabaseValidator.writeChat(appartmentNo,chatMessage);
    }
    void viewChat(){
        System.out.println("View All Chats...");
        DatabaseValidator.viewAllChat();
    }
}
