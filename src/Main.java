import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ebubekir",12000,48,2010));
        employees.add(new Employee("Eymen",11200,42,2008));
        employees.add(new Employee("Havva",8300,46,2016));
        employees.add(new Employee("Selma",9500,51,2003));
        employees.add(new Employee("Alp",15000,30,2020));

        for (Employee employee : employees){
            System.out.println(employee);
        }


    }
}
