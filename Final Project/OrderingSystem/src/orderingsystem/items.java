/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderingsystem;

import java.io.*;

/**
 *
 * @author eslemus
 */
public class items implements Serializable{
    
    private String name;
    private double price;
    public boolean equals(items item)
    {
        if(this.price==item.price && this.name.equals(item.name))
        {
            return true;
        }
        else {
            return false;
        }
    }
    
    //constructor
 
    //the following are setters and getters
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }
    public double getPrice()
    {
        return price;
    }
    //--------------------------------------------------------------
    
}
