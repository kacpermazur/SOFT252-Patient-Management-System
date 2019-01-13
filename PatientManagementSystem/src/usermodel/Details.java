/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author kacper
 */
public class Details {
    private String name;
    private String surname;
    private LocalDate birthDate;
    private String password;

    public Details(String name, String surname, LocalDate birthDate, String password) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.password = password;
    }
    
    public Integer getAge()
    {
        return Period.between(birthDate, LocalDate.now()).getYears();
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String ToText()
    {
        StringBuilder hold = new StringBuilder();
        
        hold.append(this.name);
        hold.append(" - ");
        hold.append(this.surname);
        hold.append(" - ");
        hold.append(this.birthDate);
        
        return hold.toString();
    }
}
