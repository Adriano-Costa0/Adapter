import classes.OldVehicleStorage;
import classes.Vehicle;
import classes.VehicleStorageAdapter;

public class Main {
  public static void main(String[] args) {
    Vehicle rangerRaptor = new Vehicle();
    
    rangerRaptor.setId("raptor-4wd-at");
    rangerRaptor.setModel("Ranger Raptor");
    rangerRaptor.setYear(2023);

    OldVehicleStorage oldStorage = new OldVehicleStorage();
    oldStorage.storeVehicleData(rangerRaptor.getModel());

    VehicleStorageAdapter newStorageAdapter = new VehicleStorageAdapter(oldStorage);

    newStorageAdapter.saveVehicleData(rangerRaptor);

  }
}