public class CERGMaxHeartRate extends MaximumHeartRate implements ICalculateMaxHeartRate
{
    protected String maxHeartRateVersion = "Cardiac Exercise Research Group (CERG)";

    @Override
    protected Object getMaxHeartRateVersion()
    {
        return maxHeartRateVersion;
    }

    public CERGMaxHeartRate(Human human, TargetHeartRate targetHeartRate)
    {
        this.human = human;
        this.targetHeartRate = targetHeartRate;
    }

    public double calculateMaxHeartRate()
    {
        return 211 - 0.64 * human.getAge();
    }
}