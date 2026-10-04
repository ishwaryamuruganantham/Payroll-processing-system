package casestudy5;

 class PermanentEmployee  extends Employee {
    private double houseAllowance;
    private double transportAllowance;

    public PermanentEmployee(String employeeId,String employeeName,double basicSalary,double houseAllowance,double transportAllowance){
        super(employeeId,employeeName,basicSalary);
        this.houseAllowance=houseAllowance;
        this.transportAllowance=transportAllowance;
    }
    public double getHouseAllowance() {
        return houseAllowance;
    }
    public double getTransportAllowance() {
        return transportAllowance;
    }
     @Override
     public double calculateGrossSalary() {
        double grossSalary=getBasicSalary()+houseAllowance+transportAllowance;
         return grossSalary;
     }

     @Override
     public double calculateDeduction() {
         return calculateGrossSalary()*0.10;
     }

     @Override
     public double calculateNetSalary() {
        double netSalary=calculateGrossSalary()-calculateDeduction();
         return netSalary;
     }



}
