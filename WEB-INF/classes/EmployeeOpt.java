package bean;

import java.sql.*;

public class EmployeeOpt {
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

        } catch (Exception ignored) { }

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
        } catch (Exception ignored) { }

        return (status != 0);
    }
}