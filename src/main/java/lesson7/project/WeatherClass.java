package lesson7.project;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName(value = "weather")
public class WeatherClass {
    private String LocalObservationDateTime;
    private float EpochTime;
    private String WeatherText;
    private float WeatherIcon;
    private boolean HasPrecipitation;
    private String PrecipitationType = null;
    private boolean IsDayTime;
    Temperature TemperatureObject;
    private String MobileLink;
    private String Link;



    public String getLocalObservationDateTime() {
        return LocalObservationDateTime;
    }

    public float getEpochTime() {
        return EpochTime;
    }

    public String getWeatherText() {
        return WeatherText;
    }

    public float getWeatherIcon() {
        return WeatherIcon;
    }

    public boolean getHasPrecipitation() {
        return HasPrecipitation;
    }

    public String getPrecipitationType() {
        return PrecipitationType;
    }

    public boolean getIsDayTime() {
        return IsDayTime;
    }

    public Temperature getTemperature() {
        return TemperatureObject;
    }

    public String getMobileLink() {
        return MobileLink;
    }

    public String getLink() {
        return Link;
    }

    // Setter Methods
    @JsonSetter("LocalObservationDateTime")
    public void setLocalObservationDateTime(String LocalObservationDateTime) {
        this.LocalObservationDateTime = LocalObservationDateTime;
    }
    @JsonSetter("EpochTime")
    public void setEpochTime(float EpochTime) {
        this.EpochTime = EpochTime;
    }
    @JsonSetter("WeatherText")
    public void setWeatherText(String WeatherText) {
        this.WeatherText = WeatherText;
    }
    @JsonSetter("WeatherIcon")
    public void setWeatherIcon(float WeatherIcon) {
        this.WeatherIcon = WeatherIcon;
    }
    @JsonSetter("HasPrecipitation")
    public void setHasPrecipitation(boolean HasPrecipitation) {
        this.HasPrecipitation = HasPrecipitation;
    }
    @JsonSetter("PrecipitationType")
    public void setPrecipitationType(String PrecipitationType) {
        this.PrecipitationType = PrecipitationType;
    }
    @JsonSetter("IsDayTime")
    public void setIsDayTime(boolean IsDayTime) {
        this.IsDayTime = IsDayTime;
    }
    @JsonSetter("Temperature")
    public void setTemperature(Temperature TemperatureObject) {
        this.TemperatureObject = TemperatureObject;
    }
    @JsonSetter("MobileLink")
    public void setMobileLink(String MobileLink) {
        this.MobileLink = MobileLink;
    }
    @JsonSetter("Link")
    public void setLink(String Link) {
        this.Link = Link;
    }

    @Override
    public String toString() {
        return "WeatherClass{" +
                "LocalObservationDateTime='" + LocalObservationDateTime + '\'' +
                ", EpochTime=" + EpochTime +
                ", WeatherText='" + WeatherText + '\'' +
                ", WeatherIcon=" + WeatherIcon +
                ", HasPrecipitation=" + HasPrecipitation +
                ", PrecipitationType='" + PrecipitationType + '\'' +
                ", IsDayTime=" + IsDayTime +
                ", TemperatureObject=" + TemperatureObject +
                ", MobileLink='" + MobileLink + '\'' +
                ", Link='" + Link + '\'' +
                '}';
    }
}
class Temperature {
    Metric MetricObject;
    Imperial ImperialObject;


    // Getter Methods
    public Metric getMetric() {
        return MetricObject;
    }

    public Imperial getImperial() {
        return ImperialObject;
    }

    // Setter Methods
    @JsonSetter("Metric")
    public void setMetric(Metric MetricObject) {
        this.MetricObject = MetricObject;
    }
    @JsonSetter("Imperial")
    public void setImperial(Imperial ImperialObject) {
        this.ImperialObject = ImperialObject;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "MetricObject=" + MetricObject +
                ", ImperialObject=" + ImperialObject +
                '}';
    }
}
class Imperial {
    private float Value;
    private String Unit;
    private float UnitType;


    // Getter Methods

    public float getValue() {
        return Value;
    }

    public String getUnit() {
        return Unit;
    }

    public float getUnitType() {
        return UnitType;
    }

    // Setter Methods
    @JsonSetter("Value")
    public void setValue(float Value) {
        this.Value = Value;
    }
    @JsonSetter("Unit")
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }
    @JsonSetter("UnitType")
    public void setUnitType(float UnitType) {
        this.UnitType = UnitType;
    }

    @Override
    public String toString() {
        return "Imperial{" +
                "Value=" + Value +
                ", Unit='" + Unit + '\'' +
                ", UnitType=" + UnitType +
                '}';
    }
}
class Metric {
    private float Value;
    private String Unit;
    private float UnitType;


    // Getter Methods

    public float getValue() {
        return Value;
    }

    public String getUnit() {
        return Unit;
    }

    public float getUnitType() {
        return UnitType;
    }

    // Setter Methods
    @JsonSetter("Value")
    public void setValue(float Value) {
        this.Value = Value;
    }
    @JsonSetter("Unit")
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    @Override
    public String toString() {
        return "Metric{" +
                "Value=" + Value +
                ", Unit='" + Unit + '\'' +
                ", UnitType=" + UnitType +
                '}';
    }

    @JsonSetter("UnitType")
    public void setUnitType(float UnitType) {
        this.UnitType = UnitType;

    }
}
