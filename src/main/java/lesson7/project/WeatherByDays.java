package lesson7.project;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName(value = "weather")
public class WeatherByDays {
    private String Date;
    private float EpochDate;
    TemperatureNew Temperature;
    Day DayObject;
    Night NightObject;
    private String MobileLink;
    private String Link;


    // Getter Methods

    public String getDate() {
        return Date;
    }

    public float getEpochDate() {
        return EpochDate;
    }

    public TemperatureNew getTemperature() {
        return Temperature;
    }

    public Day getDay() {
        return DayObject;
    }

    public Night getNight() {
        return NightObject;
    }

    public String getMobileLink() {
        return MobileLink;
    }

    public String getLink() {
        return Link;
    }

    // Setter Methods
    @JsonSetter("Date")
    public void setDate(String Date) {
        this.Date = Date;
    }
    @JsonSetter("EpochDate")
    public void setEpochDate(float EpochDate) {
        this.EpochDate = EpochDate;
    }
    @JsonSetter("Temperature")
    public void setTemperatureNew(TemperatureNew Temperature) {
        this.Temperature = Temperature;
    }
    @JsonSetter("Day")
    public void setDay(Day DayObject) {
        this.DayObject = DayObject;
    }
    @JsonSetter("Night")
    public void setNight(Night NightObject) {
        this.NightObject = NightObject;
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
        return "WeatherByDays{" +
                "Date='" + Date + '\'' +
                ", EpochDate=" + EpochDate +
                ", TemperatureNewObject=" + Temperature +
                ", DayObject=" + DayObject +
                ", NightObject=" + NightObject +
                ", MobileLink='" + MobileLink + '\'' +
                ", Link='" + Link + '\'' +
                '}';
    }
}
@JsonIgnoreProperties(ignoreUnknown = true)
class Night {
    private float Icon;
    private String IconPhrase;
    private boolean HasPrecipitation;


    // Getter Methods

    public float getIcon() {
        return Icon;
    }

    public String getIconPhrase() {
        return IconPhrase;
    }

    public boolean getHasPrecipitation() {
        return HasPrecipitation;
    }

    // Setter Methods
    @JsonSetter("Icon")
    public void setIcon(float Icon) {
        this.Icon = Icon;
    }
    @JsonSetter("IconPhrase")
    public void setIconPhrase(String IconPhrase) {
        this.IconPhrase = IconPhrase;
    }
    @JsonSetter("HasPrecipitation")
    public void setHasPrecipitation(boolean HasPrecipitation) {
        this.HasPrecipitation = HasPrecipitation;
    }

    @Override
    public String toString() {
        return "Night{" +
                "Icon=" + Icon +
                ", IconPhrase='" + IconPhrase + '\'' +
                ", HasPrecipitation=" + HasPrecipitation +
                '}';
    }
}
@JsonIgnoreProperties(ignoreUnknown = true)
class Day {
    private float Icon;
    private String IconPhrase;
    private boolean HasPrecipitation;


    // Getter Methods

    public float getIcon() {
        return Icon;
    }

    public String getIconPhrase() {
        return IconPhrase;
    }

    public boolean getHasPrecipitation() {
        return HasPrecipitation;
    }

    // Setter Methods
    @JsonSetter("Icon")
    public void setIcon(float Icon) {
        this.Icon = Icon;
    }
    @JsonSetter("IconPhrase")
    public void setIconPhrase(String IconPhrase) {
        this.IconPhrase = IconPhrase;
    }
    @JsonSetter("HasPrecipitation")
    public void setHasPrecipitation(boolean HasPrecipitation) {
        this.HasPrecipitation = HasPrecipitation;
    }

    @Override
    public String toString() {
        return "Day{" +
                "Icon=" + Icon +
                ", IconPhrase='" + IconPhrase + '\'' +
                ", HasPrecipitation=" + HasPrecipitation +
                '}';
    }
}
@JsonIgnoreProperties(ignoreUnknown = true)
class TemperatureNew {
    public Minimum MinimumObject;
    public  Maximum MaximumObject;


    // Getter Methods

    public Minimum getMinimum() {
        return MinimumObject;
    }

    public Maximum getMaximum() {
        return MaximumObject;
    }

    // Setter Methods
    @JsonSetter("Minimum")
    public void setMinimum(Minimum MinimumObject) {
        this.MinimumObject = MinimumObject;
    }
    @JsonSetter("Maximum")
    public void setMaximum(Maximum MaximumObject) {
        this.MaximumObject = MaximumObject;
    }

    @Override
    public String toString() {
        return "TemperatureNew{" +
                "MinimumObject=" + MinimumObject +
                ", MaximumObject=" + MaximumObject +
                '}';
    }
}
@JsonIgnoreProperties(ignoreUnknown = true)
class Maximum {
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
        return "Maximum{" +
                "Value=" + Value +
                ", Unit='" + Unit + '\'' +
                ", UnitType=" + UnitType +
                '}';
    }
}
@JsonIgnoreProperties(ignoreUnknown = true)
class Minimum {
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
        return "Minimum{" +
                "Value=" + Value +
                ", Unit='" + Unit + '\'' +
                ", UnitType=" + UnitType +
                '}';
    }
}
