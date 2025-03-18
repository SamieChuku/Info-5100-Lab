/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.sql.*;
import java.util.ArrayList;
import model.Student;

/**
 *
 * @author rishabhkaushick
 */
public class DatabaseConnector {
     // Create a connection
    // DB_URL = "jdbc:<database>://ip_address:port/database_name";
    static final String DB_URL = "jdbc:mysql://localhost:3306/customerdb";
    static final String DB_USERNAME = "root";
    static final String DB_PASSWORD = "my-secret-pw";
    
   
     
    // CRUD Operations on Database
    
    // C - Create: Inserting data into the database
    public static void addStudent(Student s1) throws SQLException{
        String query = "INSERT INTO student(firstname, lastname, gender, age, emailaddress, phonenumber, hobbies) VALUES (?, ?, ?, ?, ?, ?, ?) ";
        try{
            // Create a connection
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, s1.getFirstname());
            stmt.setString(2, s1.getLastname());
            stmt.setString(3, s1.getGender());
            stmt.setInt(4, s1.getAge());
            stmt.setString(5, s1.getEmailaddress());
            stmt.setString(6, s1.getPhonenumber());
            stmt.setString(7, s1.getHobbies());
            
            // After this query will look like:
            // "INSERT INTO patient(first_name, age, college, hobbies) VALUES ('Rish', 28, 'COE', 'Football, guitar') "
            int rows = stmt.executeUpdate();
            System.out.println("Rows inserted: "+rows);
            
            // Close the connection
            conn.close();
        } catch (SQLException sqle){
            System.out.println("SQL Exception Occured.");            
            System.out.println(sqle);
        } catch (Exception ex){
            System.out.println(ex);
        }
        
        
    }
    // R - Read: Getting all the values from the database
    
    public static ArrayList<Student> getStudents(){
        ArrayList <Student> Students = new ArrayList();
        String query = "SELECT * FROM student";
        try{
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Student s1 = new Student();
                s1.setStudent_id(rs.getInt("student_id"));
                s1.setFirstname(rs.getString("firstname"));
                s1.setLastname(rs.getString("lastname"));
                s1.setGender(rs.getString("gender"));
                s1.setAge(rs.getInt("age"));
                s1.setEmailaddress (rs.getString("emailaddress"));
                s1.setPhonenumber(rs.getString("phonenumber"));
                s1.setHobbies(rs.getString("hobbies"));
                Students.add(s1);
            }
            rs.close();
            conn.close();
        } catch (SQLException sqle){
            System.out.println("SQL Exception Occured.");           
            System.out.println(sqle);
        } catch (Exception ex){
            ex.printStackTrace();
            System.out.println(ex);
        }
        return Students;
    }
    
    // U - Update: Changing a value in the database
    public static void updateStudent(Student oldStudent, Student updatedStudent){
            String query = "UPDATE student SET firstname = ?, lastname = ?, gender = ?, age = ?, emailaddress = ?, phonenumber = ?, hobbies = ? WHERE student_id = ? ";
            // Update the query
        try{
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, updatedStudent.getFirstname());
            stmt.setString(2, updatedStudent.getLastname());
            stmt.setString(3, updatedStudent.getGender());
            stmt.setInt(4, updatedStudent.getAge());
            stmt.setString(5, updatedStudent.getEmailaddress());
            stmt.setString(6, updatedStudent.getPhonenumber());
            stmt.setString(7, updatedStudent.getHobbies());
            stmt.setInt(8, oldStudent.getStudent_id());
            int rows = stmt.executeUpdate();
            System.out.println("Rows updated: "+rows);
            conn.close();
        } catch (SQLException sqle){
            System.out.println("SQL Exception Occured.");            
            System.out.println(sqle);
        } catch (Exception ex){
            System.out.println(ex);
        }
    }
    
    // D - Delete 
    public static void deleteStudent(Student s1){
        String query = "DELETE FROM student WHERE student_id = ?";
        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, s1.getStudent_id());
            int rows = stmt.executeUpdate();
            System.out.println("Rows deleted: "+rows);
            conn.close();
        } catch (SQLException sqle){
            System.out.println("SQL Exception Occured.");            
            System.out.println(sqle);
        } catch (Exception ex){
            System.out.println(ex);
        }
    }
}
