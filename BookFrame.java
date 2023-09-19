package MainFrame;
import static MainFrame.MainFrame.database;
import static MainFrame.MainFrame.gbi;
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

public class BookFrame extends MainFrame{
    public static void createFrame(int newbi, int index)
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                JFrame frame = new JFrame("Book");
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
                
                JLabel l4 = new JLabel("Publisher Name");
                panel.add(l4);
                JTextField pubnput = new JTextField(20);
                panel.add(pubnput);
                
                JLabel l5 = new JLabel("Publisher City");
                panel.add(l5);
                JTextField pcinput = new JTextField(20);
                panel.add(pcinput);
                
                JLabel l6 = new JLabel("Publisher State");
                panel.add(l6);
                JTextField pstinput = new JTextField(20);
                panel.add(pstinput);
                
                JLabel l7 = new JLabel("Publisher ZIP code");
                panel.add(l7);
                JTextField pzinput = new JTextField(20);
                panel.add(pzinput);
                
                JLabel l8 = new JLabel("Number of Chapters");
                panel.add(l8);
                JTextField chinput = new JTextField(20);
                panel.add(chinput);
                
                JLabel l9 = new JLabel("Number of Figures");
                panel.add(l9);
                JTextField fignput = new JTextField(20);
                panel.add(fignput);
                
                JLabel l10 = new JLabel("Edition Number");
                panel.add(l10);
                JTextField eninput = new JTextField(20);
                panel.add(eninput);
                
                JPanel inputpanel = new JPanel();
                inputpanel.setLayout(new FlowLayout());
                
                JButton button = new JButton("Enter");
                button.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                         database[index] = new Book(tinput.getText(),pinput.getText(), newbi, Integer.parseInt(chinput.getText()), Integer.parseInt(fignput.getText()),Integer.parseInt(ninput.getText()),pubnput.getText(),pcinput.getText(),pstinput.getText(),pzinput.getText(),Integer.parseInt(eninput.getText()));
                         Book temp = (Book) database[index];
                         AuthorFrame.createFrame(Integer.parseInt(ninput.getText()), index, 3);
                         FigureFrame.createFrame(Integer.parseInt(fignput.getText()), index, 2);
                         frame.dispose();
                    }
                });
                
                inputpanel.add(button);
                panel.add(inputpanel);
                frame.getContentPane().add(BorderLayout.CENTER, panel);
                frame.setSize(500,600);
                frame.setLocationByPlatform(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                frame.setResizable(false);
            }
        });
    }
}
