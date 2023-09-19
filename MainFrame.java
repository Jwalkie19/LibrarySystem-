
package MainFrame;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class MainFrame extends JFrame {
    public final JButton editBtn, addBtn, removeBtn, sumBtn, searchBtn;
    public final JTextField searchTxt;
    public final JTextArea printTxt;
    public final JScrollPane scroller;
    public static String dropDown[] = {"Research Report","Magazine","Conference Paper","Dissertation","Thesis","Book","Journal Paper"};
    public static Written[] database;
    public static int gbi;
    public MainFrame() {
        super("Library Management System");
        database = new Written[2];
        database[0]=new Magazine("How to be Ihab","2022",1);
        database[1]=new Magazine("Can i pass my class","2023",2);
        gbi = 2;
        FlowLayout fl = new FlowLayout();
        setLayout(fl);
        
        searchTxt = new JTextField("",30);
        Font fnt = new Font("Serif",Font.PLAIN, 14);
        searchTxt.setFont(fnt);
        add(searchTxt);
        
        searchBtn = new JButton("Search");
        searchBtn.setFont(fnt);
        add(searchBtn);
        
        searchBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String result = "";
                int IDBook = Integer.parseInt(searchTxt.getText());
                
                for(int i =0; i < database.length;i++){
                    if (IDBook == database[i].getBookId())
                    {
                    result = database[i].toString();
                    }
                }
                printTxt.setText(result);
            }
            
        });
        
        
        addBtn = new JButton("Add");
        addBtn.setFont(fnt);
        add(addBtn);
        
        addBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                AddFrame.createFrame();
            }
        });
        
        removeBtn = new JButton("Remove");
        removeBtn.setFont(fnt);
        add(removeBtn);
        removeBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               SubFrame.createFrame();
            }
        });
        
        
        editBtn = new JButton("Edit");
        editBtn.setFont(fnt);
        add(editBtn);
        
        editBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                EditFrame.createFrame();
            }
        });
        
        sumBtn = new JButton("Print All Data");
        sumBtn.setFont(fnt);
        add(sumBtn);
    
        sumBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String result = "";
                for(int i =0; i < database.length;i++){
                    result+= database[i].toString();
                }
                printTxt.setText(result);
            }
            
        });
        
        printTxt = new JTextArea(200,40);
        printTxt.setFont(fnt);
        add(printTxt);
        printTxt.setEditable(false);
        printTxt.setWrapStyleWord(false);
        scroller = new JScrollPane(printTxt);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(scroller);
    }
    
    public static String searcher(int bi){
        String result = "";
        for(int i =0; i < database.length;i++){
            if (bi == database[i].getBookId())
            {
                result = database[i].toString();
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(480,500);
        myFrame.setVisible(true);
        myFrame.setResizable(false);
    }
}
