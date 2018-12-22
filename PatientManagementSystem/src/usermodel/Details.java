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
    private String unqiueID;
    

    public Details(String name, String surname, String unqiueID, Address address) {
        this.name = name;
        this.surname = surname;
        this.unqiueID = unqiueID;
        this.userAddress = address;
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

    public String getUnqiueID() {
        return unqiueID;
    }

    public void setUnqiueID(String unqiueID) {
        this.unqiueID = unqiueID;
    }
    
    public String toString()
    {
        String hold = "";
        
        hold = "Name: " + this.name + "\n"
                + "Surname: " + this.surname + "\n"
                + "Address: " + this.userAddress+ "\n"
                + "unqiueID: " + this.unqiueID + "\n";
        
        return hold;
    }
}
