/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import usermodel.Appointment;
import usermodel.Data;

/**
 * sets the appointmente to the pending list that will get reviewed by sec later
 * @author kacper
 */
public class RequestAppointment implements IAppointment{

    /**
     *  sets the appointmentto the static data class that can be acessed globally by the secutary
     * @param appointment appointment that is getting approved but not set to doctor yet.
     */
    @Override
    public void makeAppointment(Appointment appointment) {
        
        Data.addAppointmentStatic(appointment);
    }
    
    
}
