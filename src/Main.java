import EmployeeDetails.Employee;
import EmployeeDetails.Schedule;
import EmployeeDetails.Shift;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("John", List.of("Programming", "Communication"), List.of("Morning", "Evening"), 40);
        Employee employee2 = new Employee("Alice", List.of("Customer Service", "Communication"), List.of("Morning", "Night"), 35);

        Shift morningShift = new Shift("Morning", List.of("Programming"));
        Shift eveningShift = new Shift("Evening", List.of("Customer Service"));
        Shift nightShift = new Shift("Night", List.of("Programming", "Communication"));

        Schedule schedule = new Schedule();


        schedule.assignEmployeeToShift(morningShift.getShiftName(), employee1);
        schedule.assignEmployeeToShift(eveningShift.getShiftName(), employee2);
        schedule.assignEmployeeToShift(nightShift.getShiftName(), employee1);


        System.out.println("Shift Assignments:");
        for (Map.Entry<String, List<Employee>> entry : schedule.getShiftAssignments().entrySet()) {
            System.out.println(entry.getKey() + " Shift:");
            for (Employee employee : entry.getValue()) {
                System.out.println("- " + employee.getName());
            }
            System.out.println();
        }
    }
}