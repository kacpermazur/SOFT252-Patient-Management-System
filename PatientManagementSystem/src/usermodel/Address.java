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
public class Address implements Serializable{
    private String building;
    private String road;
    private String city;
    private String postCode;

    public Address(String building, String road, String city, String postCode) {
        this.building = building;
        this.road = road;
        this.city = city;
        this.postCode = postCode;
    }

    public String getBuilding() {
        
        return building;
    }
    public void setBuilding(String building) {
        if (building != null && !building.isEmpty())
            this.building = building;
    }

    public String getRoad() {
        return road;
    }
    public void setRoad(String road) {
        if (road != null && !road.isEmpty())
            this.road = road;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        if (city != null && !city.isEmpty())
            this.city = city;
    }

    public String getPostCode() {
        return postCode;
    }
    public void setPostCode(String postCode) {
        if (postCode != null && !postCode.isEmpty())
            this.postCode = postCode;
    }
    
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
