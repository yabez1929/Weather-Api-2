import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import org.json.JSONObject;

public class WeatherAppJSON {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter location (city/country): ");
            String location = scanner.nextLine().replace(" ", "+");

            String url = "https://wttr.in/" + location + "?format=j1";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("User-Agent", "Mozilla/5.0")
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JSONObject json = new JSONObject(response.body());
            JSONObject current = json.getJSONArray("current_condition").getJSONObject(0);

            String temperature = current.getString("temp_C");
            String weatherCondition = current.getJSONArray("weatherDesc").getJSONObject(0).getString("value");
            String humidity = current.getString("humidity");

            System.out.println("\n📍 Weather in " + location.replace("+", " "));
            System.out.println("-------------------------");
            System.out.println("🌡️ Temperature : " + temperature + "°C");
            System.out.println("☁️ Condition   : " + weatherCondition);
            System.out.println("💧 Humidity    : " + humidity + "%");

        } catch (Exception e) {
            System.out.println("⚠️ Error fetching or parsing weather data:");
            e.printStackTrace();
        }
    }
}










