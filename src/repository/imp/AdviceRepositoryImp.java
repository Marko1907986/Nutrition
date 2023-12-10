package repository.imp;

import java.io.*;
import javax.swing.JTextArea;
import repository.AdviceRepository;

/**
 *
 * @author Marko Milosevic
 */
public class AdviceRepositoryImp implements AdviceRepository {

    @Override
    public void readFile(JTextArea text) {
        // ucitaj podatke iz fajla i prikazi ih na formi odmah po njenoj aktivaciji
        try ( FileReader fr = new FileReader("neki_prakticni_saveti.txt");  BufferedReader br = new BufferedReader(fr)) {
            boolean end = false;
            String s = "";
            while (!end) {
                String pom = br.readLine();
                s = s + pom + "\n";
                if (pom == null) {
                    end = true;
                } else {
                    text.setText(s);
                }
            }
        } catch (Exception e) {
        }
    }

}
