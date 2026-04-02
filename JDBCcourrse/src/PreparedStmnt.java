import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedStmnt {
    public static void main(String[] args) throws Exception {
        /*
        <---steps to follow------>
        import the package
        Load Driver and  Register driver
        Create connection
        Create statement
        Execute statement
        close
         */
        int sid=108;
        int marks=98;
        String sname="Jasmine";
        String url="jdbc:postgresql://localhost:5432/Demo";
        String uname="postgres";
        String pass="49309";
        String sql=" insert into student values(?,?,?)";
       Connection con = DriverManager.getConnection(url,uname,pass);
        PreparedStatement st=con.prepareStatement(sql);
        st.setInt(1,sid);
        st.setInt(2,marks);
        st.setString(3,sname);
        st.executeUpdate();
    }
}
