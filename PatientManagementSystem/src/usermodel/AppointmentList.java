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
 *
 * @author kacper
 */
public class AppointmentList implements Serializable{
    
    private final List<Appointment> appointments;

    public AppointmentList() {
        appointments = new ArrayList<>();
    }
    
    public boolean add(Appointment appointment)
    {
        boolean isAdded = false;
        
        if(appointment != null)
        {
            isAdded = appointments.add(appointment);
        }
        
        return isAdded;
    }
    
    public boolean clear()
    {
         boolean isCleared= false;
         
         if(!appointments.isEmpty())
         {
            isCleared =  appointments.containsAll(appointments);
         }
         
         return isCleared;
    }
    
    public boolean moveTo(Appointment appointment, List<Appointment> target)
    {
        boolean isMoved = false;
        
        isMoved = target.add(appointment);
        
        if(isMoved)
            remove(appointment);
        
        return isMoved;
    }
    
    public boolean remove(Appointment appointment)
    {
        return appointments.remove(appointment);
    }
    
    public Appointment getByPatientID(String id)
    {
        Appointment appointment;
        
        return  appointment = appointments.stream()
                .filter(Appointment -> id.equals(Appointment.getPatientID()))
                .findAny()
                .orElse(null);
    }
    
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
