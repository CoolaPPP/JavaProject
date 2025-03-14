import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class coffee extends DbTool {

    private Connection connection = null;

    coffee() {
        System.out.println("***** Coffee Constructor ******");
        // Database connection properties
        String url = "jdbc:mysql://localhost:3306/coffee";
        String username = "root";
        String password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected successful!");
        }
        catch(Exception e) {
            System.out.println( e.getClass().getName() + " : " +e.getMessage() );
            System.exit(0);
        }
    }

    //Display all Data
    public void displayAllData(){
    System.out.println("*********** Display All Data ************");
    System.out.println("*****************************************");
    System.out.println("*********** Coffee Bean Data ************");
    try {
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("Select * From coffeeBean");
        while(rs.next()){
            //Display values
            System.out.print("ID : " + rs.getString("bean_id"));
            System.out.println("");
            System.out.print("Name : " + rs.getString("name"));
            System.out.println("");
            System.out.print("Region : " + rs.getString("region"));
            System.out.println("");
            System.out.println("-----------------------------------------");
        }
    } catch (Exception e) {
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        System.exit(0);
    }
    System.out.println("*****************************************");
    System.out.println("********* Coffee Region Data **********");
    try {
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("Select * From coffeeLocate");
        while(rs.next()){
            //Display values
            System.out.print("ID : " + rs.getString("locate_id"));
            System.out.println("");
            System.out.print("Name : " + rs.getString("name"));
            System.out.println("");
            System.out.print("City : " + rs.getString("city"));
            System.out.println("");
            System.out.print("Country : " + rs.getString("country"));
            System.out.println("");
            System.out.print("Level : " + rs.getString("level"));
            System.out.println("");
            System.out.println("-----------------------------------------");
        }
    } catch (Exception e) {
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        System.exit(0);
    }
    System.out.println("*****************************************");
    System.out.println("********** Coffee Product Data **********");
    try {
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("Select * From coffeeProduct");
        while(rs.next()){
            //Display values
            System.out.print("ID : " + rs.getString("product_id"));
            System.out.println("");
            System.out.print("Name : " + rs.getString("name"));
            System.out.println("");
            System.out.print("Detail : " + rs.getString("detail"));
            System.out.println("");
            System.out.print("Price : " + rs.getFloat("price"));
            System.out.println("");
            System.out.println("-----------------------------------------");
        }
    } catch (Exception e) {
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        System.exit(0);
    }
    System.out.println("*****************************************");
 }

//  ===============================================================================
  //coffeeBean Table
  //insert
  public void insertCoffeeBeanData(String bean_id, String name, String region){
    System.out.println("***** Insert Coffee Bean Data ******");
    String sql;
    sql = "INSERT INTO coffeeBean (bean_id,name,region) " +
                        "VALUES('"+bean_id+"','"+name+"','"+region+"');";
    System.out.println(sql);
    try{
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(sql);
    }catch( Exception e ) {
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        System.exit(0);
    }               
  }
  //update
  public void updateCoffeeBeanData(String bean_id, String name, String region){
    System.out.println("***** Update Coffee Bean Data ******");
    String sql;
    sql = "UPDATE coffeeBean "+
                "SET name = '"+name+"', region = '"+region+"' "+
                "WHERE bean_id = '"+bean_id+"'";
    System.out.println(sql);
    try{
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(sql);
    }catch( Exception e ) {
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        System.exit(0);
    }               
  }
  //delete
  public void DeleteCoffeeBeanData(String bean_id){
    System.out.println("***** Delete Coffee Bean Data ******");
    String sql;
    sql = "DELETE FROM coffeeBean WHERE bean_id ='"+bean_id+"';";
    System.out.println(sql);
    try{
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(sql);
    }catch( Exception e ) {
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        System.exit(0);
    }               
}
//show
public void showCoffeeBeanData(){
    System.out.println("***** Show Coffee Bean Data ******");
    try {
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("Select * From coffeeBean");
        while(rs.next()){
            //Display values
            System.out.print("ID : " + rs.getString("bean_id"));
            System.out.println("");
            System.out.print("Name : " + rs.getString("name"));
            System.out.println("");
            System.out.print("Region : " + rs.getString("region"));
            System.out.println("");
        }
    } catch (Exception e) {
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        System.exit(0);
    }
}
//  ===============================================================================

