/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel;

import java.io.Serializable;

/**
 * User address class that holds the first line address and postcode
 * @author kacper
 */
public class Address implements Serializable{
    private String building;
    private String road;
    private String city;
    private String postCode;
    
    /**
     * 
     */
    public Address() {
    }

    /**
     *
     * @param building 
     * @param road 
     * @param city
     * @param postCode
     */
    public Address(String building, String road, String city, String postCode) {
        this.building = building;
        this.road = road;
        this.city = city;
        this.postCode = postCode;
    }

    /**
     *
     * @return
     */
    public String getBuilding() {
        
        return building;
    }

    /**
     *
     * @param building
     */
    public void setBuilding(String building) {
        if (building != null && !building.isEmpty())
            this.building = building;
    }

    /**
     *
     * @return
     */
    public String getRoad() {
        return road;
    }

    /**
     *
     * @param road
     */
    public void setRoad(String road) {
        if (road != null && !road.isEmpty())
            this.road = road;
    }

    /**
     *
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     */
    public void setCity(String city) {
        if (city != null && !city.isEmpty())
            this.city = city;
    }

    /**
     *
     * @return
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     *
     * @param postCode
     */
    public void setPostCode(String postCode) {
        if (postCode != null && !postCode.isEmpty())
            this.postCode = postCode;
    }
    
    /**
     * outPuts the whole adress into a single string 
     * @return whole adresss formatted by commas
     */
    public String toString()
    {
        StringBuilder hold = new StringBuilder();
        
        hold.append(this.building);
        hold.append(", ");
        hold.append(this.road);
        hold.append(", ");
        hold.append(this.city);
        hold.append(", ");
        hold.append(this.postCode);
        
        return hold.toString();
    }
}
