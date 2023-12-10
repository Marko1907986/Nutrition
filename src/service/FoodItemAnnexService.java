package service;

import domain.FoodItemAnnex;
import java.util.List;

/**
 *
 * @author Marko Milosevic
 */
public interface FoodItemAnnexService {

    List<FoodItemAnnex> getAll() throws Exception;
}
