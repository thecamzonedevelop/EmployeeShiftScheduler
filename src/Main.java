import java.util.*;

public class Main {
    public static void main(String[] args) {
        SchedulingSystem schedulingSystem = new ShiftSchedulerImpl();
        schedulingSystem.initializeSampleData();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add New Employee");
            System.out.println("2. View Shift Schedule");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    schedulingSystem.addNewEmployee(scanner);
                    break;
                case 2:
                    schedulingSystem.viewShiftSchedule();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 3);

        scanner.close();
    }
}
