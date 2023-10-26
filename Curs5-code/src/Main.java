import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
    }

    public static class test {


            public static void main(String[] args) {

                int variabla1 = 5;

                int[] numere = {1, 2, 3, 4, 5, 6, 7, 8, 9};
                // EX 1
                int adunareNumere = sumOfArrayNumbers(numere);
                System.out.println("Suma totala a numerelor din Array este = " + adunareNumere);
                // EX 2
                int numereImpare = oddNumbersCalc(numere);
                System.out.println("Numerele total de numere impare sunt = " + numereImpare);
                // EX 3
                int numereMaiMari = biggerNumberCalc(numere, variabla1);
                System.out.println("Avem " + numereMaiMari + " numere mai mari decat " + variabla1);
                // EX 4-5
                int sumaDorita = 13500;
                int maxNumberOfDonations = 103;
                donationsApp(sumaDorita, maxNumberOfDonations);

                // EX 6
                String newPhrase = "This. Is. A. String. Separation. Tester";
                stringArraySeparation(newPhrase);

            }

            public static int sumOfArrayNumbers(int[] a) {
                int total = 0;

                for (int numar : a) {
                    total += numar;
                }

                return total;

            }

            public static int oddNumbersCalc(int[] oddNumbers) {
                int oddNumber = 0;

                for (int numar : oddNumbers) {
                    if (numar % 2 != 0) {
                        oddNumber++;
                    }
                }

                return oddNumber;
            }

            public static int biggerNumberCalc(int[] numere1, int numar2) {
                int numarMaiMare = 0;

                for (int numarX : numere1) {
                    if (numar2 > numarX) {
                        numarMaiMare++;
                    }
                }
                return numarMaiMare;

            }

            public static void donationsApp(int sumaDorita, int maxNumberOfDonations) {
                Random random = new Random();
                int sumaActuala = 0;
                int numarDonatii = 0;

                while (sumaActuala < sumaDorita && numarDonatii < maxNumberOfDonations) {
                    int donatie = random.nextInt(50);
                    sumaActuala += donatie;
                    numarDonatii++;

                    System.out.println("Donație #" + numarDonatii + ": " + donatie + " eur. Suma actuală: " + sumaActuala + " eur");

                    if (sumaActuala >= sumaDorita) {
                        System.out.println("Suma dorita de " + sumaDorita + " eur a fost atinsă! Mulțumim pentru donații!");
                    }
                }

                if (numarDonatii >= maxNumberOfDonations) {
                    System.out.println("End of Campaign, goal Reached!");
                }
            }
            public static void stringArraySeparation(String phrase) {
                String[] phrases = phrase.split("\\.");

                for (String a: phrases) {
                    a = a.trim();
                    System.out.println(a);
                }



            }

        }
}
