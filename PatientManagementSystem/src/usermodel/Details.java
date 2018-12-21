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

    public String getAddress() { return address.toString();}
    public void setAddress(String curBuilding, String curRoad, String curCity, String curPostcode) 
    { 
        this.address.setBuilding(curBuilding);
        this.address.setRoad(curRoad);
        this.address.setCity(curCity);
        this.address.setPostcode(curPostcode);
    }

    public String getUnquieID() { return unquieID; }
    public void setUnquieID(String unquieID) { this.unquieID = unquieID; }
    
    
}
