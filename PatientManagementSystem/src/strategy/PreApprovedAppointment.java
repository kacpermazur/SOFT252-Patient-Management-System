/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import singleton.UserManger;
import usermodel.Appointment;
import usermodel.users.User;

/**
 *
 * @author kacper
 */
public class PreApprovedAppointment implements IAppointment{

    /**
     *
     * @param appointment
     */
    @Override
    public void makeAppointment(Appointment appointment) {
        
        String temp = appointment.getDoctorID();
        
        User tempUser = UserManger.getInstance().getById(temp);
        tempUser.getUserData().getActivePatientAppointments().add(appointment);
    }
        
    
}
