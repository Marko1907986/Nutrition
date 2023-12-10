package table;

import domain.ThermalProcessing;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marko Milosevic
 */
public class TableThermalProcessing extends AbstractTableModel {

    private final List<ThermalProcessing> thermalProcessings;
    private final String[] attributes
            = new String[]{"Id", "Naziv", "Uredjaj sa hermetickim poklopcem", "Uredjaj sa obicnim poklopcem"};

    public TableThermalProcessing(List<ThermalProcessing> thermalProcessings) {
        this.thermalProcessings = thermalProcessings;
    }

    @Override
    public int getRowCount() {
        return thermalProcessings.size();
    }

    @Override
    public int getColumnCount() {
        return attributes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ThermalProcessing thermalProcessing = thermalProcessings.get(rowIndex);
        return switch (columnIndex) {
            case 0 ->
                thermalProcessing.getId();
            case 1 ->
                thermalProcessing.getName();
            case 2 ->
                thermalProcessing.getHermeticLid();
            case 3 ->
                thermalProcessing.getOrdinaryCover();
            default ->
                "n/a";
        };
    }

    @Override
    public String getColumnName(int column) {
        return attributes[column];
    }

}
