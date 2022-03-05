public class ImperialBodyMassIndex extends BodyMassIndex
{
    private Human human;
    protected String weightMessage = "Please enter the Weight in Pounds";
    protected String heightMessage = "Please enter the Height in Inches";

    public ImperialBodyMassIndex(Human human, Input input)
    {
        this.human = human;
        this.input = input;
    }
    public void calculateBMI()
    {
        bmi = Math.round((human.getWeight() * 703) / Math.pow(human.getHeight(), 2) * 100.0) / 100.0; 
    }
}
