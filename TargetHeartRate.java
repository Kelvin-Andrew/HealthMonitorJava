public class TargetHeartRate
{
    private int lowerBoundaryTargetHeartRate;
    private int upperBoundaryTargetHeartRate;

    private double[] intensityPercentage = { 0.50, 0.70, 0.80, 0.90, 1.00 };

    private String[] intensity = { "Low", "Moderate", "High", "Max" };

    private void outputTargetHeartRateBoundaries(String intensity)
    {
        System.out.println("At " + intensity + " intensity your target heart range is between "
        + lowerBoundaryTargetHeartRate + " and " + upperBoundaryTargetHeartRate);
    }

    public void calculateTargetHeartRate(MaximumHeartRate maximumHeartRate)
    {
        int j = 0;
        for (int i = 0; i < 4; i++)
        {
            lowerBoundaryTargetHeartRate = (int)(maximumHeartRate.maxHeartRate * intensityPercentage[i]);
            upperBoundaryTargetHeartRate = (int)(maximumHeartRate.maxHeartRate * intensityPercentage[i+1]);
            outputTargetHeartRateBoundaries(intensity[j]);
            j += 1;
        }  
    } 
}
