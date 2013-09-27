
package projpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class proggg {

        public static JanelaPrincipal jj;
        public static JanelaSec js;
        
        public static void main(String[] args) throws IOException {
        
        final String title;
        System.out.println("insert window title: ");
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            title = br.readLine();
        } catch (IOException iOException) {
            System.out.println("input error");
            return;
        }
        
        jj = new JanelaPrincipal(title);
        SwingConsole.run(jj, 200, 100);
        
    }
}
