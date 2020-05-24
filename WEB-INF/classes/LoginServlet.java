package hris.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

import hris.bean.Employee;
import hris.bean.EmployeeDbUtil;

public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession session = request.getSession();
        Employee eLogin = (Employee) session.getAttribute("eLogin");
        
        if (session.isNew()) {
            eLogin = new Employee(request.getParameter("j_username"), request.getParameter("j_password"));
            session.setAttribute("eLogin", eLogin);
        }
        
        EmployeeDbUtil eDbUtil = new EmployeeDbUtil();

        if (eDbUtil.validate(eLogin)) {
            response.sendRedirect("/Hris/user.jsp");
        } else {
            response.sendRedirect("/Hris/user.jsp");
        }
    }
}