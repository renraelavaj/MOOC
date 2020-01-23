
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
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
public class ZListener implements ActionListener {
    
    private JTextField in;
    private JTextField out;
    private JButton z;

    public ZListener(JTextField in, JTextField out, JButton z) {
        this.in = in;
        this.out = out;
        this.z = z;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        out.setText("0");
        z.setEnabled(false);
    }
    
}
