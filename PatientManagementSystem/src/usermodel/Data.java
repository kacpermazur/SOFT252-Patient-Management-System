/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel;

import java.io.Serializable;

/**
 *
 * @author kacper
 */
public class Data implements Serializable {
    
    // Default Data;
    private Details details;
    private Address adress;
    private NotificationList notfications;
    
    // Patient Data
    private AppointmentList history;
    private Appointment activeAppointment;
    private Perscription activePerscription;
    
    // Doctor Data
    private AppointmentList activePatientAppointments;
    private RatingList doctorRatings;
    
    // Sectary Data
    private static AppointmentList requestedAppointments;

    public Data() 
    {
        this.details = new Details();
        this.adress = new Address();
        this.notfications = new NotificationList();
        this.history = new AppointmentList();
        this.activeAppointment = new Appointment();
        this.doctorRatings = new RatingList();
        this.activePerscription = new Perscription();
        this.activePatientAppointments = new AppointmentList();;
        this.requestedAppointments = new AppointmentList();
    }

    public RatingList getDoctorRatings() {
        return doctorRatings;
    }

    public void setDoctorRatings(RatingList doctorRatings) {
        this.doctorRatings = doctorRatings;
    }
    
    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }

    public NotificationList getNotfications() {
        return notfications;
    }

    public void setNotfications(NotificationList notfications) {
        this.notfications = notfications;
    }

    public AppointmentList getHistory() {
        return history;
    }

    public void setHistory(AppointmentList history) {
        this.history = history;
    }

    public Appointment getActiveAppointment() {
        return activeAppointment;
    }

    public void setActiveAppointment(Appointment activeAppointment) {
        this.activeAppointment = activeAppointment;
    }

    public Perscription getActivePerscription() {
        return activePerscription;
    }

    public void setActivePerscription(Perscription activePerscription) {
        this.activePerscription = activePerscription;
    }

    public AppointmentList getActivePatientAppointments() {
        return activePatientAppointments;
    }

    public void setActivePatientAppointments(AppointmentList activePatientAppointments) {
        this.activePatientAppointments = activePatientAppointments;
    }

    public static AppointmentList getRequestedAppointments() {
        return requestedAppointments;
    }
    
    public static boolean addAppointmentStatic(Appointment App) {
        return requestedAppointments.add(App);
    }

    public static void setRequestedAppointments(AppointmentList requestedAppointments) {
        Data.requestedAppointments = requestedAppointments;
    }
    
    
}
