package Sql;
import java.sql.*;
import java.util.Scanner;
public class Delete {
    static void delete(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name to Delete : ");
        String name=sc.nextLine();
        try {
            Connection con = Connectiondb.getConnection();
            Statement st= con.createStatement();
           String str= "delete from student where name = '" +name+ "'";
           int k = st.executeUpdate(str);
           if (k>=1) {
            System.out.println("OK");
           } else {
            System.out.println("Problme ");
           }

        } catch (Exception e) {
            System.out.println(e);
                    }
    }
}
