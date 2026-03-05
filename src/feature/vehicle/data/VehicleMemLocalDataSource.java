package feature.vehicle.data;

import feature.vehicle.domain.Vehicle;

import java.util.ArrayList;
import java.util.Objects;

public class VehicleMemLocalDataSource {

    private static VehicleMemLocalDataSource instance = null;

    private ArrayList<Vehicle> storage = new ArrayList<>();

    public ArrayList<Vehicle> findAll() {
        return storage;
    }

    public void save(Vehicle vehicle) {
        storage.add(vehicle);
    }

    public void delete(String Id) {
        storage.removeIf(vehicle -> Objects.equals(vehicle.getId(), Id));
    }
}
