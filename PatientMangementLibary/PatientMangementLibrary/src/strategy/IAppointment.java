/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import usermodel.Appointment;

/**
 * appointmenet starergy pattern for requests and pre-approved appointments
 * @author kacper
 */
public interface IAppointment {
    
    /**
     * appointment function will set the function to its correct method when called
     * @param appointment the appointment that will be set to its correct place
     */
    public void makeAppointment(Appointment appointment);
}
