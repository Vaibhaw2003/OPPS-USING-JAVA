import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo {

    private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Vaibhaw05@";

    public static void main(String[] args) {

        System.out.println("Connecting to Database...");

        try {
            // 1. Load Driver (optional)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connected successfully!");

            // 3. Create Statement
            Statement stmt = con.createStatement();

            // 4. Execute Query
            String query = "SELECT * FROM std";
            ResultSet rs = stmt.executeQuery(query);

            // 5. Process Result
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getInt("age") + " " +
                        rs.getDouble("marks")
                );
            }

            // 6. Close
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}