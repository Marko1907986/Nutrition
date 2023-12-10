package table;

import domain.FoodItemAnnex;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marko Milosevic
 */
public class TableFoodItemAnnex extends AbstractTableModel {

    private final List<FoodItemAnnex> foodItems;
    private final String[] attributes
            = new String[]{"Id", "Naziv", "Ravna kasicica", "Puna kasicica", "Ravna kasika", "Puna kasika",
                "Solja od 2,5 dl"};

    public TableFoodItemAnnex(List<FoodItemAnnex> foodItems) {
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
        FoodItemAnnex foodItem = foodItems.get(rowIndex);
        return switch (columnIndex) {
            case 0 ->
                foodItem.getId();
            case 1 ->
                foodItem.getName();
            case 2 ->
                foodItem.getFlatSmallSpoon();
            case 3 ->
                foodItem.getFullSmallSpoon();
            case 4 ->
                foodItem.getFlatSpoon();
            case 5 ->
                foodItem.getFullSpoon();
            case 6 ->
                foodItem.getCup();
            default ->
                "n/a";
        };
    }

    @Override
    public String getColumnName(int column) {
        return attributes[column];
    }

}
