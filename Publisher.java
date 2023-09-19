/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainFrame;

/**
 *
 * @author garre
 */
public class Publisher {
    public String pubName;
    public Location publoc;
    
    public Publisher(String pn, String c, String s, String z){
        pubName = pn;
        publoc = new Location(c,s,z);
    }
    public Publisher(){
        publoc = new Location();
        pubName = "Waldorf Pub";
    }
    public Publisher(String pn){
        publoc = new Location();
        pubName = pn;
    }
    @Override
    public String toString(){
        return "Publisher Name: "+pubName+publoc.toString();
    }
}
