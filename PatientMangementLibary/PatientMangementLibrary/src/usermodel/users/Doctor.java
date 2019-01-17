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
 * Doctor class
 * @author kacper
 */
public class Doctor extends User implements IAppointment{

    /**
     *
     * @param userDetails constructor that takes in details (name, surname...ect) and the address
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
     * returns a string of appoints that doctor has to do
     * @return
     */
    public String getAppointments()
    {
        return this.userData.getActivePatientAppointments().ToString();
    }
    
    /**
     * looks aht patients history by and returing it as a string
     * @param patient target that gets its 
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
     * sets the perscription which can be passed to the patient 
     * @param medicine
     * @param dosage
     * @param notes
     * @return returns a perscription with all the set values
     */
    public Perscription perscribeMedicine(Medicine medicine, String dosage, String notes)
    {
        return new Perscription(medicine, dosage, notes);
    }
    
    /**
     * request the medicice from the invetory manger
     * @param medicine
     */
    public void requestMedicine(Medicine medicine)
    {
        // TODO: InvetoryManger
    }
}
