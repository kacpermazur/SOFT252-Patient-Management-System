/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * appointment list that has its own implementation that ineracts with the list,
 * makes it more safe and clean
 * @author kacper
 */
public class AppointmentList implements Serializable{
    
    private final List<Appointment> appointments;

    /**
     *
     */
    public AppointmentList() {
        appointments = new ArrayList<>();
    }
    
    /**
     * adds appointment to the list
     * @param appointment 
     * @return if the value was added
     */
    public boolean add(Appointment appointment)
    {
        boolean isAdded = false;
        
        if(appointment != null)
        {
            isAdded = appointments.add(appointment);
        }
        
        return isAdded;
    }
    
    /**
     * clears the whole list
     * @return returns true when list is cleared
     */
    public boolean clear()
    {
         boolean isCleared= false;
         
         if(!appointments.isEmpty())
         {
            isCleared =  appointments.containsAll(appointments);
         }
         
         return isCleared;
    }
    
    /**
     * moves the appointment to another list and removes this extra copy
     * @param appointment target that is being moved
     * @param target the new list its being send to
     * @return true when action is completed
     */
    public boolean moveTo(Appointment appointment, List<Appointment> target)
    {
        boolean isMoved = false;
        
        isMoved = target.add(appointment);
        
        if(isMoved)
            remove(appointment);
        
        return isMoved;
    }
    
    /**
     *
     * @param appointment
     * @return
     */
    public boolean remove(Appointment appointment)
    {
        return appointments.remove(appointment);
    }
    
    /**
     * returns an appointment based on the user id it has stored inside
     * @param id patients ID
     * @return returns appointment or null if its not found 
     */
    public Appointment getByPatientID(String id)
    {
        Appointment appointment;
        
        return  appointment = appointments.stream()
                .filter(Appointment -> id.equals(Appointment.getPatientID()))
                .findAny()
                .orElse(null);
    }
    
    /**
     * returns string value of the whole list
     * @return single string of the whole list
     */
    public String ToString()
    {
        StringBuilder hold = new StringBuilder();
        
        for (Appointment app : appointments)
        {
            hold.append(app.ToSring() + "\n");
        }
        
        return hold.toString();
    }
}
