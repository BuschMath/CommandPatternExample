/* In this example, we create a JButton and associate it with an 
    Action called HelloAction. The HelloAction class is an 
    implementation of the Action interface that encapsulates the 
    operation of displaying a message box with the text "Hello, 
    World!". When the button is pressed, the actionPerformed() 
    method of the HelloAction class is called, and the HelloAction 
    object performs its operation.

    By using the Command Pattern with the Action interface, we have 
    decoupled the button (the "Invoker") from the operation that it 
    performs (the "Receiver"). This makes it easy to change the 
    operation that is performed by the button without needing to modify 
    the button itself. 
*/

import javax.swing.*;

public class CommandPatternExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Command Pattern Example");

        // Create a button with an Action
        Action helloAction = new HelloAction("Hello");
        JButton helloButton = new JButton(helloAction);

        // Add the button to the frame
        frame.getContentPane().add(helloButton);

        // Display the frame
        frame.pack();
        frame.setVisible(true);
    }
}