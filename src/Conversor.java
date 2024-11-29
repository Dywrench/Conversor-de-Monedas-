import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {

    private static final String API_URL = "https://v6.exchangerate-api.com/v6/bc427019f2689f65d12b678d/latest/USD";

    public static double obtenerTasaCambio(String monedaDestino) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            Gson gson = new Gson();
            ExchangeRateResponse rates = gson.fromJson(response.body(), ExchangeRateResponse.class);

            return rates.getConversionRates().getOrDefault(monedaDestino, 0.0);
        } else {
            throw new RuntimeException("Error al obtener la tasa de cambio. Código: " + response.statusCode());
        }
    }

    public static double convertir(double cantidad, double tasaCambio) {
        return cantidad * tasaCambio;
    }
}
