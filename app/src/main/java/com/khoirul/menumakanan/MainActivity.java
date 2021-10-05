package com.khoirul.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> imgFoto = new ArrayList<>();
    private  ArrayList<String> nama = new ArrayList<>();
    private  ArrayList<String> harga = new ArrayList<>();
    private  ArrayList<String> infoMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDatafromInternet();
    }
    private void prosesmenuAdapater() {
        RecyclerView recyclerView = findViewById(R.id.menu);
        menuAdapter adapter = new menuAdapter(imgFoto, nama, harga, infoMakanan,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDatafromInternet() {
        nama.add("Steak Tempe");
        imgFoto.add("https://image.cermati.com/q_70/znkzhw84imvjc9ok9vgh.webp");
        harga.add("Rp. 10.000");
        infoMakanan.add("Tempe yang dihaluskan, dibentuk, dan dimasak seperti steak");

        nama.add("Nasi Goreng");
        imgFoto.add("https://image.cermati.com/q_70/melljndeljcfqxa4yunh.webp");
        harga.add("Rp. 10.000");
        infoMakanan.add("Nasi Goreng dengan berbagai toping");

        nama.add("Pepes");
        imgFoto.add("https://image.cermati.com/q_70/wblvq0vvmflgwmgxsitn.webp");
        harga.add("Rp. 15.000");
        infoMakanan.add("Pepes terbuat dari ikan yang dikukus dengan daun pisang");

        nama.add("Ayam Bakar");
        imgFoto.add("https://image.cermati.com/q_70/krzzarnrg5txqy0tbrzp.webp");
        harga.add("Rp. 17.000");
        infoMakanan.add("Ayam kampung yang dibakar dengan bumbu special");

        nama.add("Gado-Gado");
        imgFoto.add("https://image.cermati.com/q_70/awhnkfzulrrvi2rmux4n.webp");
        harga.add("Rp. 10.000");
        infoMakanan.add("Terbuat dari sayur yang diberi saus kacang");

        nama.add("Perkedel");
        imgFoto.add("https://image.cermati.com/q_70/fue8oldhfmv9gozpy5be.webp");
        harga.add("Rp. 10.000");
        infoMakanan.add("Kentang yang dihaluskan dan digoreng");

        prosesmenuAdapater();

    }
}