package casestudy5;

public class Manager extends PermanentEmployee{
    private double performanceBonus;
    public Manager(String employeeId,String employeeName,double basicSalary,double houseAllowance,double transportAllowance,double performanceBonus){
        super(employeeName,employeeId,basicSalary,houseAllowance,transportAllowance );
        this.performanceBonus=performanceBonus;
    }
    public double getPerformanceBonus() {
        return performanceBonus;
    }

    @Override
    public double calculateGrossSalary() {
        double grossSalary=getBasicSalary()+getHouseAllowance()+getTransportAllowance()+getPerformanceBonus();
        return grossSalary;
    }
    @Override
    public double calculateDeduction() {
        double deduction=calculateGrossSalary()*0.12;
        return deduction;
    }
    @Override
    public double calculateNetSalary() {
        double netSalary=calculateGrossSalary()-calculateDeduction();
        return netSalary;
    }
    }

