package Sql;
import java.sql.*;
import java.util.Scanner;

public class UpdateData {

static void update(){
          Scanner sc = new Scanner(System.in);
       
        try {
             System.out.println("Enter id Where you wana to change :");
        int id = sc.nextInt();
        System.out.println("Enter Name : ");
        
       String name = sc.next();
         Connection   connection = Connectiondb.getConnection();
            Statement statement = connection.createStatement();

            String query = "UPDATE student SET name = '"+name+"' WHERE id="+id;
            statement.executeUpdate(query);
           
            System.out.println("Data updated successfully.");
        } catch (SQLException e) {
      System.out.println(e);
        } 
    }
}