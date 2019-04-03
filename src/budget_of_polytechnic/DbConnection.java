package budget_of_polytechnic;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DbConnection {

    public ResultSet rs;
   public Statement st;
   public Connection con;
    private Connection DbConnection;

    public Connection connect() {
         try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/budget_of_polytechnic","root","");
                st = con.createStatement();
               }
       catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        
        }
        return DbConnection;
    }

}