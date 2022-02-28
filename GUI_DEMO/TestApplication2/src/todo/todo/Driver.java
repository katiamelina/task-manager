package todo;

/*
 * @author Terry Tosh
 */
public class Driver {
    public static void main(String[] args) {
        new MainGUI().setVisible(true);
        // new AddTask().setVisible(true);
        new EditTaskGUI().setVisible(true);
    }
}
