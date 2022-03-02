package taskmanager;
import javax.swing.*;
import java.awt.*;

public class TaskGUI extends JPanel{
    private JTextField taskName;

    TaskGUI(Task task){
        this.setPreferredSize(new Dimension(40,200));
        this.setBackground(Color.gray);
        this.setLayout(new BorderLayout());   

        taskName = new JTextField(task.getTitle());
        
    }
}
