package hris.controller;

import hris.bean.Employee;
import hris.bean.EmployeeDbUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class EmployeeControllerServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String command = request.getParameter("command");

            if (command == null)
                command = "LIST";

            switch (command) {
                case "LIST" -> listEmployees(request, response);
                case "LOGIN" -> login(request, response);
                case "LOGOUT" -> logout(request, response);
                case "ADD" -> addEmployee(request, response);
                case "LOAD" -> loadEmployee(request, response);
                case "UPDATE" -> updateEmployee(request, response);
                case "DELETE" -> deleteEmployee(request, response);
                case "PROFILE" -> employeeProfile(request, response);
                case "EDIT_PROFILE" -> updateProfile(request, response);
                default -> listEmployees(request, response);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void login(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Employee eLogin = new EmployeeDbUtil().validate(username, password);

        if (eLogin == null)
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        else {
            Employee eProfile = new EmployeeDbUtil().getProfile(eLogin.getId());
            request.getSession().setAttribute("eLogin", eLogin);
            request.getSession().setAttribute("eProfile", eProfile);
            request.getRequestDispatcher("/user.jsp").forward(request, response);
        }
    }

    private void logout(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.getSession().removeAttribute("eLogin");
        response.sendRedirect("/Hris/index.jsp");
    }

    private void updateEmployee(HttpServletRequest request, HttpServletResponse response) throws Exception {
        int id = Integer.parseInt(request.getParameter("id"));
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String address = request.getParameter("address");
        String dateOfBirth = request.getParameter("dateOfBirth");
        long phoneNo = Long.parseLong(request.getParameter("phoneNo"));
        String email = request.getParameter("email");
        String qualification = request.getParameter("qualification");
        String designation = request.getParameter("designation");
        String joiningDate = request.getParameter("joiningDate");
        int departmentId = Integer.parseInt(request.getParameter("departmentId"));
        int branchId = Integer.parseInt(request.getParameter("branchId"));
        double salary = Double.parseDouble(request.getParameter("salary"));

        Employee employee = new Employee(id, firstName, lastName, address, dateOfBirth, phoneNo, email, qualification,
                designation, joiningDate, departmentId, branchId, salary);

        new EmployeeDbUtil().updateEmployee(employee);
        listEmployees(request, response);
    }

    private void loadEmployee(HttpServletRequest request, HttpServletResponse response) throws Exception {
        int id = Integer.parseInt(request.getParameter("id"));
        Employee employee = new EmployeeDbUtil().getEmployee(id);
        request.setAttribute("eBean", employee);
        request.getRequestDispatcher("/updateEmployee.jsp").forward(request, response);
    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) throws Exception {
        int id = Integer.parseInt(request.getParameter("id"));
        new EmployeeDbUtil().deleteEmployee(id);
        listEmployees(request, response);
    }

    private void listEmployees(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<Employee> employees = new EmployeeDbUtil().getEmployees();
        request.setAttribute("employeeList", employees);
        request.getRequestDispatcher("/listEmployees.jsp").forward(request, response);
    }

    private void addEmployee(HttpServletRequest request, HttpServletResponse response) throws Exception {
        int id = Integer.parseInt(request.getParameter("id"));
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String address = request.getParameter("address");
        String dateOfBirth = request.getParameter("dateOfBirth");
        long phoneNo = Long.parseLong(request.getParameter("phoneNo"));
        String email = request.getParameter("email");
        String qualification = request.getParameter("qualification");
        String designation = request.getParameter("designation");
        String joiningDate = request.getParameter("joiningDate");
        int departmentId = Integer.parseInt(request.getParameter("departmentId"));
        int branchId = Integer.parseInt(request.getParameter("branchId"));
        double salary = Double.parseDouble(request.getParameter("salary"));
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Employee employee = new Employee(id, firstName, lastName, address, dateOfBirth, phoneNo, email, qualification,
                designation, joiningDate, departmentId, branchId, salary, username, password);

        new EmployeeDbUtil().addEmployee(employee);
        listEmployees(request, response);
    }

    private void employeeProfile(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Employee eLogin = (Employee) request.getSession().getAttribute("eLogin");
        Employee eProfile = new EmployeeDbUtil().getProfile(eLogin.getId());
        request.getSession().setAttribute("eProfile", eProfile);
        request.getRequestDispatcher("/profile.jsp").forward(request, response);
    }

    private void updateProfile(HttpServletRequest request, HttpServletResponse response) throws Exception {
        int id = Integer.parseInt(request.getParameter("id"));
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String address = request.getParameter("address");
        String dateOfBirth = request.getParameter("dateOfBirth");
        long phoneNo = Long.parseLong(request.getParameter("phoneNo"));
        String email = request.getParameter("email");
        String qualification = request.getParameter("qualification");
        String designation = request.getParameter("designation");
        String joiningDate = request.getParameter("joiningDate");
        int branchId = Integer.parseInt(request.getParameter("branchId"));
        String branchAddress = request.getParameter("branchAddress");
        String branchLocation = request.getParameter("branchLocation");
        int departmentId = Integer.parseInt(request.getParameter("departmentId"));
        String departmentName = request.getParameter("departmentName");
        double salary = Double.parseDouble(request.getParameter("salary"));

        Employee employee = new Employee(id, firstName, lastName, address, dateOfBirth, phoneNo, email, qualification,
                designation, joiningDate, branchId, branchAddress, branchLocation, departmentId, departmentName,
                salary);

        new EmployeeDbUtil().updateEmployee(employee);
        employeeProfile(request, response);
    }

}