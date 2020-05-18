package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.ConnectionProvider;
import bean.EmployeeBean;
import bean.LoginBean;
import bean.LoginDao;

public class GetInfoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession session = request.getSession();
        Enumeration<String> parameters = request.getParameterNames();
        EmployeeBean eBean = (EmployeeBean) session.getAttribute("employeeBean");
        try {
            Connection con = ConnectionProvider.getConnection();
            String query = "SELECT * FROM employee WHERE full_name=? AND address=? AND qualification=? AND post_level=? AND department_id=? AND branch_id=? AND salary=?";
            PreparedStatement ps = con.prepareStatement(query);
            
        } catch (Exception ignored) { }
    }

}