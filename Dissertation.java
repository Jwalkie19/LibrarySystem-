/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainFrame;

/**
 *
 * @author garre
 */
public class Dissertation extends CommiteeWritten {
    public Author[] authorlist;
    public Dissertation(String t, String py, int bi, int noc, int nof, int nocm, String depnam, String city, String state, String zip, int noa) {
        super(t, py, bi, noc, nof, nocm, depnam, city, state, zip);
        authorlist = new Author[noa];
        for(int i = 0; i<noa;i++){
            authorlist[i] = new Author();
        }
    }
    public Dissertation(int bi){
        super(bi);
        authorlist = new Author[10];
    }
    @Override
    public String toString(){
        String result = "";
        for (Author authorList1 : authorlist) {
            result += authorList1.toString();
        }
        return super.toString() + result;
    }
    
}
