import java.sql.*; //import
public class CRUD {
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
        String url="jdbc:postgresql://localhost:5432/Demo";
        String uname="postgres";
        String pass="49309";
        //String sql="insert into student values(5,88,'John')";
        //String sql="update student set sname='MAX' where sid=5";
        String sql="delete from student where sid=3";
        Class.forName("org.postgresql.Driver"); //load Driver and  Register driver and it is optinal
        Connection con = DriverManager.getConnection(url,uname,pass); //Create connection
        System.out.println("Connected");
        Statement st= con.createStatement();
         st.execute(sql);
        //System.out.println(status);
        con.close();
        System.out.println("Connection Closed");


    }
}
