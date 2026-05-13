// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.Statement;

// public class Demo {

//     private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
//     private static final String USERNAME = "root";
//     private static final String PASSWORD = "Vaibhaw05@";

//     public static void main(String[] args) {

//         System.out.println("Connecting to Database...");

//         try {
//             // 1. Load Driver (optional)
//             Class.forName("com.mysql.cj.jdbc.Driver");

//             // 2. Create Connection
//             Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//             System.out.println("Connected successfully!");

//             // 3. Create Statement
//             Statement stmt = con.createStatement();

//             // 4. Execute Query
//             String query = "SELECT * FROM std";
//             ResultSet rs = stmt.executeQuery(query);

//             // 5. Process Result
//             while (rs.next()) {
//                 System.out.println(
//                         rs.getInt("id") + " " +
//                         rs.getString("name") + " " +
//                         rs.getInt("age") + " " +
//                         rs.getDouble("marks")
//                 );
//             }

//             // 6. Close
//             rs.close();
//             stmt.close();
//             con.close();

//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }

//-------- NEW JDBC CONNECTION CODE --------

//  import java.util.Scanner;
//  import java.sql.*;
//  class Demo {

//      private static final String url = "jdbc:mysql://127.0.0.1:3306/studentdb";
//      private static final String user = "root";
//      private static final String password = "Vaibhaw05@";

//      public static void main(String[] args){
//          try
//          {
//              Class.forName("com.mysql.cj.jdbc.Driver");
//          }catch (ClassNotFoundException e){
//              System.out.println(e.getMessage());
//          }

//          try{
//              Connection connection = DriverManager.getConnection(url,user,password);
//              Statement statement = connection.createStatement();

//              System.out.println("Connected successfully");

//              ResultSet resultSet = statement.executeQuery("SELECT * FROM std");

//              while(resultSet.next()){
//                  System.out.println(
//                          "ID: " + resultSet.getInt(1) +
//                                  " Name: " + resultSet.getString(2)
//                  );
//              }

//          } catch (SQLException e) {
//              throw new RuntimeException(e);
//          }
//      }
//  }


//CREATE TABLE FROM THE JDBC -----------

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
// class Demo {
//
//     private static final String url = "jdbc:mysql://127.0.0.1:3306/?user=root&useSSL=false";
//     private static final String user = "root";
//    private static final String password   = "Vaibhaw05@";
//
//        public static void main(String[] args) {
//            try {
//                Class.forName("com.mysql.cj.jdbc.Driver");
//            } catch (ClassNotFoundException e) {
//                System.out.println(e.getMessage());
//            }
//
//            try {
//                Connection connection = DriverManager.getConnection(url, user, password);
//                Statement statement = connection.createStatement();
//
//                System.out.println("Connected successfully");
//
//                String createTableQuery = "CREATE TABLE IF NOT EXISTS std (" +
//                        "id INT PRIMARY KEY AUTO_INCREMENT," +
//                        "name VARCHAR(50) NOT NULL," +
//                        "age INT," +
//                        "marks DOUBLE" +
//                        ")";
//                statement.executeUpdate(createTableQuery);
//                System.out.println("Table 'std' created successfully.");
//
//            } catch (SQLException e) {
//                throw new RuntimeException(e);
//            }
//        }
//}



//--------- INSERTING RECORDS INTO THE TABLE FROM JDBC -----------

// class Demo{
//     private static final String url = "jdbc:mysql://127.0.0.1:3306/studentdb";
//     private static final String user = "root";
//     private static final String password   = "Vaibhaw05@";

//     public static void main(String[] args){

//     try{
//     Class.forName("com.mysql.cj.jdbc.Driver");
//     Connection conn = DriverManager.getConnection(url,user,password);
//     Statement stmt = conn.createStatement();
//     String insertQuery = "INSERT INTO std (name, age, marks) VALUES ('John Doe', 20, 85.5)";
//     stmt.executeUpdate(insertQuery);
//     System.out.println("Record inserted successfully.");
//     }
//     catch (Exception e){
//         System.out.println(e.getMessage());
//     }
// }
// }