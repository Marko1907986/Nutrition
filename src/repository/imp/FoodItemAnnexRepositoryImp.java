package repository.imp;

import domain.FoodItemAnnex;
import java.math.BigDecimal;
import java.util.*;
import java.sql.*;
import connection.MyConnection;
import repository.FoodItemAnnexRepository;

/**
 *
 * @author Marko Milosevic
 */
public class FoodItemAnnexRepositoryImp implements FoodItemAnnexRepository {

    @Override
    public List<FoodItemAnnex> getAll() throws Exception {
        List<FoodItemAnnex> foodItems = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM food_item_annex";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            Long id = resultSet.getLong("id");
            String name = resultSet.getString("name");
            BigDecimal flatSmallSpoonContainsGrams = resultSet.getBigDecimal("flatSmallSpoonContainsGrams");
            BigDecimal fullSmallSpoonContainsGrams = resultSet.getBigDecimal("fullSmallSpoonContainsGrams");
            BigDecimal flatSpoonContainsGrams = resultSet.getBigDecimal("flatSpoonContainsGrams");
            BigDecimal fullSpoonContainsGrams = resultSet.getBigDecimal("fullSpoonContainsGrams");
            String cup = resultSet.getString("cup_2,5_dlContainsGrams");
            FoodItemAnnex foodItem
                    = new FoodItemAnnex(id, name, flatSmallSpoonContainsGrams, fullSmallSpoonContainsGrams,
                            flatSpoonContainsGrams, fullSpoonContainsGrams, cup);
            foodItems.add(foodItem);
        }
        resultSet.close();
        statement.close();
        return foodItems;
    }

}
