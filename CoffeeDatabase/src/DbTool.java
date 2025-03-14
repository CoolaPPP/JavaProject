import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DbTool {

    private Connection connection = null;
    private Statement stmt = null;
    DbTool() {
        System.out.println("***** Coffee Constructor ******");
        // Database connection properties
        String url = "jdbc:mysql://localhost:3306/coffee";
        String username = "root";
        String password = " ";
        try{
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // Establish the database connection
            connection = DriverManager.getConnection(url, username, password);
            // Print a success message
            System.out.println("Database connection successful!");
            Statement stmt = connection.createStatement();
            String bean = "CREATE TABLE IF NOT EXISTS  coffeeBean "+
                        "(bean_id char(4) NOT NULL,"+
                        "name char(30) NOT NULL,"+
                        "region char(30) NOT NULL,"+
                        "PRIMARY KEY (bean_id))";
            
            int i = stmt.executeUpdate(bean);
            System.out.println("Table Created at "+i);

            String locate = "CREATE TABLE IF NOT EXISTS  coffeeLocate "+
                        "(locate_id char(4) NOT NULL,"+
                        "name char(30) NOT NULL,"+
                        "city char(30) NOT NULL,"+
                        "country char(30) NOT NULL,"+
                        "level char(5) NOT NULL,"+
                        "PRIMARY KEY (locate_id))";
            
            int j = stmt.executeUpdate(locate);
            System.out.println("Table Created at "+j);

            String product = "CREATE TABLE IF NOT EXISTS  coffeeProduct "+
                        "(product_id char(4) NOT NULL,"+
                        "name char(30) NOT NULL,"+
                        "detail char(30) NOT NULL,"+
                        "price float(4) NOT NULL,"+
                        "PRIMARY KEY (product_id))";
            
            int k = stmt.executeUpdate(product);
            System.out.println("Table Created at "+k);


       }
        catch (ClassNotFoundException e) {
            // MySQL JDBC driver not found
            System.out.println("MySQL JDBC driver not found!");
            e.printStackTrace();
         }
         catch (SQLException e) {
            // Error establishing connection
            System.out.println("Failed to connect to the database!");
            e.printStackTrace();
        } 
    }


//   public List<Student_his> selectAll(){
//     System.out.println("***** SELECT ALL ******");
//     String sql = "SELECT * FROM Student;";
//     List<Student_his> data=null;
//     ResultSet rs ;
//     try{
//         rs = stmt.executeQuery(sql);
//         while ( rs.next() ) {
//             String id = rs.getString("id");
//             String  name = rs.getString("name");
//             String  address = rs.getString("address");
//             String tel = rs.getString("tel");
//             byte age  = rs.getByte("age");
            
            
//             Student_his obj = new Student_his(id, name, address,tel,age);
//             data.add(obj);
//         }
//         return data;
//     }catch( Exception e ) {
//         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
//         System.exit(0);
//         return data;
//     } 
//   }

/*   public void UpdateData(String id, String name, String address,String tel,int age){
    System.out.println("***** Update ******");    
    String sql = "UPDATE student set ";
            sql =sql+ " Name = '"+name+"',";
            sql =sql+ " Address = '"+address;
            sql =sql+ "' ,Tel = '"+tel+"',";
            sql =sql+ " Age = " + age;
            sql =sql+ " where id='"+id+"';";
        try{
            stmt.executeUpdate(sql);
            // conn.commit();
        }catch(Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.out.println(sql);
            System.exit(0);
        }
    }
*/

    public abstract void displayAllData();

    public abstract void showCoffeeBeanData();
    public abstract void showCoffeeLocateData();
    public abstract void showCoffeeProductData();

    public abstract void insertCoffeeBeanData(String bean_id, String name, String region);
    public abstract void insertCoffeeLocateData(String locate_id, String name, String city, String country, String level);
    public abstract void insertCoffeeProductData(String product_id, String name, String detail, Float price);

    public abstract void updateCoffeeBeanData(String bean_id, String name, String region);
    public abstract void updateCoffeeLocateData(String locate_id, String name, String city, String country, String level);
    public abstract void updateCoffeeProductData(String product_id, String name, String detail, Float price);

    public abstract void DeleteCoffeeBeanData(String bean_id);
    public abstract void DeleteCoffeeLocateData(String locate_id);
    public abstract void DeleteCoffeeProductData(String product_id);

    public abstract void CloseDb();

}