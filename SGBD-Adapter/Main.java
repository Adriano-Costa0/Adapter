import classes.AdapterBasicClient;
import classes.AdapterUltimateClient;
import classes.BasicClient;
import classes.UltimateClient;

public class Main {

  public static void main(String[] args) {
    BasicClient basicClient = new BasicClient();
    UltimateClient ultimateClient = new UltimateClient();

    AdapterBasicClient adapterBasic = new AdapterBasicClient(basicClient);
    AdapterUltimateClient adapterUltimateClient = new AdapterUltimateClient(ultimateClient);

    adapterBasic.baseConnection();
    adapterUltimateClient.baseConnection();

  }
}