package casestudy5;

abstract class Employee {
    private String employeeName;
    private String employeeID;
    protected double basicSalary;

    public Employee(String employeeName, String employeeID, double basicSalary) {
        this.employeeName=employeeName;
        this.employeeID=employeeID;
        this.basicSalary=basicSalary;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public String getEmployeeID() {
        return employeeID;
    }
    public double getBasicSalary() {
        return basicSalary;
    }
    public void  displayEmployeeDetails()
    {
        System.out.println("Employee Name : "+getEmployeeName());
        System.out.println("Employee ID : "+getEmployeeID());
        System.out.println("Employee Salary : "+getBasicSalary());
    }
    abstract public double  calculateGrossSalary();
    abstract public double  calculateDeduction();
    abstract public double  calculateNetSalary();


}
