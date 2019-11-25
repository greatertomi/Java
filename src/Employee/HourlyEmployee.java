public class HourlyEmployee extends Employee {
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours) {
        super(firstName, lastName, socialSecurityNumber);

        if (hours < 0 || hours > 168)
            throw new IllegalArgumentException("Hours must be > 0 and < 168");
        this.hours = hours;
    }

    public void setHours(double hours) {
        if (hours < 0 || hours > 168)
            throw new IllegalArgumentException("Hours must be > 0 and < 168");

        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    public double getWage(double hours, double wagePerHour) {
        double wage = 0;
        if(hours <= 40)
            wage = 40 * wagePerHour;
        else {
            wage = (40 * wagePerHour) + ((hours-40)*wagePerHour);
        }

        return wage;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s: %.2f%n%s: %.2f", super.toString(),
                "Hours Worked",getHours(), "Wage", getWage(getHours(), 20));
    }
}
