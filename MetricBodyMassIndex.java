public class MetricBodyMassIndex extends BodyMassIndex
{
    private Human human;
    protected String weightMessage = "Please enter the Weight in Kilograms";
    protected String heightMessage = "Please enter the Height in Meters";

    public MetricBodyMassIndex(Human human, Input input)
    {
        this.human = human;
        this.input = input;
    }
    public void calculateBMI()
    {
        bmi = Math.round(human.getWeight() / Math.pow(human.getHeight(), 2) * 100.0) / 100.0;
    }
}