package feature.vehicle.domain;

import java.util.ArrayList;

public interface VehicleRepository {
    public void saveVehicle(Vehicle vehicle);
    public ArrayList<Vehicle> getVehicles();

}
