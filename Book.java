/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainFrame;

/**
 *
 * @author garre
 */
public class Book extends PictureWritings {
    public Author[] authorlist;
    public Publisher published;
    public int editionnum;
    public Book(String t, String py, int bi, int noc, int nof, int noa, String pub, String c, String s, String z, int en) {
        super(t, py, bi, noc, nof);
        editionnum = en;
        published = new Publisher(pub, c, s, z);
        authorlist = new Author[noa];
        for(int i = 0; i<noa;i++){
            authorlist[i] = new Author();
        }
    }
    public Book(int bi){
        super(bi);
        editionnum = 0;
        published = new Publisher();
        authorlist = new Author[2];
    }
    @Override
    public String toString(){
        String result ="";
        for (Author authorList1 : authorlist) {
            result += authorList1.toString();
        }
        return super.toString()+result+published.toString()+" Edition Number: "+(char)editionnum + "\n";
    }
    
}
