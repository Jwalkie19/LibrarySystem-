/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainFrame;

/**
 *
 * @author garre
 */
public class ConferencePaper extends Written{
    public Author[] authorlist;
    public String conference;
    private Location meeting;
    private Period timeperiod;

    public ConferencePaper(String t, String py, int bi, int noa, String cname, String c, String s, String z, String sdate, String edate) {
        super(t, py, bi);
        conference = cname;
        meeting = new Location(c,s,z);
        timeperiod = new Period(sdate,edate);
        authorlist = new Author[noa];
        for(int i = 0; i<noa;i++){
            authorlist[i] = new Author();
        }
    }
    public ConferencePaper(int bi){
        super(bi);
        conference = "Super Summit";
        meeting = new Location();
        timeperiod = new Period();
        authorlist = new Author[2];
        authorlist[0] = new Author("Franklin", "Richard");
        authorlist[1] = new Author("Sue", "Storm");
    }
    @Override
    public String toString(){
        String result = "";
        for (Author authorList1 : authorlist) {
            result += authorList1.toString();
        }
        return super.toString() + "Conference: "+conference+"\n"+meeting.toString()+timeperiod.toString()+result;
    }
    
    
}
