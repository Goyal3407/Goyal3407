package Sql;
import java.sql.*;

public class App {
static void Showdata(){   try {
                    Connection con=Connectiondb.getConnection();
                    Statement st= con.createStatement();
                    
                    String str = "select * from student";
        ResultSet rs=st.executeQuery(str);
        while (rs.next()) {
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
        }
                } catch (Exception e) {
        
                }
            }
        }
         
