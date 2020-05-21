package hris.bean;

import java.util.Date;

public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String state;
    private String city;
    private Date dateOfBirth;
    private long phoneNo;
    private String email;
    private String qualification;
    private String postLevel;
    private String joiningDate;
    private int departmentId;
    private int branchId;
    private double salary;
    private String username;
    private String password;

    public Employee() { }

    public Employee(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Employee(int employeeId, String firstName, String lastName, String state, String city, Date dateOfBirth, long phoneNo, String email, String qualification, String postLevel, String joiningDate, int departmentId, int branchId, double salary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.state = state;
        this.city = city;
        this.dateOfBirth = dateOfBirth;
        this.phoneNo = phoneNo;
        this.email = email;
        this.qualification = qualification;
        this.postLevel = postLevel;
        this.joiningDate = joiningDate;
        this.departmentId = departmentId;
        this.branchId = branchId;
        this.salary = salary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setFirstName(String name) {
        firstName = name;
    }

    public void setLastName(String name) {
        lastName = name;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setPostLevel(String postLevel) {
        this.postLevel = postLevel;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public String getQualification() {
        return qualification;
    }

    public String getPostLevel() {
        return postLevel;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public int getBranchId() {
        return branchId;
    }

    public double getSalary() {
        return salary;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
}
