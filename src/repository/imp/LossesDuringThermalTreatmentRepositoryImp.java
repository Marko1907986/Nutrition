package repository.imp;

import java.io.*;
import javax.swing.JTextArea;
import repository.LossesDuringThermalTreatmentRepository;

/**
 *
 * @author Marko Milosevic
 */
public class LossesDuringThermalTreatmentRepositoryImp implements LossesDuringThermalTreatmentRepository {

    @Override
    public void readFile(JTextArea text) {
        // ucitaj podatke iz fajla i prikazi ih na formi odmah po njenoj aktivaciji
        try ( FileReader fr
                = new FileReader("gubici_prilikom_termicke_obrade.txt");  BufferedReader br = new BufferedReader(fr)) {
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
