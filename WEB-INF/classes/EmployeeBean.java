package bean;

public class EmployeeBean {
    private int employeeId;
    private String fullName;
    private int age;
    private String address;
    private String dateOfBirth;
    private int phoneNo;
    private String emailId;
    private String qualification;
    private String postLevel;
    private String joiningDate;
    private int departmentId;
    private int branchId;
    private int salary;

    public EmployeeBean() { }

    public EmployeeBean(int employeeId, String fullName, int age, String address, String dateOfBirth, int phoneNo, String emailId, String qualification, String postLevel, String joiningDate, int departmentId, int branchId, int salary) {
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.age = age;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.phoneNo = phoneNo;
        this.emailId = emailId;
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

    public void setFullName(String name) {
        fullName = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDateOfBirth(String dateOfBString) {
        this.dateOfBirth = dateOfBString;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
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

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public String getEmailId() {
        return emailId;
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

    public int getSalary() {
        return salary;
    }
}
