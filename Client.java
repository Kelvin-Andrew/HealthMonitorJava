import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client 
{
    private Input input;
    private RangeValidation rangeValidation;
    private TargetHeartRate targetHeartRate;
    private Human human;
    private BodyMassIndex imperialBodyMassIndex;
    private BodyMassIndex metricBodyMassIndex;
    private byte maxHeartRateVersion;
    public byte imperialOrMetric;

    public Client()
    {
        input = new Input();
        rangeValidation = new RangeValidation();
        targetHeartRate = new TargetHeartRate();
        human = new Human(input, rangeValidation, imperialOrMetric);
        imperialBodyMassIndex = new ImperialBodyMassIndex(human, input);
        metricBodyMassIndex = new MetricBodyMassIndex(human, input);
    }

    public void runClient()
    {
        imperialOrMetric = selectImperialOrMetric();
        human.imperialOrMetric = imperialOrMetric;

        List<MaximumHeartRate> maximumHeartRates = new ArrayList<>();
        maximumHeartRates.add(new GellishMaxHeartRate(human, targetHeartRate));
        maximumHeartRates.add(new Gellish2MaxHeartRate(human, targetHeartRate));
        maximumHeartRates.add(new TanakaMaxHeartRate(human, targetHeartRate));
        maximumHeartRates.add(new CERGMaxHeartRate(human, targetHeartRate));
        maximumHeartRates.add(new FairburnMaxHeartRate(human, targetHeartRate));
        
        human.runHuman();
        maxHeartRateVersion = maxHeartRateVersion();

        if (maxHeartRateVersion == 1)
        {
            maximumHeartRates.get(0).runMaxHeartRate();
            targetHeartRate.calculateTargetHeartRate(maximumHeartRates.get(0));
        }
        else if (maxHeartRateVersion == 2)
        {
            maximumHeartRates.get(1).runMaxHeartRate();
            targetHeartRate.calculateTargetHeartRate(maximumHeartRates.get(1));
        }
        else if (maxHeartRateVersion == 3)
        {
            maximumHeartRates.get(2).runMaxHeartRate();
            targetHeartRate.calculateTargetHeartRate(maximumHeartRates.get(2));
        }
        else if (maxHeartRateVersion == 4)
        {
            maximumHeartRates.get(3).runMaxHeartRate();
            targetHeartRate.calculateTargetHeartRate(maximumHeartRates.get(3));
        }
        else if (maxHeartRateVersion == 5)
        {
            maximumHeartRates.get(4).runMaxHeartRate();
            targetHeartRate.calculateTargetHeartRate(maximumHeartRates.get(4));
        }
        else if (maxHeartRateVersion == 6)
        {
            for(int i = 0; i < maximumHeartRates.size();i++)
            {
                maximumHeartRates.get(i).runMaxHeartRate();
                targetHeartRate.calculateTargetHeartRate(maximumHeartRates.get(i));
            }
        }

        if (imperialOrMetric == 1)
        {
            imperialBodyMassIndex.runBodyMassIndex();
        }
        else if (imperialOrMetric == 2)
        {
            metricBodyMassIndex.runBodyMassIndex();
        }
        
    }

    private byte selectImperialOrMetric()
    {
        byte choice = 0;
        boolean isValid = false;
        do
        {
            System.out.println("\n\nWill you be providing Imperial (Pounds and Inches) or Metric (Kilograms and Meters) units?\n" +
            "For Imperial units press 1\n" +
            "For Metric units press 2\n");
            Scanner scanner = new Scanner(System.in);

            if(!scanner.hasNextByte()) 
            {
                System.out.println("Type Error. Enter a byte only. Please try again");
            }
            else
            {
                isValid = true;
                choice = scanner.nextByte();
            }
            if(choice < 1 || choice > 2)
            {
                System.out.println("Incorrect data entered. Only integer values of 1 and 2 are accepted");
            }
        } while (!isValid || choice < 1 || choice > 2);
        return choice;
    }

    private byte maxHeartRateVersion()
    {
        byte choice = 0;
        boolean isValid = false;
        do
        {
            System.out.println("Which version / algorithm would you like to use to calculate your Maximum Heart Rate?\n" +
            "Press 1 for Gellish\n" +
            "Press 2 for Gellish Version 2\n" + 
            "Press 3 for Tanaka\n" +
            "Press 4 for Cardiac Exercise Research Group\n" +
            "Press 5 for Fairburn\n" +
            "Press 6 to calculate them all\n");
            Scanner scanner = new Scanner(System.in);

            if(!scanner.hasNextByte()) 
            {
                System.out.println("Type Error. Enter a byte only. Please try again");
            }
            else
            {
                isValid = true;
                choice = scanner.nextByte();
            }
            if (choice < 1 || choice > 6)
            {
                System.out.println("Incorrect data entered. Only integer values between 1 and 5 are accepted");
            }
        } while (!isValid || choice < 1 || choice > 6);
        
        return choice;
    }
}   
