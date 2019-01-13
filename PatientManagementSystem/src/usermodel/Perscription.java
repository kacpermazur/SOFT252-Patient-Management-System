/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel;

/**
 *
 * @author kacper
 */
public class Perscription {
    private Medicine perscribedMedicine;
    private String dosage;
    private String notes;

    public Perscription(Medicine perscribedMedicine, String dosage) {
        this.perscribedMedicine = perscribedMedicine;
        this.dosage = dosage;
    }

    public Perscription(Medicine perscribedMedicine, String dosage, String notes) {
        this.perscribedMedicine = perscribedMedicine;
        this.dosage = dosage;
        this.notes = notes;
    }

    public Medicine getPerscribedMedicine() {
        return perscribedMedicine;
    }

    public void setPerscribedMedicine(Medicine perscribedMedicine) {
        this.perscribedMedicine = perscribedMedicine;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getNotes() {
        if(notes != null)
        {
            return notes;
        }
        
        return "no notes recored";
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
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
