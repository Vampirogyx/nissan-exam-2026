package feature.vehicle.presentation;

import feature.vehicle.data.VehicleDataRepository;
import feature.vehicle.data.VehicleMemLocalDataSource;
import feature.vehicle.domain.DeleteVehiclesUseCase;
import feature.vehicle.domain.GetVehiclesUseCase;
import feature.vehicle.domain.SaveVehiclesUseCase;
import feature.vehicle.domain.Vehicle;

import java.util.ArrayList;

public class VehicleView {
    public static void printVehicles() {
        GetVehiclesUseCase getVehiclesUseCase = new GetVehiclesUseCase(new VehicleDataRepository(VehicleMemLocalDataSource.newInstance()));

        ArrayList<Vehicle> vehicles= getVehiclesUseCase.execute();

        System.out.println(vehicles);
    }

    public static void saveVehicles() {
        Vehicle newVehicle = new Vehicle("1", "1234 ASD","Azul","Cascai","Hibrido");
        SaveVehiclesUseCase saveVehiclesUseCase = new SaveVehiclesUseCase(
                new VehicleDataRepository(VehicleMemLocalDataSource.newInstance()));

        saveVehiclesUseCase.execute(newVehicle);
    }

    public static void deleteVehicle(String Id) {
        DeleteVehiclesUseCase deleteVehiclesUseCase = new DeleteVehiclesUseCase(
                new VehicleDataRepository(VehicleMemLocalDataSource.newInstance));
        deleteVehiclesUseCase.execute(Id);
    }
}
