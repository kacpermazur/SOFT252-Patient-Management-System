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
public class Rating implements Serializable{
    private Integer rating;
    private String comment; 
    
    /**
     *
     */
    public Rating() {
        
    }

    /**
     *
     * @param rating
     * @param comment
     */
    public Rating(Integer rating, String comment) {
        this.rating = rating;
        this.comment = comment;
    }

    /**
     *
     * @return
     */
    public Integer getRating() {
        return rating;
    }

    /**
     *
     * @param rating
     */
    public void setRating(Integer rating) {
        
        int lowerBoundry = 1;
        int upperBoundry = 5;
        
        if(rating < lowerBoundry)
        {
            rating = lowerBoundry;
        }
        else if (rating > upperBoundry)
        {
            rating = upperBoundry;
        }
        
        this.rating = rating;
    }

    /**
     *
     * @return
     */
    public String getComment() {
        return comment;
    }

    /**
     *
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    /**
     *
     * @return
     */
    public String ToString()
    {
        StringBuilder temp = new StringBuilder();
        
        temp.append(this.rating);
        temp.append("\n");
        temp.append(this.comment);
        
        return temp.toString();
    }
}
