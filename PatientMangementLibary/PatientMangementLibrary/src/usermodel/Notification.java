/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 * user notfiactions that holds the data tha this going to be set and title, comment 
 * @author kacper
 */
public class Notification implements Serializable{
    
    private LocalDate date;
    private String subjectTitle;
    private String comment;
    
    /**
     *
     */
    public Notification() {
        
    }

    /**
     *
     * @param time
     * @param subjectTitle
     * @param Comment
     */
    public Notification(LocalDate time, String subjectTitle, String Comment) {
        this.date = time;
        this.subjectTitle = subjectTitle;
        this.comment = Comment;
    }

    /**
     *
     * @return
     */
    public LocalDate getTime() {
        return date;
    }

    /**
     *
     * @param time
     */
    public void setTime(LocalDate time) {
        this.date = time;
    }

    /**
     *
     * @return
     */
    public String getSubjectTitle() {
        return subjectTitle;
    }

    /**
     *
     * @param subjectTitle
     */
    public void setSubjectTitle(String subjectTitle) {
        this.subjectTitle = subjectTitle;
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
     * @param Comment
     */
    public void setComment(String Comment) {
        this.comment = Comment;
    }
    
    /**
     * returns string of all elements 
     * @return
     */
    public String ToString()
    {
        StringBuilder hold = new StringBuilder();
        
        hold.append(this.date);
        hold.append(" - ");
        hold.append(this.subjectTitle);
        hold.append(" - ");
        hold.append(this.comment);
        
        return hold.toString();
    }
}
