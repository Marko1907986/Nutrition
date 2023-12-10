package service.imp;

import domain.FoodItemAnnex;
import java.util.List;
import repository.imp.FoodItemAnnexRepositoryImp;
import service.FoodItemAnnexService;
import repository.FoodItemAnnexRepository;

/**
 *
 * @author Marko Milosevic
 */
public class FoodItemAnnexServiceImp implements FoodItemAnnexService {

    private final FoodItemAnnexRepository foodItemAnnexRepository;

    public FoodItemAnnexServiceImp() {
        foodItemAnnexRepository = new FoodItemAnnexRepositoryImp();
    }

    @Override
    public List<FoodItemAnnex> getAll() throws Exception {
        return foodItemAnnexRepository.getAll();
    }

}
