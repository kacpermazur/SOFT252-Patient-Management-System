/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel;

import java.time.LocalDate;
import usermodel.users.Doctor;
import usermodel.users.Patient;

/**
 *
 * @author kacper
 */
public class Appointment {
    
    private String doctorID;
    private String patientID;
    private LocalDate date;
    private Perscription perscription;

    public Appointment(Doctor doctor, Patient patient, LocalDate date) {
        // ToDo: Set ID From Doctor & Patient Class when finished
    }
    
    
}
