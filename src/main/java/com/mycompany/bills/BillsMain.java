/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bills;
import javax.swing.*;
/**
 *
 * @author lab_services_student
 */
public class BillsMain {
    
    public static void main(String[]args)
    {
        String name = JOptionPane.showInputDialog("Please enter name");
        double minutesTalked = Double.parseDouble(JOptionPane.showInputDialog("Please enter minutes talked"));
        double costPerMinute = Double.parseDouble(JOptionPane.showInputDialog("Please enter cost per minute"));
        
        Bills b = new Bills(name, costPerMinute, minutesTalked);
        
        JOptionPane.showMessageDialog(null, "CUSTOMER NAME: " + b.getName().toUpperCase() + "\n" + "Total due: R" + b.getTotalBills());
    }
}
