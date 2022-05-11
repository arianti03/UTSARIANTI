package com.example.menghitungnilaiakhirmahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ednama, edtugas, edhadir, eduts, eduas, edakhir, edhuruf;
    Button btnhitung;
    Double vtugas, vhadir, vuts, vuas, vakhir;
    String vnama, vhuruf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ednama = (EditText) findViewById(R.id.ednama);
        edtugas = (EditText) findViewById(R.id.edtugas);
        edhadir = (EditText) findViewById(R.id.edhadir);
        eduts = (EditText) findViewById(R.id.eduts);
        eduas = (EditText) findViewById(R.id.eduas);
        edakhir = (EditText) findViewById(R.id.edakhir);
        edhuruf = (EditText) findViewById(R.id.edhuruf);
        btnhitung = (Button) findViewById(R.id.btnHitung);
    }

    public void hitung(View view) {
        vtugas = Double.parseDouble(edtugas.getText().toString());
        vhadir = Double.parseDouble(edhadir.getText().toString());
        vuts = Double.parseDouble(eduts.getText().toString());
        vuas = Double.parseDouble(eduas.getText().toString());

        vakhir = (0.15 * vhadir) + (0.25 * vtugas) + (0.25 * vuts) + (0.35 * vuas);

        if (vakhir >=90 && vakhir <=100) {
            vhuruf = "A";
        }
            else if (vakhir >=80 && vakhir <=89){
                vhuruf="B";
        }
        else if (vakhir >=70 && vakhir <=79){
            vhuruf="C";
        }
        else if (vakhir >=60 && vakhir <=69){
            vhuruf="D";
        }
        else {
            vhuruf = "E";
        }
        edakhir.setText(""+vakhir);
        edhuruf.setText(""+vhuruf);

    }
}