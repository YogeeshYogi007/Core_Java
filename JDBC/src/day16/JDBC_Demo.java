package day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Demo {

	public static void main(String[] args) throws Exception {
	
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sample","Yogeesh","tiger");
			Statement st=con.createStatement();
			//to create a table in student
			String query="create table student (ID int primary key,SName varchar(20), SMarks int)";
			//to insert values into column
			String query1= "insert into student values (1,'yogi',20)";
			//to update values in column
			String query2= "update student set SName='Yogi' where ID=1";
			//to create table using alter
			String query3= "alter table student add (percentage double)";
			//to rename column using alter
			String query4= "alter table student rename column percentage to CGPA";
			//to drop column using alter
			String query5= "alter table student drop CGPA";
			//to delete any row
			 String query6= "delete from  student where ID=1";
			st.executeUpdate(query);
			//st.executeUpdate(query1);
			///st.executeUpdate(query2);
			//st.executeUpdate(query3);
			//st.executeUpdate(query4);
			//st.executeUpdate(query5);
			//st.executeUpdate(query6);
			//System.out.println("Students Table created successfully");
			//System.out.println("Row inserted succesfully");
			//System.out.println("updated successfull"); 
			//System.out.println("new column added using alter successfull"); 
			//System.out.println("Rename column using alter successfull");
			//System.out.println("Drop column using alter successfull");
			System.out.println("deleted succesfully");
			st.close();
			con.close();
			
			
		}
	}


