import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 for ClI \nPress 2 for GUI");
        int viewChoice = input.nextInt();

        switch(viewChoice)
        {
            case 1:
                ViewCLI viewCLI = new ViewCLI();
                viewCLI.init();
                break;

            case 2:
                Controller controller = new Controller();
                break;
        }
        input.close();
    }
}
