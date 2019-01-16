/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel;

import java.io.Serializable;
import java.time.LocalDate;
import usermodel.users.Doctor;
import usermodel.users.Patient;

/**
 *
 * @author kacper
 */
public class Appointment implements Serializable{
    
    private String doctorID;
    private String patientID;
    private LocalDate date;
    private Perscription perscription;
    
    public Appointment()
    {
        
    }

    public Appointment(Doctor doctor, Patient patient, LocalDate date) {
        // ToDo: Set ID From Doctor & Patient Class when finished
    }

    public Appointment(String doctorID, String patientID, LocalDate date) {
        this.doctorID = doctorID;
        this.patientID = patientID;
        this.date = date;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public String getPatientID() {
        return patientID;
    }

    public LocalDate getDate() {
        return date;
    }

    public Perscription getPerscription() {
        return perscription;
    }
    
    public String ToSring()
    {
        StringBuilder hold = new StringBuilder();
        
        hold.append(this.doctorID);
        hold.append("\n");
        hold.append(this.patientID);
        hold.append("\n");
        hold.append(this.date);
        
        if (this.perscription != null)
        {
            hold.append("\n");
            hold.append(this.perscription);
        }
        
        return hold.toString();
    }
}
