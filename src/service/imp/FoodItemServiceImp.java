package service.imp;

import domain.FoodItem;
import java.util.List;
import repository.imp.FoodItemRepositoryImp;
import service.FoodItemService;
import repository.FoodItemRepository;

/**
 *
 * @author Marko Milosevic
 */
public class FoodItemServiceImp implements FoodItemService {

    private final FoodItemRepository foodItemRepository;

    public FoodItemServiceImp() {
        foodItemRepository = new FoodItemRepositoryImp();
    }

    @Override
    public List<FoodItem> getAll() throws Exception {
        return foodItemRepository.getAll();
    }

    @Override
    public List<FoodItem> getByName(String text) throws Exception {
        return foodItemRepository.getByName(text);
    }

    @Override
    public List<FoodItem> getByEnergyValueKJ(String text) throws Exception {
        return foodItemRepository.getByEnergyValueKJ(text);
    }

    @Override
    public List<FoodItem> getByEnergyValueCal(String text) throws Exception {
        return foodItemRepository.getByEnergyValueCal(text);
    }

    @Override
    public List<FoodItem> getByProtein(String text) throws Exception {
        return foodItemRepository.getByProtein(text);
    }

    @Override
    public List<FoodItem> getByFats(String text) throws Exception {
        return foodItemRepository.getByFats(text);
    }

    @Override
    public List<FoodItem> getByCarbohydrates(String text) throws Exception {
        return foodItemRepository.getByCarbohydrates(text);
    }

    @Override
    public List<FoodItem> getByCalcium(String text) throws Exception {
        return foodItemRepository.getByCalcium(text);
    }

    @Override
    public List<FoodItem> getByIron(String text) throws Exception {
        return foodItemRepository.getByIron(text);
    }

    @Override
    public List<FoodItem> getByVitaminA(String text) throws Exception {
        return foodItemRepository.getByVitaminA(text);
    }

    @Override
    public List<FoodItem> getByVitaminB1(String text) throws Exception {
        return foodItemRepository.getByVitaminB1(text);
    }

    @Override
    public List<FoodItem> getByVitaminB2(String text) throws Exception {
        return foodItemRepository.getByVitaminB2(text);
    }

    @Override
    public List<FoodItem> getByNiacin(String text) throws Exception {
        return foodItemRepository.getByNiacin(text);
    }

    @Override
    public List<FoodItem> getByVitaminC(String text) throws Exception {
        return foodItemRepository.getByVitaminC(text);
    }

    @Override
    public List<FoodItem> getNullEnergyValueKJ() throws Exception {
        return foodItemRepository.getNullEnergyValueKJ();
    }

    @Override
    public List<FoodItem> getNullEnergyValueCal() throws Exception {
        return foodItemRepository.getNullEnergyValueCal();
    }

    @Override
    public List<FoodItem> getNullProtein() throws Exception {
        return foodItemRepository.getNullProtein();
    }

    @Override
    public List<FoodItem> getNullFats() throws Exception {
        return foodItemRepository.getNullFats();
    }

    @Override
    public List<FoodItem> getNullCarbohydrates() throws Exception {
        return foodItemRepository.getNullCarbohydrates();
    }

    @Override
    public List<FoodItem> getNullCalcium() throws Exception {
        return foodItemRepository.getNullCalcium();
    }

    @Override
    public List<FoodItem> getNullIron() throws Exception {
        return foodItemRepository.getNullIron();
    }

    @Override
    public List<FoodItem> getNullVitaminA() throws Exception {
        return foodItemRepository.getNullVitaminA();
    }

    @Override
    public List<FoodItem> getNullVitaminB1() throws Exception {
        return foodItemRepository.getNullVitaminB1();
    }

    @Override
    public List<FoodItem> getNullVitaminB2() throws Exception {
        return foodItemRepository.getNullVitaminB2();
    }

    @Override
    public List<FoodItem> getNullNiacin() throws Exception {
        return foodItemRepository.getNullNiacin();
    }

    @Override
    public List<FoodItem> getNullVitaminC() throws Exception {
        return foodItemRepository.getNullVitaminC();
    }

}
