
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srecko
 */
public class RKeyListener implements KeyListener {
    
    private JTextField inputField;

    public RKeyListener(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_R) {
            inputField.setText("");
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }
    
}
