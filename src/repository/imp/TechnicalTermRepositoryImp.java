package repository.imp;

import java.io.*;
import javax.swing.JTextArea;
import repository.TechnicalTermRepository;

/**
 *
 * @author Marko Milosevic
 */
public class TechnicalTermRepositoryImp implements TechnicalTermRepository {

    @Override
    public void write(String text, JTextArea definition) {
        switch (text) {
            case "Termicka obrada" -> {
                try ( FileReader fr
                        = new FileReader("termicka_obrada.txt");  BufferedReader br = new BufferedReader(fr)) {
                    readFile(br, definition);
                } catch (Exception e) {
                }
            }
            case "Kuvanje" -> {
                try ( FileReader fr
                        = new FileReader("kuvanje.txt");  BufferedReader br = new BufferedReader(fr)) {
                    readFile(br, definition);
                } catch (Exception e) {
                }
            }
            case "Parenje ili proces vlazne toplote" -> {
                try ( FileReader fr
                        = new FileReader("parenje.txt");  BufferedReader br = new BufferedReader(fr)) {
                    readFile(br, definition);
                } catch (Exception e) {
                }
            }
            case "Dinstanje" -> {
                try ( FileReader fr
                        = new FileReader("dinstanje.txt");  BufferedReader br = new BufferedReader(fr)) {
                    readFile(br, definition);
                } catch (Exception e) {
                }
            }
            case "Przenje" -> {
                try ( FileReader fr
                        = new FileReader("przenje.txt");  BufferedReader br = new BufferedReader(fr)) {
                    readFile(br, definition);
                } catch (Exception e) {
                }
            }
            case "Pecenje" -> {
                try ( FileReader fr
                        = new FileReader("pecenje.txt");  BufferedReader br = new BufferedReader(fr)) {
                    readFile(br, definition);
                } catch (Exception e) {
                }
            }
            case "Blansiranje" -> {
                try ( FileReader fr
                        = new FileReader("blansiranje.txt");  BufferedReader br = new BufferedReader(fr)) {
                    readFile(br, definition);
                } catch (Exception e) {
                }
            }
            case "Pohovanje" -> {
                try ( FileReader fr
                        = new FileReader("pohovanje.txt");  BufferedReader br = new BufferedReader(fr)) {
                    readFile(br, definition);
                } catch (Exception e) {
                }
            }
            case "Kombinovani procesi" -> {
                try ( FileReader fr
                        = new FileReader("kombinovani_procesi.txt");  BufferedReader br = new BufferedReader(fr)) {
                    readFile(br, definition);
                } catch (Exception e) {
                }
            }
            case "Zaprzavanje" -> {
                try ( FileReader fr
                        = new FileReader("zaprzavanje.txt");  BufferedReader br = new BufferedReader(fr)) {
                    readFile(br, definition);
                } catch (Exception e) {
                }
            }
            case "Zamascivanje" -> {
                try ( FileReader fr
                        = new FileReader("zamascivanje.txt");  BufferedReader br = new BufferedReader(fr)) {
                    readFile(br, definition);
                } catch (Exception e) {
                }
            }
            case "Zacinjavanje" -> {
                try ( FileReader fr
                        = new FileReader("zacinjavanje.txt");  BufferedReader br = new BufferedReader(fr)) {
                    readFile(br, definition);
                } catch (Exception e) {
                }
            }
            case "Glaziranje" -> {
                try ( FileReader fr
                        = new FileReader("glaziranje.txt");  BufferedReader br = new BufferedReader(fr)) {
                    readFile(br, definition);
                } catch (Exception e) {
                }
            }
            case "Gratiniranje" -> {
                try ( FileReader fr
                        = new FileReader("gratiniranje.txt");  BufferedReader br = new BufferedReader(fr)) {
                    readFile(br, definition);
                } catch (Exception e) {
                }
            }
            case "Sotiranje" -> {
                try ( FileReader fr
                        = new FileReader("sotiranje.txt");  BufferedReader br = new BufferedReader(fr)) {
                    readFile(br, definition);
                } catch (Exception e) {
                }
            }
            case "Dekantiranje" -> {
                try ( FileReader fr
                        = new FileReader("dekantiranje.txt");  BufferedReader br = new BufferedReader(fr)) {
                    readFile(br, definition);
                } catch (Exception e) {
                }
            }
            case "Paniranje" -> {
                try ( FileReader fr
                        = new FileReader("paniranje.txt");  BufferedReader br = new BufferedReader(fr)) {
                    readFile(br, definition);
                } catch (Exception e) {
                }
            }
            case "Pasiranje" -> {
                try ( FileReader fr
                        = new FileReader("pasiranje.txt");  BufferedReader br = new BufferedReader(fr)) {
                    readFile(br, definition);
                } catch (Exception e) {
                }
            }
            default -> {
                try ( FileReader fr
                        = new FileReader("fond.txt");  BufferedReader br = new BufferedReader(fr)) {
                    readFile(br, definition);
                } catch (Exception e) {
                }
            }

        }
    }

    private void readFile(BufferedReader br, JTextArea definition) throws IOException {
        boolean end = false;
        String s = "";
        while (!end) {
            String pom = br.readLine();
            s = s + pom + "\n";
            if (pom == null) {
                end = true;
            } else {
                definition.setText(s);
            }
        }
    }
}
