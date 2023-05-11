package com.aufal.praktikumday2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    Button btnSave;
    TextView rNama, rTtl, rNomerhp,jenisKelamin,makananFavorit;
    EditText nama,nomerHp,tempat,tanggalLahir;
    String Jeniskelamin, makananfavorit;
//    String [] makananfavorit;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int [] checkboxs = {R.id.cbNasiAyam, R.id.cbNasiJagung, R.id.cbNasiPecel};
        int [] radios = {R.id.rbPria, R.id.rbWanita};

        //inputan
        nama = findViewById(R.id.nama);
        tempat = findViewById(R.id.tempatLahir);
        tanggalLahir= findViewById(R.id.tanggalLahir);
        nomerHp = findViewById(R.id.kontak);

        //hasil
        rNama = findViewById(R.id.rNama);
        rTtl = findViewById(R.id.rTtl);
        rNomerhp = findViewById(R.id.rNohp);
        jenisKelamin = findViewById(R.id.rJenisKelamin);
        makananFavorit = findViewById(R.id.rMakananFavorit);


//       tombol
        btnSave = findViewById(R.id.btnSave);



        for (int i : checkboxs){
            CheckBox button = findViewById(i);
            button.setOnCheckedChangeListener((a,ischecked)-> {
                makananfavorit = (String) button.getText();
            });
        };

        for (int i : radios){
            RadioButton button = findViewById(i);
            button.setOnCheckedChangeListener((a,ischecked)->{
                Jeniskelamin = (String) button.getText();
            });
        }


        btnSave.setOnClickListener(v->{
            rNama.setText(nama.getText().toString());
            rTtl.setText(tempat.getText().toString() + tanggalLahir.getText().toString());
            rNomerhp.setText(nomerHp.getText().toString());
            jenisKelamin.setText(Jeniskelamin);
            makananFavorit.setText(makananfavorit);


            //
            nama.getText().clear();
            tempat.getText().clear();
            tanggalLahir.getText().clear();
            nomerHp.getText().clear();
        });

    }
}