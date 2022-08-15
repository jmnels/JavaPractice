package inheritanceExample;

public class StudentEmployee extends Student{

    private String employeeId;
    private double rateOfPayPerHour;

    public StudentEmployee(String firstname, String lastname, String studentId, String employeeId, double pay) {

        super(firstname, lastname, studentId);
        this.employeeId = employeeId;
        this.rateOfPayPerHour = pay;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public double getRateOfPayPerHour() {
        return this.rateOfPayPerHour;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setRateOfPayPerHour(double pay) {
        this.rateOfPayPerHour = pay;
    }

    @Override
    public String toString() {return super.toString() + " Employee Id: " + this.employeeId + " Rate of Pay: " + this.rateOfPayPerHour;}
}
