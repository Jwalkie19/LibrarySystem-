/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainFrame;

/**
 *
 * @author garre
 */
public class CommitteeMem {
    private String firstName;
    private String lastName;
   
    public CommitteeMem(String fn, String ln){
        firstName = fn;
        lastName = ln;
    }
    
    public String getfname(){
        return firstName;
    }
    public String getlname(){
        return lastName;
    }
    public void setfname(String newf){
        firstName = newf;
    }
    public void setlname(String newl){
        lastName = newl;   
    }
    public CommitteeMem(){
        firstName = "Bob";
        lastName = "Polluck";
    }
    @Override
    public String toString(){
       return "First Name: "+firstName+" Last Name: "+lastName+"\n"; 
    }
}
