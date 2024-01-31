import java.util.*;

public class Main {
    public static void main(String[] args) {
        SchedulingSystem schedulingSystem = new ShiftSchedulerImpl();
        schedulingSystem.initializeSampleData();

        Scanner scanner = new Scanner(System.in);
        schedulingSystem.firstLogin(scanner);
        int choice = 0;

        do {
            System.out.println("1. Add New Employee");
            System.out.println("2. View Shift Schedule");
            System.out.println("3. View Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
                continue;
            }


            switch (choice) {
                case 1:
                    schedulingSystem.addNewEmployee(scanner);
                    break;
                case 2:
                    schedulingSystem.viewShiftSchedule();
                    break;
                case 3:
                    schedulingSystem.viewEmployee();
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
