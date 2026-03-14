import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class LocationFinder {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://ip-api.com/line/?fields=country,regionName,city,query");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

            String country = br.readLine();
            String region = br.readLine();
            String city = br.readLine();
            String ip = br.readLine();

            System.out.println("IP Address: " + ip);
            System.out.println("Country: " + country);
            System.out.println("State: " + region);
            System.out.println("City: " + city);

        } catch (Exception e) {
            System.out.println("Error fetching location");
        }
    }
}