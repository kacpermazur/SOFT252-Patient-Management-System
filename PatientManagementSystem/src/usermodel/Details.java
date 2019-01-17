/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermodel;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author kacper
 */
public class Details implements Serializable{
    private String iD;
    private String name;
    private String surname;
    private String gender;
    private LocalDate birthDate;
    private String password;
    
    /**
     *
     */
    public Details() {
        
    }
    
    /**
     *
     * @param name
     * @param surname
     * @param gender
     * @param birthDate
     * @param password
     */
    public Details(String name, String surname, String gender, LocalDate birthDate, String password) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthDate = birthDate;
        this.password = password;
    }

    /**
     *
     * @param iD
     * @param name
     * @param surname
     * @param gender
     * @param birthDate
     * @param password
     */
    public Details(String iD, String name, String surname, String gender, LocalDate birthDate, String password) {
        this.iD = iD;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthDate = birthDate;
        this.password = password;
    }
    
    /**
     *
     * @return
     */
    public Integer getAge()
    {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    /**
     *
     * @return
     */
    public String getiD() {
        return iD;
    }

    /**
     *
     * @param iD
     */
    public void setiD(String iD) {
        this.iD = iD;
    }
    
    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getSurname() {
        return surname;
    }

    /**
     *
     * @param surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     *
     * @return
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /**
     *
     * @param birthDate
     */
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @return
     */
    public String getGender() {
        return gender;
    }

    /**
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     *
     * @return
     */
    public String ToText()
    {
        StringBuilder hold = new StringBuilder();
        
        hold.append(this.iD);
        hold.append(" - ");
        hold.append(this.name);
        hold.append(" - ");
        hold.append(this.surname);
        hold.append(" - ");
        hold.append(this.gender);
        hold.append(" - ");
        hold.append(this.birthDate);
        hold.append(" - ");
        hold.append(this.getAge());
        
        return hold.toString();
    }
}
