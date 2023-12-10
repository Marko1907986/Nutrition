package repository.imp;

import domain.FoodItem;
import java.math.BigDecimal;
import java.util.*;
import java.sql.*;
import connection.MyConnection;
import repository.FoodItemRepository;

/**
 *
 * @author Marko Milosevic
 */
public class FoodItemRepositoryImp implements FoodItemRepository {

    @Override
    public List<FoodItem> getAll() throws Exception {
        List<FoodItem> foodItems = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM composition_of_foodstuffs";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        addItem(rs, foodItems);
        rs.close();
        statement.close();
        return foodItems;
    }

    @Override
    public List<FoodItem> getByName(String text) throws Exception {
        List<FoodItem> foodItems = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM composition_of_foodstuffs WHERE name RLIKE '" + text + "'";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        addItem(rs, foodItems);
        rs.close();
        statement.close();
        return foodItems;
    }

    @Override
    public List<FoodItem> getByEnergyValueKJ(String text) throws Exception {
        List<FoodItem> foodItems = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM composition_of_foodstuffs WHERE energyValueKJ =" + text;
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        addItem(rs, foodItems);
        rs.close();
        statement.close();
        return foodItems;
    }

    @Override
    public List<FoodItem> getByEnergyValueCal(String text) throws Exception {
        List<FoodItem> foodItems = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM composition_of_foodstuffs WHERE energyValueCal =" + text;
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        addItem(rs, foodItems);
        rs.close();
        statement.close();
        return foodItems;
    }

    @Override
    public List<FoodItem> getByProtein(String text) throws Exception {
        List<FoodItem> foodItems = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM composition_of_foodstuffs WHERE protein =" + text;
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        addItem(rs, foodItems);
        rs.close();
        statement.close();
        return foodItems;
    }

    @Override
    public List<FoodItem> getByFats(String text) throws Exception {
        List<FoodItem> foodItems = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM composition_of_foodstuffs WHERE fats =" + text;
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        addItem(rs, foodItems);
        rs.close();
        statement.close();
        return foodItems;
    }

    @Override
    public List<FoodItem> getByCarbohydrates(String text) throws Exception {
        List<FoodItem> foodItems = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM composition_of_foodstuffs WHERE carbohydrates =" + text;
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        addItem(rs, foodItems);
        rs.close();
        statement.close();
        return foodItems;
    }

    @Override
    public List<FoodItem> getByCalcium(String text) throws Exception {
        List<FoodItem> foodItems = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM composition_of_foodstuffs WHERE calcium =" + text;
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        addItem(rs, foodItems);
        rs.close();
        statement.close();
        return foodItems;
    }

    @Override
    public List<FoodItem> getByIron(String text) throws Exception {
        List<FoodItem> foodItems = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM composition_of_foodstuffs WHERE iron =" + text;
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        addItem(rs, foodItems);
        rs.close();
        statement.close();
        return foodItems;
    }

    @Override
    public List<FoodItem> getByVitaminA(String text) throws Exception {
        List<FoodItem> foodItems = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM composition_of_foodstuffs WHERE vitaminA =" + text;
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        addItem(rs, foodItems);
        rs.close();
        statement.close();
        return foodItems;
    }

    @Override
    public List<FoodItem> getByVitaminB1(String text) throws Exception {
        List<FoodItem> foodItems = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM composition_of_foodstuffs WHERE vitaminB1 =" + text;
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        addItem(rs, foodItems);
        rs.close();
        statement.close();
        return foodItems;
    }

    @Override
    public List<FoodItem> getByVitaminB2(String text) throws Exception {
        List<FoodItem> foodItems = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM composition_of_foodstuffs WHERE vitaminB2 =" + text;
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        addItem(rs, foodItems);
        rs.close();
        statement.close();
        return foodItems;
    }

    @Override
    public List<FoodItem> getByNiacin(String text) throws Exception {
        List<FoodItem> foodItems = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM composition_of_foodstuffs WHERE niacin =" + text;
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        addItem(rs, foodItems);
        rs.close();
        statement.close();
        return foodItems;
    }

    @Override
    public List<FoodItem> getByVitaminC(String text) throws Exception {
        List<FoodItem> foodItems = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM composition_of_foodstuffs WHERE vitaminC =" + text;
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        addItem(rs, foodItems);
        rs.close();
        statement.close();
        return foodItems;
    }

    @Override
    public List<FoodItem> getNullEnergyValueKJ() throws Exception {
        List<FoodItem> foodItems = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM composition_of_foodstuffs WHERE energyValueKJ IS NULL";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        addItem(rs, foodItems);
        rs.close();
        statement.close();
        return foodItems;
    }

