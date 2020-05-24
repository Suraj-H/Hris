package hris.bean;

public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String state;
    private String city;
    private String dateOfBirth;
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

    public Employee() {
    }

    public Employee(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Employee(int employeeId, String firstName, String lastName, String state, String city, String dateOfBirth,
            long phoneNo, String email, String qualification, String postLevel, String joiningDate, int departmentId,
            int branchId, double salary) {
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

    public Employee(int employeeId, String firstName, String lastName, String state, String city, String dateOfBirth,
            long phoneNo, String email, String qualification, String postLevel, String joiningDate, int departmentId,
            int branchId, double salary, String username, String password) {
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
        this.username = username;
        this.password = password;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public String getPostLevel() {
        return postLevel;
    }

    public void setPostLevel(String postLevel) {
        this.postLevel = postLevel;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
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

    @Override
    public String toString() {
        return "Employee [branchId=" + branchId + ", city=" + city + ", dateOfBirth=" + dateOfBirth + "departmentId="
                + departmentId + ", email=" + email + ", employeeId=" + employeeId + ", firstName=" + firstName
                + ", joiningDate=" + joiningDate + ", lastName=" + lastName + ", password=" + password + ", phoneNo="
                + phoneNo + ", postLevel=" + postLevel + ", qualification=" + qualification + ", salary=" + salary
                + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + branchId;

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
        if (branchId != other.branchId)
            return false;

        return true;
    }
}