package hris.bean;

import java.util.Map;

public class Employee {
    private Map<String, String> searchObj;
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String dateOfBirth;
    private long phoneNo;
    private String email;
    private String qualification;
    private String designation;
    private String joiningDate;
    private int branchId;
    private String branchAddress;
    private String branchLocation;
    private int departmentId;
    private String departmentName;
    private double salary;
    private String username;
    private String password;

    public Employee() {
    }

    // validate constructor
    public Employee(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // login constructor
    public Employee(int id, String firstName, String lastName, String address, String dateOfBirth, long phoneNo,
            String email, String qualification, String designation, String joiningDate, int branchId,
            String branchAddress, String branchLocation, int departmentId, String departmentName, double salary,
            String username, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.phoneNo = phoneNo;
        this.email = email;
        this.qualification = qualification;
        this.designation = designation;
        this.joiningDate = joiningDate;
        this.branchId = branchId;
        this.branchLocation = branchLocation;
        this.branchAddress = branchAddress;
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.salary = salary;
        this.username = username;
        this.password = password;
    }

    // update employee constructor
    public Employee(int id, String firstName, String lastName, String address, String dateOfBirth, long phoneNo,
            String email, String qualification, String designation, String joiningDate, int branchId, 
            int departmentId, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.phoneNo = phoneNo;
        this.email = email;
        this.qualification = qualification;
        this.designation = designation;
        this.joiningDate = joiningDate;
        this.branchId = branchId;
        this.departmentId = departmentId;
        this.salary = salary;
    }

    // add employee constructor
    public Employee(int id, String firstName, String lastName, String address, String dateOfBirth, long phoneNo,
            String email, String qualification, String designation, String joiningDate, int branchId, int departmentId,
            double salary, String username, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.phoneNo = phoneNo;
        this.email = email;
        this.qualification = qualification;
        this.designation = designation;
        this.joiningDate = joiningDate;
        this.branchId = branchId;
        this.departmentId = departmentId;
        this.salary = salary;
        this.username = username;
        this.password = password;
    }

    // list employees constructor
    public Employee(int id, String firstName, String lastName, String address, String dateOfBirth, long phoneNo,
            String email, String qualification, String designation, String joiningDate, String branchAddress,
            String branchLocation, String departmentName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.phoneNo = phoneNo;
        this.email = email;
        this.qualification = qualification;
        this.designation = designation;
        this.joiningDate = joiningDate;
        this.branchAddress = branchAddress;
        this.branchLocation = branchLocation;
        this.departmentName = departmentName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getBranchLocation() {
        return branchLocation;
    }

    public void setBranchLocation(String branchLocation) {
        this.branchLocation = branchLocation;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map<String, String> getSearchObj() {
        return searchObj;
    }

    public void setSearchObj(Map<String, String> searchObj) {
        this.searchObj = searchObj;
    }

    @Override
    public String toString() {
        return "Employee [address=" + address + ", branchId=" + branchId + ", branchLocation=" + branchLocation
                + ", dateOfBirth=" + dateOfBirth + ", departmentId=" + departmentId + ", departmentName="
                + departmentName + ", designation=" + designation + ", email=" + email + ", firstName=" + firstName
                + ", id=" + id + ", joiningDate=" + joiningDate + ", lastName=" + lastName + ", phoneNo=" + phoneNo
                + ", qualification=" + qualification + ", salary=" + salary + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (id != other.id)
            return false;
        return true;
    }

    public static String formatString(String str) {
        return (str.substring(0, 1).toUpperCase()).concat(str.substring(1).toLowerCase());
    }

    

}