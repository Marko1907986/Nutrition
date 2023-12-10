package repository;

import domain.FoodItem;
import java.util.List;

/**
 *
 * @author Marko Milosevic
 */
public interface FoodItemRepository {

    List<FoodItem> getAll() throws Exception;

    List<FoodItem> getByName(String text) throws Exception;

    List<FoodItem> getByEnergyValueKJ(String text) throws Exception;

    List<FoodItem> getByEnergyValueCal(String text) throws Exception;

    List<FoodItem> getByProtein(String text) throws Exception;

    List<FoodItem> getByFats(String text) throws Exception;

    List<FoodItem> getByCarbohydrates(String text) throws Exception;

    List<FoodItem> getByCalcium(String text) throws Exception;

    List<FoodItem> getByIron(String text) throws Exception;

    List<FoodItem> getByVitaminA(String text) throws Exception;

    List<FoodItem> getByVitaminB1(String text) throws Exception;

    List<FoodItem> getByVitaminB2(String text) throws Exception;

    List<FoodItem> getByNiacin(String text) throws Exception;

    List<FoodItem> getByVitaminC(String text) throws Exception;

    List<FoodItem> getNullEnergyValueKJ() throws Exception;

    List<FoodItem> getNullEnergyValueCal() throws Exception;

    List<FoodItem> getNullProtein() throws Exception;

    List<FoodItem> getNullFats() throws Exception;

    List<FoodItem> getNullCarbohydrates() throws Exception;

    List<FoodItem> getNullCalcium() throws Exception;

    List<FoodItem> getNullIron() throws Exception;

    List<FoodItem> getNullVitaminA() throws Exception;

    List<FoodItem> getNullVitaminB1() throws Exception;

    List<FoodItem> getNullVitaminB2() throws Exception;

    List<FoodItem> getNullNiacin() throws Exception;

    List<FoodItem> getNullVitaminC() throws Exception;
}
