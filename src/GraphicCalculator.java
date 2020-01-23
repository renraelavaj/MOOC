
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    
    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300, 150));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        frame.setLayout(new GridLayout(3, 1));
        
        JTextField output = new JTextField("0");
        output.setEnabled(false);
        
        JTextField input = new JTextField("0");
        
        JPanel panel = new JPanel(new GridLayout(1, 3));
        
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton z = new JButton("Z");
        
        if (output.getText().equals("0")) z.setEnabled(false);
        
        SumListener sumListener = new SumListener(input, output, z);
        plus.addActionListener(sumListener);
        
        SubtractionListener subListener = new SubtractionListener(input, output, z);
        minus.addActionListener(subListener);
        
        ZListener zListener = new ZListener(input, output, z);
        z.addActionListener(zListener);
        
        panel.add(plus);
        panel.add(minus);
        panel.add(z);
        
        container.add(output);
        container.add(input);
        container.add(panel);
    }

    public JFrame getFrame() {
        return frame;
    }
}
