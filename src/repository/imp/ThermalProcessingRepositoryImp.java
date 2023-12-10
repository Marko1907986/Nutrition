package repository.imp;

import domain.ThermalProcessing;
import java.util.*;
import java.sql.*;
import connection.MyConnection;
import repository.ThermalProcessingRepository;

/**
 *
 * @author Marko Milosevic
 */
public class ThermalProcessingRepositoryImp implements ThermalProcessingRepository {

    @Override
    public List<ThermalProcessing> getAll() throws Exception {
        List<ThermalProcessing> thermalProcessings = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM thermal_processing";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            Long id = resultSet.getLong("id");
            String name = resultSet.getString("name");
            String hermeticLid = resultSet.getString("device_with_hermetic_lid");
            String ordinaryCover = resultSet.getString("device_with_an_ordinary_cover");
            ThermalProcessing thermalProcessing = new ThermalProcessing(id, name, hermeticLid, ordinaryCover);
            thermalProcessings.add(thermalProcessing);
        }
        resultSet.close();
        statement.close();
        return thermalProcessings;
    }

}
