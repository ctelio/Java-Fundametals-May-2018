package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfTrainDays = Integer.parseInt(scanner.nextLine());
        int numOfDancers = Integer.parseInt(scanner.nextLine());
        double energyOfDancer = 100.00;
        double energyOfEvenEven = 68.00;
        double energyOfEvenOdd = 65.00;
        double energyOfOddEven = 49.00;
        double energyOfOddOdd = 30.00;
        double totalEnergy = 0.0;
        double totalEnergyInDancers = numOfDancers * energyOfDancer * numOfTrainDays;
        double currentTotalEnergy = 0.0;
        for (int i = 1; i <= numOfTrainDays; i++){
            double trainHour = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0 && trainHour % 2 == 0)
            {
                totalEnergy = numOfDancers * energyOfEvenEven;
            }
            if (i % 2 == 0 && trainHour % 2 != 0)
            {
                totalEnergy = numOfDancers * energyOfEvenOdd;
            }
            if (i % 2 != 0 && trainHour % 2 == 0)
            {
                totalEnergy = numOfDancers * energyOfOddEven;
            }
            if (i % 2 != 0 && trainHour % 2 != 0)
            {
                totalEnergy = numOfDancers * energyOfOddOdd;
            }
            currentTotalEnergy += totalEnergy;
        }
        double nonSpendEnergy = totalEnergyInDancers - currentTotalEnergy;
        double nonSpendEnergyByDancer = nonSpendEnergy / numOfDancers / numOfTrainDays;
        if(nonSpendEnergyByDancer <= 50)
        {
            System.out.printf("They are wasted! Energy left: %.2f", nonSpendEnergyByDancer);
        }
        else if (nonSpendEnergyByDancer > 50)
        {
            System.out.printf("They feel good! Energy left: %.2f" , nonSpendEnergyByDancer);
        }
    }
}