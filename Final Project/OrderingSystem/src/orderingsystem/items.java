/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderingsystem;

/**
 *
 * @author eslemus
 */
public class items {
    
    private String name;
    private String description;
    private double price;
    
    //constructor
    public items(String name, String description, double price)
    {
        this.name = name;
        this.description = description;
        this.price = price;
    }
    
    //the following are setters and getters
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
    public String getDescription()
    {
        return description;
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
