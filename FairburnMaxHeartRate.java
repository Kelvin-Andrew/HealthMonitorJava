public class FairburnMaxHeartRate extends MaximumHeartRate implements ICalculateMaxHeartRate
{
    private String maxHeartRateVersion = "Fairburn";

    @Override
    protected Object getMaxHeartRateVersion()
    {
        return maxHeartRateVersion;
    }

    public FairburnMaxHeartRate(Human human, TargetHeartRate targetHeartRate)
    {
        this.human = human;
        this.targetHeartRate = targetHeartRate;
    }

    public double calculateMaxHeartRate()
    {
        if(human.getSexIsFemale())
        {
            return 201 - 0.63 * human.getAge();
        }
        else
        {
            return 208 - 0.80 * human.getAge();
        }   
    }
}