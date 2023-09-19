/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainFrame;

/**
 *
 * @author garre
 */
public class JournalPaper extends Written {
    public String journalName;
    public Author[] authorlist;
    public JournalPaper(String t, String py, int bi, String jn, int noa) {
        super(t, py, bi);
        journalName = jn;
        authorlist = new Author[noa];
        for(int n =0; n< noa; n++){
            authorlist[n] = new Author();
        }
    }
    public JournalPaper(int bi){
        super(bi);
        journalName = " ";
        authorlist = new Author[2];
    }
    @Override
    public String toString(){
        String authors ="\n";
        for (Author authorlist1 : authorlist) {
            authors += authorlist1.toString();
        }
        return super.toString()+" Journal Name: "+journalName+" Authors: "+authors;
    }
    
}
