package br.com.alura.Challenge.ApiKeyPackge;

import br.com.alura.Challenge.ModeloDoJson.RecordJSON;
import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIJSON {

    private RecordJSON moedaJSON;

    public RecordJSON getJsonCoin() {
        return moedaJSON;
    }

  public void httpRequest(String moedaInicial,  String moedaRequisitada) throws IOException, InterruptedException {

        var chaveAPI = "36c546f67f72f1147a0fea0c";
        String url = "https://v6.exchangerate-api.com/v6/" + chaveAPI + "/pair/" + moedaInicial + "/" + moedaRequisitada;

      try {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();

            String json = response.body();
            moedaJSON = gson.fromJson(json, RecordJSON.class);

        } catch  (IllegalArgumentException e) {
          throw  new RuntimeException();}
}}