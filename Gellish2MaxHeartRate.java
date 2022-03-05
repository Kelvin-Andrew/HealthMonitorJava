public class Gellish2MaxHeartRate extends MaximumHeartRate implements ICalculateMaxHeartRate
{
    protected String maxHeartRateVersion = "Gellish 2";

    @Override
    protected Object getMaxHeartRateVersion()
    {
        return maxHeartRateVersion;
    }

    public Gellish2MaxHeartRate(Human human, TargetHeartRate targetHeartRate)
    {
        this.human = human;
        this.targetHeartRate = targetHeartRate;
    }

    public double calculateMaxHeartRate()
    {
        return 191.5 - 0.007 * Math.pow(human.getAge(), 2); 
    }
}
