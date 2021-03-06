/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel;

import java.io.Serializable;

/**
 *
 * @author kacper
 */
public class Perscription implements Serializable{
    private Medicine perscribedMedicine;
    private String dosage;
    private String notes;

    /**
     *
     */
    public Perscription() {
        
    }
    
    /**
     *
     * @param perscribedMedicine
     * @param dosage
     */
    public Perscription(Medicine perscribedMedicine, String dosage) {
        this.perscribedMedicine = perscribedMedicine;
        this.dosage = dosage;
    }

    /**
     *
     * @param perscribedMedicine
     * @param dosage
     * @param notes
     */
    public Perscription(Medicine perscribedMedicine, String dosage, String notes) {
        this.perscribedMedicine = perscribedMedicine;
        this.dosage = dosage;
        this.notes = notes;
    }

    /**
     *
     * @return
     */
    public Medicine getPerscribedMedicine() {
        return perscribedMedicine;
    }

    /**
     *
     * @param perscribedMedicine
     */
    public void setPerscribedMedicine(Medicine perscribedMedicine) {
        this.perscribedMedicine = perscribedMedicine;
    }

    /**
     *
     * @return
     */
    public String getDosage() {
        return dosage;
    }

    /**
     *
     * @param dosage
     */
    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    /**
     *
     * @return
     */
    public String getNotes() {
        if(notes != null)
        {
            return notes;
        }
        
        return "no notes recored";
    }

    /**
     *
     * @param notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    /**
     *
     * @return
     */
    public String ToString()
    {
        StringBuilder hold = new StringBuilder();
        
        hold.append(this.perscribedMedicine.ToString());
        hold.append(" - ");
        hold.append(this.dosage);
        
        if (this.notes != null)
        {
            hold.append(" - ");
            hold.append(this.notes);
        }
        
        return hold.toString();
    }
}
