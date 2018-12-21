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
    private String postcode;

    public String getBuilding() { return building; }
    public void setBuilding(String building) { this.building = building; }

    public String getRoad() {return road; }
    public void setRoad(String road) { this.road = road; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getPostcode() { return postcode; }
    public void setPostcode(String postcode) { this.postcode = postcode; }
    
    public String toString()
    {
        String holder = "";
        
        holder = this.getBuilding() + "," + this.getRoad() + ","
                + this.getCity() + ", " + this.getPostcode();
        
        return holder;
    }
}
