/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sammysrentalprice;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author lab_services_student
 */
public class SammysRentalPrice {

    public static void main(String[] args) {
        //Takes user input
        int minutes = Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount of minutes that you have rented equipment for"));
        //calculates hours and extra minutes and price
        int hours = minutes/60;
        int extraMinutes = minutes%60;
        int price = (40*hours) + extraMinutes;
        //Displays details
        JOptionPane.showMessageDialog(null,"SAMMY'S SEASHORE SUPPLIES\n" + "MINUTES:\t" + minutes + "\nHOURS:\t" + hours + "\nTOTAL PRICE:\t$" + price);
    }
}
