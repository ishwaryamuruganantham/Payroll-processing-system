package casestudy5;

public class ContractEmployee extends Employee {
    private double contractBonus;
    public ContractEmployee(String employeeName,String employeeId,double basicSalary,double contractBonus)
    {
        super(employeeId,employeeName,basicSalary);
        this.contractBonus=contractBonus;
    }
    public double getContractBonus()
    {
        return contractBonus;
    }
    @Override
    public double calculateGrossSalary()
    {
        double grossSalary=getBasicSalary()+getContractBonus();
        return grossSalary;
    }

    @Override
    public double calculateDeduction() {
        double deduction=calculateGrossSalary()*0.05;
        return deduction;
    }

    @Override
    public double calculateNetSalary() {
        double netSalary=getBasicSalary()-calculateDeduction();
        return netSalary;
    }


}
