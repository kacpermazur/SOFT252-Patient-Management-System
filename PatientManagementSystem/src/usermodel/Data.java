/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel;

import java.util.List;

/**
 *
 * @author kacper
 */
public class Data {
    
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
    
    // Sectary Data
    private static AppointmentList requestedAppointments;
}
