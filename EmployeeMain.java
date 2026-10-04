package casestudy5;

public class EmployeeMain  {
    public static void main(String[] args) {
        Employee employee=new PermanentEmployee("EMP101","Arun",3000,500,200);
        employee.calculateGrossSalary() ;

        Employee employee1=new ContractEmployee("EMP102","Ishu",5000,500);
        employee1.calculateGrossSalary();

        Employee employee2=new Manager("EMP103","Pavi",50000,2000,1000,500);
        employee2.calculateGrossSalary();

        PayRoll payRoll1=new PayRoll(employee);
        PayRoll payRoll2=new PayRoll(employee1);
        PayRoll payRoll3=new PayRoll(employee2);

        payRoll1.processPayroll();
        System.out.println();
        payRoll1.generatePaySlip();
        System.out.println();
        payRoll2.processPayroll();
        System.out.println();
        payRoll2.generatePaySlip();
        System.out.println();
        payRoll3.processPayroll();
        System.out.println();

        payRoll3.generatePaySlip();

    }

}
