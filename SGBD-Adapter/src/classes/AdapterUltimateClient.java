package classes;
public class AdapterUltimateClient extends FreeClient {
  private UltimateClient ultimateClient;

  public AdapterUltimateClient(UltimateClient client) {
    this.ultimateClient = client;
  }

  @Override
  public void baseConnection() {
    this.ultimateClient.connectBD();
  };
}
