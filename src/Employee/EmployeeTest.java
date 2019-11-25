public class EmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee employee1 = new CommissionEmployee("Michael", "Jameson",
                "111-22-333",2000, 0.03);


        BasePlusCommissionEmployee employee2 = new BasePlusCommissionEmployee("Rasaki", "Moshood", "847-42-940",
           2348.3, 0.02, 800);

        HourlyEmployee employee3 = new HourlyEmployee("Michael2", "Jameson2",
                "111-22-333",100);


        System.out.print(employee1.toString());
        System.out.println();
        System.out.print(employee2.toString());
        System.out.println();
        System.out.print(employee3.toString());
    }
}
