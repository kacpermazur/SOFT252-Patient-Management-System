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

    /**
     *
     */
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

    /**
     *
     * @return
     */
    public RatingList getDoctorRatings() {
        return doctorRatings;
    }

    /**
     *
     * @param doctorRatings
     */
    public void setDoctorRatings(RatingList doctorRatings) {
        this.doctorRatings = doctorRatings;
    }
    
    /**
     *
     * @return
     */
    public Details getDetails() {
        return details;
    }

    /**
     *
     * @param details
     */
    public void setDetails(Details details) {
        this.details = details;
    }

    /**
     *
     * @return
     */
    public Address getAdress() {
        return adress;
    }

    /**
     *
     * @param adress
     */
    public void setAdress(Address adress) {
        this.adress = adress;
    }

    /**
     *
     * @return
     */
    public NotificationList getNotfications() {
        return notfications;
    }

    /**
     *
     * @param notfications
     */
    public void setNotfications(NotificationList notfications) {
        this.notfications = notfications;
    }

    /**
     *
     * @return
     */
    public AppointmentList getHistory() {
        return history;
    }

    /**
     *
     * @param history
     */
    public void setHistory(AppointmentList history) {
        this.history = history;
    }

    /**
     *
     * @return
     */
    public Appointment getActiveAppointment() {
        return activeAppointment;
    }

    /**
     *
     * @param activeAppointment
     */
    public void setActiveAppointment(Appointment activeAppointment) {
        this.activeAppointment = activeAppointment;
    }

    /**
     *
     * @return
     */
    public Perscription getActivePerscription() {
        return activePerscription;
    }

    /**
     *
     * @param activePerscription
     */
    public void setActivePerscription(Perscription activePerscription) {
        this.activePerscription = activePerscription;
    }

    /**
     *
     * @return
     */
    public AppointmentList getActivePatientAppointments() {
        return activePatientAppointments;
    }

    /**
     *
     * @param activePatientAppointments
     */
    public void setActivePatientAppointments(AppointmentList activePatientAppointments) {
        this.activePatientAppointments = activePatientAppointments;
    }

    /**
     *
     * @return
     */
    public static AppointmentList getRequestedAppointments() {
        return requestedAppointments;
    }
    
    /**
     *
     * @param App
     * @return
     */
    public static boolean addAppointmentStatic(Appointment App) {
        return requestedAppointments.add(App);
    }

    /**
     *
     * @param requestedAppointments
     */
    public static void setRequestedAppointments(AppointmentList requestedAppointments) {
        Data.requestedAppointments = requestedAppointments;
    }
    
    
}
