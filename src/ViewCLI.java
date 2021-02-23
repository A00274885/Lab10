import java.util.Scanner;

public class ViewCLI
{
    private boolean interfaceLoop = true;

    Scanner input = new Scanner(System.in);
    Controller controller = new Controller();

    public void init()
    {
        while(interfaceLoop)
        {
        System.out.println("1. Create a Student entry");
        System.out.println("2. Delete a Student entry");
        System.out.println("3. Show all Students");

        System.out.println("1. Create a Staff entry");
        System.out.println("2. Delete a Staff entry");
        System.out.println("3. Show all Staff");

        System.out.println("7. Close the program");

        int choice = input.nextInt();

            switch (choice) {
                case 1:
                    createStudent();
                    break;

                case 2:
                    deleteStudent();
                    break;

                case 3:
                    showStudent();
                    break;

                case 4:
                    CreateStaff();
                    break;
                case 5:
                    DeleteStaff();
                    break;

                case 6:
                    ShowStaff();
                    break;

                case 7:
                    interfaceLoop = false;
            }
        }

    }

    private void CreateStaff()
    {
        try
        {
            System.out.println("Enter staff name: ");
            String name = input.next();

            System.out.println("Enter staff DOB:");
            String dOB = input.next();

            System.out.println("Enter staff age: ");
            int age = input.nextInt();

            System.out.println("Enter staff gender: ");
            char gender = input.next().charAt(0);

            System.out.println("Enter Staff department: ");
            String department = input.next();

            Staff s = new Staff(name, dOB, age, gender, department);

            controller.addToStaff(s);

        }
        catch (CustomExceptionHandler e)
        {
            System.out.println(e.getMessage());
            init();
        }
    }

    private void DeleteStaff()
    {

    }

    private void ShowStaff()
    {

    }

    private void createStudent()
    {
        try
        {
            System.out.println("Enter students name: ");
            String name = input.next();

            System.out.println("Enter students DOB:");
            String dOB = input.next();

            System.out.println("Enter students age: ");
            int age = input.nextInt();

            System.out.println("Enter students gender: ");
            char gender = input.next().charAt(0);

            System.out.println("Enter students module: ");
            String module = input.next();

            System.out.println("Enter students year");
            int year = input.nextInt();

            Student s = new Student(name, dOB, age, gender, module, year);

            controller.addToStudent(s);

        }
        catch (CustomExceptionHandler e)
        {
            System.out.println(e.getMessage());
            init();
        }
    }

    private void deleteStudent()
    {
        System.out.println("Enter the name you want to remove");
        String name = input.next();
        controller.removeFromStudent(name);

    }

    private void showStudent()
    {
        controller.printStudent();
    }
}
