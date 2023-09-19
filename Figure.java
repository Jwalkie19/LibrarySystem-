/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainFrame;

/**
 *
 * @author garre
 */
public class Figure {
    private String name;
    private String description;
    
    public Figure(String nam,String d){
        name =nam;
        description = d;
    }
    public Figure(){
        name = " ";
        description = " ";
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setDescript(String d){
        description = d;
    }
    public String getDescript(){
        return description;
    }
    @Override
    public String toString(){
        return "Name: "+name+" Description: "+description+"\n";
        
    }
}
