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
public class Address {
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
        this.building = building;
    }

    public String getRoad() {
        return road;
    }
    public void setRoad(String road) {
        this.road = road;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getPostCode() {
        return postCode;
    }
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
    
    public String toString()
    {
        String hold = "n/a";
        
        hold = this.building + ", " + this.road + ", " + this.city + ", " + this.postCode;
        
        return hold;
    }
}
