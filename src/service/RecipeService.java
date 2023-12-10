package service;

import domain.Recipe;
import java.util.List;
import javax.swing.JTextArea;

/**
 *
 * @author Marko Milosevic
 */
public interface RecipeService {

    List<Recipe> getBeverages() throws Exception;

    List<Recipe> getSoups() throws Exception;

    List<Recipe> getSauces() throws Exception;

    List<Recipe> getEggDishes() throws Exception;

    List<Recipe> getFishDishes() throws Exception;

    List<Recipe> getMeatDishesFromTheGrill() throws Exception;
    
    List<Recipe> getMeatDishesAndMeatProducts() throws Exception;
    
    List<Recipe> findMeatDishesAndMeatProductsByQuery(String model) throws Exception;
    
    List<Recipe> getVegetableDishes() throws Exception;
    
    List<Recipe> findVegetableDishesByQuery(String model) throws Exception;
    
    List<Recipe> getComplexDishes() throws Exception;
    
    List<Recipe> findComplexDishesByQuery(String model) throws Exception;
    
    List<Recipe> getSalads() throws Exception;
    
    List<Recipe> getSweets() throws Exception;
    
    List<Recipe> findSweetsByQuery(String model) throws Exception;
    
    List<Recipe> getReadyMeals() throws Exception;

    public void readFile(JTextArea text, String name);
}
