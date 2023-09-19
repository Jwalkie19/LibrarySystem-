/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainFrame;

/**
 *
 * @author garre
 */
public abstract class Written {
    public String title;
    public String publicationyear;
    private int bookId;
    
    public Written(String t, String py, int bi){
        title = t;
        publicationyear = py;
        bookId = bi;
    }
    public Written(int bi){
        bookId =bi;
        title = "Untitled Piece";
        publicationyear = " ";
    }
    public int getBookId(){
        return bookId;
    }
    @Override
    public String toString(){
        return "Title: "+title+"\nPublication Year: "+publicationyear+"\nBook Id: "+bookId+"\n";   
    }
}
