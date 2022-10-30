package com.burhan.servlets;

import com.burhan.servlets.dao.UserDao;
import com.burhan.servlets.model.User;
import com.burhan.servlets.model.util.Validate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class GetUserController extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String user_name = (req.getParameter("user_name"));
        String user_password = (req.getParameter("password"));
        UserDao dao = new UserDao();
        User user = null;
        try {
            user = dao.getUser(user_name);
            if(Validate.isNull(user_name) || Validate.isNull(user_password))
                throw new Error("USER NAME OR PASSWORD cannot be null");
            if(!Validate.isValid(user_name, user.getUserName()) ||
                                    !Validate.isValid(user_password, user.getPassword()))
                throw new Error("INVALID USERNAME OR PASSWORD");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        req.setAttribute("user", user);
        RequestDispatcher rd = req.getRequestDispatcher("showUser.jsp");
        rd.forward(req, res);

    }
}
