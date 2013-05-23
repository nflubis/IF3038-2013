package console;

import java.io.*;
import java.net.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

public class Console {
    //Database Connection variables
    static Connection currentCon = null;
    static ResultSet rs = null;
    static PreparedStatement ps = null;
    
    //Socket Connection variables
    static ServerSocket serverSocket = null;
    static PrintWriter pw = null;
    static BufferedReader br = null;
    
    //User task
    static ArrayList<String> task = new ArrayList<String>();
    
    /*public static void login(){
        
        Statement stmt = null;

        try{      
            serverSocket = new ServerSocket(8899);
            System.out.println("SOK");
            
            
            
            //br = new BufferedReader(new InputStreamReader(sokcobain.getInputStream()));
            //pw = new PrintWriter(sokcobain.getOutputStream(), true);
            
            String username = br.readLine();
            String password = br.readLine();
            
            String searchQuery = "SELECT * FROM user WHERE username='" + username + "' AND password='" + password + "'";
            String testQuery = "SELECT name FROM user WHERE username='" + username + "'";
            
            System.out.println(username);
            System.out.println(password);
            System.out.println(searchQuery);
            System.out.println(testQuery);
            
            currentCon = ConnectionManager.getConnection();
            System.out.println("GOT CONNECTION");
            stmt = currentCon.createStatement();
            System.out.println("STATEMENT CREATED");
            rs = stmt.executeQuery(searchQuery);
            System.out.println("QUERY EXECUTED");
            boolean more = rs.next();
            System.out.println("RS NEXTED");
            
            if (!more){
                pw.println("login failed");
                System.out.println("LOGIN FAILED");
            }
            
            while (more)
            {
                //rs = stmt.executeQuery(testQuery);
                //System.out.println("RS 2 NEXTED");
                pw.println(rs.getString("name"));
                System.out.println("NAME PRINTED");
                pw.println(rs.getString("username"));
                System.out.println("USERNAME RETURNED");
                pw.println(rs.getString("name"));
                System.out.println("NAME LABEL PRINTED");
                more = rs.next();
                //System.out.println("USER NOT FOUND");
                listTask(username);
                Iterator<String> it = task.iterator();

                String results = "";
                while (it.hasNext()){
                    String taskQuery = "SELECT * FROM task WHERE idtask='" + it.next() + "'";
                    currentCon = ConnectionManager.getConnection();
                    System.out.println("GOT TASK(1) CONNECTION");
                    stmt = currentCon.createStatement();
                    System.out.println("TASK(1) STATEMENT CREATED");
                    rs = stmt.executeQuery(taskQuery);
                    System.out.println("TASK(1) QUERY EXECUTED");
                    boolean taskMore = rs.next();
                    System.out.println("TASK RS NEXTED");

                    while (taskMore){
                        if (rs.getString("taskname").equals(null)){
                            System.out.println("task is empty");
                            rs.next();
                        }
                        else{
                            results += rs.getString("taskname");
                            results += ":";
                            results += rs.getString("status");
                            taskMore = rs.next();
                        }
                        results += ";";
                    }
                }
                System.out.println(results);
                pw.println(results);

                //TASK UPDATE HERE
                String input, output;

                while ((input = br.readLine()) != null && (!input.equals("exit") || !input.equals("failed"))){
                    System.out.println("change made");
                    System.out.println(input);
                    String[] change = input.split(";");
                    String taskname = change[0];
                    int is = Integer.parseInt(change[1]);
                    int fs = Integer.parseInt(change[2]);
                    String time = change[3];

                    String updateQuery = "update task set status=" + fs + " where taskname='" + taskname + "'";

                    System.out.println(taskname);
                    System.out.println(is);
                    System.out.println(fs);
                    System.out.println(time);
                    System.out.println(updateQuery);

                    currentCon = ConnectionManager.getConnection();
                    System.out.println("GOT UPDATE CONNECTION");
                    stmt = currentCon.createStatement();
                    System.out.println("UPDATE STATEMENT CREATED");
                    stmt.executeUpdate(updateQuery);
                    System.out.println("UPDATE QUERY EXECUTED");
                }
                if (input.equals("exit")){
                    System.out.println("user " + username + " logged out");
                    serverSocket.close();
                    pw.close();
                    br.close();
                }
                else if (input.equals("failed")){
                    System.out.println("login failed");
                    serverSocket.close();
                    pw.close();
                    br.close();
                }
            }
            
            
            
            String exit;
            if ((exit = br.readLine()).equals("logout"))
            {
                pw.println("bye");
                System.out.println("BYE");
                serverSocket.close();
                pw.close();
                br.close();
            }
            
        }catch(Exception ex){
            System.out.println("CONNECTION ERROR");
            ex.getMessage();
        }
    }
    
    public static void listTask(String username){
        
        Statement stmt = null;
        
        try{
            String searchQuery = "SELECT idtask FROM do WHERE username='"+username+"'";
            
            currentCon = ConnectionManager.getConnection();
            System.out.println("GOT TASK CONNECTION");
            stmt = currentCon.createStatement();
            System.out.println("TASK STATEMENT CREATED");
            rs = stmt.executeQuery(searchQuery);
            System.out.println("TASK QUERY EXECUTED");
            boolean more = rs.next();
            System.out.println("TASK RS NEXTED");
            
            while(more){
                task.add(rs.getString("idtask"));
                System.out.println("TASK ADDED");
                more = rs.next();
            }
            
        }catch (Exception ex){
            System.out.println("LISTING ERROR");
        }
    }*/
    
    public static void main(String[] args) {
        try{
        serverSocket = new ServerSocket(8899);
        }catch (Exception e){}
        while (true){
            try{
            new ServerThread(serverSocket.accept()).start();
            }
            catch(Exception ex){}
        }
    }
}
