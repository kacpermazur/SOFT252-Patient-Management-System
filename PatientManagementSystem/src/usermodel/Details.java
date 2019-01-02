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

    public Address getAddress() {
        
        if(this.userAddress != null)
        {
            return userAddress;
        }
        
        return new Address("none set","none set","none set","none set");
    }
    public void setAddress(Address userAddress) {
        if (userAddress != null)
            this.userAddress = userAddress;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name != null && !name.isEmpty())
            this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        if (surname != null && !surname.isEmpty())
            this.surname = surname;
    }
        
    public String toString()
    {
        
        StringBuilder hold = new StringBuilder();
        
        hold.append("\n");
        hold.append("Name: " + this.name);
        hold.append("\n");
        hold.append("Surname: " + this.surname);
        hold.append("\n");
        hold.append("Address: " + this.userAddress);

        return hold.toString();
    }
}
