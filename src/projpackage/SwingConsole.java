
package projpackage;

import javax.swing.*;

public class SwingConsole {
    
   public static void run(final JFrame f, final int width, final int height) {
       SwingUtilities.invokeLater(new Runnable() {
           public void run() {
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setSize(width, height);
                f.setVisible(true);
           }
       });
    }
   
   public static void runNoSize(final JFrame f) {
       SwingUtilities.invokeLater(new Runnable() {
           public void run() {
                f.setVisible(true);
           }
       });
    }
}
