package ott;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create the 3 streaming services
        StreamingService netflix = new StreamingService("Netflix", 10, 10);
        StreamingService amazon = new StreamingService("Amazon Prime", 2, 5);
        StreamingService hotstar = new StreamingService("Hotstar", 1, 5);

        // Sample Input 1
        // Netflix: 20hrs, Amazon: 10hrs, Hotstar: 50hrs
        List<StreamingService> services = new ArrayList<>();
        services.add(netflix);
        services.add(amazon);
        services.add(hotstar);

        List<Integer> hours = new ArrayList<>();
        hours.add(20);
        hours.add(10);
        hours.add(50);

        OTTPlan plan = new OTTPlan(services, hours);
        System.out.println("Total amount: Rs." + plan.calculateTotalBill());
        // Expected output: Rs.34
    }
}
