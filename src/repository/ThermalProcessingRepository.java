package repository;

import domain.ThermalProcessing;
import java.util.List;

/**
 *
 * @author Marko Milosevic
 */
public interface ThermalProcessingRepository {

    List<ThermalProcessing> getAll() throws Exception;
}
