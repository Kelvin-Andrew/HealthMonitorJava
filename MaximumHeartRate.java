public abstract class MaximumHeartRate
{
    protected Human human;
    protected TargetHeartRate targetHeartRate;  

    private String maxHeartRateVersion;         //do not want to use this field's value, but instead use the derived class
    protected double maxHeartRate;

    public abstract double calculateMaxHeartRate();

    //polymorphism to ensure derived value of maxHeartRateVersion used
    protected Object getMaxHeartRateVersion()
    {
        return maxHeartRateVersion;
    }

    public void runMaxHeartRate()
    {
        maxHeartRate = Math.round(calculateMaxHeartRate());
        outputMaxHeartRate();
    }

    public void outputMaxHeartRate()
    {
        System.out.println("Based on the " + getMaxHeartRateVersion() + " algorithm,"
           + " your maximum heart rate is " + maxHeartRate);
    }
}