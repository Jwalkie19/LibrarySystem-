/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainFrame;

/**
 *
 * @author garre
 */
public class Chapter {
    public String chapName;
    private int chapNum;
    
    public Chapter(String nam,int num){
        chapName =nam;
        chapNum = num;
    }
    public Chapter(int num){
        chapNum = num;
        chapName = "Chapter "+ Integer.toString(num);
    }
    public int getchapNum(){
        return chapNum;
    }
    public void setchapNum(int newnum){
        chapNum = newnum;
    }
    @Override
    public String toString(){
        return "Chapter Name: "+chapName+" Chapter #: "+ Integer.toString(chapNum)+"\n";
    }
}
