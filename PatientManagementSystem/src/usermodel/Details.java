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
    private Address userAddress;

    public Details(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Details(String name, String surname, Address address) {
        this.name = name;
        this.surname = surname;
        this.userAddress = address;
    }

    public Address getUserAddress() {
        return userAddress;
    }
    public void setUserAddress(Address userAddress) {
        this.userAddress = userAddress;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
        
    public String toString()
    {
        String hold = "n/a";
        
        hold = "Name: " + this.name + "\n"
                + "Surname: " + this.surname + "\n"
                + "Address: " + this.userAddress+ "\n";
        
        return hold;
    }
}
