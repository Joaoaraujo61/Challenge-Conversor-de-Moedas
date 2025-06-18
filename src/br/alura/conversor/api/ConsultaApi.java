package br.alura.conversor.api;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi {
   /* private String moedaBase;
    private String moedaAlvo;

    public String getMoedaBase(){
        return moedaBase;
    }
    public String getMoedaAlvo(){
        return moedaAlvo;
    }

    public br.alura.conversor.api.ConsultaApi(String moedaBase, String moedaAlvo){
        this.moedaAlvo = moedaAlvo;
        this.moedaBase = moedaBase;
    }*/
    public double buscaCotacao(String moedaBase, String moedaAlvo){
        String apiKey = System.getenv("API_KEY_EXCHANGE");
        URI endereco =  URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + moedaBase);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();
            JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
            double coinRate = conversionRates.get(moedaAlvo).getAsDouble();

            return coinRate ;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
