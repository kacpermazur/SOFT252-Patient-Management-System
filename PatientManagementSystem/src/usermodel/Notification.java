/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author kacper
 */
public class Notification {
    
    private LocalDateTime time;
    private String subjectTitle;
    private String comment;

    public Notification(LocalDateTime time, String subjectTitle, String Comment) {
        this.time = time;
        this.subjectTitle = subjectTitle;
        this.comment = Comment;
    }

    public LocalDateTime getTime() {
        return time;
    }
    public void setTime(LocalDateTime time) {
        this.time = time;
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
        StringBuilder hold = new StringBuilder(subjectTitle);
        hold.append(" - ");
        DateTimeFormatter currDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        hold.append(time.format(currDateFormat));
        hold.append(" - ");
        hold.append(comment);
        
        return hold.toString();
    }
}
