/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import usermodel.Appointment;
import usermodel.Data;

/**
 *
 * @author kacper
 */
public class RequestAppointment implements IAppointment{

    /**
     *
     * @param appointment
     */
    @Override
    public void makeAppointment(Appointment appointment) {
        
        Data.addAppointmentStatic(appointment);
    }
    
    
}
