import java.util.ArrayList;
import java.util.Scanner;

public class Taskmanager {

   //Declare an ArrayList to store tasks
    ArrayList<String> tasks = new ArrayList<>();

    //Declare a method to add tasks to the list
    void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    //Declare method to display the list of tasks
    void displayTasks() {
        if (tasks.isEmpty()){
            System.out.println("Task lists is empty.");
            } else {
                System.out.println("Tasks:");
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + ". " + tasks.get(i));
                }
        }
    }

    // Method to remove a task from the list
    void removeTask(int taskIndex) {
        if (taskIndex >= 1 && taskIndex <= tasks.size()) {
            String removedTask = tasks.remove(taskIndex - 1);
            System.out.println("Task removed: " + removedTask);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public static void main(String[] args) {
        Taskmanager taskManager = new Taskmanager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTask manager Menu:");
            System.out.println("1. Add a task");
            System.out.println("2. Display tasks");
            System.out.println("3. Remove a task");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the task: ");
                    String newTask = scanner.nextLine();
                    taskManager.addTask(newTask);
                    break;
                case 2:
                    taskManager.displayTasks();
                    break;
                case 3:
                    System.out.print("Enter the task index to remove: ");
                    int indexToRemove = scanner.nextInt();
                    taskManager.removeTask(indexToRemove);
                    break;
                case 4:
                    System.out.println("Exiting Task Manager. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}



