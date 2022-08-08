import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Demerging {
    public static void main(String[] args) {
        Employee[] employees =
                {
                        new Employee("John", "male", 1988),
                        new Employee("Mari", "female", 1989),
                        new Employee("Zog", "female", 1990),
                        new Employee("Rock", "male", 1991),
                        new Employee("Rose", "female", 1992),
                        new Employee("Meow", "male", 1993),
                        new Employee("Pong", "female", 1993),
                        new Employee("Qui", "male", 1995),
                        new Employee("Fang", "female", 1998),
                };


        Queue<Employee> male = new LinkedList<>();
        Queue<Employee> female = new LinkedList<>();

        for (Employee employee : employees) {
            if (employee.getGender().equals("male")) male.add(employee);
            if (employee.getGender().equals("female")) female.add(employee);
        }
        Employee[] maleE = new Employee[male.size()];
        Employee[] femaleE = new Employee[female.size()];

        for (int i = 0; i < maleE.length; i++) {
            maleE[i] = male.remove();
            System.out.print(maleE[i].getName() + ", ");
        }
        System.out.println();
        for (int i = 0; i < femaleE.length; i++) {
            femaleE[i] = female.remove();
            System.out.print(femaleE[i].getName() + ", ");
        }


    }
}
