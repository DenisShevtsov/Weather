package ru.startandroid.myapplication2;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Icon;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ru.startandroid.myapplication2.geocoder.Geocoder;
import ru.startandroid.myapplication2.weather.Weather;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.TownViewHolder> {
    public static class TownViewHolder extends RecyclerView.ViewHolder{
        CardView cv;
        TextView townName;
        TownViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            townName = (TextView)itemView.findViewById(R.id.town_name);
        }
    }
    Context con;
    List<Town> towns;
    RVAdapter(List<Town> towns, Context context){
        this .towns = towns;
        con = context;
    }



    private ListView listView;
    @NonNull
    @Override
    public RVAdapter.TownViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.maket_1, parent, false);
        RVAdapter.TownViewHolder tvh = new RVAdapter.TownViewHolder(v);
        return tvh;
    }

    @Override
    public void onBindViewHolder(@NonNull RVAdapter.TownViewHolder holder, final int position) {
        holder.townName.setText(towns.get(position).name);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String par;

                par = towns.get(position).name;

                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("https://geocode-maps.yandex.ru/1.x/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();


                Api api = retrofit.create(Api.class);

                Call<Geocoder> pointCall = api.geocoder(par);

                pointCall.enqueue(new Callback<Geocoder>() {
                    @Override
                    public void onResponse(Call<Geocoder> call, Response<Geocoder> response) {
                        String r = response.body()
                                .getResponse()
                                .getGeoObjectCollection()
                                .getFeatureMember()
                                .get(0)
                                .getGeoObject()
                                .getPoint()
                                .getPos();

                        String[] subR = r.split(" ");

                        Retrofit weather = new Retrofit.Builder()
                                .baseUrl("https://api.weather.yandex.ru/v1/")
                                .addConverterFactory(GsonConverterFactory.create())
                                .build();

                        Api apiWeather = weather.create(Api.class);

                        Call<Weather> weatherCall = apiWeather.weather(subR[0], subR[1], "ad3be5ab-f902-4cec-8e64-9d7029208c3b");

                        weatherCall.enqueue(new Callback<Weather>() {
                            @Override
                            public void onResponse(Call<Weather> call, Response<Weather> response) {

                                String tip = null;
                                switch (response.body().getFact().getCondition()){
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
                                AlertDialog.Builder bildet = new AlertDialog.Builder(con);
                                bildet.setTitle(par)
                                        .setMessage(response.body().getFact().getTemp() + " " + tip)
                                        .setCancelable(false)
                                        .setNegativeButton("Закрыть", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int i) {
                                                dialogInterface.cancel();
                                            }
                                        });
                                AlertDialog alr = bildet.create();
                                alr.show();
                            }

                            @Override
                            public void onFailure(Call<Weather> call, Throwable t) {
                                String war = "Ошибка";
                            }
                        });

                    }

                    @Override
                    public void onFailure(Call<Geocoder> call, Throwable t) {

                    }
                });
            }
        });
    }

    @Override
    public int getItemCount() { return towns.size(); }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView){
        super .onAttachedToRecyclerView(recyclerView);
    }

}