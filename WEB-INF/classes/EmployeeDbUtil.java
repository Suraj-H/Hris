package hris.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDbUtil {
    private static Connection con;
    private final String qString = "SELECT id, first_name, last_name, address, date_of_birth, phone_no, email, qualification, designation, joining_date, b_address, location, name, salary FROM employees e "
            + "INNER JOIN branch_info b ON b.b_id = e.branch_id "
            + "INNER JOIN department_info d ON d.d_id = e.department_id";

    public static Connection gConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hris_db", "root", "surajh");
        } catch (Exception ignored) {
        }

        return con;
    }

    public Employee validate(String user, String pass) throws Exception {

        Connection con = null;
        PreparedStatement ps = null;
        String query = "SELECT id, username, password FROM auth_info a INNER JOIN employees e ON e.id = a.employee_id WHERE username=? AND password=?";
        ResultSet rs = null;
        Employee employee;

        try {
            con = gConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");

                employee = new Employee(id, username, password);

                return employee;
            }

        } finally {
            if (rs != null)
                rs.close();
            if (ps != null)
                ps.close();
            if (con != null)
                con.close();
        }

        return null;
    }

    public Employee getProfile(int id) throws Exception {

        Employee employee;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = gConnection();
            String query = "SELECT first_name, last_name, address, date_of_birth, phone_no, email, qualification, "
                    + "designation, joining_date, branch_id, b_address, location, department_id, name, salary "
                    + "FROM employees e INNER JOIN branch_info b ON b.b_id = e.branch_id "
                    + "INNER JOIN department_info d ON d.d_id = e.department_id WHERE id=?";
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String address = rs.getString("address");
                String dateOfBirth = rs.getString("date_of_birth");
                long phoneNo = rs.getLong("phone_no");
                String email = rs.getString("email");
                String qualification = rs.getString("qualification");
                String designation = rs.getString("designation");
                String joiningDate = rs.getString("joining_date");
                int branchId = rs.getInt("branch_id");
                String branchAddress = rs.getString("b_address");
                String branchLocation = rs.getString("location");
                int departmentId = rs.getInt("department_id");
                String departmentName = rs.getString("name");
                double salary = rs.getDouble("salary");

                employee = new Employee(id, firstName, lastName, address, dateOfBirth, phoneNo, email, qualification,
                        designation, joiningDate, branchId, branchAddress, branchLocation, departmentId, departmentName,
                        salary);

                return employee;
            }
        } finally {
            if (rs != null)
                rs.close();
            if (ps != null)
                ps.close();
            if (con != null)
                con.close();
        }

        return null;
    }

    public List<Employee> getEmployees() throws Exception {
        List<Employee> employees = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = gConnection();
            String query = qString + " ORDER BY id";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String address = rs.getString("address");
                String dateOfBirth = rs.getString("date_of_birth");
                long phoneNo = rs.getLong("phone_no");
                String email = rs.getString("email");
                String qualification = rs.getString("qualification");
                String designation = rs.getString("designation");
                String joiningDate = rs.getString("joining_date");
                String departmentName = rs.getString("name");
                String branchAddress = rs.getString("b_address");
                String branchLocation = rs.getString("location");
                double salary = rs.getDouble("salary");

                Employee employee = new Employee(id, firstName, lastName, address, dateOfBirth, phoneNo, email,
                        qualification, designation, joiningDate, branchAddress, branchLocation, departmentName, salary);

                employees.add(employee);
            }

        } finally {
            if (rs != null)
                rs.close();
            if (ps != null)
                ps.close();
            if (con != null)
                con.close();
        }

        return employees;
    }

    public Employee getEmployee(int id) throws Exception {

        Employee employee;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = gConnection();
            String query = "SELECT id, first_name, last_name, address, date_of_birth, phone_no, email, qualification, designation, joining_date, department_id, branch_id, salary "
                    + "FROM employees WHERE id = ?";
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String address = rs.getString("address");
                String dateOfBirth = rs.getString("date_of_birth");
                long phoneNo = rs.getLong("phone_no");
                String email = rs.getString("email");
                String qualification = rs.getString("qualification");
                String designation = rs.getString("designation");
                String joiningDate = rs.getString("joining_date");
                int departmentId = rs.getInt("department_id");
                int branchId = rs.getInt("branch_id");
                double salary = rs.getDouble("salary");

                employee = new Employee(id, firstName, lastName, address, dateOfBirth, phoneNo, email, qualification,
                        designation, joiningDate, branchId, departmentId, salary);
            } else
                throw new Exception("Could not find employee with id: " + id);

        } finally {
            if (rs != null)
                rs.close();
            if (ps != null)
                ps.close();
            if (con != null)
                con.close();
        }

        return employee;
    }

    public void updateEmployee(Employee employee) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = gConnection();
            String query = "UPDATE employees SET first_name=?, last_name=?, address=?, date_of_birth=?, "
                    + "phone_no=?, email=?, qualification=?, designation=?, joining_date=?, department_id=?, branch_id=?, salary=? WHERE id=?";

            ps = con.prepareStatement(query);
            ps.setString(1, employee.getFirstName());
            ps.setString(2, employee.getLastName());
            ps.setString(3, employee.getAddress());
            ps.setString(4, employee.getDateOfBirth());
            ps.setLong(5, employee.getPhoneNo());
            ps.setString(6, employee.getEmail());
            ps.setString(7, employee.getQualification());
            ps.setString(8, employee.getDesignation());
            ps.setString(9, employee.getJoiningDate());
            ps.setInt(10, employee.getDepartmentId());
            ps.setInt(11, employee.getBranchId());
            ps.setDouble(12, employee.getSalary());
            ps.setInt(13, employee.getId());
            ps.execute();

        } finally {
            if (ps != null)
                ps.close();
            if (con != null)
                con.close();
        }
    }

    public void addEmployee(Employee employee) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = EmployeeDbUtil.gConnection();
            String query = "INSERT INTO employees (id, first_name, last_name, address, date_of_birth, phone_no, email, qualification, designation, joining_date, department_id, branch_id, salary) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            ps = con.prepareStatement(query);
            ps.setInt(1, employee.getId());
            ps.setString(2, employee.getFirstName());
            ps.setString(3, employee.getLastName());
            ps.setString(4, employee.getAddress());
            ps.setString(5, employee.getDateOfBirth());
            ps.setLong(6, employee.getPhoneNo());
            ps.setString(7, employee.getEmail());
            ps.setString(8, employee.getQualification());
            ps.setString(9, employee.getDesignation());
            ps.setString(10, employee.getJoiningDate());
            ps.setInt(11, employee.getDepartmentId());
            ps.setInt(12, employee.getBranchId());
            ps.setDouble(13, employee.getSalary());
            ps.executeUpdate();

            String lString = "INSERT INTO auth_info (employee_id, username, password, access_level) "
                    + "VALUES (?, ?, ?, ?)";
            ps = con.prepareStatement(lString);
            ps.setInt(1, employee.getId());
            ps.setString(2, employee.getUsername());
            ps.setString(3, employee.getPassword());

            if (employee.getDesignation().equals("Admin"))
                ps.setString(4, "Admin");
            else
                ps.setString(4, "Employee");

            ps.executeUpdate();
        } finally {
            if (ps != null)
                ps.close();
            if (con != null)
                con.close();
        }
    }

    public void deleteEmployee(int id) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = gConnection();
            String query = "DELETE FROM employees WHERE id=?";
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.execute();
        } finally {
            if (ps != null)
                ps.close();
            if (con != null)
                con.close();
        }
    }

    /* search filter */
    public List<Employee> getQPL(String qual, String pL) throws Exception {

        List<Employee> es = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = gConnection();
            String query = qString;

            if (qual.length() != 0 && pL.length() != 0)
                query = qString + " WHERE qualification=? AND designation=?";
            else if (qual.length() != 0)
                query = qString + " WHERE qualification=?";
            else if (pL.length() != 0)
                query = qString + " WHERE designation=?";

            ps = con.prepareStatement(query);

            if (qual.length() != 0 && pL.length() != 0) {
                ps.setString(1, qual);
                ps.setString(2, pL);
            } else if (qual.length() != 0)
                ps.setString(1, qual);
            else if (pL.length() != 0)
                ps.setString(1, pL);

            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String address = rs.getString("address");
                String dateOfBirth = rs.getString("date_of_birth");
                long phoneNo = rs.getLong("phone_no");
                String email = rs.getString("email");
                String qualification = rs.getString("qualification");
                String designation = rs.getString("designation");
                String joiningDate = rs.getString("joining_date");
                String departmentName = rs.getString("name");
                String branchAddress = rs.getString("b_address");
                String branchLocation = rs.getString("location");
                double salary = rs.getDouble("salary");

                Employee employee = new Employee(id, firstName, lastName, address, dateOfBirth, phoneNo, email,
                        qualification, designation, joiningDate, branchAddress, branchLocation, departmentName, salary);

                es.add(employee);
            }

        } finally {
            if (rs != null)
                rs.close();
            if (ps != null)
                ps.close();
            if (con != null)
                con.close();
        }

        return es;
    }

    public List<Employee> getBD(String rBranchId, String rBranchLocation, String rDepartmentName) throws Exception {

        List<Employee> es = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = gConnection();
            String query = "SELECT id, first_name, last_name, address, date_of_birth, phone_no, "
                    + "email, qualification, designation, joining_date, b_address, location, name, salary "
                    + "FROM employees e INNER JOIN branch_info b ON b.b_id = e.branch_id "
                    + "INNER JOIN department_info d ON d.d_id = e.department_id";

            if (rBranchId.length() != 0) {
                query = query + " WHERE branch_id = ?";
                ps = con.prepareStatement(query);
                ps.setInt(1, Integer.parseInt(rBranchId));
            } else {
                if (rBranchLocation.length() != 0 && rDepartmentName.length() != 0)
                    query = qString + " WHERE location=? AND name=?";
                else if (rBranchLocation.length() != 0)
                    query = qString + " WHERE location=?";
                else if (rDepartmentName.length() != 0)
                    query = qString + " WHERE name=?";

                ps = con.prepareStatement(query);

                if (rBranchLocation.length() != 0 && rDepartmentName.length() != 0) {
                    ps.setString(1, rBranchLocation);
                    ps.setString(2, rDepartmentName);
                } else if (rBranchLocation.length() != 0)
                    ps.setString(1, rBranchLocation);
                else if (rDepartmentName.length() != 0)
                    ps.setString(1, rDepartmentName);
            }

            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String address = rs.getString("address");
                String dateOfBirth = rs.getString("date_of_birth");
                long phoneNo = rs.getLong("phone_no");
                String email = rs.getString("email");
                String qualification = rs.getString("qualification");
                String designation = rs.getString("designation");
                String joiningDate = rs.getString("joining_date");
                String branchAddress = rs.getString("b_address");
                String branchLocation = rs.getString("location");
                String departmentName = rs.getString("name");
                double salary = rs.getDouble("salary");

                Employee employee = new Employee(id, firstName, lastName, address, dateOfBirth, phoneNo, email,
                        qualification, designation, joiningDate, branchAddress, branchLocation, departmentName, salary);

                es.add(employee);
            }

        } finally {
            if (rs != null)
                rs.close();
            if (ps != null)
                ps.close();
            if (con != null)
                con.close();
        }

        return es;
    }

    public List<Employee> getName(String rId, String rFirstName, String rLastName) throws Exception {

        List<Employee> es = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = gConnection();
            String query = "SELECT id, first_name, last_name, address, date_of_birth, phone_no, email, qualification, designation, joining_date, b_address, location, name, salary FROM employees e "
                    + "INNER JOIN branch_info b ON b.b_id = e.branch_id "
                    + "INNER JOIN department_info d ON d.d_id = e.department_id";

            if (rId.length() != 0) {
                query = query + " WHERE id=?";
            } else {
                if (rFirstName.length() != 0 && rLastName.length() != 0)
                    query = qString + " WHERE first_name=? AND last_name=?";
                else if (rFirstName.length() != 0)
                    query = qString + " WHERE first_name=?";
                else if (rLastName.length() != 0)
                    query = qString + " WHERE last_name=?";
            }

            ps = con.prepareStatement(query);

            if (rId.length() != 0) {
                ps.setInt(1, Integer.parseInt(rId));
            } else {
                if (rFirstName.length() != 0 && rLastName.length() != 0) {
                    ps.setString(1, rFirstName);
                    ps.setString(2, rLastName);
                } else if (rFirstName.length() != 0)
                    ps.setString(1, rFirstName);
                else if (rLastName.length() != 0)
                    ps.setString(1, rLastName);
            }

            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String address = rs.getString("address");
                String dateOfBirth = rs.getString("date_of_birth");
                long phoneNo = rs.getLong("phone_no");
                String email = rs.getString("email");
                String qualification = rs.getString("qualification");
                String designation = rs.getString("designation");
                String joiningDate = rs.getString("joining_date");
                String branchAddress = rs.getString("b_address");
                String branchLocation = rs.getString("location");
                String departmentName = rs.getString("name");
                double salary = rs.getDouble("salary");

                Employee employee = new Employee(id, firstName, lastName, address, dateOfBirth, phoneNo, email,
                        qualification, designation, joiningDate, branchAddress, branchLocation, departmentName, salary);

                es.add(employee);
            }

        } finally {
            if (rs != null)
                rs.close();
            if (ps != null)
                ps.close();
            if (con != null)
                con.close();
        }

        return es;
    }

    public List<Employee> getSalary(String lessThan, String greaterThan, String value) throws Exception {

        List<Employee> es = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = gConnection();
            // String query = qString + " WHERE salary < ? AND salary > ? ORDER BY salary";
            String query = "SELECT id, first_name, last_name, address, date_of_birth, phone_no, email, qualification, designation, joining_date, b_address, location, name, salary FROM employees e "
                    + "INNER JOIN branch_info b ON b.b_id = e.branch_id "
                    + "INNER JOIN department_info d ON d.d_id = e.department_id "
                    + "WHERE salary < ? AND salary > ? ORDER BY salary";

            // if (value.equals("A")) {
            // query = query + " ASC";
            // } else if (value.equals("D")) {
            // query = query + " DESC";
            // }

            ps = con.prepareStatement(query);
            ps.setDouble(1, Double.parseDouble(lessThan));
            ps.setDouble(2, Double.parseDouble(greaterThan));
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String address = rs.getString("address");
                String dateOfBirth = rs.getString("date_of_birth");
                long phoneNo = rs.getLong("phone_no");
                String email = rs.getString("email");
                String qualification = rs.getString("qualification");
                String designation = rs.getString("designation");
                String joiningDate = rs.getString("joining_date");
                String departmentName = rs.getString("name");
                String branchAddress = rs.getString("b_address");
                String branchLocation = rs.getString("location");
                double salary = rs.getDouble("salary");

                Employee employee = new Employee(id, firstName, lastName, address, dateOfBirth, phoneNo, email,
                        qualification, designation, joiningDate, branchAddress, branchLocation, departmentName, salary);

                es.add(employee);

            }

        } finally {
            if (rs != null)
                rs.close();
            if (ps != null)
                ps.close();
            if (con != null)
                con.close();
        }

        return es;
    }

}