/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainFrame;

import static MainFrame.MainFrame.database;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author zpete
 */
public class FigureFrame {
    public static void createFrame(int nof, int index, int ID)
    {
        EventQueue.invokeLater(new Runnable()
        {
            int gaming = nof;
            int whichOne = ID;
            @Override
            public void run()
            {
                JFrame frame = new JFrame("Commitee Member Name Entry");
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
                
                
                JTextField first[] = new JTextField[gaming];
                JTextField last[] = new JTextField[gaming];
                for(int i = 0; i < gaming; i++)
                {
                    
                    JLabel l1 = new JLabel("First Name:");
                    panel.add(l1);
                    first[i] = new JTextField();
                    panel.add(first[i]);
                    
                    JLabel l2 = new JLabel("Last Name:");
                    panel.add(l2);
                    last[i] = new JTextField();
                    panel.add(last[i]);
                }
                
                JPanel inputpanel = new JPanel();
                inputpanel.setLayout(new FlowLayout());
                JButton button = new JButton("Enter");
                button.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        switch(whichOne){
                            
                            case 0:
                            for(int j = 0; j < gaming; j++)
                            {
                            Dissertation temp = (Dissertation) database[index];
                            temp.authorlist[j].firstName = first[j].getText();
                            temp.authorlist[j].lastName = last[j].getText();
                            }
                            break;
                            
                            case 1:
                            
                            for(int j = 0; j < gaming; j++)
                            {
                            Thesis temp = (Thesis) database[index];
                            temp.writer.firstName = first[j].getText();
                            temp.writer.lastName = last[j].getText();
                            }
                            break;
                            
                            case 2:
                            for(int j = 0; j < gaming; j++)
                            {
                            Book temp = (Book) database[index];
                            temp.authorlist[j].firstName = first[j].getText();
                            temp.authorlist[j].lastName = last[j].getText();
                            }
                            break;
                        }
                         frame.dispose();
                    }
                });
                
                inputpanel.add(button);
                panel.add(inputpanel);
                frame.getContentPane().add(BorderLayout.CENTER, panel);
                frame.setSize(500,300);
                frame.setLocationByPlatform(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                frame.setResizable(false);
            }
        });
    }
}
