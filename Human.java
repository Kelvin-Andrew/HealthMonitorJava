public class Human 
{
    private Input input;
    private RangeValidation rangeValidation;
    private int age;
    private int weight;
    private double height;
    private boolean sexIsFemale;
    public byte imperialOrMetric;

    public Human(Input input, RangeValidation rangeValidation, byte imperialOrMetric)
    {
        this.input = input;
        this.rangeValidation = rangeValidation;
        this.imperialOrMetric = imperialOrMetric;
    }

    public void runHuman()
    {
        age = setUserAge();
        rangeValidation.validateRange(age, 0, 150);
        weight = setUserWeight();
        rangeValidation.validateRange(weight, 0, 1000);
        height = setUserHeight();
        rangeValidation.validateRange(height, 0.0, 118.0);
        sexIsFemale = setUserSex();
    }

    private String DetermineWeightUnits(byte imperialOrMetric)
    {
        String unit = "";
        if (imperialOrMetric == 1)
        {
            unit = "Pounds";
        }
        else if (imperialOrMetric == 2)
        {
            unit = "Kilograms";
        }
        return unit;
    }

    private String DetermineHeightUnits(byte imperialOrMetric)
    {
        String unit = "";
        if (imperialOrMetric == 1)
        {
            unit = "Inches";
        }
        else if (imperialOrMetric == 2)
        {
            unit = "Meters (E.G: 1.75 for 175cm)";
        }
        return unit;
    }

    private int setUserAge() 
    {
        return input.getInputAndTypeValidate("Enter your age", age);
    }

    private int setUserWeight()
    {
        return input.getInputAndTypeValidate("Enter your weight in " + DetermineWeightUnits(imperialOrMetric), weight);
    }

    private boolean setUserSex() 
    {
        return input.getInputAndTypeValidate("Enter \"true\" if your are female, \"false\" if you are male", sexIsFemale);
    }

    private double setUserHeight() 
    {
        return input.getInputAndTypeValidate("Enter your height in " + DetermineHeightUnits(imperialOrMetric), height);
    }

    public int getWeight()
    {
        return weight;
    }

    public double getHeight()
    {
        return height;
    }

    public boolean getSexIsFemale()
    {
        return sexIsFemale;
    }

    public int getAge()
    {
        return age;
    }
}