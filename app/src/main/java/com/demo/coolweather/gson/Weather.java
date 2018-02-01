package com.demo.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Basic getBasic() {
        return basic;
    }

    public void setBasic(Basic basic) {
        this.basic = basic;
    }

    public AQI getAqi() {
        return aqi;
    }

    public void setAqi(AQI aqi) {
        this.aqi = aqi;
    }

    public Now getNow() {
        return now;
    }

    public void setNow(Now now) {
        this.now = now;
    }

    public Suggestion getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(Suggestion suggestion) {
        this.suggestion = suggestion;
    }

    public List<Forecast> getForecastList() {
        return forecastList;
    }

    public void setForecastList(List<Forecast> forecastList) {
        this.forecastList = forecastList;
    }

    public class Basic {

        @SerializedName("city")
        public String cityName;

        @SerializedName("id")
        public String weatherId;

        public Update update;

        public class Update {

            @SerializedName("loc")
            public String updateTime;

        }

    }

    public class AQI {

        public AQICity city;

        public class AQICity {

            public String aqi;

            public String pm25;

        }

    }

    public class Now {

        @SerializedName("tmp")
        public String temperature;

        @SerializedName("cond")
        public More more;

        public class More {

            @SerializedName("txt")
            public String info;

        }

    }

    public class Suggestion {

        @SerializedName("comf")
        public Comfort comfort;

        @SerializedName("cw")
        public CarWash carWash;

        public Sport sport;

        public class Comfort {

            @SerializedName("txt")
            public String info;

        }

        public class CarWash {

            @SerializedName("txt")
            public String info;

        }

        public class Sport {

            @SerializedName("txt")
            public String info;

        }

    }

    public class Forecast {

        public String date;

        @SerializedName("tmp")
        public Temperature temperature;

        @SerializedName("cond")
        public More more;

        public class Temperature {

            public String max;

            public String min;

        }

        public class More {

            @SerializedName("txt_d")
            public String info;

        }

    }
}
