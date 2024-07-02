package classes;
public class AdapterBasicClient extends FreeClient {
  private BasicClient basicClient;

  public AdapterBasicClient(BasicClient client) {
    this.basicClient = client;
  }

  @Override
  public void baseConnection() {
    this.basicClient.connection();
  };
}
