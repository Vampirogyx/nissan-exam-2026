package feature.vehicle.data;

import feature.vehicle.domain.Vehicle;
import feature.vehicle.domain.VehicleRepository;

import java.util.ArrayList;

public class VehicleDataRepository {

    private VehicleMemLocalDataSource vehicleMemLocalDataSource;

    public VehicleDataRepository(VehicleMemLocalDataSource vehicleMemLocalDataSource) {
        this.vehicleMemLocalDataSource = vehicleMemLocalDataSource;
    }

    @Override
    public ArrayList<Vehicle> getVehicles() {
        return vehicleMemLocalDataSource.findAll();
    }

    @Override
    public void saveVehicle(Vehicle vehicle) {
        vehicleMemLocalDataSource.save(vehicle);
    }

    @Override
    public void deleteVehicle(String vehicleId) {
        vehicleMemLocalDataSource.delete(vehicleId);
    }
}
