public abstract class BodyMassIndex 
{
    protected Input input;
    protected double bmi;
    protected String bmiCategory;
    protected double[] boundary = {18.0, 25.0, 30.0, 35.0, 40.0};

    public abstract void calculateBMI();

    public void runBodyMassIndex()
    {
        calculateBMI();
        calculateBMICategory();
        outputBodyMassIndex();
        outputBodyMassIndexCategory();
    }

    protected void calculateBMICategory()
    {
        if (bmi < boundary[0])
        {
            bmiCategory = "Underweight";
        }
        else if (bmi >= boundary[0] && bmi < boundary[1])
        {
            bmiCategory = "Normal";
        }
        else if (bmi >= boundary[1] && bmi < boundary[2])
        {
            bmiCategory = "Overweight";
        }
        else if (bmi >= boundary[2] && bmi < boundary[3])
        {
            bmiCategory = "Obese Class 1";
        }
        else if (bmi >= boundary[3] && bmi < boundary[4])
        {
            bmiCategory = "Obese Class 2";
        }
        else if (bmi >= boundary[4])
        {
            bmiCategory = "Obese Class 3";
        }
    }

    protected void outputBodyMassIndex()
    {
        System.out.println("BMI: " + bmi);
    }

    protected void outputBodyMassIndexCategory()
    {
        System.out.println("BMI Category: " + bmiCategory);
    }
}
