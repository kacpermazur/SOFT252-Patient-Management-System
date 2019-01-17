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
 * user appointment that holds the target doctor the send patient, the date that is being set
 * and the perscription.
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
     * if an object is passed its string values will be set so it can be layer serlisized and called back
     * by the usermanger
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
     * same constructor but sets the string values 
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
     * sets the perscription to text and checks if perscption exisits and sets it aswell
     * @return whole appointment values
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
