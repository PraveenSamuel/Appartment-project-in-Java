/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appartment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author test
 */
public class DatabaseValidator {
    static {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
    }
    static int signInValidate(String appartmentNo,String password){
            try (Connection con = DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/Appartment?autoReconnect=true&useSSL=false","praveen","PraSam@17")) {
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from People");
                while(rs.next()){  
                    if(appartmentNo.equals(rs.getString(6)) && (password.equals(rs.getString(5))) && (rs.getInt(1)==1)){
                        return 1;
                    }else if(appartmentNo.equals(rs.getString(6)) && (password.equals(rs.getString(5))) && (rs.getInt(1)==2)){
                        return 2;
                    }else if(appartmentNo.equals(rs.getString(6)) && password.equals(rs.getString(5))){
                        return 3;
                    }    
                }
            }  
            catch(SQLException e){
                System.out.println(e);
            }
        return 0;
    }
    static void updatePassword(String appartmentNo,String password){  
            try (Connection con = DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/Appartment?autoReconnect=true&useSSL=false","praveen","PraSam@17")) {
                PreparedStatement stmt=con.prepareStatement("update People set Password=? where AppartmentNo=?");
                stmt.setString(1,password);  
                stmt.setString(2,appartmentNo);
                stmt.executeUpdate();
            }
        catch(SQLException e){
                System.out.println(e);
            }
    }
    static boolean addPeople(String name,String phoneNo,String email,String appartmentNo,int appartmentPrice,int maintainanceCharge,String aadhaarNo,String address){
            try (Connection con = DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/Appartment?autoReconnect=true&useSSL=false","praveen","PraSam@17")) {
                Statement stmt=con.createStatement();
                stmt.executeUpdate("insert into People(Name,PhoneNo,Email,AppartmentNo,AppartmentPrice,MaintainanceCharge,AadhaarNo,Address) values ('"+name+"','"+phoneNo+"','"+email+"','"+appartmentNo+"',"+appartmentPrice+","+maintainanceCharge+",'"+aadhaarNo+"','"+address+"')");
            }  
            catch(SQLException e){
                return false;
            }
        return true;
    }
    static void viewPeopleList(){
            try (Connection con = DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/Appartment?autoReconnect=true&useSSL=false","praveen","PraSam@17")) {
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from People");
                while(rs.next()){  
                    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(6));
                }
            }  
            catch(SQLException e){
                System.out.println(e);
            }
    }
    static void adminViewPeopleList(){
            try (Connection con = DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/Appartment?autoReconnect=true&useSSL=false","praveen","PraSam@17")) {
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from People");
                while(rs.next()){  
                    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getInt(7)+" "+rs.getInt(8)+" "+rs.getString(9)+" "+rs.getString(10));
                }
            }  
            catch(SQLException e){
                System.out.println(e);
            }
    }
    static void writeChat(String appartmentNo,String chatMessage){  
            try (Connection con = DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/Appartment?autoReconnect=true&useSSL=false","praveen","PraSam@17")) {
                Statement stmt=con.createStatement();
                stmt.executeUpdate("insert into Chat(AppartmentNo,ChatMessage) values ('"+appartmentNo+"','"+chatMessage+"')");
            }  
            catch(SQLException e){
                System.out.println(e);
            }
    }
    static void viewAllChat(){  
            try (Connection con = DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/Appartment?autoReconnect=true&useSSL=false","praveen","PraSam@17")) {
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from Chat");
                while(rs.next()){  
                    System.out.println(rs.getString(1)+" "+rs.getString(2));
                    System.out.println("-------");
                }
            }  
            catch(SQLException e){
                System.out.println(e);
            }
    }
    static void uploadIssue(String appartmentNo,String issueMessage,int priority){  
            try (Connection con = DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/Appartment?autoReconnect=true&useSSL=false","praveen","PraSam@17")) {
                Statement stmt=con.createStatement();
                stmt.executeUpdate("insert into Issue(AppartmentNo,IssueMessage,Priority) values ('"+appartmentNo+"','"+issueMessage+"',"+priority+")");
            }  
            catch(SQLException e){
                System.out.println(e);
            }
    }
    static void viewAllIssues(){  
            try (Connection con = DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/Appartment?autoReconnect=true&useSSL=false","praveen","PraSam@17")) {
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from Issue");
                while(rs.next()){  
                    System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
                    System.out.println("-------");
                }
            }  
            catch(SQLException e){
                System.out.println(e);
            }
    }
    static void publishAnnouncement(String appartmentNo,String announcementMessage){ 
            try (Connection con = DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/Appartment?autoReconnect=true&useSSL=false","praveen","PraSam@17")) {
                Statement stmt=con.createStatement();
                stmt.executeUpdate("insert into Announcement(AppartmentNo,AnnouncementMessage) values ('"+appartmentNo+"','"+announcementMessage+"')");
            }  
            catch(SQLException e){
                System.out.println(e);
            }
    }
    static void viewAllAnnouncement(){  
            try (Connection con = DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/Appartment?autoReconnect=true&useSSL=false","praveen","PraSam@17")) {
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from Announcement");
                while(rs.next()){  
                    System.out.println(rs.getString(2));
                    System.out.println("-------");
                }
            } 
            catch(SQLException e){
                System.out.println(e);
            }
    }
}
