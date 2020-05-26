package hris.bean;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDbUtil {
    private List<Employee> employees;
    private static Connection con;

    public static Connection gConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hris_db", "root", "surajh");
        } catch (Exception igonred) {
        }

        return con;
    }

    public Employee validate(String user, String pass) throws Exception {

        Connection con = null;
        PreparedStatement ps = null;
        String query = "SELECT * FROM employees WHERE username=? AND password=?";
        ResultSet rs = null;
        Employee employee = null;

        try {
            con = gConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();

            if (rs.next()) {
                int employeeId = rs.getInt("employee_id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String state = rs.getString("state");
                String city = rs.getString("city");
                String dateOfBirth = rs.getString("date_of_birth");
                long phoneNo = rs.getLong("phone_no");
                String email = rs.getString("email");
                String qualification = rs.getString("qualification");
                String postLevel = rs.getString("post_level");
                String joiningDate = rs.getString("joining_date");
                int departmentId = rs.getInt("department_id");
                int branchId = rs.getInt("branch_id");
                double salary = rs.getDouble("salary");
                String username = rs.getString("username");
                String password = rs.getString("password");

                employee = new Employee(employeeId, firstName, lastName, state, city, dateOfBirth, phoneNo, email,
                        qualification, postLevel, joiningDate, departmentId, branchId, salary, username, password);

                return employee;
            }

        } finally {
            rs.close();
            ps.close();
            con.close();
        }

        return null;
    }

    public List<Employee> getEmployees() throws Exception {
        employees = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = gConnection();
            String query = "SELECT * FROM employees";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                int employeeId = rs.getInt("employee_id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String state = rs.getString("state");
                String city = rs.getString("city");
                String dateOfBirth = rs.getString("date_of_birth");
                long phoneNo = rs.getLong("phone_no");
                String email = rs.getString("email");
                String qualification = rs.getString("qualification");
                String postLevel = rs.getString("post_level");
                String joiningDate = rs.getString("joining_date");
                int departmentId = rs.getInt("department_id");
                int branchId = rs.getInt("branch_id");
                double salary = rs.getDouble("salary");

                Employee employee = new Employee(employeeId, firstName, lastName, state, city, dateOfBirth, phoneNo,
                        email, qualification, postLevel, joiningDate, departmentId, branchId, salary);

                employees.add(employee);
            }

        } catch (Exception ignored) {

        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (Exception e) {
            }
        }

        return employees;
    }

    public Employee getEmployee(int employeeId) throws Exception {

        Employee employee = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = gConnection();
            String query = "SELECT * FROM employees WHERE employee_id = ?";
            ps = con.prepareStatement(query);
            ps.setInt(1, employeeId);
            rs = ps.executeQuery();

            if (rs.next()) {
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String state = rs.getString("state");
                String city = rs.getString("city");
                String dateOfBirth = rs.getString("date_of_birth");
                long phoneNo = rs.getLong("phone_no");
                String email = rs.getString("email");
                String qualification = rs.getString("qualification");
                String postLevel = rs.getString("post_level");
                String joiningDate = rs.getString("joining_date");
                int departmentId = rs.getInt("department_id");
                int branchId = rs.getInt("branch_id");
                double salary = rs.getDouble("salary");

                employee = new Employee(employeeId, firstName, lastName, state, city, dateOfBirth, phoneNo, email,
                        qualification, postLevel, joiningDate, departmentId, branchId, salary);
            } else {
                throw new Exception("Could not find employee with " + employeeId);
            }

        } finally {
            rs.close();
            ps.close();
            con.close();
        }

        return employee;
    }

    public void updateEmployee(Employee employee) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = gConnection();
            String query = "UPDATE employees "
                    + "SET first_name=?, last_name=?, state=?, city=?, date_of_birth=?, phone_no=?, email=?, qualification=?, post_level=?, joining_date=?, department_id=?, branch_id=?, salary=? "
                    + "WHERE employee_id=?";

            ps = con.prepareStatement(query);
            ps.setString(1, employee.getFirstName());
            ps.setString(2, employee.getLastName());
            ps.setString(3, employee.getState());
            ps.setString(4, employee.getCity());
            ps.setString(5, employee.getDateOfBirth());
            ps.setLong(6, employee.getPhoneNo());
            ps.setString(7, employee.getEmail());
            ps.setString(8, employee.getQualification());
            ps.setString(9, employee.getPostLevel());
            ps.setString(10, employee.getJoiningDate());
            ps.setInt(11, employee.getDepartmentId());
            ps.setInt(12, employee.getBranchId());
            ps.setDouble(13, employee.getSalary());
            ps.setInt(14, employee.getEmployeeId());
            ps.execute();

        } finally {
            ps.close();
            con.close();
        }
    }

    public void addEmployee(Employee employee) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = EmployeeDbUtil.gConnection();
            String query = "INSERT INTO employees "
                    + "(employee_id, first_name, last_name, state, city, date_of_birth, phone_no, email, qualification, post_level, joining_date, department_id, branch_id, salary, username, password) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            ps = con.prepareStatement(query);
            ps.setInt(1, employee.getEmployeeId());
            ps.setString(2, employee.getFirstName());
            ps.setString(3, employee.getLastName());
            ps.setString(4, employee.getState());
            ps.setString(5, employee.getCity());
            ps.setString(6, employee.getDateOfBirth());
            ps.setLong(7, employee.getPhoneNo());
            ps.setString(8, employee.getEmail());
            ps.setString(9, employee.getQualification());
            ps.setString(10, employee.getPostLevel());
            ps.setString(11, employee.getJoiningDate());
            ps.setInt(12, employee.getDepartmentId());
            ps.setInt(13, employee.getBranchId());
            ps.setDouble(14, employee.getSalary());
            ps.setString(15, employee.getUsername());
            ps.setString(16, employee.getPassword());
            ps.executeUpdate();
        } finally {
            ps.close();
            con.close();
        }
    }

    public void deleteEmployee(int employeeId) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = gConnection();
            String query = "DELETE FROM employees WHERE employee_id=?";
            ps = con.prepareStatement(query);
            ps.setInt(1, employeeId);
            ps.execute();
        } finally {
            ps.close();
            con.close();
        }
    }

}