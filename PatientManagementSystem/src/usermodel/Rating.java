/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel;

/**
 *
 * @author kacper
 */
public class Rating {
    private Integer rating;
    private String comment; 

    public Rating(Integer rating, String comment) {
        this.rating = rating;
        this.comment = comment;
    }

    public Integer getRating() {
        return rating;
    }

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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    
}
