package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rec_Makanan;
    private ArrayList<Kuliner> listMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rec_Makanan = findViewById(R.id.rec_Makanan);
        initData();

        rec_Makanan.setAdapter(new KulinerAdapter(listMakanan));
        rec_Makanan.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData() {
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new Kuliner("Mie Rebus",
                "Rp. 10.000",
                "Mie Rebus instan varian rasa : soto, ayam bawang, kare.",
                R.drawable.mierebus));
        listMakanan.add(new Kuliner("Mie Goreng",
                "Rp. 15.000",
                "Mie Goreng instan varian rasa : original, ayam bawang, aceh, rendang.",
                R.drawable.miegoreng));
        listMakanan.add(new Kuliner("Kentang Goreng",
                "Rp. 15.000",
                "kentang goreng dengan saus atau mayonaise.",
                R.drawable.frenchfries));
        listMakanan.add(new Kuliner("Mendoan",
                "Rp. 5.000",
                "Tempe tepung dengan saus atau cabe hijau.",
                R.drawable.mendoan));
        listMakanan.add(new Kuliner("Sate",
                "Rp. 20.000",
                "Sate ayam atau kambing dengan bumbu kecap atau bumbu kacang.",
                R.drawable.sate));
        listMakanan.add(new Kuliner("Soto Ayam",
                "Rp. 15.000",
                "Soto dengan suwiran ayam dan telur bacem.",
                R.drawable.soto));
        listMakanan.add(new Kuliner("Ayam geprek keju",
                "Rp. 20.000",
                "Ayam geprek dengan keju.",
                R.drawable.geprekkeju));
        listMakanan.add(new Kuliner("Ayam geprek",
                "Rp. 20.000",
                "Ayam geprek dengan pilihan sambal : sambal hijau, sambal matah,sambal geprek.",
                R.drawable.geprek));
    }
}