import javax.swing.*;
import java.awt.event.*;

// Define an Action that implements the Command Pattern
class HelloAction extends AbstractAction {
    public HelloAction(String text) {
        super(text);
    }

    public void actionPerformed(ActionEvent e) {
        // Perform the operation
        JOptionPane.showMessageDialog(null, "Hello, World!");
    }
}
