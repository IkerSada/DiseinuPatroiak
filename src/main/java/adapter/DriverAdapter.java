package adapter;

import javax.swing.table.AbstractTableModel;
import java.text.SimpleDateFormat;
import java.util.List;

import domain.Driver;
import domain.Ride;

public class DriverAdapter extends AbstractTableModel {
    private Driver driver;
    private String[] columnNames = {"From", "To", "Date", "Places", "Price"};
    public DriverAdapter(Driver driver) {
        this.driver = driver;
    }
    @Override
    public int getRowCount() {
        if (driver == null || driver.getRides() == null) {
            return 0;
        }
        return driver.getRides().size();
    }
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (driver == null || driver.getRides() == null || rowIndex >= driver.getRides().size()) {
            return null;
        }
        
        List<Ride> rides = driver.getRides();
        Ride ride = rides.get(rowIndex);
        
        switch (columnIndex) {
            case 0: 
                return ride.getFrom();
            case 1: 
                return ride.getTo();
            case 2: 
                return ride.getDate();
            case 3: 
                return ride.getnPlaces();
            case 4: 
                return String.format("%.1f", ride.getPrice()); 
            default: 
                return null;
        }
    }
}