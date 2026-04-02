import java.sql.*; //import
public class Demojdbc {
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
        String sql="select * from student";
        Class.forName("org.postgresql.Driver"); //load Driver and  Register driver and it is optinal
        Connection con = DriverManager.getConnection(url,uname,pass); //Create connection
        System.out.println("Connected");
        Statement st= con.createStatement();
        ResultSet rs =st.executeQuery(sql);
        //rs.next();//Returns true when you have next row else it will return false
//        rs.next();
//        String name =rs.getString("sname");
//        System.out.println(name);
        while(rs.next()){
            System.out.print(rs.getInt(1) + " : ");
            System.out.print(rs.getInt(2) + " : ");
            System.out.println(rs.getString(3) );
        }
        con.close();
        System.out.println("Connection Closed");


    }
}
