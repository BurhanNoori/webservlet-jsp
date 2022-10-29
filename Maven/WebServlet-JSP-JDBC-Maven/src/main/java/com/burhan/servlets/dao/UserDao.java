package com.burhan.servlets.dao;

import com.burhan.servlets.model.User;

import java.sql.*;


public class UserDao {

    public User getUser(String user_name) throws SQLException, ClassNotFoundException {

        User user = new User();
        //To work with the database following are the steps:

        //1. Import the package

        //2.  Get Class from Driver String
        Class.forName("org.postgresql.Driver");


        //3. Make Connection by passing 3 params(url, uname, password)
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/calcusers", "postgres", "pgadmin14");
        if (conn != null)
            System.out.println("Postgres db connected...");
        else
            System.out.println("Connection Error");
        //4. After connection, we need to make Statement object to talk to database

        Statement st = conn.createStatement();

        //5. Executing Query
        //6. The moment we fire st.executeQuery() it gives you the data in the table form. To store this data we need an object of Class ResultSet.
        ResultSet rs = st.executeQuery("SELECT * FROM users WHERE user_name='" + user_name + "'" );

        //7. If you have a record it means the rs.next() is not null.
        if (rs.next()) {
            user.setUserId(rs.getString("user_id"));
            user.setUserName(rs.getString("user_name"));
            user.setPassword(rs.getString("user_password"));
        }
        conn.close();

        return user;
    }
}

