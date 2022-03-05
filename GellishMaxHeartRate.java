public class GellishMaxHeartRate extends MaximumHeartRate implements ICalculateMaxHeartRate
{
    protected String maxHeartRateVersion = "Gellish";

    @Override
    protected Object getMaxHeartRateVersion()
    {
        return maxHeartRateVersion;
    }

    public GellishMaxHeartRate(Human human, TargetHeartRate targetHeartRate)
    {
        this.human = human;
        this.targetHeartRate = targetHeartRate;
    }

    public double calculateMaxHeartRate()
    {
        return 206.9 - (0.67 * human.getAge());
    }
}
