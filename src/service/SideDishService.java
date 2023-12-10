package service;

import domain.SideDish;
import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author Marko Milosevic
 */
public interface SideDishService {

    List<SideDish> getAll() throws Exception;

    public void checkValue(JTextField text, String sideDish);

}
