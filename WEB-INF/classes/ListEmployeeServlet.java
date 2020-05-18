package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.EmployeeDbUtil;
import bean.EmployeeBean;

public class ListEmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            List<EmployeeBean> employees = new EmployeeDbUtil().getEmployees();
            request.setAttribute("employeeList", employees);
            request.getRequestDispatcher("/listEmployees.jsp").forward(request, response);
        } catch (Exception ex) {
            throw new ServletException(ex);
        }
    }
}