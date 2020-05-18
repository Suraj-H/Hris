package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.EmployeeBean;

public class AddEmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        int status = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hris_db", "root", "surajh");
            String query = "INSERT INTO employee VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, Integer.parseInt(request.getParameter("employeeId")));
            ps.setString(2, request.getParameter("fullName"));
            ps.setInt(3, Integer.parseInt(request.getParameter("age")));
            ps.setString(4, request.getParameter("address"));
            ps.setString(5, request.getParameter("dateOfBirth"));
            ps.setInt(6, Integer.parseInt(request.getParameter("phoneNo")));
            ps.setString(7, request.getParameter("emailId"));
            ps.setString(8, request.getParameter("qualification"));
            ps.setString(9, request.getParameter("postLevel"));
            ps.setString(10, request.getParameter("joiningDate"));
            ps.setInt(11, Integer.parseInt(request.getParameter("departmentId")));
            ps.setInt(12, Integer.parseInt(request.getParameter("branchId")));
            ps.setInt(13, Integer.parseInt(request.getParameter("salary")));
            status = ps.executeUpdate();
            con.close();

            if (status != 0) 
                request.getRequestDispatcher("/Hris/viewDetails.jsp").forward(request, response);
            else 
                response.sendRedirect("/Hris/addEmployee.jsp");
            
        } catch (Exception ignored) { }
    }
}