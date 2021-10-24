package lesson7.project;

import com.fasterxml.jackson.annotation.*;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName(value = "weather")
public class WeatherResponse {
    private String localObservationDateTime;
    private String epochTime;
    private String weatherText;
    private String weatherIcon;
    private String hasPrecipitation;
    private String precipitationType;
    private String isDayTime;

    public String getLocalObservationDateTime() {
        return localObservationDateTime;
    }
    @JsonSetter("LocalObservationDateTime")
    public void setLocalObservationDateTime(String localObservationDateTime) {
        this.localObservationDateTime = localObservationDateTime;
    }

    public String getEpochTime() {
        return epochTime;
    }
    @JsonSetter("EpochTime")
    public void setEpochTime(String epochTime) {
        this.epochTime = epochTime;
    }

    public String getWeatherText() {
        return weatherText;
    }
    @JsonSetter("WeatherText")
    public void setWeatherText(String weatherText) {
        this.weatherText = weatherText;
    }

    public String getWeatherIcon() {
        return weatherIcon;
    }
    @JsonSetter("WeatherIcon")
    public void setWeatherIcon(String weatherIcon) {
        this.weatherIcon = weatherIcon;
    }

    public String getHasPrecipitation() {
        return hasPrecipitation;
    }
    @JsonSetter("HasPrecipitation")
    public void setHasPrecipitation(String hasPrecipitation) {
        this.hasPrecipitation = hasPrecipitation;
    }

    public String getPrecipitationType() {
        return precipitationType;
    }
    @JsonSetter("PrecipitationType")
    public void setPrecipitationType(String precipitationType) {
        this.precipitationType = precipitationType;
    }

    public String getIsDayTime() {
        return isDayTime;
    }
    @JsonSetter("IsDayTime")
    public void setIsDayTime(String isDayTime) {
        this.isDayTime = isDayTime;
    }

    @Override
    public String toString() {
        return "WeatherResponse{" +
                "localObservationDateTime='" + localObservationDateTime + '\'' +
                ", epochTime='" + epochTime + '\'' +
                ", weatherText='" + weatherText + '\'' +
                ", weatherIcon='" + weatherIcon + '\'' +
                ", hasPrecipitation='" + hasPrecipitation + '\'' +
                ", precipitationType='" + precipitationType + '\'' +
                ", isDayTime='" + isDayTime + '\'' +
                '}';
    }
// Getter Methods

}



