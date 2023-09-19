/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainFrame;

/**
 *
 * @author garre
 */
public class Period {
    public String startDate;
    public String endDate;
    
    public Period(String sd, String ed){
        startDate =sd;
        endDate = ed;
    }
    public Period(){
        startDate = "";
        endDate = "";
    }
    @Override
    public String toString(){
        return "Start Date: "+startDate+"End Date: "+endDate+"\n";
    }
}
