import java.sql.*;
import java.util.Scanner;

class JDBC_Example
{
    public static void main(String[] args)
    {
        try{
			//1. Registering JDBC Driver with Driver Manager
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("DRIVER LOADED.");

			//2. Establish Connection with Database
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Allen", "Allen0209");
			System.out.println("CONNECTION OPENED.\n");

			//3. Creating SQL Statement
			Statement stmt = con.createStatement();
			System.out.println("STATEMENTS CREATED.\n");

			// Just to make sure the table is not already created.
			try{stmt.execute("drop table mytable");}catch(Exception e2){}

			//4. Executing the SQL Statement
				//Creating Table
				stmt.execute("create table mytable(id number(1), name char(1), avg number(3,1))");
				System.out.println("Table created.\n");

				//Inserting into Table
				int i = stmt.executeUpdate("insert all into mytable values(1, 'A', 6.5) into mytable values(2, 'B', 7.3) into mytable values(3, 'C', 7.5) into mytable values(4, 'D', 9.1) into mytable values(5, 'E', 10.0) into mytable values(6, 'F', 4.2) select * from dual");
				System.out.printf("%d rows inserted.\n\n", i);
				
				//Selecting Table
				ResultSet a = stmt.executeQuery("select * from mytable");
				System.out.println("Table Contents:\nID NAME AVG");
			//5. Process the Results using previous(),next() and getInt(),getString() methods
			while(a.next())
				System.out.println(a.getString(1) + "  " + a.getString(2) + "    " + a.getString(3));

				//Deleting Table Rows
				int d = stmt.executeUpdate("delete from mytable where avg < 6.5");
				System.out.printf("\n%d rows deleted.\n\n", d);

				//Updating Table Rows
				int u = stmt.executeUpdate("update mytable set avg = 7.5 where 6.5 < avg and avg < 7.5");
				System.out.printf("%d rows updated.\n\n", u);

				//Inserting into Table [Dynamically]
				PreparedStatement pstmt = con.prepareStatement("insert into mytable values(?, ?, ?)");
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the details of student to be inserted:");
				String rno = sc.next(), name = sc.next(), avg = sc.next(); sc.close();
				pstmt.setString(1, rno); pstmt.setString(2, name); pstmt.setString(3, avg); 
				pstmt.executeUpdate();

				//Selecting Table
				ResultSet rs = stmt.executeQuery("select * from mytable");
				System.out.println("\nTable Contents:\nID NAME AVG");
				while(rs.next())
					System.out.println(rs.getString(1) + "  " + rs.getString(2) + "    " + rs.getString(3));
				
				//Dropping Table
				stmt.execute("drop table mytable");
                System.out.println("\nTable dropped.");

			//6. Closing the Connection
            con.close();
            System.out.println("CONNECTION CLOSED.\n");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

/* Output:

DRIVER LOADED.
CONNECTION OPENED.

STATEMENTS CREATED.

Table created.

6 rows inserted.

Table Contents:
ID NAME AVG
1  A    6.5
2  B    7.3
3  C    7.5
4  D    9.1
5  E    10
6  F    4.2

1 rows deleted.

1 rows updated.

Enter the details of student to be inserted:
7
G
7.4

Table Contents:
ID NAME AVG
1  A    6.5
2  B    7.5
3  C    7.5
4  D    9.1
5  E    10
7  G    7.4

Table dropped.
CONNECTION CLOSED.
*/

/*
 * executeQuery: Returns one ResultSet object.
 * executeUpdate: Returns an integer representing the number of rows affected by the SQL statement. Use this method if you are using INSERT, DELETE, or UPDATE SQL statements.
 * execute: Returns true if the first object that the query returns is a ResultSet object. Use this method if the query could return one or more ResultSet objects. Retrieve the ResultSet objects returned from the query by repeatedly calling Statement.getResultSet.
 */