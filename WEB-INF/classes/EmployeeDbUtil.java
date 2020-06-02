package hris.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDbUtil {
    private List<Employee> employees;
    private static Connection con;
    private String qString = "SELECT employee_id, first_name, last_name, s.name, c.name, date_of_birth, phone_no, email, qualification, designation, joining_date, branch_location, department_name, salary FROM employees e INNER JOIN branch_info b ON b.id = e.branch_id INNER JOIN department_info d ON d.id = e.department_id INNER JOIN state_info s ON s.id = e.state_id INNER JOIN city_info c ON c.id = e.city_id";

    public static Connection gConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hris_db", "root", "surajh");
        } catch (Exception igonred) { }

        return con;
    }

    public Employee validate(String user, String pass) throws Exception {

        Connection con = null;
        PreparedStatement ps = null;
        String query = "SELECT e.id, e.first_name, e.last_name, e.address, e.state_id, s.name, e.district_id, di.name, e.date_of_birth, e.phone_no, e.email, e.qualification, e.designation, e.joining_date, e.branch_id, b.address, e.department_id, d.name, e.salary, e.username, e.password FROM employees e INNER JOIN branch_info b ON b.id = e.branch_id INNER JOIN department_info d ON d.id = e.department_id INNER JOIN state_info s ON s.id = e.state_id INNER JOIN district_info di ON di.id = e.district_id WHERE e.username=? AND e.password=?";
        ResultSet rs = null;
        Employee employee = null;

        try {
            con = gConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("e.id");
                String firstName = rs.getString("e.first_name");
                String lastName = rs.getString("e.last_name");
                String address = rs.getString("e.address");
                int stateId = rs.getInt("e.state_id");
                String stateName = rs.getString("s.name");
                int districtId = rs.getInt("e.district_id");
                String districtName = rs.getString("di.id");
                String dateOfBirth = rs.getString("e.date_of_birth");
                long phoneNo = rs.getLong("e.phone_no");
                String email = rs.getString("e.email");
                String qualification = rs.getString("e.qualification");
                String designation = rs.getString("e.designation");
                String joiningDate = rs.getString("e.joining_date");
                int branchId = rs.getInt("e.branch_id");
                String branchAddress = rs.getString("b.address");
                int departmentId = rs.getInt("e.department_id");
                String departmentName = rs.getString("d.name");
                double salary = rs.getDouble("e.salary");
                String username = rs.getString("e.username");
                String password = rs.getString("e.password");

                employee = new Employee(id, firstName, lastName, address, stateId, stateName, districtId, districtName, dateOfBirth, phoneNo, email, qualification, designation, joiningDate, branchId, branchAddress, departmentId, departmentName, salary, username, password);

                return employee;
            }

        } finally {
            rs.close();
            ps.close();
            con.close();
        }

        return null;
    }

    // public List<Employee> getEmployees() throws Exception {
    //     employees = new ArrayList<>();
    //     Connection con = null;
    //     PreparedStatement ps = null;
    //     ResultSet rs = null;

    //     try {
    //         con = gConnection();
    //         String query = qString + " ORDER BY employee_id";
    //         ps = con.prepareStatement(query);
    //         rs = ps.executeQuery();
    //         while (rs.next()) {
    //             int employeeId = rs.getInt("employee_id");
    //             String firstName = rs.getString("first_name");
    //             String lastName = rs.getString("last_name");
    //             String state = rs.getString("state");
    //             String city = rs.getString("city");
    //             String dateOfBirth = rs.getString("date_of_birth");
    //             long phoneNo = rs.getLong("phone_no");
    //             String email = rs.getString("email");
    //             String qualification = rs.getString("qualification");
    //             String designation = rs.getString("designation");
    //             String joiningDate = rs.getString("joining_date");
    //             String departmentName = rs.getString("department_name");
    //             String branchLocation = rs.getString("branch_location");
    //             double salary = rs.getDouble("salary");

    //             Employee employee = new Employee(employeeId, firstName, lastName, state, city, dateOfBirth, phoneNo,
    //                     email, qualification, designation, joiningDate, departmentName, branchLocation, salary);

    //             employees.add(employee);
    //         }

    //     } catch (Exception ignored) {

    //     } finally {
    //         try {
    //             rs.close();
    //             ps.close();
    //             con.close();
    //         } catch (Exception e) {
    //         }
    //     }

    //     return employees;
    // }

    // public List<Employee> getLocation(String rState, String rCity) throws Exception {

    //     List<Employee> es = new ArrayList<>();
    //     Connection con = null;
    //     PreparedStatement ps = null;
    //     ResultSet rs = null;

    //     try {
    //         con = gConnection();
    //         String query = qString + " WHERE state=? AND city=?";

    //         ps = con.prepareStatement(query);
    //         ps.setString(1, rState);
    //         ps.setString(2, rCity);

    //         rs = ps.executeQuery();

    //         while (rs.next()) {
    //             int employeeId = rs.getInt("employee_id");
    //             String firstName = rs.getString("first_name");
    //             String lastName = rs.getString("last_name");
    //             String state = rs.getString("state");
    //             String city = rs.getString("city");
    //             String dateOfBirth = rs.getString("date_of_birth");
    //             long phoneNo = rs.getLong("phone_no");
    //             String email = rs.getString("email");
    //             String qualification = rs.getString("qualification");
    //             String designation = rs.getString("designation");
    //             String joiningDate = rs.getString("joining_date");
    //             String departmentName = rs.getString("department_name");
    //             String branchLocation = rs.getString("branch_location");
    //             double salary = rs.getDouble("salary");

    //             Employee employee = new Employee(employeeId, firstName, lastName, state, city, dateOfBirth, phoneNo,
    //                     email, qualification, designation, joiningDate, departmentName, branchLocation, salary);

    //             es.add(employee);
    //         }

    //     } catch (Exception ignored) {
    //     }

    //     return es;
    // }

    // public List<Employee> getQPL(String qual, String pL) throws Exception {

    //     List<Employee> es = new ArrayList<>();
    //     Connection con = null;
    //     PreparedStatement ps = null;
    //     ResultSet rs = null;

    //     try {
    //         con = gConnection();
    //         String query = qString;

    //         if (qual.length() != 0 && pL.length() != 0) {
    //             query = qString + " WHERE qualification=? AND designation=?";
    //         } else if (qual.length() != 0 && pL.length() == 0) {
    //             query = qString + " WHERE qualification=?";
    //         } else if (qual.length() == 0 && pL.length() != 0) {
    //             query = qString + " WHERE designation=?";
    //         }

    //         ps = con.prepareStatement(query);

    //         if (qual.length() != 0 && pL.length() != 0) {
    //             ps.setString(1, qual);
    //             ps.setString(2, pL);
    //         } else if (qual.length() != 0 && pL.length() == 0) {
    //             ps.setString(1, qual);
    //         } else if (qual.length() == 0 && pL.length() != 0) {
    //             ps.setString(1, pL);
    //         }

    //         rs = ps.executeQuery();

    //         while (rs.next()) {
    //             int employeeId = rs.getInt("employee_id");
    //             String firstName = rs.getString("first_name");
    //             String lastName = rs.getString("last_name");
    //             String state = rs.getString("state");
    //             String city = rs.getString("city");
    //             String dateOfBirth = rs.getString("date_of_birth");
    //             long phoneNo = rs.getLong("phone_no");
    //             String email = rs.getString("email");
    //             String qualification = rs.getString("qualification");
    //             String designation = rs.getString("designation");
    //             String joiningDate = rs.getString("joining_date");
    //             String departmentName = rs.getString("department_name");
    //             String branchLocation = rs.getString("branch_location");
    //             double salary = rs.getDouble("salary");

    //             Employee employee = new Employee(employeeId, firstName, lastName, state, city, dateOfBirth, phoneNo,
    //                     email, qualification, designation, joiningDate, departmentName, branchLocation, salary);

    //             es.add(employee);
    //         }

    //     } catch (Exception e) {
    //         // TODO: handle exception
    //     }

    //     return es;
    // }

    // public List<Employee> getBD(String rBranch, String rDepartment) throws Exception {

    //     List<Employee> es = new ArrayList<>();
    //     Connection con = null;
    //     PreparedStatement ps = null;
    //     ResultSet rs = null;

    //     try {
    //         con = gConnection();
    //         String query = qString;

    //         if (rBranch.length() != 0 && rDepartment.length() != 0) {
    //             query = qString + " WHERE branch_location=? AND department_name=?";
    //         } else if (rBranch.length() != 0 && rDepartment.length() == 0) {
    //             query = qString + " WHERE branch_location=?";
    //         } else if (rBranch.length() == 0 && rDepartment.length() != 0) {
    //             query = qString + " WHERE department_name=?";
    //         }

    //         ps = con.prepareStatement(query);

    //         if (rBranch.length() != 0 && rDepartment.length() != 0) {
    //             ps.setString(1, rBranch);
    //             ps.setString(2, rDepartment);
    //         } else if (rBranch.length() != 0 && rDepartment.length() == 0) {
    //             ps.setString(1, rBranch);
    //         } else if (rBranch.length() == 0 && rDepartment.length() != 0) {
    //             ps.setString(1, rDepartment);
    //         }

    //         rs = ps.executeQuery();

    //         while (rs.next()) {
    //             int employeeId = rs.getInt("employee_id");
    //             String firstName = rs.getString("first_name");
    //             String lastName = rs.getString("last_name");
    //             String state = rs.getString("state");
    //             String city = rs.getString("city");
    //             String dateOfBirth = rs.getString("date_of_birth");
    //             long phoneNo = rs.getLong("phone_no");
    //             String email = rs.getString("email");
    //             String qualification = rs.getString("qualification");
    //             String designation = rs.getString("designation");
    //             String joiningDate = rs.getString("joining_date");
    //             String departmentName = rs.getString("department_name");
    //             String branchLocation = rs.getString("branch_location");
    //             double salary = rs.getDouble("salary");

    //             Employee employee = new Employee(employeeId, firstName, lastName, state, city, dateOfBirth, phoneNo,
    //                     email, qualification, designation, joiningDate, departmentName, branchLocation, salary);

    //             es.add(employee);
    //         }

    //     } catch (Exception e) {
    //         // TODO: handle exception
    //     }

    //     return es;
    // }

    // public List<Employee> getName(String rFirstName, String rLastName) throws Exception {

    //     List<Employee> es = new ArrayList<>();
    //     Connection con = null;
    //     PreparedStatement ps = null;
    //     ResultSet rs = null;

    //     try {
    //         con = gConnection();
    //         String query = qString;

    //         if (rFirstName.length() != 0 && rLastName.length() != 0) {
    //             query = qString + " WHERE first_name=? AND last_name=?";
    //         } else if (rFirstName.length() != 0 && rLastName.length() == 0) {
    //             query = qString + " WHERE first_name=?";
    //         } else if (rFirstName.length() == 0 && rLastName.length() != 0) {
    //             query = qString + " WHERE last_name=?";
    //         }

    //         ps = con.prepareStatement(query);

    //         if (rFirstName.length() != 0 && rLastName.length() != 0) {
    //             ps.setString(1, rFirstName);
    //             ps.setString(2, rLastName);
    //         } else if (rFirstName.length() != 0 && rLastName.length() == 0) {
    //             ps.setString(1, rFirstName);
    //         } else if (rFirstName.length() == 0 && rLastName.length() != 0) {
    //             ps.setString(1, rLastName);
    //         }

    //         rs = ps.executeQuery();

    //         while (rs.next()) {
    //             int employeeId = rs.getInt("employee_id");
    //             String firstName = rs.getString("first_name");
    //             String lastName = rs.getString("last_name");
    //             String state = rs.getString("state");
    //             String city = rs.getString("city");
    //             String dateOfBirth = rs.getString("date_of_birth");
    //             long phoneNo = rs.getLong("phone_no");
    //             String email = rs.getString("email");
    //             String qualification = rs.getString("qualification");
    //             String designation = rs.getString("designation");
    //             String joiningDate = rs.getString("joining_date");
    //             String departmentName = rs.getString("department_name");
    //             String branchLocation = rs.getString("branch_location");
    //             double salary = rs.getDouble("salary");

    //             Employee employee = new Employee(employeeId, firstName, lastName, state, city, dateOfBirth, phoneNo,
    //                     email, qualification, designation, joiningDate, departmentName, branchLocation, salary);

    //             es.add(employee);
    //         }

    //     } catch (Exception e) {
    //         // TODO: handle exception
    //     }

    //     return es;
    // }

    // public List<Employee> getSalary(String lessThan, String greaterThan, String value) throws Exception {

    //     List<Employee> es = new ArrayList<>();
    //     Connection con = null;
    //     PreparedStatement ps = null;
    //     ResultSet rs = null;

    //     try {
    //         con = gConnection();
    //         String query = qString + " WHERE salary < ? AND salary > ? ORDER BY salary";

    //         if (value.equals("A")) {
    //             query = query + " ASC";
    //         } else if (value.equals("D")) {
    //             query = query + " DESC";
    //         }

    //         ps = con.prepareStatement(query);
    //         ps.setString(1, lessThan);
    //         ps.setString(2, greaterThan);
    //         rs = ps.executeQuery();

    //         while (rs.next()) {
    //             int employeeId = rs.getInt("employee_id");
    //             String firstName = rs.getString("first_name");
    //             String lastName = rs.getString("last_name");
    //             String state = rs.getString("state");
    //             String city = rs.getString("city");
    //             String dateOfBirth = rs.getString("date_of_birth");
    //             long phoneNo = rs.getLong("phone_no");
    //             String email = rs.getString("email");
    //             String qualification = rs.getString("qualification");
    //             String designation = rs.getString("designation");
    //             String joiningDate = rs.getString("joining_date");
    //             String departmentName = rs.getString("department_name");
    //             String branchLocation = rs.getString("branch_location");
    //             double salary = rs.getDouble("salary");

    //             Employee employee = new Employee(employeeId, firstName, lastName, state, city, dateOfBirth, phoneNo,
    //                     email, qualification, designation, joiningDate, departmentName, branchLocation, salary);

    //             es.add(employee);
    //         }

    //     } catch (Exception e) {
    //         // TODO: handle exception
    //     }

    //     return es;
    // }

    // public Employee getEmployee(int employeeId) throws Exception {

    //     Employee employee = null;
    //     Connection con = null;
    //     PreparedStatement ps = null;
    //     ResultSet rs = null;

    //     try {
    //         con = gConnection();
    //         String query = "SELECT employee_id, first_name, last_name, state, city, date_of_birth, phone_no, email, qualification, designation, joining_date, department_id, branch_id, salary, branch_location, department_name FROM employees e INNER JOIN branch_info b ON b.id = e.branch_id INNER JOIN department_info d ON d.id = e.department_id WHERE employee_id = ?";
    //         ps = con.prepareStatement(query);
    //         ps.setInt(1, employeeId);
    //         rs = ps.executeQuery();

    //         if (rs.next()) {
    //             String firstName = rs.getString("first_name");
    //             String lastName = rs.getString("last_name");
    //             String state = rs.getString("state");
    //             String city = rs.getString("city");
    //             String dateOfBirth = rs.getString("date_of_birth");
    //             long phoneNo = rs.getLong("phone_no");
    //             String email = rs.getString("email");
    //             String qualification = rs.getString("qualification");
    //             String designation = rs.getString("designation");
    //             String joiningDate = rs.getString("joining_date");
    //             int departmentId = rs.getInt("department_id");
    //             int branchId = rs.getInt("branch_id");
    //             double salary = rs.getDouble("salary");
    //             String branchLocation = rs.getString("branch_location");
    //             String departmentName = rs.getString("department_name");

    //             employee = new Employee(employeeId, firstName, lastName, state, city, dateOfBirth, phoneNo, email,
    //                     qualification, designation, joiningDate, departmentId, branchId, salary, departmentName,
    //                     branchLocation);
    //         } else {
    //             throw new Exception("Could not find employee with " + employeeId);
    //         }

    //     } finally {
    //         rs.close();
    //         ps.close();
    //         con.close();
    //     }

    //     return employee;
    // }

    // public void updateEmployee(Employee employee) throws Exception {
    //     Connection con = null;
    //     PreparedStatement ps = null;

    //     try {
    //         con = gConnection();
    //         String query = "UPDATE employees "
    //                 + "SET first_name=?, last_name=?, state=?, city=?, date_of_birth=?, phone_no=?, email=?, qualification=?, designation=?, joining_date=?, department_id=?, branch_id=?, salary=? "
    //                 + "WHERE employee_id=?";

    //         ps = con.prepareStatement(query);
    //         ps.setString(1, employee.getFirstName());
    //         ps.setString(2, employee.getLastName());
    //         ps.setString(3, employee.getState());
    //         ps.setString(4, employee.getCity());
    //         ps.setString(5, employee.getDateOfBirth());
    //         ps.setLong(6, employee.getPhoneNo());
    //         ps.setString(7, employee.getEmail());
    //         ps.setString(8, employee.getQualification());
    //         ps.setString(9, employee.getdesignation());
    //         ps.setString(10, employee.getJoiningDate());
    //         ps.setInt(11, employee.getDepartmentId());
    //         ps.setInt(12, employee.getBranchId());
    //         ps.setDouble(13, employee.getSalary());
    //         ps.setInt(14, employee.getEmployeeId());
    //         ps.execute();

    //     } finally {
    //         ps.close();
    //         con.close();
    //     }
    // }

    // public void addEmployee(Employee employee) throws Exception {
    //     Connection con = null;
    //     PreparedStatement ps = null;

    //     try {
    //         con = EmployeeDbUtil.gConnection();
    //         String query = "INSERT INTO employees "
    //                 + "(employee_id, first_name, last_name, state, city, date_of_birth, phone_no, email, qualification, designation, joining_date, department_id, branch_id, salary, username, password) "
    //                 + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    //         ps = con.prepareStatement(query);
    //         ps.setInt(1, employee.getEmployeeId());
    //         ps.setString(2, employee.getFirstName());
    //         ps.setString(3, employee.getLastName());
    //         ps.setString(4, employee.getState());
    //         ps.setString(5, employee.getCity());
    //         ps.setString(6, employee.getDateOfBirth());
    //         ps.setLong(7, employee.getPhoneNo());
    //         ps.setString(8, employee.getEmail());
    //         ps.setString(9, employee.getQualification());
    //         ps.setString(10, employee.getdesignation());
    //         ps.setString(11, employee.getJoiningDate());
    //         ps.setInt(12, employee.getDepartmentId());
    //         ps.setInt(13, employee.getBranchId());
    //         ps.setDouble(14, employee.getSalary());
    //         ps.setString(15, employee.getUsername());
    //         ps.setString(16, employee.getPassword());
    //         ps.executeUpdate();
    //     } finally {
    //         ps.close();
    //         con.close();
    //     }
    // }

    // public void deleteEmployee(int employeeId) throws Exception {
    //     Connection con = null;
    //     PreparedStatement ps = null;

    //     try {
    //         con = gConnection();
    //         String query = "DELETE FROM employees WHERE employee_id=?";
    //         ps = con.prepareStatement(query);
    //         ps.setInt(1, employeeId);
    //         ps.execute();
    //     } finally {
    //         ps.close();
    //         con.close();
    //     }
    // }

}