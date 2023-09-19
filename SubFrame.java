/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package MainFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
/**
 *
 * @author jerry
 *
 * */
public class SubFrame extends MainFrame{
    public static void createFrame()
    {
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run()
            {
                JFrame frame = new JFrame("Remove Item Window");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                try 
                {
                   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                   e.printStackTrace();
                }
                
                JPanel panel = new JPanel();
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                panel.setOpaque(true);
                
                
                
                JPanel inputpanel = new JPanel();
                inputpanel.setLayout(new FlowLayout());
               
                JTextField input = new JTextField(20);
                JButton button = new JButton(" enter");
                button.addActionListener(new ActionListener(){
                    @Override
                   public void actionPerformed(ActionEvent e) {
                       Written[]temp=new Written[database.length-1];
                       int j=0;
                       int check = Integer.parseInt(input.getText());
                       for(int i =0; i<database.length; i++){
                           if(check != database[i].getBookId()){
                            temp[j]=database[i];
                            j++;
                              
                       }
                       }
                       JOptionPane.showMessageDialog(null, "Task Complete");  
                       database=temp;
                         frame.dispose();
                       }
                   });
                
                
                inputpanel.add(input);
                inputpanel.add(button);
                panel.add(inputpanel);
                frame.getContentPane().add(BorderLayout.CENTER, panel);
                frame.setSize(300,300);
                frame.setLocationByPlatform(true);
                frame.setVisible(true);
                frame.setResizable(false);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                input.requestFocus();
                
            }
        });
    }
}

    
