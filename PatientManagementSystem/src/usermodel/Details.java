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
public class Details {
    
    private String name;
    private String surname;
    private Address address;
    private String unquieID;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }
    
    public String getUnquieID() { return unquieID; }
    public void setUnquieID(String unquieID) { this.unquieID = unquieID; }
    
    public String toString()
    {
        String holder = "";
        
        holder = "Name: " + this.getName() + "/n"
                + "Surname: " + this.getSurname() + "/n"
                + "Address: " + this.address.toString() + "/n"
                + "UnquieID: " + this.getUnquieID();
        
        return holder;
    }
}
