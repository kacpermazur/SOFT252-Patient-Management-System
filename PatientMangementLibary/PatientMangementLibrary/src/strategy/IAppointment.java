/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import usermodel.Appointment;

/**
 *
 * @author kacper
 */
public interface IAppointment {
    
    /**
     *
     * @param appointment
     */
    public void makeAppointment(Appointment appointment);
}
