package table;

import domain.SideDish;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marko Milosevic
 */
public class TableSideDish extends AbstractTableModel {

    private final List<SideDish> sideDishes;
    private final String[] attributes = new String[]{"Id", "Naziv namirnice", "Masa u gramima"};

    public TableSideDish(List<SideDish> sideDishes) {
        this.sideDishes = sideDishes;
    }

    @Override
    public int getRowCount() {
        return sideDishes.size();
    }

    @Override
    public int getColumnCount() {
        return attributes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        SideDish sideDish = sideDishes.get(rowIndex);
        return switch (columnIndex) {
            case 0 ->
                sideDish.getId();
            case 1 ->
                sideDish.getName();
            case 2 ->
                sideDish.getMass();
            default ->
                "n/a";
        };
    }

    @Override
    public String getColumnName(int column) {
        return attributes[column];
    }

    public SideDish getSideDish(int index) {
        return sideDishes.get(index);
    }

}
