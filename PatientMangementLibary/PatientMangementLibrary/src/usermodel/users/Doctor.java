/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel.users;

import strategy.IAppointment;
import strategy.PreApprovedAppointment;
import usermodel.Address;
import usermodel.Appointment;
import usermodel.Details;
import usermodel.Medicine;
import usermodel.Notification;
import usermodel.Perscription;

/**
 *
 * @author kacper
 */
public class Doctor extends User implements IAppointment{

    public Doctor(Details userDetails, Address userAddress) {
        super(userDetails, userAddress);
    }
    
    @Override
    public void update(Notification notfication) {
        this.userData.getNotfications().add(notfication);
    }
    
    public String getAppointments()
    {
        return this.userData.getActivePatientAppointments().ToString();
    }
    
    public String InspectPatientHistory(Patient patient )
    {
        return patient.getUserData().getHistory().ToString();
    }

    @Override
    public void makeAppointment(Appointment appointment) {
        IAppointment app = new PreApprovedAppointment();
        app.makeAppointment(appointment);
    }
    
    public Perscription perscribeMedicine(Medicine medicine, String dosage, String notes)
    {
        return new Perscription(medicine, dosage, notes);
    }
    
    public void requestMedicine(Medicine medicine)
    {
        // TODO: InvetoryManger
    }
}
