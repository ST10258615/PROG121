/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bills;

/**
 *
 * @author lab_services_student
 */
public class Bills {
    private String customer;
    private double minutes, cost;
    
    public Bills(String name, double costPerMinute, double minutesTalked)
    {
        customer = name;
        minutes = minutesTalked;
        cost = costPerMinute;
    }
    
    public String getName()
    {
        return customer;
    }
    public double getTotalBills()
    {
        return (minutes * cost);
    }
}
