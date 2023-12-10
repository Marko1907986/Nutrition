package repository;

import domain.FoodItemAnnex;
import java.util.List;

/**
 *
 * @author Marko Milosevic
 */
public interface FoodItemAnnexRepository {

    List<FoodItemAnnex> getAll() throws Exception;
}
