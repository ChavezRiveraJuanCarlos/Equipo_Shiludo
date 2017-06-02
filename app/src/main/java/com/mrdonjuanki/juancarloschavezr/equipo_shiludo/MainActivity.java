package com.mrdonjuanki.juancarloschavezr.equipo_shiludo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import static android.R.attr.button;
import static com.mrdonjuanki.juancarloschavezr.equipo_shiludo.R.id.btnAccion;

public class MainActivity extends AppCompatActivity {
    
    Button btnAccion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAccion=(Button)findViewById(btnAccion);
        
    }

    private Button findViewById(Button btnAccion) {

        return btnAccion;
    }
}
