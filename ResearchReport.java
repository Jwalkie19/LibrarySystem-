/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainFrame;

/**
 *
 * @author garre
 */
public class ResearchReport extends Written {
    public Author[] authorList;
    public ResearchReport(String t, String py, int bi, int numauth) {
        super(t, py, bi);
        authorList = new Author[numauth];
        for(int i = 0; i<numauth;i++){
            authorList[i] = new Author();
        }
    }
    public ResearchReport(int bi){
        super(bi);
        authorList = new Author[2];
    }
    @Override
    public String toString(){
        String result = "";
        for (Author authorList1 : authorList) {
            result += authorList1.toString();
        }
        return super.toString() + result;
    }
    
    
}
