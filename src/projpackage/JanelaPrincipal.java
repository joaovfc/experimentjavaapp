
package projpackage;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JanelaPrincipal extends JFrame {
    
    private JButton
        b1 = new JButton("Button 1"),
        b2 = new JButton("Button 2");
    private JTextField txt = new JTextField("enter text");
    
    public JanelaPrincipal(String title) {
        setLayout(new GridLayout());
        setTitle(title);
        add(b1);
        add(b2);
        add(txt);
        txt.addActionListener(new TextListener());
        b1.addActionListener(new BtListener());
        b2.addActionListener(new Bt2Listener(b2));
    }
    
    class TextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            final String phrase = txt.getText();
            txt.setText("");
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    System.out.println("chaging title to " + phrase);
                    getJanelaPrincipal().setTitle(phrase);
                } 
            });
        }
    }
    
    class BtListener implements ActionListener {
        
        public void actionPerformed(ActionEvent e) {  
            final String phrase = txt.getText();
            txt.setText("");
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    if (proggg.js == null)
                        SwingConsole.runNoSize(proggg.js = new JanelaSec());
                    else
                        proggg.js.setVisible(true);
                }
            });
        }
    }
    
    class Bt2Listener implements ActionListener {
        
        private JButton j;
        public Bt2Listener(JButton but) {
            j = but;
        }
        
        public void actionPerformed(ActionEvent e) {  
            final String phrase = txt.getText();
            txt.setText("");
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    System.out.println("changing " + j.getText() + " to " + phrase);
                    j.setText(phrase);
                }
            });
        }
    }
    
    public JanelaPrincipal getJanelaPrincipal() {
        return JanelaPrincipal.this;
    }
    
}