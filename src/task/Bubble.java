package task;

import java.util.Scanner;

public class Bubble {
    static int dayCounter;
    static double[] price;
    private final static String CURRENCY = "UAH";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n - кількість днів
        int n = 7;
        double sum = 0;
        price = new double[n];
        System.out.println("Enter the price: ");
        for (int i = 0; i < n; ++i) {
            dayCounter++;
            System.out.println("Day " + dayCounter + "-");
            price[i] = sc.nextDouble();
            sum += price[i];
        }
sc.close();
        for (int i = 0; i < n; ++i) {
            for (int j = 1; j < n - i; ++j) {
                if (price[j - 1] > price[j]) {
                    double temp = price[j - 1];
                    price[j - 1] = price[j];
                    price[j] = temp;
                }
            }
        }
        System.out.println("Sorted price:");
        for (int i = 0; i < n; ++i) {
            System.out.printf("%.2f %s%n",
                    price[i], CURRENCY);
        }

        double averr = sum / dayCounter;
        System.out.printf("Averrage price equals: %.2f %s", averr, CURRENCY);
    }
}