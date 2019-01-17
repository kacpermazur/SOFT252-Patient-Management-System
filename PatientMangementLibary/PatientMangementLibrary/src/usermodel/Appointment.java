/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel;

import java.io.Serializable;
import java.time.LocalDate;
import singleton.UserManger;
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
    
    /**
     *
     */
    public Appointment()
    {
        
    }

    /**
     *
     * @param doctor
     * @param patient
     * @param date
     */
    public Appointment(Doctor doctor, Patient patient, LocalDate date) {
        this.doctorID = UserManger.getInstance().getUserID(doctor);
        this.patientID = UserManger.getInstance().getUserID(patient);
        this.date = date;
    }

    /**
     *
     * @param doctorID
     * @param patientID
     * @param date
     */
    public Appointment(String doctorID, String patientID, LocalDate date) {
        this.doctorID = doctorID;
        this.patientID = patientID;
        this.date = date;
    }

    /**
     *
     * @return
     */
    public String getDoctorID() {
        return doctorID;
    }

    /**
     *
     * @return
     */
    public String getPatientID() {
        return patientID;
    }

    /**
     *
     * @return
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     *
     * @return
     */
    public Perscription getPerscription() {
        return perscription;
    }
    
    /**
     *
     * @return
     */
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
