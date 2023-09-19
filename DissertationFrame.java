
package MainFrame;
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
import static MainFrame.MainFrame.database;

public class DissertationFrame extends MainFrame{
    public static void createFrame(int newbi, int index)
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                JFrame frame = new JFrame("Dissertation");
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
                JLabel l4 = new JLabel("noc");
                panel.add(l4);
                JTextField nocinput = new JTextField(20);
                panel.add(nocinput);
                JLabel l5 = new JLabel("nof");
                panel.add(l5);
                JTextField nofinput = new JTextField(20);
                panel.add(nofinput);
                JLabel l6 = new JLabel("nocm");
                panel.add(l6);
                JTextField nocminput = new JTextField(20);
                panel.add(nocminput);
                JLabel l7 = new JLabel("depnam");
                panel.add(l7);
                JTextField depnaminput = new JTextField(20);
                panel.add(depnaminput);
                JLabel l8 = new JLabel("City");
                panel.add(l8);
                JTextField cityinput = new JTextField(20);
                panel.add(cityinput);
                JLabel l9 = new JLabel("State");
                panel.add(l9);
                JTextField stateinput = new JTextField(20);
                panel.add(stateinput);
                JLabel l10 = new JLabel("ZIP");
                panel.add(l10);
                JTextField zipinput = new JTextField(20);
                panel.add(zipinput);
                JLabel l11 = new JLabel("noa");
                panel.add(l11);
                JTextField noainput = new JTextField(20);
                panel.add(noainput);
                
                JPanel inputpanel = new JPanel();
                inputpanel.setLayout(new FlowLayout());
                JButton button = new JButton("Enter");
                button.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        database[index] = new Dissertation(tinput.getText(),pinput.getText(), newbi, Integer.parseInt(nocinput.getText()), Integer.parseInt(nofinput.getText()), Integer.parseInt(nocminput.getText()), depnaminput.getText(), cityinput.getText(), stateinput.getText(), zipinput.getText(), Integer.parseInt(noainput.getText()));
                        Dissertation temp = (Dissertation) database[index];
                        AuthorFrame.createFrame(Integer.parseInt(ninput.getText()), index, 2);
                        CommiteeMemFrame.createFrame(Integer.parseInt(nocminput.getText()), index, 0);
                        FigureFrame.createFrame(Integer.parseInt(nofinput.getText()), index, 0);
                        frame.dispose();
                    }
                });
                
                inputpanel.add(button);
                panel.add(inputpanel);
                frame.getContentPane().add(BorderLayout.CENTER, panel);
                frame.setSize(300,600);
                frame.setLocationByPlatform(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                frame.setResizable(false);
            }
        });
    }
}
