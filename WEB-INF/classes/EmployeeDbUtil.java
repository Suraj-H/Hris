package bean;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import bean.EmployeeBean;

public class EmployeeDbUtil {

    public List<EmployeeBean> getEmployees() throws Exception {
        List<EmployeeBean> employees = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hris_db", "root", "surajh");
            String query = "SELECT * FROM employee";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                int employeeId = rs.getInt("employee_id");
                String fullName = rs.getString("full_name");
                int age = rs.getInt("age");
                String address = rs.getString("address");
                String dateOfBirth = rs.getString("date_of_birth");
                int phoneNo = rs.getInt("phone_no");
                String emailId = rs.getString("email_id");
                String qualification = rs.getString("qualification");
                String postLevel = rs.getString("post_level");
                String joiningDate = rs.getString("joining_date");
                int departmentId = rs.getInt("department_id");
                int branchId = rs.getInt("branch_id");
                int salary = rs.getInt("salary");

                EmployeeBean eBean = new EmployeeBean(
                    employeeId, fullName, age, address, dateOfBirth, phoneNo, emailId, qualification, postLevel, joiningDate, departmentId, branchId, salary);
                employees.add(eBean);
            }

        } catch (Exception ignored) {

        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (Exception e) {
                // TODO: handle exception
            }

        }
        return employees;
    }

    public static boolean addEmployee(EmployeeBean employee) {
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

    public static boolean deleteEmployee(EmployeeBean employee) {
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
}