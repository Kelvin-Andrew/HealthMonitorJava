public class TanakaMaxHeartRate extends MaximumHeartRate implements ICalculateMaxHeartRate
{
    protected String maxHeartRateVersion = "Tanaka";

    @Override
    protected Object getMaxHeartRateVersion()
    {
        return maxHeartRateVersion;
    }

    public TanakaMaxHeartRate(Human human, TargetHeartRate targetHeartRate)
    {
        this.human = human;
        this.targetHeartRate = targetHeartRate;
    }

    public double calculateMaxHeartRate()
    {
        return 208 - (0.7 * human.getAge()); 
    }
}