package org.abrahamtech.session05.util;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Axios {
    public <T> T request(String url, Class<T> clazz) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        // Objeto que va a permitir realizar la petición
        HttpClient client = HttpClient.newHttpClient();

        // Objeto de la petición
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            // Realizar la petición
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Es el resultado de la petición (en formato JSON)
            String body = response.body();

            // Convertir el objeto JSON a un objeto de Java
            return mapper.readValue(body, clazz);
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
            throw new Exception();
        }
    }
}
