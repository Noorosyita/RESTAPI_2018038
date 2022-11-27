package com.example.tugas_restapi;

import com.google.gson.annotations.SerializedName;

public class DataModel {

    private String Nama;
    private int NIM;
    private String Jurusan;
    private String Fakultas;
    private String Alamat;
    private int Angkatan;


    public String getNama() {
        return Nama;
    }

    public int getNIM() {
        return NIM;
    }

    public String getJurusan() {
        return Jurusan;
    }

    public String getFakultas() {
        return Fakultas;
    }

    public String getAlamat() {
        return Alamat;
    }

    public int getAngkatan() {
        return Angkatan;
    }
}
