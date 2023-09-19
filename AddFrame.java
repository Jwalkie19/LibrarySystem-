
package MainFrame;
import static MainFrame.MainFrame.database;
import static MainFrame.MainFrame.dropDown;
import static MainFrame.MainFrame.gbi;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class AddFrame extends MainFrame{
    public static void createFrame()
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                JFrame frame = new JFrame("Add Item Window");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                try 
                {
                   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                   e.printStackTrace();
                }
                JComboBox addBox = new JComboBox(dropDown);
                
                
                JPanel panel = new JPanel();
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                panel.setOpaque(true);
                
                
                
                JPanel inputpanel = new JPanel();
                inputpanel.setLayout(new FlowLayout());
                JButton button = new JButton("Enter");
                button.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Written[] temp = new Written[database.length+1];
                        for(int i = 0; i<database.length;i++){
                            temp[i] = database[i];
                        }
                        database = temp;
                        if (addBox.getSelectedItem().equals(dropDown[0])){
                            gbi++;
                            ResearchFrame.createFrame(gbi, database.length-1);
                        
                        }
                        else if (addBox.getSelectedItem().equals(dropDown[1])){
                           gbi++;
                           MagazineFrame.createFrame(gbi, database.length-1);
                        }
                        else if (addBox.getSelectedItem().equals(dropDown[2])){
                            gbi++;
                            ConferenceFrame.createFrame(gbi, database.length-1);
                        }
                        else if (addBox.getSelectedItem().equals(dropDown[3])){
                            gbi++;
                            DissertationFrame.createFrame(gbi, database.length-1);
                        }
                        else if (addBox.getSelectedItem().equals(dropDown[4])){
                            gbi++;
                            ThesisFrame.createFrame(gbi, database.length-1);
                        }
                        else if (addBox.getSelectedItem().equals(dropDown[5])){
                            gbi++;
                            BookFrame.createFrame(gbi, database.length-1);
                        }
                        else if (addBox.getSelectedItem().equals(dropDown[6])){
                            gbi++;
                            JournalPaperFrame.createFrame(gbi, database.length-1);
                        }
                            
                        frame.dispose();
                        
                    }
                });
                
                inputpanel.add(addBox);
                inputpanel.add(button);
                panel.add(inputpanel);
                frame.getContentPane().add(BorderLayout.CENTER, panel);
                frame.setSize(300,300);
                frame.setLocationByPlatform(true);
                frame.setVisible(true);
                frame.setResizable(false);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }
}
