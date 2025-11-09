package DSA.LP3;

import java.util.Arrays;
import java.util.Scanner;
public class FractionalKnapsackGreedy{
    // Class to represent an item with weight and value
    static class Item {
        int weight, value;

        Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }

    // Method to get the maximum total value in the knapsack
    public static double getMaxValue(Item[] items, int capacity) {
        // Step 1: Sort items by value/weight ratio in descending order
        Arrays.sort(items, (a, b) -> Double.compare((double)b.value / b.weight, (double)a.value / a.weight));

        double totalValue = 0.0;

        // Step 2: Pick items greedily
        for (Item item : items) {
            if (capacity == 0)
                break;

            if (item.weight <= capacity) {
                // Take full item
                capacity -= item.weight;
                totalValue += item.value;
            } else {
                // Take fractional part of the item
                double fraction = (double) capacity / item.weight;
                totalValue += item.value * fraction;
                capacity = 0;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        Item[] items = new Item[n];
        System.out.println("Enter weight and value of each item:");
        for (int i = 0; i < n; i++) {
            int weight = sc.nextInt();
            int value = sc.nextInt();
            items[i] = new Item(weight, value);
        }

        System.out.print("Enter capacity of knapsack: ");
        int capacity = sc.nextInt();

        double maxValue = getMaxValue(items, capacity);
        System.out.println("Maximum total value in knapsack = " + maxValue);
    }
}
