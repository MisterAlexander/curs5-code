import java.util.Random;

public class Curs5Homework {

    public static void main(String[] args) {

        int variable1 = 6;

        int[] numbers = {2, 3, 6, 13, 9, 1, 5, 8, 11};
        // EX 1
        int aditionOfNumbers = sumOfArrayNumbers(numbers);
        System.out.println("The sum of numbers in the array is = " + aditionOfNumbers);
        // EX 2
        int oddNumbers = oddNumbersCalc(numbers);
        System.out.println("Total number of odd numbers is = " + oddNumbers);
        // EX 3
        int biggerNumbers = biggerNumberCalc(numbers, variable1);
        System.out.println("I got " + biggerNumbers + " numbers bigger then " + variable1);
        // EX 4-5
        int desirednumberofdonations = 5000;
        int maxNumberOfDonations = 200;
        donationsApp(desirednumberofdonations, maxNumberOfDonations);

        // EX 6
        String newPhrase = "Hello. Good morning. Evening. This is my line. 12345666 . Yoohoo";
        stringArraySeparator(newPhrase);

    }

    public static int sumOfArrayNumbers(int[] a) {
        int total = 0;

        for (int number : a) {
            total += number;
        }

        return total;

    }

    public static int oddNumbersCalc(int[] oddNumbers) {
        int oddNumber = 0;

        for (int number : oddNumbers) {
            if (number % 2 != 0) {
                oddNumber++;
            }
        }

        return oddNumber;
    }

    public static int biggerNumberCalc(int[] numbers1, int numbers2) {
        int biggerNumbers = 0;

        for (int xNumber : numbers1) {
            if (numbers2 > xNumber) {
                biggerNumbers++;
            }
        }
        return biggerNumbers;

    }

    public static void donationsApp(int desirednumberofdonations, int maxNumberOfDonations) {
        Random random = new Random();
        int actualSum = 0;
        int nrOfDonations = 0;

        while (actualSum < desirednumberofdonations && nrOfDonations < maxNumberOfDonations) {
            int donation = random.nextInt(500);
            actualSum += donation;
            nrOfDonations++;

            System.out.println("Donation #" + nrOfDonations + ": " + donation + " eur. New sum: " + actualSum + " eur");

            if (actualSum >= desirednumberofdonations) {
                System.out.println("The desired sum of " + desirednumberofdonations + " eur was reached! Thank you all for the donations!");
            }
        }

        if (nrOfDonations >= maxNumberOfDonations) {
            System.out.println("We reached our goal!");
        }
    }
    public static void stringArraySeparator(String phrase) {
        String[] phrases = phrase.split("\\.");

        for (String a: phrases) {
            a = a.trim();
            System.out.println(a);
        }



    }

}