public class RangeValidation 
{
    public boolean validateRange(int value, int lowerBoundary, int upperBoundary)
    {
        boolean isValid = false;

        if(value >=lowerBoundary && value <= upperBoundary)
        {
            isValid = true;
        }
        else
        {
            System.out.println(
                "The value entered: " + value + " is outside the acceptable range \n" +
                "The value must be between " + lowerBoundary + " and " + upperBoundary
            );
        }
        return isValid;
    }

    public boolean validateRange(double value, double lowerBoundary, double upperBoundary)
    {
        boolean isValid = false;

        if(value >=lowerBoundary && value <= upperBoundary)
        {
            isValid = true;
        }
        else
        {
            System.out.println(
                "The value entered: " + value + " is outside the acceptable range \n" +
                "The value must be between " + lowerBoundary + " and " + upperBoundary
            );
        }
        return isValid;
    }
}
