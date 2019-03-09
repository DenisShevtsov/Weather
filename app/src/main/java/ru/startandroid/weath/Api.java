package ru.startandroid.weath;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;
import ru.startandroid.weath.geocoder.Geocoder;
import ru.startandroid.weath.weather.Weather;

public interface Api {
    @GET("?apikey=d34990c6-ecae-4e8d-8be4-68e92836b8df&format=json")
    Call<Geocoder> geocoder(@Query("geocode") String town);


    @GET("forecast?")
    Call<Weather> weather(@Query("lat") String lat, @Query("lon") String lon, @Header("X-Yandex-API-Key") String h);
}
