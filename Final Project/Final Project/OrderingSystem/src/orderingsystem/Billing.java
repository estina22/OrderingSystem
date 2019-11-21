/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderingsystem;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author eslemus
 */

public class Billing {
    private double subtotal;
    private double tax = .0625; //sales tax = 6.25%
    private double calc;
    DecimalFormat formatter = new DecimalFormat("#,###.00");

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
 
    String taxcalculate()
    {
        String finaltax;
        calc = subtotal * tax;
        finaltax= formatter.format(calc);
        return finaltax;
    }
    
    String billcalculate()
    {
        double bill;
        String total;
        bill = subtotal + calc;
        total = formatter.format(bill);
        return total;
    }
   
}

    
  

