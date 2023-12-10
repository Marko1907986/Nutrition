package service.imp;

import domain.SideDish;
import java.util.List;
import javax.swing.JTextField;
import repository.imp.SideDishRepositoryImp;
import service.SideDishService;
import repository.SideDishRepository;

/**
 *
 * @author Marko Milosevic
 */
public class SideDishServiceImp implements SideDishService {

    private final SideDishRepository sideDishRepositorium;

    public SideDishServiceImp() {
        sideDishRepositorium = new SideDishRepositoryImp();
    }

    @Override
    public List<SideDish> getAll() throws Exception {
        return sideDishRepositorium.getAll();
    }

    @Override
    public void checkValue(JTextField text, String sideDish) {
        sideDishRepositorium.checkValue(text, sideDish);
    }

}