//  ===============================================================================
  //coffeeLocate Table
  //insert
  public void insertCoffeeLocateData(String locate_id, String name, String city, String country, String level){
    System.out.println("***** Insert Coffee Region Data ******");
    String sql;
    sql = "INSERT INTO coffeeLocate (locate_id,name,city,country,level) " +
                        "VALUES('"+locate_id+"','"+name+"','"+city+"','"+country+"','"+level+"');";
    System.out.println(sql);
    try{
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(sql);
    }catch( Exception e ) {
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        System.exit(0);
    }               
  }
  //update
  public void updateCoffeeLocateData(String locate_id, String name, String city, String country, String level){
    System.out.println("***** Update Coffee Region Data ******");
    String sql;
    sql = "UPDATE coffeeLocate "+
                "SET name = '"+name+"', city = '"+city+"', , country = '"+country+"', , level = '"+level+"' "+
                "WHERE locate_id = '"+locate_id+"'";
    System.out.println(sql);
    try{
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(sql);
    }catch( Exception e ) {
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        System.exit(0);
    }               
  }
  //delete
  public void DeleteCoffeeLocateData(String locate_id){
    System.out.println("***** Delete Coffee Region Data ******");
    String sql;
    sql = "DELETE FROM coffeeLocate WHERE locate_id ='"+locate_id+"';";
    System.out.println(sql);
    try{
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(sql);
    }catch( Exception e ) {
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        System.exit(0);
    }               
}
//show
public void showCoffeeLocateData(){
    System.out.println("***** Show Coffee Region Data ******");
    try {
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("Select * From coffeeLocate");
        while(rs.next()){
            //Display values
            System.out.print("ID : " + rs.getString("locate_id"));
            System.out.println("");
            System.out.print("Name : " + rs.getString("name"));
            System.out.println("");
            System.out.print("City : " + rs.getString("city"));
            System.out.println("");
            System.out.print("Country : " + rs.getString("country"));
            System.out.println("");
            System.out.print("Level : " + rs.getString("level"));
            System.out.println("");
        }
    } catch (Exception e) {
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        System.exit(0);
    }
}
//  ===============================================================================

//  ===============================================================================
  //coffeeProduct Table
  //insert
  public void insertCoffeeProductData(String product_id, String name, String detail, Float price){
    System.out.println("***** Insert Coffee Product Data ******");
    String sql;
    sql = "INSERT INTO coffeeProduct (product_id,name,detail,price) " +
                        "VALUES('"+product_id+"','"+name+"','"+detail+"','"+price+"');";
    System.out.println(sql);
    try{
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(sql);
    }catch( Exception e ) {
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        System.exit(0);
    }               
  }
  //update
  public void updateCoffeeProductData(String product_id, String name, String detail, Float price){
    System.out.println("***** Update Coffee Product Data ******");
    String sql;
    sql = "UPDATE coffeeProduct "+
                "SET name = '"+name+"', detail = '"+detail+"', , price = '"+price+"' "+
                "WHERE product_id = '"+product_id+"'";
    System.out.println(sql);
    try{
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(sql);
    }catch( Exception e ) {
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        System.exit(0);
    }               
  }
  //delete
  public void DeleteCoffeeProductData(String product_id){
    System.out.println("***** Delete Coffee Product Data ******");
    String sql;
    sql = "DELETE FROM coffeeProduct WHERE product_id ='"+product_id+"';";
    System.out.println(sql);
    try{
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(sql);
    }catch( Exception e ) {
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        System.exit(0);
    }               
}
//show
public void showCoffeeProductData(){
    System.out.println("***** Show Coffee Product Data ******");
    try {
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("Select * From coffeeProduct");
        while(rs.next()){
            //Display values
            System.out.print("ID : " + rs.getString("product_id"));
            System.out.println("");
            System.out.print("Name : " + rs.getString("name"));
            System.out.println("");
            System.out.print("Detail : " + rs.getString("detail"));
            System.out.println("");
            System.out.print("Price : " + rs.getFloat("price"));
            System.out.println("");
        }
    } catch (Exception e) {
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        System.exit(0);
    }
}
//  ===============================================================================




public void CloseDb(){
    System.out.println("***** Close Data ******");
    // Close the database connection
    if (connection != null) {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
  }
}