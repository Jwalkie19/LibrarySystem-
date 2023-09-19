
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

public class ResearchFrame extends MainFrame{
    public static void createFrame(int newbi, int index)
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                JFrame frame = new JFrame("Research Report");
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
                
                JPanel inputpanel = new JPanel();
                inputpanel.setLayout(new FlowLayout());
                JButton button = new JButton("Enter");
                button.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                         database[index] = new ResearchReport(tinput.getText(),pinput.getText(), newbi, Integer.parseInt(ninput.getText()));
                         ResearchReport temp = (ResearchReport) database[index];
                         AuthorFrame.createFrame(Integer.parseInt(ninput.getText()), index, 0);
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
