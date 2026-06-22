package ott; // ← missing semicolon

import java.util.*;

public class OTTPlan {
    List<StreamingService> services;
    List<Integer> hours;
    
    public OTTPlan(List<StreamingService> services, List<Integer> hours) { // comma not dot
        this.services = services; 
        this.hours = hours;
    }
    
    public int calculateTotalBill() {
        int total = 0;        
        for(int i = 0; i < services.size(); i++) {
            total += services.get(i).calculateCost(hours.get(i));}
        return total;
    }
}
