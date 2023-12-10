package table;

import domain.FoodItem;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marko Milosevic
 */
public class TableFoodItem extends AbstractTableModel {

    private final List<FoodItem> foodItems;
    private final String[] attributes
            = new String[]{"Id", "Naziv", "Energetska vred. kJ", "Energetska vred. Cal",
                "Belancevine", "Masti", "Ugljeni hidrati", "Kalcijum", "Gvozdje", "Vitamin A", "Vitamin B1",
                "Vitamin B2", "Niacin", "Vitamin C"};

    public TableFoodItem(List<FoodItem> foodItems) {
        this.foodItems = foodItems;
    }

    @Override
    public int getRowCount() {
        return foodItems.size();
    }

    @Override
    public int getColumnCount() {
        return attributes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        FoodItem foodItem = foodItems.get(rowIndex);
        return switch (columnIndex) {
            case 0 ->
                foodItem.getId();
            case 1 ->
                foodItem.getName();
            case 2 ->
                foodItem.getEnergyValueKJ();
            case 3 ->
                foodItem.getEnergyValueCal();
            case 4 ->
                foodItem.getProtein();
            case 5 ->
                foodItem.getFats();
            case 6 ->
                foodItem.getCarbohydrates();
            case 7 ->
                foodItem.getCalcium();
            case 8 ->
                foodItem.getIron();
            case 9 ->
                foodItem.getVitaminA();
            case 10 ->
                foodItem.getVitaminB1();
            case 11 ->
                foodItem.getVitaminB2();
            case 12 ->
                foodItem.getNiacin();
            case 13 ->
                foodItem.getVitaminC();
            default ->
                "n/a";
        };
    }

    @Override
    public String getColumnName(int column) {
        return attributes[column];
    }
}
