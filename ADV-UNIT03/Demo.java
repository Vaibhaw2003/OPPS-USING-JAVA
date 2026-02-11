//-------- unit03/----  JDBC --------
// JDBC: Java Database Connectivity ---------

/* 
Java Application
       ↓
JDBC API
       ↓
JDBC Driver
       ↓
Database (MySQL / Oracle / etc.)
*/


// ----------Steps to connect Java with Database using JDBC:--------
//-----------Full Example (MySQL)--------
// import java.sql.*;

// public class Demo {
//     public static void main(String[] args) {

//         String url = "jdbc:mysql://localhost:3306/testdb";
//         String username = "root";
//         String password = "root";

//         try {
//             // 1. Load Driver (optional in modern JDBC)
//             Class.forName("com.mysql.cj.jdbc.Driver");

//             // 2. Create Connection
//             Connection con = DriverManager.getConnection(url, username, password);

//             // 3. Create Statement
//             Statement stmt = con.createStatement();

//             // 4. Execute Query
//             ResultSet rs = stmt.executeQuery("SELECT * FROM student");

//             // 5. Process Result
//             while(rs.next()) {
//                 System.out.println(
//                     rs.getInt("id") + " " +
//                     rs.getString("name")
//                 );
//             }

//             // 6. Close
//             con.close();

//         } catch(Exception e) {
//             e.printStackTrace();
//         }
//     }
// }

