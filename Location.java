/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainFrame;

/**
 *
 * @author garre
 */
public class Location {
    public String city;
    public String state;
    public String zip;
    
    public Location(String c, String s, String z){
        city = c;
        state = s;
        zip = z;
    }
    public Location(){
        city = " ";
        state = " ";
        zip =" ";
    }
    @Override
    public String toString(){
        return " City: "+city+" State: "+state+" Zip: "+zip+"\n";
    }
}
