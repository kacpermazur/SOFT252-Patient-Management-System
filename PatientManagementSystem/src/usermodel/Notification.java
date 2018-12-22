/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel;

import java.time.LocalDateTime;


/**
 *
 * @author kacper
 */
public class Notification {
    
    private LocalDateTime time;
    private String subjectTitle;
    private String Comment;

    public Notification(String subjectTitle) {
        this.subjectTitle = subjectTitle;
    }
    
    
}
