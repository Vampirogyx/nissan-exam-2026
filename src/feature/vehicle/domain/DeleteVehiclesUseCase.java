package feature.vehicle.domain;

public class DeleteVehiclesUseCase {
    private VehicleRepository vehicleRepository;

    public DeleteVehiclesUseCase(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public void execute(String Id) {
        vehicleRepository.deleteVehicle(Id);
    }
}
