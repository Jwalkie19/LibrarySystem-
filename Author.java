/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainFrame;

/**
 *
 * @author garre
 */
public class Author {
    public String firstName;
    public String lastName;
   
    public Author(String fn, String ln){
        firstName = fn;
        lastName = ln;
    }
    public Author(){
        firstName = "Bob";
        lastName = "Sheldon";
    }
    @Override
    public String toString(){
       return "First Name: "+firstName+" Last Name: "+lastName+"\n"; 
    }
}
