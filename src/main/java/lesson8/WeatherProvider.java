package lesson8;


import lesson8.entity.WeatherData;
import lesson8.enums.Periods;


import java.io.IOException;

public interface WeatherProvider {

    WeatherData getWeather(Periods periods) throws IOException;

    WeatherData getAllFromDb() throws IOException;
}
