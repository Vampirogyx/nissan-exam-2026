package feature.vehicle.domain;

import java.util.ArrayList;

public class GetVehiclesUseCase {

    private VehicleRepository vehicleRepository;

    public GetVehiclesUseCase(VehicleRepository songRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public ArrayList<Vehicle> execute() {
        return vehicleRepository.getVehicles();
    }
}
