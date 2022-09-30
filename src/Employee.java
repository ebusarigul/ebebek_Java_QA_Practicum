public class Employee {

    private String name;
    private double salary;
    private double workHours;
    private int hireYear;

    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    private double tax() {
        double tax = 0;
        if (salary > 1000) {
            tax = (salary * 3) / 100;
        }
        return tax;
    }

    private double bonus() {
        double bonus = 0;
        if (workHours > 40) {
            bonus = (workHours - 40) * 30;
        }
        return bonus;
    }

    private double raiseSalary() {
        int workingYear = 2021 - hireYear;
        int raiseRate = 0;
        double raiseSalary;

        if (workingYear >= 0 && workingYear < 10) {
            raiseRate = 5;
        } else if (workingYear > 9 && workingYear < 20) {
            raiseRate = 10;
        } else if (workingYear > 19) {
            raiseRate = 15;
        } else {
            System.out.println("Hatalı veri girişi");
        }

        System.out.println("Salary increase rate = %" + raiseRate);
        raiseSalary = (salary * (100 + raiseRate)) / 100;
        System.out.println("Your increased salary with bonuses and taxes = " + (raiseSalary + bonus() - tax()) + " TL");

        return raiseSalary;
    }

    @Override
    public String toString() {
        return "---Employee Info---" + "\n" +
                "  name = " + name + "\n" +
                "  salary = " + salary + " TL" + "\n" +
                "  workHours = " + workHours + " Hours" + "\n" +
                "  hireYear = " + hireYear + "\n" +
                "  raiseSalary = " + (raiseSalary() + bonus() - tax()) + " TL" + "\n" +
                "  tax = -" + tax() + " TL" + "\n" +
                "  bonus = +" + bonus() + " TL" + "\n" +
                "----------------------------";
    }
}
