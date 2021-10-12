package lesson6;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.*;

public class WeatherApp {

    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String FORECAST = "forecasts";
    private static final String API_VERSION = "v1";
    private static final String FORECAST_TYPE = "daily";
    private static final String FORECAST_PERIOD = "5day";

    private static final String SAINT_PETERSBURG_KEY = "222191";
    private static final String API_KEY = "r5oFelX6xKp2mOx8EZUJUZaxyj307Qb4";

    public static void main(String[] args) throws IOException {

        OkHttpClient client = new OkHttpClient();


        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host(BASE_HOST)
                .addPathSegment(FORECAST)
                .addPathSegment(API_VERSION)
                .addPathSegment(FORECAST_TYPE)
                .addPathSegment(FORECAST_PERIOD)
                .addPathSegment(SAINT_PETERSBURG_KEY)
                .addQueryParameter("apikey", API_KEY)
                .addQueryParameter("language", "en-us")
                .addQueryParameter("metric", "true")
                .build();

        System.out.println(url.toString());

        Request requesthttp = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(url)
                .build();

        String jsonResponse = client.newCall(requesthttp).execute().body().string();
        String[] line = jsonResponse.split("/\\}\\s*\\{/g");

        FileWriter file = new FileWriter("weatherInfo.json");
        for (int i = 0; i < line.length; i++) {
            file.write(line[i]);
            file.write("\n");
        }
        file.close();

        System.out.println(jsonResponse);
    }
}

