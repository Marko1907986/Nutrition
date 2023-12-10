package table;

import domain.Recipe;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marko Milosevic
 */
public class TableRecipe extends AbstractTableModel {

    private final List<Recipe> recipes;
    private final String[] attributes = new String[]{"Broj recepture", "Naziv recepture"};

    public TableRecipe(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    @Override
    public int getRowCount() {
        return recipes.size();
    }

    @Override
    public int getColumnCount() {
        return attributes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Recipe recipe = recipes.get(rowIndex);
        return switch (columnIndex) {
            case 0 ->
                recipe.getId();
            case 1 ->
                recipe.getName();
            default ->
                "n/a";
        };
    }

    @Override
    public String getColumnName(int column) {
        return attributes[column];
    }

    public Recipe getRecipe(int index) {
        return recipes.get(index);
    }

}
