import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShiftSchedulerImpl implements SchedulingSystem {
    private final List<Employee> employees = new ArrayList<>();
    private final List<Shift> shifts = new ArrayList<>();
    private final Schedule schedule = new Schedule();

    private static final String[] SKILL_CHOICES = {"Programming", "Communication", "Customer Service", "Problem Solving", "Teamwork", "Adaptability", "Leadership", "Organization", "Time Management", "Creativity"};

    @Override
    public void addNewEmployee(Scanner scanner) {
        System.out.print("Enter the employee's name: ");
<<<<<<< HEAD
        String name = scanner.next();


        if (!name.matches("[A-Za-z]+")) {
=======
        String name = scanner.nextLine();
        String trimmedName = name.trim();
        if (!trimmedName.matches("[A-Za-z ]+")) {
>>>>>>> 63a63b2831d5ed7f93490af38437dc0b76d3867a
            System.out.println("Invalid name. Please enter a name containing only alphabetic characters.");
            return;
        }

        System.out.println("Choose skills from the following options:");
        displayOptions();
        List<String> selectedSkills = chooseFromOptions(scanner);

<<<<<<< HEAD

        System.out.println("Shift Preview:");
        for (String skill : selectedSkills) {
            List<Shift> shiftsForSkill = getShiftsForSkill(skill);
            System.out.println("Skill: " + skill + " -> Shifts: " + shiftsForSkill);
        }
=======
        System.out.println("Shift Preview:");
        int count = 1;
        for (String skill : selectedSkills) {
            List<Shift> shiftsForSkill = getShiftsForSkill(skill);
            System.out.println("Skill: " + skill +  " -> " + count + " Shifts:+ " + shiftsForSkill);
            count ++;
        }
        List<String> OptionSkills = new ArrayList<>(selectedSkills);
        System.out.print("Enter your option: ");
        int shiftSelected = scanner.nextInt();
        String selectedSkill = OptionSkills.get(shiftSelected - 1);
        OptionSkills.clear();
        OptionSkills.add(selectedSkill);
>>>>>>> 63a63b2831d5ed7f93490af38437dc0b76d3867a

        System.out.print("Enter the maximum weekly working hours: ");
        int maxWeeklyHours = scanner.nextInt();

        Employee newEmployee = new Employee(name, selectedSkills, maxWeeklyHours);
        employees.add(newEmployee);
<<<<<<< HEAD
        for (String skill : selectedSkills) {
=======
        for (String skill : OptionSkills) {
>>>>>>> 63a63b2831d5ed7f93490af38437dc0b76d3867a
            List<Shift> shiftsForSkill = getShiftsForSkill(skill);
            for (Shift shift : shiftsForSkill) {
                schedule.assignEmployeeToShift(shift.getShiftName(), newEmployee);
            }
        }

        System.out.println("New employee added successfully!");
<<<<<<< HEAD
=======
        viewShiftSchedule();
>>>>>>> 63a63b2831d5ed7f93490af38437dc0b76d3867a
    }

    @Override
    public void viewShiftSchedule() {
        System.out.println("Shift Assignments:");
        for (Shift shift : shifts) {
            System.out.println(shift.getShiftName() + " Shift:");
            List<Employee> assignedEmployees = schedule.getShiftAssignments().getOrDefault(shift.getShiftName(), new ArrayList<>());
            for (Employee employee : assignedEmployees) {
                System.out.println("- " + employee.getName());
            }
            System.out.println();
        }
    }

    @Override
    public void initializeSampleData() {
        // Sample shifts
<<<<<<< HEAD
        Shift morningShift = new Shift("Morning - Afternoon", List.of("Programming", "Communication", "Problem Solving", "Teamwork"));
        Shift eveningShift = new Shift("Evening - Night", List.of("Customer Service", "Communication", "Adaptability", "Leadership"));
=======
        Shift morningShift = new Shift("Morning - Afternoon", List.of("Programming","Problem Solving", "Teamwork"));
        Shift eveningShift = new Shift("Evening - Night", List.of("Customer Service","Adaptability", "Leadership"));
>>>>>>> 63a63b2831d5ed7f93490af38437dc0b76d3867a
        Shift nightShift = new Shift("Night - Morning", List.of("Communication", "Organization", "Time Management", "Creativity"));
        shifts.add(morningShift);
        shifts.add(eveningShift);
        shifts.add(nightShift);

        // Sample employees
        Employee employee1 = new Employee("John", List.of("Programming", "Communication"), 40);
        Employee employee2 = new Employee("Alice", List.of("Customer Service", "Communication"), 35);
        employees.add(employee1);
        employees.add(employee2);

        // Sample schedule
        schedule.assignEmployeeToShift(morningShift.getShiftName(), employee1);
        schedule.assignEmployeeToShift(eveningShift.getShiftName(), employee2);
<<<<<<< HEAD
        schedule.assignEmployeeToShift(nightShift.getShiftName(), employee1);
=======
    }

    @Override
    public void viewEmployee() {
        System.out.println("All Employees");
        for (Employee name : employees){
            System.out.println("Name: "+name.getName()+ " MaxHours: "+name.getMaxWeeklyHours()+ " Skills: ");
            for (String skill : name.getSkills()) {
                System.out.println(skill);
            }
        }
>>>>>>> 63a63b2831d5ed7f93490af38437dc0b76d3867a
    }

    private void displayOptions() {
        for (int i = 0; i < ShiftSchedulerImpl.SKILL_CHOICES.length; i++) {
            System.out.println((i + 1) + ". " + ShiftSchedulerImpl.SKILL_CHOICES[i]);
        }
    }

    private List<String> chooseFromOptions(Scanner scanner) {
        List<String> selectedOptions = new ArrayList<>();
        System.out.print("Enter the number of skills to choose: ");
<<<<<<< HEAD
        int numChoices = scanner.nextInt();
=======

        int numChoices = 0;
        try {
            try {
                numChoices = scanner.nextInt();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (RuntimeException e) {
            System.out.println("An error occurred: " + e.getMessage() + " only accept number in rage");
            addNewEmployee(scanner);
        }
>>>>>>> 63a63b2831d5ed7f93490af38437dc0b76d3867a

        for (int i = 0; i < numChoices; i++) {
            System.out.print("Enter skill choice " + (i + 1) + ": ");
            int choice = scanner.nextInt();
            if (choice > 0 && choice <= SKILL_CHOICES.length) {
                selectedOptions.add(SKILL_CHOICES[choice - 1]);
            } else {
                System.out.println("Invalid choice. Please try again.");
                i--;
            }
        }

        return selectedOptions;
    }

    private List<Shift> getShiftsForSkill(String skill) {
        List<Shift> shiftsForSkill = new ArrayList<>();
        for (Shift shift : shifts) {
            if (shift.getRequiredSkills().contains(skill)) {
                shiftsForSkill.add(shift);
            }
        }
        return shiftsForSkill;
    }
}
