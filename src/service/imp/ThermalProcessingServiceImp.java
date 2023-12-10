package service.imp;

import domain.ThermalProcessing;
import java.util.List;
import repository.imp.ThermalProcessingRepositoryImp;
import service.ThermalProcessingService;
import repository.ThermalProcessingRepository;

/**
 *
 * @author Marko Milosevic
 */
public class ThermalProcessingServiceImp implements ThermalProcessingService {

    private final ThermalProcessingRepository thermalProcessingRepository;

    public ThermalProcessingServiceImp() {
        thermalProcessingRepository = new ThermalProcessingRepositoryImp();
    }

    @Override
    public List<ThermalProcessing> getAll() throws Exception {
        return thermalProcessingRepository.getAll();
    }

}
