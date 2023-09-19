/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainFrame;

/**
 *
 * @author garre
 */
public class Magazine extends Written {
    
    public Magazine(String t, String py, int bi) {
        super(t, py, bi);
    }
    public Magazine(int bi){
        super(bi);
    }
    @Override
    public String toString(){
        return super.toString()+"Type: Magazine\n\n";
    }
    
}
