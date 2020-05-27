package hris.controller;

import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hris.bean.Employee;
import hris.bean.EmployeeDbUtil;

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
                case "LIST":
                    listEmployees(request, response);
                    break;

                case "LOGIN":
                    login(request, response);
                    break;

                case "LOGOUT":
                    logout(request, response);
                    break;

                case "ADD":
                    addEmployee(request, response);
                    break;

                case "LOAD":
                    loadEmployee(request, response);
                    break;

                case "UPDATE":
                    updateEmployee(request, response);
                    break;

                case "DELETE":
                    deleteEmployee(request, response);
                    break;

                // case "SEARCH":
                //     searchEmployee(request, response);
                //     break;

                default:
                    listEmployees(request, response);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            addEmployee(request, response);
            listEmployees(request, response);
        } catch (Exception e) {
        }
    }

    private void login(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        try {
            Employee employee = new EmployeeDbUtil().validate(username, password);

            if (employee == null)
                request.getRequestDispatcher("/login.jsp").forward(request, response);
            else {
                request.getSession().setAttribute("eLogin", employee);
                request.getRequestDispatcher("/user.jsp").forward(request, response);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    private void logout(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.getSession().removeAttribute("eLogin");
        response.sendRedirect("/Hris/index.jsp");
    }

    // private void searchEmployee(HttpServletRequest request, HttpServletResponse response) throws Exception {

    //     String EMPLOYEEID = request.getParameter("employeeId");
    //     String FIRSTNAME = request.getParameter("firstName");
    //     String LASTNAME = request.getParameter("lastName");
    //     String STATE = request.getParameter("state");
    //     String CITY = request.getParameter("city");
    //     String DATEOFBIRTH = request.getParameter("dateOfBirth");
    //     String PHONENO = request.getParameter("phoneNo");
    //     String EMAIL = request.getParameter("email");
    //     String QUALIFICATION = request.getParameter("qualification");
    //     String POSTLEVEL = request.getParameter("postLevel");
    //     String JOININGDATE = request.getParameter("joiningDate");
    //     String DEPARTMENTID = request.getParameter("departmentId");
    //     String BRANCHID = request.getParameter("branchId");
    //     String SALARY = request.getParameter("salary");

    //     if (EMPLOYEEID == "" && FIRSTNAME == "" && LASTNAME == "" && STATE == "" && CITY == "" 
    //             && DATEOFBIRTH == "" && PHONENO == "" && EMAIL == "" && QUALIFICATION == "" && POSTLEVEL == "" 
    //             && JOININGDATE == "" && DEPARTMENTID == "" && BRANCHID == "" && SALARY == "") {
    //         Employee employee = null;
    //     }

    //     int employeeId = EMPLOYEEID.equals("") ? 0 : Integer.parseInt(EMPLOYEEID);
    //     String firstName = FIRSTNAME.equals("") ? "" : FIRSTNAME;
    //     String lastName = LASTNAME.equals("") ? "" : LASTNAME;
    //     String state = STATE.equals("") ? "" : STATE;
    //     String city = CITY.equals("") ? "" : CITY;
    //     String dateOfBirth = DATEOFBIRTH.equals("") ? "" : DATEOFBIRTH;
    //     long phoneNo = PHONENO.equals("") ? 0 : Long.parseLong(PHONENO);
    //     String email = EMAIL.equals("") ? "" : EMAIL;
    //     String qualification = QUALIFICATION.equals("") ? "" : QUALIFICATION;
    //     String postLevel = POSTLEVEL.equals("") ? "" : POSTLEVEL;
    //     String joiningDate = JOININGDATE.equals("") ? "" : JOININGDATE;
    //     int departmentId = DEPARTMENTID.equals("") ? 0 : Integer.parseInt(DEPARTMENTID);
    //     int branchId = BRANCHID.equals("") ? 0 : Integer.parseInt(BRANCHID);
    //     double salary = SALARY.equals("") ? 0 : Double.parseDouble(SALARY);

    //     Employee employee = new Employee(employeeId, firstName, lastName, state, city, dateOfBirth, phoneNo, email,
    //             qualification, postLevel, joiningDate, departmentId, branchId, salary);

    //     List<Employee> es = new EmployeeDbUtil().searchEmployees(employee);
    //     request.setAttribute("employeeFound", es);

    //     request.getRequestDispatcher("/searchResult.jsp").forward(request, response);
    // }

    private void updateEmployee(HttpServletRequest request, HttpServletResponse response) throws Exception {

        int employeeId = Integer.parseInt(request.getParameter("employeeId"));
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String state = request.getParameter("state");
        String city = request.getParameter("city");
        String dateOfBirth = request.getParameter("dateOfBirth");
        long phoneNo = Long.parseLong(request.getParameter("phoneNo"));
        String email = request.getParameter("email");
        String qualification = request.getParameter("qualification");
        String postLevel = request.getParameter("postLevel");
        String joiningDate = request.getParameter("joiningDate");
        int departmentId = Integer.parseInt(request.getParameter("departmentId"));
        int branchId = Integer.parseInt(request.getParameter("branchId"));
        double salary = Double.parseDouble(request.getParameter("salary"));

        Employee employee = new Employee(employeeId, firstName, lastName, state, city, dateOfBirth, phoneNo, email,
                qualification, postLevel, joiningDate, departmentId, branchId, salary);

        new EmployeeDbUtil().updateEmployee(employee);
        listEmployees(request, response);
    }

    private void loadEmployee(HttpServletRequest request, HttpServletResponse response) throws Exception {

        int employeeId = Integer.parseInt(request.getParameter("employeeId"));
        Employee employee = new EmployeeDbUtil().getEmployee(employeeId);
        request.setAttribute("eBean", employee);
        request.getRequestDispatcher("/updateEmployee.jsp").forward(request, response);
    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) throws Exception {

        int employeeId = Integer.parseInt(request.getParameter("employeeId"));
        new EmployeeDbUtil().deleteEmployee(employeeId);
        listEmployees(request, response);
    }

    private void listEmployees(HttpServletRequest request, HttpServletResponse response) throws Exception {

        List<Employee> employees = new EmployeeDbUtil().getEmployees();
        request.setAttribute("employeeList", employees);

        request.getRequestDispatcher("/listEmployees.jsp").forward(request, response);
    }

    private void addEmployee(HttpServletRequest request, HttpServletResponse response) throws Exception {

        int employeeId = Integer.parseInt(request.getParameter("employeeId"));
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String state = request.getParameter("state");
        String city = request.getParameter("city");
        String dateOfBirth = request.getParameter("dateOfBirth");
        long phoneNo = Long.parseLong(request.getParameter("phoneNo"));
        String email = request.getParameter("email");
        String qualification = request.getParameter("qualification");
        String postLevel = request.getParameter("postLevel");
        String joiningDate = request.getParameter("joiningDate");
        int departmentId = Integer.parseInt(request.getParameter("departmentId"));
        int branchId = Integer.parseInt(request.getParameter("branchId"));
        double salary = Double.parseDouble(request.getParameter("departmentId"));
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Employee employee = new Employee(employeeId, firstName, lastName, state, city, dateOfBirth, phoneNo, email,
                qualification, postLevel, joiningDate, departmentId, branchId, salary, username, password);

        new EmployeeDbUtil().addEmployee(employee);

        listEmployees(request, response);
    }

}