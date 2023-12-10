package service.imp;

import javax.swing.JTextArea;
import repository.imp.AdviceRepositoryImp;
import service.AdviceService;
import repository.AdviceRepository;

/**
 *
 * @author Marko Milosevic
 */
public class AdviceServiceImp implements AdviceService {

    private final AdviceRepository adviceRepository;

    public AdviceServiceImp() {
        adviceRepository = new AdviceRepositoryImp();
    }

    @Override
    public void readFile(JTextArea text) {
        adviceRepository.readFile(text);
    }

}
