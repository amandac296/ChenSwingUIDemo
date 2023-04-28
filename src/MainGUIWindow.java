import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainGUIWindow extends JFrame implements ActionListener, KeyListener {
    private JPanel mainPanel;
    private JLabel myLabel;
    private JTextField myText;
    private JTextArea myTextArea;
    private JButton enterButton;
    private JSlider slider1;
    private JButton randomButton;

    public MainGUIWindow() {
        createGUIComponents();
    }

    private void createGUIComponents(){
        setContentPane(mainPanel);
        setTitle("MyGUI!");
        setSize(400,500);//can change later
        setLocation(450,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        myTextArea.setLineWrap(true);
        enterButton.addActionListener(this);
        randomButton.addActionListener(this);
        myText.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source instanceof JButton){
            JButton button = (JButton) source;
            String text = button.getText();

            if (text.equals ("Enter")){
                myTextArea.append(myText.getText());
            } else {
                myTextArea.append("RANDOMMM!");
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}