/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lotterytracker;

import java.time.*;
import java.util.Comparator;
/**
 *
 * @author logan
 */
public class BinComparator implements Comparator<Bin> {
    private final LocalDate dateConfirmation;
    
    public BinComparator(LocalDate dateConfirmation) {
        this.dateConfirmation = dateConfirmation;
    }
    
    @Override
    public int compare(Bin bin1, Bin bin2) {
        int requiredQuantity1 = getRequiredQuantity(bin1.getValue(), bin1.getTotalQuantity());
        int requiredQuantity2 = getRequiredQuantity(bin2.getValue(), bin2.getTotalQuantity());

        return Integer.compare(requiredQuantity1, requiredQuantity2);
    }
    
    private static final int TICKET_THRESHOLD_1 = 20;
    private static final int TICKET_THRESHOLD_2 = 30;
    private static final int TICKET_THRESHOLD_3 = 45;
    private static final int TICKET_THRESHOLD_4 = 60;
    
    private int getRequiredQuantity(int value, int total) {
        if (value == 1 || value == 2 || value == 3) {
            return Math.max(0, TICKET_THRESHOLD_1 - total);
        } else if (value == 5 || value == 30) {
            return Math.max(0, TICKET_THRESHOLD_2 - total);
        } else if (value == 10 || value == 20) {
            return Math.max(0, TICKET_THRESHOLD_3 - total);
        } else if (value == 50 || value == 25) {
            return Math.max(0, TICKET_THRESHOLD_4 - total);
        } else {
            return 0;
        }
    }
    
}
