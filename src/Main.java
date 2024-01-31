import java.util.*;

public class Main {
    public static void main(String[] args) {
        SchedulingSystem schedulingSystem = new ShiftSchedulerImpl();
        schedulingSystem.initializeSampleData();

        Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD
        int choice;
=======
        int choice = 0;
>>>>>>> 63a63b2831d5ed7f93490af38437dc0b76d3867a

        do {
            System.out.println("1. Add New Employee");
            System.out.println("2. View Shift Schedule");
<<<<<<< HEAD
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
=======
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

>>>>>>> 63a63b2831d5ed7f93490af38437dc0b76d3867a

            switch (choice) {
                case 1:
                    schedulingSystem.addNewEmployee(scanner);
                    break;
                case 2:
                    schedulingSystem.viewShiftSchedule();
                    break;
                case 3:
<<<<<<< HEAD
=======
                    schedulingSystem.viewEmployee();
                case 4:
>>>>>>> 63a63b2831d5ed7f93490af38437dc0b76d3867a
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

<<<<<<< HEAD
        } while (choice != 3);
=======
        } while (choice != 4);
>>>>>>> 63a63b2831d5ed7f93490af38437dc0b76d3867a

        scanner.close();
    }
}
