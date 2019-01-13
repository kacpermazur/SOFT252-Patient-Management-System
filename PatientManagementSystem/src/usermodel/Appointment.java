/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel;

import java.time.LocalDate;

/**
 *
 * @author kacper
 */
public class Appointment {
    
    private String doctorID;
    private String patientID;
    private LocalDate date;
    private Perscription perscription;
}
