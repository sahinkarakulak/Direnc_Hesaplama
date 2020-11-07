package com.example.emin_direnc_hesaplama;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spinner1, spinner2, spinner3, spinner4;

    TextView txt_sonuc, txt_band1, txt_band2;

    String item1, item2, item3, item4;

    long sayi1, sayi2, sayi3;
    String sayi4;

    private String[] band1 = {"1 Kahverengi", "2 Kırmızı", "3 Turuncu", "4 Sarı", "5 Yeşil", "6 Mavi", "7 Mor", "8 Gri", "9 Beyaz"};
    private String[] band2 = {"0 Siyah", "1 Kahverengi", "2 Kırmızı", "3 Turuncu", "4 Sarı", "5 Yeşil", "6 Mavi", "7 Mor", "8 Gri", "9 Beyaz"};
    private String[] band3 = {"x1 Siyah", "x10 Kahverengi", "x100 Kırmızı", "x1K Turuncu", "x10K Sarı", "x100K Yeşil", "x1M Mavi", "x10M Mor", "x100M Gri", "x1G Beyaz", "/10 Altın", "/100 Gümüş"};
    private String[] band4 = {"%1 Kahverengi", "%2 Kırmızı", "%3 Turuncu", "%4 Sarı", "%0.5 Yeşil", "%0.25 Mavi", "%0.10 Mor", "%0.05 Gri", "%5 Altın", "%10 Gümüş"};

    private ArrayAdapter<String> band1_adaptoru1, band1_adaptoru2, band1_adaptoru3, band1_adaptoru4;

    int b1_kahverengi, b1_kırmızı, b1_turuncu, b1_sarı, b1_yesil, b1_mavi, b1_mor, b1_gri, b1_beyaz;
    int b2_siyah, b2_kahverengi, b2_kırmızı, b2_turuncu, b2_sarı, b2_yesil, b2_mavi, b2_mor, b2_gri, b2_beyaz;
    int b3_siyah, b3_kahverengi, b3_kırmızı, b3_turuncu, b3_sarı, b3_yesil, b3_mavi, b3_mor, b3_gri, b3_beyaz, b3_altın, b3_gumus;
    String b4_kahverengi, b4_kırmızı, b4_turuncu, b4_sarı, b4_yesil, b4_mavi, b4_mor, b4_gri, b4_altın, b4_gumus;

    private void init() {
        spinner1 = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);
        spinner3 = findViewById(R.id.spinner3);
        spinner4 = findViewById(R.id.spinner4);

        txt_sonuc = findViewById(R.id.txt_sonuc);
        txt_band1 = findViewById(R.id.txt_band1);
        txt_band2 = findViewById(R.id.txt_band2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        setTitle("Direnç Hesaplama");

        band1_adaptoru1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, band1);
        band1_adaptoru2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, band2);
        band1_adaptoru3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, band3);
        band1_adaptoru4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, band4);

        band1_adaptoru1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        band1_adaptoru2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        band1_adaptoru3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        band1_adaptoru4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner1.setAdapter(band1_adaptoru1);
        spinner2.setAdapter(band1_adaptoru2);
        spinner3.setAdapter(band1_adaptoru3);
        spinner4.setAdapter(band1_adaptoru4);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(band1[0])) {
                    b1_kahverengi = 10;
                    hesapla1(b1_kahverengi);
                    hesaplaCarparak();
                }

                if (adapterView.getSelectedItem().toString().equals(band1[1])) {
                    b1_kırmızı = 20;
                    hesapla1(b1_kırmızı);
                    hesaplaCarparak();
                }

                if (adapterView.getSelectedItem().toString().equals(band1[2])) {
                    b1_turuncu = 30;
                    hesapla1(b1_turuncu);
                    hesaplaCarparak();
                }

                if (adapterView.getSelectedItem().toString().equals(band1[3])) {
                    b1_sarı = 40;
                    hesapla1(b1_sarı);
                    hesaplaCarparak();
                }

                if (adapterView.getSelectedItem().toString().equals(band1[4])) {
                    b1_yesil = 50;
                    hesapla1(b1_yesil);
                    hesaplaCarparak();
                }

                if (adapterView.getSelectedItem().toString().equals(band1[5])) {
                    b1_mavi = 60;
                    hesapla1(b1_mavi);
                    hesaplaCarparak();
                }

                if (adapterView.getSelectedItem().toString().equals(band1[6])) {
                    b1_mor = 70;
                    hesapla1(b1_mor);
                    hesaplaCarparak();
                }

                if (adapterView.getSelectedItem().toString().equals(band1[7])) {
                    b1_gri = 80;
                    hesapla1(b1_gri);
                    hesaplaCarparak();
                }

                if (adapterView.getSelectedItem().toString().equals(band1[8])) {
                    b1_beyaz = 90;
                    hesapla1(b1_beyaz);
                    hesaplaCarparak();
                }

                item1 = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(band2[0])) {
                    b2_siyah = 0;
                    hesapla2(b2_siyah);
                    hesaplaCarparak();
                }

                if (adapterView.getSelectedItem().toString().equals(band2[1])) {
                    b2_kahverengi = 1;
                    hesapla2(b2_kahverengi);
                    hesaplaCarparak();
                }

                if (adapterView.getSelectedItem().toString().equals(band2[2])) {
                    b2_kırmızı = 2;
                    hesapla2(b2_kırmızı);
                    hesaplaCarparak();
                }

                if (adapterView.getSelectedItem().toString().equals(band2[3])) {
                    b2_turuncu = 3;
                    hesapla2(b2_turuncu);
                    hesaplaCarparak();
                }

                if (adapterView.getSelectedItem().toString().equals(band2[4])) {
                    b2_sarı = 4;
                    hesapla2(b2_sarı);
                    hesaplaCarparak();
                }

                if (adapterView.getSelectedItem().toString().equals(band2[5])) {
                    b2_yesil = 5;
                    hesapla2(b2_yesil);
                    hesaplaCarparak();
                }

                if (adapterView.getSelectedItem().toString().equals(band2[6])) {
                    b2_mavi = 6;
                    hesapla2(b2_mavi);
                    hesaplaCarparak();
                }

                if (adapterView.getSelectedItem().toString().equals(band2[7])) {
                    b2_mor = 7;
                    hesapla2(b2_mor);
                    hesaplaCarparak();
                }

                if (adapterView.getSelectedItem().toString().equals(band2[8])) {
                    b2_gri = 8;
                    hesapla2(b2_gri);
                    hesaplaCarparak();
                }

                if (adapterView.getSelectedItem().toString().equals(band2[9])) {
                    b2_beyaz = 9;
                    hesapla2(b2_beyaz);
                    hesaplaCarparak();
                }

                item2 = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(band3[0])) {
                    b3_siyah = 1;
                    hesapla3(b3_siyah);
                    hesaplaCarparak();
                }

                if (adapterView.getSelectedItem().toString().equals(band3[1])) {
                    b3_kahverengi = 10;
                    hesapla3(b3_kahverengi);
                    hesaplaCarparak();
                }

                if (adapterView.getSelectedItem().toString().equals(band3[2])) {
                    b3_kırmızı = 100;
                    hesapla3(b3_kırmızı);
                    hesaplaCarparak();
                }

                if (adapterView.getSelectedItem().toString().equals(band3[3])) {
                    b3_turuncu = 1000;
                    hesapla3(b3_turuncu);
                    hesaplaCarparak();
                }

                if (adapterView.getSelectedItem().toString().equals(band3[4])) {
                    b3_sarı = 10000;
                    hesapla3(b3_sarı);
                    hesaplaCarparak();
                }

                if (adapterView.getSelectedItem().toString().equals(band3[5])) {
                    b3_yesil = 100000;
                    hesapla3(b3_yesil);
                    hesaplaCarparak();
                }

                if (adapterView.getSelectedItem().toString().equals(band3[6])) {
                    b3_mavi = 1000000;
                    hesapla3(b3_mavi);
                    hesaplaCarparak();
                }

                if (adapterView.getSelectedItem().toString().equals(band3[7])) {
                    b3_mor = 10000000;
                    hesapla3(b3_mor);
                    hesaplaCarparak();
                }

                if (adapterView.getSelectedItem().toString().equals(band3[8])) {
                    b3_gri = 100000000;
                    hesapla3(b3_gri);
                    hesaplaCarparak();
                }

                if (adapterView.getSelectedItem().toString().equals(band3[9])) {
                    b3_beyaz = 1000000000;
                    hesapla3(b3_beyaz);
                    hesaplaCarparak();
                }

                if (adapterView.getSelectedItem().toString().equals(band3[10])) {
                    b3_altın = 10;
                    hesapla3(b3_altın);

                    hesaplaBolerek();
                }

                if (adapterView.getSelectedItem().toString().equals(band3[11])) {
                    b3_gumus = 100;
                    hesapla3(b3_gumus);

                    hesaplaBolerek();
                }

                item3 = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(band4[0])) {
                    b4_kahverengi = "1";
                    hesapla4(b4_kahverengi);
                    islemX();
                }

                if (adapterView.getSelectedItem().toString().equals(band4[1])) {
                    b4_kırmızı = "2";
                    hesapla4(b4_kırmızı);
                    islemX();
                }

                if (adapterView.getSelectedItem().toString().equals(band4[2])) {
                    b4_turuncu = "3";
                    hesapla4(b4_turuncu);
                    islemX();
                }

                if (adapterView.getSelectedItem().toString().equals(band4[3])) {
                    b4_sarı = "4";
                    hesapla4(b4_sarı);
                    islemX();
                }

                if (adapterView.getSelectedItem().toString().equals(band4[4])) {
                    b4_yesil = "0.50";
                    hesapla4(b4_yesil);
                    islemX();
                }

                if (adapterView.getSelectedItem().toString().equals(band4[5])) {
                    b4_mavi = "0.25";
                    hesapla4(b4_mavi);
                    islemX();
                }

                if (adapterView.getSelectedItem().toString().equals(band4[6])) {
                    b4_mor = "0.10";
                    hesapla4(b4_mor);
                    islemX();
                }

                if (adapterView.getSelectedItem().toString().equals(band4[7])) {
                    b4_gri = "0.05";
                    hesapla4(b4_gri);
                    islemX();
                }

                if (adapterView.getSelectedItem().toString().equals(band4[8])) {
                    b4_altın = "5";
                    hesapla4(b4_altın);
                    islemX();
                }

                if (adapterView.getSelectedItem().toString().equals(band4[9])) {
                    b4_gumus = "10";
                    hesapla4(b4_gumus);
                    islemX();
                }

                item4 = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    @SuppressLint("SetTextI18n")
    public void hesaplaCarparak() {
        long hesaplama_islemi = (sayi1 + sayi2) * sayi3;
        txt_sonuc.setText("Sonuç : " + hesaplama_islemi + " Ω± %" + sayi4);
    }

    @SuppressLint("SetTextI18n")
    public void hesaplaBolerek() {
        long hesaplama_islemi = (sayi1 + sayi2) / sayi3;
        txt_sonuc.setText("Sonuç : " + hesaplama_islemi + " Ω± %" + sayi4);
    }

    public void islemX(){
        if (item3.equals("/10 Altın") || item3.equals("/100 Gümüş")){
            hesaplaBolerek();
        }else
            hesaplaCarparak();
    }

    public void hesapla1(int deger1) {
        sayi1 = deger1;
    }

    public void hesapla2(int deger2) {
        sayi2 = deger2;
    }

    public void hesapla3(int deger3) {
        sayi3 = deger3;
    }

    public void hesapla4(String deger4) {
        sayi4 = deger4;
    }

}
