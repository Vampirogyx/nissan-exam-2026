package feature.vehicle.domain;

public class SaveVehiclesUseCase {

    VehicleRepository vehicleRepository;

        public SaveVehiclesUseCase(VehicleRepository vehicleRepository) {
            this.vehicleRepository = vehicleRepository;
        }

        public void execute(Vehicle vehicle) {
            vehicleRepository.saveVehicle(vehicle);
        }


}
