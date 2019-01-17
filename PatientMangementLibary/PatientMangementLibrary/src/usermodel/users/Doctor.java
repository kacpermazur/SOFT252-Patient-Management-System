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

    /**
     *
     * @param userDetails
     * @param userAddress
     */
    public Doctor(Details userDetails, Address userAddress) {
        super(userDetails, userAddress);
    }
    
    /**
     *
     * @param notfication
     */
    @Override
    public void update(Notification notfication) {
        this.userData.getNotfications().add(notfication);
    }
    
    /**
     *
     * @return
     */
    public String getAppointments()
    {
        return this.userData.getActivePatientAppointments().ToString();
    }
    
    /**
     *
     * @param patient
     * @return
     */
    public String InspectPatientHistory(Patient patient )
    {
        return patient.getUserData().getHistory().ToString();
    }

    /**
     *
     * @param appointment
     */
    @Override
    public void makeAppointment(Appointment appointment) {
        IAppointment app = new PreApprovedAppointment();
        app.makeAppointment(appointment);
    }
    
    /**
     *
     * @param medicine
     * @param dosage
     * @param notes
     * @return
     */
    public Perscription perscribeMedicine(Medicine medicine, String dosage, String notes)
    {
        return new Perscription(medicine, dosage, notes);
    }
    
    /**
     *
     * @param medicine
     */
    public void requestMedicine(Medicine medicine)
    {
        // TODO: InvetoryManger
    }
}
