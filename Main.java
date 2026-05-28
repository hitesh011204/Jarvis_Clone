import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Hello, I am Jarvis, your personal assistant. How can I assist you today?");
        System.out.print("You: ");
        String command=scan.nextLine();
        while(true)
        {
            if(command.equalsIgnoreCase("Hello"))
            {
                System.out.println("Jarvis: Hello!");
            }
            else if(command.equalsIgnoreCase("Time"))
            {
                System.out.println("Jarvis: Time command received.");
            }
            else if(command.equalsIgnoreCase("Exit"))
            {
                break;
            }
            else
            {
                System.out.println("Jarvis: Command not recognized. Please try again.");
            }
            System.out.print("You: ");
            command=scan.nextLine();
        }
        System.out.println("Jarvis Shutting down.");
        scan.close();
    }
}