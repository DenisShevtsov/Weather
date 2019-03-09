package ru.startandroid.weath;


import android.os.Bundle;
import android.view.View;

import androidx.navigation.Navigation;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ru.startandroid.weath.geocoder.Geocoder;
import ru.startandroid.weath.weather.Weather;

public class RetrofitHelper {

    private String[] data;
    private String tip;
    private Bundle bn;
    private String itm;

    public void toWeatherFragment(String par, Bundle bundle, final View v){
        final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://geocode-maps.yandex.ru/1.x/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        bn = bundle;
        final String p = par;

        Api api = retrofit.create(Api.class);

        Call<Geocoder> pointCall = api.geocoder(par);

        pointCall.enqueue(new Callback<Geocoder>() {
            @Override
            public void onResponse(Call<Geocoder> call, retrofit2.Response<Geocoder> response) {
                setPosition(response.body());
                String[] subR = getPosition();

                Retrofit weather = new Retrofit.Builder()
                        .baseUrl("https://api.weather.yandex.ru/v1/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                Api apiWeather = weather.create(Api.class);

                Call<Weather> weatherCall = apiWeather.weather(subR[0], subR[1], "ad3be5ab-f902-4cec-8e64-9d7029208c3b");

                weatherCall.enqueue(new Callback<Weather>() {
                    @Override
                    public void onResponse(Call<Weather> call, Response<Weather> response) {
                        setTip(response.body());
                        String tip = getTip();
                        int temp = response.body().getFact().getTemp();

                        bn.putString("status", tip);
                        bn.putInt("temp", temp);
                        bn.putString("tname", p);

                        Navigation.findNavController(v).navigate(R.id.action_mainFragment_to_weatherFragment, bn);
                    }

                    @Override
                    public void onFailure(Call<Weather> call, Throwable t) {

                    }
                });

            }

            @Override
            public void onFailure(Call<Geocoder> call, Throwable t) {

            }
        });
    }


    public String[] getPosition() {
        return data;
    }

    public void setPosition(Geocoder response) {
        String r = response
                .getResponse()
                .getGeoObjectCollection()
                .getFeatureMember()
                .get(0)
                .getGeoObject()
                .getPoint()
                .getPos();
        data = r.split(" ");
    }

    public String getTip() {
        return tip;
    }

    public void setTip(Weather response) {
        tip = null;
        switch (response.getFact().getCondition()) {
            case "clear":
                tip = "ясно";
                break;
            case "partly-cloudy":
                tip = "малооблачно";
                break;
            case "cloudy":
                tip = "облачно с прояснениями";
                break;
            case "overcast":
                tip = "пасмурно";
                break;
            case "partly-cloudy-and-light-rain":
                tip = "небольшой дождь";
                break;
            case "partly-cloudy-and-rain":
                tip = "дождь";
                break;
            case "overcast-and-rain":
                tip = "сильный дождь";
                break;
            case "overcast-thunderstorms-with-rain":
                tip = "сильный дождь, гроза";
                break;
            case "cloudy-and-light-rain":
                tip = "небольшой дождь";
                break;
            case "overcast-and-light-rain":
                tip = "небольшой дождь";
                break;
            case "cloudy-and-rain":
                tip = "дождь";
                break;
            case "overcast-and-wet-snow":
                tip = "дождь со снегом";
                break;
            case "partly-cloudy-and-light-snow":
                tip = "небольшой снег";
                break;
            case "partly-cloudy-and-snow":
                tip = "снег";
                break;
            case "overcast-and-snow ":
                tip = "снегопад";
                break;
            case "cloudy-and-light-snow":
                tip = "небольшой снег";
                break;
            case "overcast-and-light-snow":
                tip = "небольшой снег";
                break;
            case "cloudy-and-snow":
                tip = "снег";
                break;
        }
    }
}
