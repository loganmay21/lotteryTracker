/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lotterytracker;

import java.io.*;
import javax.swing.JOptionPane;
import java.util.*;
import java.time.LocalDate;

/**
 *
 * @author logan
 */
public class Bin implements Serializable {
    
    private int ticketNumber;
    private int binNumber;
    private int machineQuantity;
    private int safeQuantity;
    private int value;
    private LocalDate date;
    private int totalQuantity;
    
    public Bin(int ticketNumber, int binNumber, int machineQuantity,int safeQuantity, int value, LocalDate date) {
        this.ticketNumber = ticketNumber;
        this.binNumber = binNumber;
        this.machineQuantity = machineQuantity;
        this.safeQuantity = safeQuantity;
        this.value = value;
        this.date = date;
        totalQuantity = machineQuantity + safeQuantity;
    }
    
    public boolean equals(Bin bin) {
        return (this.ticketNumber == bin.ticketNumber && this.binNumber == bin.binNumber && this.machineQuantity == bin.machineQuantity && this.safeQuantity == bin.safeQuantity 
                && this.value == bin.value && this.totalQuantity == bin.totalQuantity);
    }
    
    public LocalDate getDate() {
        return date;
    }
    
    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    public int getTicketNumber() {
        return ticketNumber;
    }
    
    public void setTicketNumber(int ticketNumber) {
        if (ticketNumber < 1) {
            JOptionPane.showMessageDialog(null,"Please Enter a Value Greater than 0");
        } else {
            this.ticketNumber = ticketNumber;
        }
    }
    public int getBinNumber() {
        return binNumber;
    }
    
    public void setBinNumber(int binNumber) {
        if (binNumber < 1) {
            JOptionPane.showMessageDialog(null,"Please Enter a Value Greater than 0");
        } else {
            this.binNumber = binNumber;
        }
        
    }
    
    public int getMachineQuantity() {
        return machineQuantity;
    }
    
    public void setMachineQuantity(int machineQuantity) {
        if (machineQuantity < 0) {
            JOptionPane.showMessageDialog(null, "Please Enter a Value Greater than or Equal to 0");
        } else {
            this.machineQuantity = machineQuantity;
        }
    }
    
    public int getSafeQuantity() {
        return safeQuantity;
    }
    
    public void setSafeQuantity(int safeQuantity) {
        if (safeQuantity < 0) {
            JOptionPane.showMessageDialog(null, "Please Enter a Value Greater than or Equal to 0");
        } else {
            this.safeQuantity = safeQuantity;
        }
    }
    
    public int getValue() {
        return value;
    }
    
    public void setValue(int value) {
        if (value < 0) {
            JOptionPane.showMessageDialog(null, "Please Enter a Value Greater than 0");
        } else {
            this.value = value;
        }
    }
    
    public int getTotalQuantity() {
        return totalQuantity;
    }
    
    public void setTotalQuantity(int totalQuantity) {
        if (totalQuantity < 0) {
            JOptionPane.showMessageDialog(null, "Please Enter a Value Greater than or Equal to 0");
        } else {
            this.totalQuantity = totalQuantity;
        }
    }
    
    public void ticketOrderQuantity(int totalQuantity, int value) {
        if ((value == 1 || value == 2 || value == 3) && totalQuantity < 20) {
            System.out.println("");
            System.out.println("You need to order " + (20 - totalQuantity) + " more tickets for bin " + this.getBinNumber());
            System.out.println("Total Quantity of tickets: " + this.getTotalQuantity());
            System.out.println("Quantity Needed: 20");
            System.out.println("");
        } else if ((value == 5 || value == 30) && totalQuantity < 30) {
            System.out.println("");
            System.out.println("You need to order " + (30 - totalQuantity) + " more tickets for bin " + this.getBinNumber());
            System.out.println("Total Quantity of tickets: " + this.getTotalQuantity());
            System.out.println("Quantity Needed: 30");
            System.out.println("");
        } else if((value == 10 || value == 20) && totalQuantity < 45) {
            System.out.println("");
            System.out.println("You need to order " + (45 - totalQuantity) + " more tickets for bin " + this.getBinNumber());
            System.out.println("Total Quantity of tickets: " + this.getTotalQuantity());
            System.out.println("Quantity Needed: 45");
            System.out.println("");
        } else if(value == 50 && totalQuantity < 60) {
            System.out.println("");
            System.out.println("You need to order " + (60 - totalQuantity) + " more tickets for bin " + this.getBinNumber());
            System.out.println("Total Quantity of tickets: " + this.getTotalQuantity());
            System.out.println("Quantity Needed: 60");
            System.out.println("");
        }
        System.out.println("No tickets need to be supplied for this bin");
    }
}
