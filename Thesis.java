/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainFrame;

/**
 *
 * @author garre
 */
public class Thesis extends CommiteeWritten {
    public Author writer;
    public Thesis(String t, String py, int bi, int noc, int nof, int nocm, String depnam, String city, String state, String zip, String fn, String ln) {
        super(t, py, bi, noc, nof, nocm, depnam, city, state, zip);
        writer = new Author(fn,ln);
    }
    public Thesis(int bi){
     super(bi);
     writer= new Author();
    }
    @Override
    public String toString(){
        return super.toString()+writer.toString()+"\n";
    }
}
