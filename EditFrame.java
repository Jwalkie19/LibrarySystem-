
package MainFrame;
import MainFrame.MainFrame;
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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class EditFrame extends MainFrame{
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
                
                
                JPanel panel = new JPanel();
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                panel.setOpaque(true);
                
                JLabel l1 = new JLabel("Book Id");
                panel.add(l1);
                JTextField binput = new JTextField(20);
                panel.add(binput);
                JPanel inputpanel = new JPanel();
                inputpanel.setLayout(new FlowLayout());
                JButton button = new JButton("Enter");
                button.addActionListener(new ActionListener(){
                    @Override
                   public void actionPerformed(ActionEvent e) {
                        int index = -1;
                        int comp = Integer.parseInt(binput.getText());
                        for(int i =0;i < database.length;i++){
                            if(comp == database[i].getBookId())
                                index = i;
                        }
                        if(index == -1){
                            
                        }
                        else if (database[index] instanceof  ResearchReport){
                            ResearchFrame.createFrame(database[index].getBookId(), index);
                        
                        }
                        else if (database[index] instanceof  Magazine){
                            MagazineFrame.createFrame(database[index].getBookId(), index);
                        
                        }
                        else if (database[index] instanceof  ConferencePaper){
                            ConferenceFrame.createFrame(database[index].getBookId(),index);
                        }
                        else if (database[index] instanceof  Dissertation){
                            DissertationFrame.createFrame(database[index].getBookId(),index);
                        }
                        else if (database[index] instanceof  Thesis){
                            ThesisFrame.createFrame(database[index].getBookId(),index);
                        }
                        else if (database[index] instanceof  Book){
                            BookFrame.createFrame(database[index].getBookId(), index);
                        }
                        else if (database[index] instanceof  JournalPaper){
                            JournalPaperFrame.createFrame(database[index].getBookId(), index);
                        
                        }
                            
                        
                        
                    }

                });
                
        
                inputpanel.add(button);
                panel.add(inputpanel);
                frame.getContentPane().add(BorderLayout.CENTER, panel);
                frame.setSize(300,300);
                frame.setLocationByPlatform(true);
                frame.setVisible(true);
                frame.setResizable(false);
            }
        });
    }
}
