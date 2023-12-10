package service;

import domain.ThermalProcessing;
import java.util.List;

/**
 *
 * @author Marko Milosevic
 */
public interface ThermalProcessingService {

    List<ThermalProcessing> getAll() throws Exception;
}
