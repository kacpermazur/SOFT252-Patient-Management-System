/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author kacper
 */
public class Notification {
    
    private LocalDate date;
    private String subjectTitle;
    private String comment;

    public Notification(LocalDate time, String subjectTitle, String Comment) {
        this.date = time;
        this.subjectTitle = subjectTitle;
        this.comment = Comment;
    }

    public LocalDate getTime() {
        return date;
    }
    public void setTime(LocalDate time) {
        this.date = time;
    }

    public String getSubjectTitle() {
        return subjectTitle;
    }
    public void setSubjectTitle(String subjectTitle) {
        this.subjectTitle = subjectTitle;
    }

    public String getComment() {
        return comment;
    }
    public void setComment(String Comment) {
        this.comment = Comment;
    }
    
    public String toString()
    {
        DateTimeFormatter temp = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        StringBuilder hold = new StringBuilder(date.format(temp ));
        hold.append(" - ");
        hold.append(subjectTitle);
        hold.append(" - ");
        hold.append(comment);
        
        return hold.toString();
    }
}
