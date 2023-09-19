/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainFrame;

/**
 *
 * @author garre
 */
public abstract class CommiteeWritten extends PictureWritings {
    public CommitteeMem[] members;
    public Department depart;
    public CommiteeWritten(String t, String py, int bi, int noc, int nof, int nocm, String depnam, String city, String state, String zip){
        super(t, py, bi, noc, nof);
        depart = new Department(depnam, city, state, zip);
        members = new CommitteeMem[nocm];
        for(int n =0; n< nocm; n++){
            members[n] = new CommitteeMem();
        }
    }
    public CommiteeWritten(int bi){
        super(bi);
        depart = new Department();
        members = new CommitteeMem[3];
       
    }
    @Override
    public String toString(){
        String result = "";
        for (CommitteeMem authorList1 : members) {
            result += authorList1.toString();
        }
        return super.toString() + depart.toString()+result;
    }
    
}
