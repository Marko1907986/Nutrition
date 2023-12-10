package service.imp;

import javax.swing.JTextArea;
import repository.imp.TechnicalTermRepositoryImp;
import service.TechnicalTermService;
import repository.TechnicalTermRepository;

/**
 *
 * @author Marko Milosevic
 */
public class TechnicalTermServiceImp implements TechnicalTermService {

    private final TechnicalTermRepository technicalTermRepository;

    public TechnicalTermServiceImp() {
        technicalTermRepository = new TechnicalTermRepositoryImp();
    }

    @Override
    public void write(String text, JTextArea definition) {
        technicalTermRepository.write(text, definition);
    }

}
