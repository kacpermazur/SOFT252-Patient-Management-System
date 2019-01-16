/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel;

import java.io.Serializable;

/**
 *
 * @author kacper
 */
public class Medicine implements Serializable{
    private String name;
    private Integer qunatity;
    
    public Medicine() {
        
    }

    public Medicine(String name, Integer qunatity) {
        this.name = name;
        this.qunatity = qunatity;
    }

    public String getName() {
        if (name != null)
        {
            return name;
        }
        
        return "no name Set";
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQunatity() {
        if (qunatity != null)
        {
            return qunatity;
        }
        return 0;
    }

    public void setQunatity(Integer qunatity) {
        this.qunatity = qunatity;
    }
    
    public String ToString()
    {
        StringBuilder hold = new StringBuilder();
        
        hold.append(this.name);
        hold.append(" - ");
        hold.append(this.qunatity);
        
        return hold.toString();
    }
}
