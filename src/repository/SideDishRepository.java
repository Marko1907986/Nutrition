package repository;

import domain.SideDish;
import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author Marko Milosevic
 */
public interface SideDishRepository {

    List<SideDish> getAll() throws Exception;

    public void checkValue(JTextField text, String sideDish);

}
