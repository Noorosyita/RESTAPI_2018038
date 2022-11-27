package com.example.tugas_restapi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.textview);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://run.mocky.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MyAPICall myAPICall = retrofit.create(MyAPICall.class);

        Call<DataModel> call = myAPICall.getData();

        call.enqueue(new Callback<DataModel>() {
            @Override
            public void onResponse(Call<DataModel> call, Response<DataModel> response) {
                if (response.code() != 200){
                    return;
                }
                String json = "";

                json =  " Nama = "+ response.body().getNama() +
                        "\n NIM = " +response.body().getNIM() +
                        "\n Jurusan = " +response.body().getJurusan() +
                        "\n Fakultas = " +response.body().getFakultas() +
                        "\n Alamat = " +response.body().getAlamat() +
                        "\n Angkatan = " +response.body().getAngkatan() ;
                txt.append(json);
            }
            @Override
            public void onFailure(Call<DataModel> call, Throwable t) {

            }
        });

    }
}