/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import guiview.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import singleton.UserManger;

/**
 *
 * @author kacper
 */
public class UiController implements ActionListener {
    
    private loginUI viewLogin = null;
    private mainMenuUI viewMain = null;
    private registerUI viewRegister = null;
    
    private adminPanelUI adminPNL = null;
    private doctorPanelUI doctor = null;
    private appointmentUI appointmentPNL = null;
    private patientPanelUI patientPNL = null;
    private secretaryPanelUI secretaryPNL = null;
    private perscriptionUI perscriptionPNL = null;
    
    public void setModel()
    {
        UserManger.getInstance().initialize();
    }
    
    @Override 
    public void actionPerformed(ActionEvent e) 
    {
        
    }
}  
