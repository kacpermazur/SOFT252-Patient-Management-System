/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kacper
 */
public class RatingList implements Serializable{
    
    private final List<Rating> ratings;
    
    public RatingList()
    {
        ratings = new ArrayList<>();
    }
    
    public boolean add(Rating rating)
    {
        boolean isAdded = false;
        
        if(ratings != null)
        {
            isAdded = ratings.add(rating);
        }
        
        return isAdded;
    }
    
    public String ToString()
    {
        StringBuilder hold = new StringBuilder();
        
        for (Rating rating : ratings)
        {
            hold.append(rating.ToString() + "\n");
        }
        
        return hold.toString();
    }
}
