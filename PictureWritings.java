/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainFrame;

/**
 *
 * @author garre
 */
public abstract class PictureWritings extends Written {
    public Chapter[] chapters;
    public Figure[] figures;
    public PictureWritings(String t, String py, int bi, int noc, int nof ) {
        super(t, py, bi);
        chapters = new Chapter[noc];
        figures = new Figure[nof];
        for(int n =0; n< noc; n++){
            chapters[n] = new Chapter(n+1);
        }
        for(int n =0; n< nof; n++){
            figures[n] = new Figure();
        }
    }
    public PictureWritings(int bi){
        super(bi);
        chapters = new Chapter[5];
        figures = new Figure[5];
    }
    @Override
    public String toString(){
        String result1 ="";
        String result2 ="";
        for (Chapter authorList1 : chapters) {
            result1 += authorList1.toString();
        }
        for (Figure authorList1 : figures) {
            result2 += authorList1.toString();
        }
        return super.toString()+"Chapters:\n"+ result1+ " Figures:\n"+result2+"\n";
    }
    
}