    @Override
    public List<FoodItem> getNullEnergyValueCal() throws Exception {
        List<FoodItem> foodItems = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM composition_of_foodstuffs WHERE energyValueCal IS NULL";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        addItem(rs, foodItems);
        rs.close();
        statement.close();
        return foodItems;
    }

    @Override
    public List<FoodItem> getNullProtein() throws Exception {
        List<FoodItem> foodItems = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM composition_of_foodstuffs WHERE protein IS NULL";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        addItem(rs, foodItems);
        rs.close();
        statement.close();
        return foodItems;
    }

    @Override
    public List<FoodItem> getNullFats() throws Exception {
        List<FoodItem> foodItems = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM composition_of_foodstuffs WHERE fats IS NULL";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        addItem(rs, foodItems);
        rs.close();
        statement.close();
        return foodItems;
    }

    @Override
    public List<FoodItem> getNullCarbohydrates() throws Exception {
        List<FoodItem> foodItems = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM composition_of_foodstuffs WHERE carbohydrates IS NULL";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        addItem(rs, foodItems);
        rs.close();
        statement.close();
        return foodItems;
    }

    @Override
    public List<FoodItem> getNullCalcium() throws Exception {
        List<FoodItem> foodItems = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM composition_of_foodstuffs WHERE calcium IS NULL";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        addItem(rs, foodItems);
        rs.close();
        statement.close();
        return foodItems;
    }

    @Override
    public List<FoodItem> getNullIron() throws Exception {
        List<FoodItem> foodItems = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM composition_of_foodstuffs WHERE iron IS NULL";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        addItem(rs, foodItems);
        rs.close();
        statement.close();
        return foodItems;
    }

    @Override
    public List<FoodItem> getNullVitaminA() throws Exception {
        List<FoodItem> foodItems = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM composition_of_foodstuffs WHERE vitaminA IS NULL";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        addItem(rs, foodItems);
        rs.close();
        statement.close();
        return foodItems;
    }

    @Override
    public List<FoodItem> getNullVitaminB1() throws Exception {
        List<FoodItem> foodItems = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM composition_of_foodstuffs WHERE vitaminB1 IS NULL";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        addItem(rs, foodItems);
        rs.close();
        statement.close();
        return foodItems;
    }

    @Override
    public List<FoodItem> getNullVitaminB2() throws Exception {
        List<FoodItem> foodItems = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM composition_of_foodstuffs WHERE vitaminB2 IS NULL";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        addItem(rs, foodItems);
        rs.close();
        statement.close();
        return foodItems;
    }

    @Override
    public List<FoodItem> getNullNiacin() throws Exception {
        List<FoodItem> foodItems = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM composition_of_foodstuffs WHERE niacin IS NULL";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        addItem(rs, foodItems);
        rs.close();
        statement.close();
        return foodItems;
    }

    @Override
    public List<FoodItem> getNullVitaminC() throws Exception {
        List<FoodItem> foodItems = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM composition_of_foodstuffs WHERE vitaminC IS NULL";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        addItem(rs, foodItems);
        rs.close();
        statement.close();
        return foodItems;
    }

    private void addItem(ResultSet rs, List<FoodItem> foodItems) {
        try {
            while (rs.next()) {
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                BigDecimal energyValueKJ = rs.getBigDecimal("energyValueKJ");
                BigDecimal energyValueCal = rs.getBigDecimal("energyValueCal");
                BigDecimal protein = rs.getBigDecimal("protein");
                BigDecimal fats = rs.getBigDecimal("fats");
                BigDecimal carbohydrates = rs.getBigDecimal("carbohydrates");
                BigDecimal calcium = rs.getBigDecimal("calcium");
                BigDecimal iron = rs.getBigDecimal("iron");
                BigDecimal vitaminA = rs.getBigDecimal("vitaminA");
                BigDecimal vitaminB1 = rs.getBigDecimal("vitaminB1");
                BigDecimal vitaminB2 = rs.getBigDecimal("vitaminB2");
                BigDecimal niacin = rs.getBigDecimal("niacin");
                BigDecimal vitaminC = rs.getBigDecimal("vitaminC");
                FoodItem foodItem
                        = new FoodItem(id, name, energyValueKJ, energyValueCal, protein, fats, carbohydrates, calcium,
                                iron, vitaminA, vitaminB1, vitaminB2, niacin, vitaminC);
                foodItems.add(foodItem);
            }
        } catch (SQLException ex) {
        }
    }

}
