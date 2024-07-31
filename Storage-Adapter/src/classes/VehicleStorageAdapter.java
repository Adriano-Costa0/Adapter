package classes;

public class VehicleStorageAdapter implements IVehicleStorage {

  private OldVehicleStorage oldObject;

  public VehicleStorageAdapter(OldVehicleStorage oldStorage) {
    this.oldObject = oldStorage;
  }

  @Override
  public void saveVehicleData(Vehicle vehicle) {

    int year = vehicle.getYear();
    String model = vehicle.getModel();
    String id = vehicle.getId();
    this.oldObject.storeVehicleData("{\nProduct: " + id + "\nModel: " + model + "\nYear: " + year + "\n}");
  }

}
