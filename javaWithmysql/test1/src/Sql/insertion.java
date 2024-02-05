package Sql;
import java.sql.*;
import java.util.Scanner;

public class insertion {
  static void insert(){

        Scanner sc = new Scanner(System.in);
    
      for (int i = 0; true; i++) {
       
          try { 
            
            
            System.out.println("Enter the Name or Want to exit : ");
        String str= sc.next();
        if (str.equals("exit")) {
            break;
        }
        System.out.println("Enter the Id : ");
        int x=sc.nextInt();
      
        System.out.println(" Enter the Age ");
        int age = sc.nextInt();
                    Connection con=Connectiondb.getConnection();
                    Statement st= con.createStatement();
                   String s= "insert into student(id , name , age) values ("+x+",'"+str+"',"+age+")";
                   int k = st.executeUpdate(s);

   String tr = "select * from student";
        ResultSet rs=st.executeQuery(tr);
        
        while (rs.next()) {
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
        }
                } catch (Exception e) {
        System.out.println(e);
                }
                
    
                
      }
    }
  }