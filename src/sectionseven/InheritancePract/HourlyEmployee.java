package sectionseven.InheritancePract;

public class HourlyEmployee extends Employee{
    double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate,
                          double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }
    @Override
    public double collectPay(){
       return 40*hourlyPayRate;
    }
    public double getDoublePay(){
        return 2*collectPay();
    }
}
