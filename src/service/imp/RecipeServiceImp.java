package service.imp;

import domain.Recipe;
import java.util.List;
import javax.swing.JTextArea;
import repository.imp.RecipeRepositoryImp;
import service.RecipeService;
import repository.RecipeRepository;

/**
 *
 * @author Marko Milosevic
 */
public class RecipeServiceImp implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImp() {
        recipeRepository = new RecipeRepositoryImp();
    }

    @Override
    public List<Recipe> getBeverages() throws Exception {
        return recipeRepository.getBeverages();
    }

    @Override
    public List<Recipe> getSoups() throws Exception {
        return recipeRepository.getSoups();
    }

    @Override
    public List<Recipe> getSauces() throws Exception {
        return recipeRepository.getSauces();
    }

    @Override
    public List<Recipe> getEggDishes() throws Exception {
        return recipeRepository.getEggDishes();
    }

    @Override
    public List<Recipe> getFishDishes() throws Exception {
        return recipeRepository.getFishDishes();
    }

    @Override
    public List<Recipe> getMeatDishesFromTheGrill() throws Exception {
        return recipeRepository.getMeatDishesFromTheGrill();
    }

    @Override
    public List<Recipe> getMeatDishesAndMeatProducts() throws Exception {
        return recipeRepository.getMeatDishesAndMeatProducts();
    }

    @Override
    public List<Recipe> findMeatDishesAndMeatProductsByQuery(String model) throws Exception {
        return recipeRepository.findMeatDishesAndMeatProductsByQuery(model);
    }

    @Override
    public List<Recipe> getVegetableDishes() throws Exception {
        return recipeRepository.getVegetableDishes();
    }

    @Override
    public List<Recipe> findVegetableDishesByQuery(String model) throws Exception {
        return recipeRepository.findVegetableDishesByQuery(model);
    }

    @Override
    public List<Recipe> getComplexDishes() throws Exception {
        return recipeRepository.getComplexDishes();
    }

    @Override
    public List<Recipe> findComplexDishesByQuery(String model) throws Exception {
        return recipeRepository.findComplexDishesByQuery(model);
    }

    @Override
    public List<Recipe> getSalads() throws Exception {
        return recipeRepository.getSalads();
    }

    @Override
    public List<Recipe> getSweets() throws Exception {
        return recipeRepository.getSweets();
    }

    @Override
    public List<Recipe> findSweetsByQuery(String model) throws Exception {
        return recipeRepository.findSweetsByQuery(model);
    }

    @Override
    public List<Recipe> getReadyMeals() throws Exception {
        return recipeRepository.getReadyMeals();
    }

    @Override
    public void readFile(JTextArea text, String name) {
        recipeRepository.readFile(text, name);
    }

}
