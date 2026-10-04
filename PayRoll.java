package casestudy5;

public class PayRoll
{
    Employee employee;
    public PayRoll(Employee employee)
    {
        this.employee=employee;
    }
    public void processPayroll()
    {
        System.out.println("------------------");
        System.out.println("PayRoll details");
        System.out.println("------------------");
        employee.displayEmployeeDetails();
        System.out.println("Gross salary:"+employee.calculateGrossSalary());

        System.out.println("Deduction:"+employee.calculateDeduction());

        System.out.println("Net Salary:"+employee.calculateNetSalary());
        System.out.println("------------------");
    }
    public void generatePaySlip(){
        System.out.println("============================");
        System.out.println("     Payroll PaySlip");
        System.out.println("============================");
        System.out.println("EMPLOYEE DETAILS:/n Name:"+employee.getEmployeeName());
        System.out.println("Gross Salary:"+employee.calculateGrossSalary());
        System.out.println("Deduction:"+employee.calculateDeduction());
        System.out.println("Net Salary:"+employee.calculateNetSalary());
        System.out.println("===============================");



    }
}
