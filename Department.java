/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainFrame;

/**
 *
 * @author garre
 */
public class Department {
    public String deptName;
    public Location departlocal;
    
    public Department(String dn,String c,String s,String z){
        deptName = dn;
        departlocal = new Location(c,s,z);
    }
    
    public Department(){
        deptName = "Research";
        departlocal = new Location();
    }
    
    @Override
    public String toString(){
      return "Department Name: "+deptName+"\n"+departlocal.toString();
    }
}
