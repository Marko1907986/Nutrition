package repository.imp;

import domain.SideDish;
import java.math.BigDecimal;
import java.util.*;
import java.sql.*;
import javax.swing.JTextField;
import connection.MyConnection;
import repository.SideDishRepository;

/**
 *
 * @author Marko Milosevic
 */
public class SideDishRepositoryImp implements SideDishRepository {
    
    @Override
    public List<SideDish> getAll() throws Exception {
        List<SideDish> sideDishes = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String querry = "SELECT * FROM side_dish";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(querry);
        while (resultSet.next()) {
            Long id = resultSet.getLong("id");
            String name = resultSet.getString("name");
            String mass = resultSet.getString("mass_in_grams");
            String enValue = resultSet.getString("energy_value_in_kJ(Cal)");
            BigDecimal protein = resultSet.getBigDecimal("protein_in_grams");
            BigDecimal fats = resultSet.getBigDecimal("fats_in_grams");
            BigDecimal carbohydrates = resultSet.getBigDecimal("carbohydrates_in_grams");
            BigDecimal calcium = resultSet.getBigDecimal("calcium_in_milligrams");
            BigDecimal iron = resultSet.getBigDecimal("iron_in_milligrams");
            BigDecimal vitaminA = resultSet.getBigDecimal("vitaminA_in_milligrams");
            BigDecimal vitaminB1 = resultSet.getBigDecimal("vitaminB1_in_milligrams");
            BigDecimal vitaminB2 = resultSet.getBigDecimal("vitaminB2_in_milligrams");
            BigDecimal niacin = resultSet.getBigDecimal("niacin_in_milligrams");
            BigDecimal vitaminC = resultSet.getBigDecimal("vitaminC_in_milligrams");
            SideDish sideDish
                    = new SideDish(id, name, mass, enValue, protein, fats, carbohydrates, calcium, iron, vitaminA,
                            vitaminB1, vitaminB2, niacin, vitaminC);
            sideDishes.add(sideDish);
        }
        resultSet.close();
        statement.close();
        return sideDishes;
    }
    
    @Override
    public void checkValue(JTextField text, String sideDish) {
        if (sideDish.equals("null")) {
            text.setText(0 + "");
        } else {
            text.setText(sideDish);
        }
    }
    
}
