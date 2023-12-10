package service.imp;

import javax.swing.JTextArea;
import repository.imp.LossesDuringThermalTreatmentRepositoryImp;
import service.LossesDuringThermalTreatmentService;
import repository.LossesDuringThermalTreatmentRepository;

/**
 *
 * @author Marko Milosevic
 */
public class LossesDuringThermalTreatmentServiceImp implements LossesDuringThermalTreatmentService {

    private final LossesDuringThermalTreatmentRepository lossesDuringThermalTreatmentRepository;

    public LossesDuringThermalTreatmentServiceImp() {
        lossesDuringThermalTreatmentRepository = new LossesDuringThermalTreatmentRepositoryImp();
    }

    @Override
    public void readFile(JTextArea text) {
        lossesDuringThermalTreatmentRepository.readFile(text);
    }

}
