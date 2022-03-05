import java.util.Scanner;

public class Input 
{
    private String typeError = "Value entered is not the correct type. Please enter a valid value";

    public double getInputAndTypeValidate(String message, double value)
    {
        boolean isValid = false;
        
        do
        {
            System.out.println(message);
            Scanner scanner = new Scanner(System.in);

            if(scanner.hasNextDouble()) 
            {
                isValid = true;
                value = scanner.nextDouble();
            }
            else 
            {
                System.out.println(typeError);
            }
        }while(!isValid);

        return value;
    }

    public int getInputAndTypeValidate(String message, int value)
    {
        boolean isValid = false;
        
        do
        {
            System.out.println(message);
            Scanner scanner = new Scanner(System.in);

            if(scanner.hasNextInt()) 
            {
                isValid = true;
                value = scanner.nextInt();
            }
            else 
            {
                System.out.println(typeError);
            }
        }while(!isValid);
        
        return value;
    }

    public boolean getInputAndTypeValidate(String message, boolean value)
    {
        boolean isValid = false;
        
        do
        {
            System.out.println(message);
            Scanner scanner = new Scanner(System.in);

            if(scanner.hasNextBoolean()) 
            {
                isValid = true;
                value = scanner.nextBoolean();
            }
            else 
            {
                System.out.println(typeError);
            }
        }while(!isValid);

        return value;
    }

}
