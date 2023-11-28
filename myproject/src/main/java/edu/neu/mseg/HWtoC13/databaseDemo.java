package edu.neu.mseg.HWtoC13;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class databaseDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employee_directory";
        String user = "springstudent";
        String password = "springstudent";
        try{
            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();

            String query = "SELECT * FROM employee";

            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String email = resultSet.getString("email");


                System.out.println("id: " + id+ ", first name: " + firstName + ", last name: "+ lastName + ", email: "+email);
            }

            // Close the result set, statement, and connection
            resultSet.close();
            statement.close();
            connection.close();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
