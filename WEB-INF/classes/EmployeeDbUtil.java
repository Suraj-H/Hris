package hris.bean;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import hris.bean.Employee;

public class EmployeeDbUtil {
    private List<Employee> employees;
    private static Connection con;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hris_db", "root", "surajh");
        } catch (Exception igonred) {}
    }

    public static Connection gConnection() {
        return con;
    }

    public boolean validate(Employee employee) {
        boolean status = false;
        
        try {
            Connection con = gConnection();

            PreparedStatement ps = con.prepareStatement("SELECT * FROM employees WHERE username=? AND password=?");

            ps.setString(1, employee.getUsername());
            ps.setString(2, employee.getPassword());

            ResultSet rs = ps.executeQuery();
            status = rs.next();

        } catch (Exception igonred) { }

        return status;
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
                Date dateOfBirth = rs.getDate("date_of_birth");
                long phoneNo = rs.getLong("phone_no");
                String email = rs.getString("email");
                String qualification = rs.getString("qualification");
                String postLevel = rs.getString("post_level");
                String joiningDate = rs.getString("joining_date");
                int departmentId = rs.getInt("department_id");
                int branchId = rs.getInt("branch_id");
                double salary = rs.getDouble("salary");

                Employee employee = new Employee(
                    employeeId, firstName, lastName, state, city, dateOfBirth, phoneNo, email, qualification, postLevel, joiningDate, departmentId, branchId, salary);
                
                employees.add(employee);
            }

        } catch (Exception ignored) {

        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (Exception e) { }
        }

        return employees;
    }

    /*
    public static boolean addEmployee(Employeemployee employee) {
        int status = 0;
        try {
            Connection con = ConnectionProvider.getConnection();
            String query = "INSERT INTO employee(full_name, age, address, date_of_birth, phone_no, email_id, qualification, post_level, joining_date, department_id, branch_id, salary) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, employee.getFullName());
            ps.setInt(2, employee.getAge());
            ps.setString(3, employee.getAddress());
            ps.setString(4, employee.getDateOfBirth());
            ps.setInt(5, employee.getPhoneNo());
            ps.setString(6, employee.getEmailId());
            ps.setString(7, employee.getQualification());
            ps.setString(8, employee.getPostLevel());
            ps.setString(9, employee.getJoiningDate());
            ps.setInt(10, employee.getDepartmentId());
            ps.setInt(11, employee.getBranchId());
            ps.setInt(12, employee.getSalary());

            status = ps.executeUpdate();

        } catch (Exception ignored) {
        }

        return (status != 0);
    }

    public static boolean deleteEmployee(Employeemployee employee) {
        int status = 0;
        try {
            Connection con = ConnectionProvider.getConnection();
            String query = "DELETE FROM employee WHERE employee_id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, employee.getEmployeeId());
            status = ps.executeUpdate();
        } catch (Exception ignored) {
        }

        return (status != 0);
    }
    */
}