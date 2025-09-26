package DSA.QuestionRandoms;

import java.util.*;

public class minDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String minItem = "";
        int minCost = 0;
        int minDisc = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            String[] parts = line.split(",");
            String item = parts[0].trim();
            int cost = Integer.parseInt(parts[1].trim());
            int disc = Integer.parseInt(parts[2].trim());

            int discountAmount = (cost * disc) / 100;

            if (discountAmount < minDisc) {
                minDisc = discountAmount;
                minCost = cost;
                minItem = item;
            }
        }

        List<Object> list = Arrays.asList(minItem, minCost, minDisc);
        System.out.println("Item with minimum discount is " + list);
    }
}
