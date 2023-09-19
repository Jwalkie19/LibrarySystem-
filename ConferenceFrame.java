
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

public class ConferenceFrame extends MainFrame{
    public static void createFrame(int newbi, int index)
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                JFrame frame = new JFrame("Conference Paper");
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
                
                JLabel l1 = new JLabel("Title");
                panel.add(l1);
                JTextField tinput = new JTextField(20);
                panel.add(tinput);
                JLabel l2 = new JLabel("Publication Year");
                panel.add(l2);
                JTextField pinput = new JTextField(20);
                panel.add(pinput);
                JLabel l3 = new JLabel("Number of Authors");
                panel.add(l3);
                JTextField ninput = new JTextField(20);
                panel.add(ninput);
                JLabel l4 = new JLabel("Conference Name");
                panel.add(l4);
                JTextField cinput = new JTextField(20);
                panel.add(cinput);
                JLabel l5 = new JLabel("City");
                panel.add(l5);
                JTextField cityinput = new JTextField(20);
                panel.add(cityinput);
                JLabel l6 = new JLabel("State");
                panel.add(l6);
                JTextField sinput = new JTextField(20);
                panel.add(sinput);
                JLabel l7 = new JLabel("Country");
                panel.add(l7);
                JTextField countryinput = new JTextField(20);
                panel.add(countryinput);
                JLabel l8 = new JLabel("Start Date");
                panel.add(l8);
                JTextField startinput = new JTextField(20);
                panel.add(startinput);
                JLabel l9 = new JLabel("End Date");
                panel.add(l9);
                JTextField endinput = new JTextField(20);
                panel.add(endinput);
                
                JPanel inputpanel = new JPanel();
                inputpanel.setLayout(new FlowLayout());
                JButton button = new JButton("Enter");
                button.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        database[index] = new ConferencePaper(tinput.getText(),pinput.getText(), newbi, Integer.parseInt(ninput.getText()), cinput.getText(), cityinput.getText(), sinput.getText(), countryinput.getText(), startinput.getText(), endinput.getText());
                        ConferencePaper temp = (ConferencePaper) database[index];
                        AuthorFrame.createFrame(Integer.parseInt(ninput.getText()), index, 1);
                        frame.dispose();
                    }
                });
                
                inputpanel.add(button);
                panel.add(inputpanel);
                frame.getContentPane().add(BorderLayout.CENTER, panel);
                frame.setSize(300,500);
                frame.setLocationByPlatform(true);
                frame.setVisible(true);
                frame.setResizable(false);
            }
        });
    }
}
