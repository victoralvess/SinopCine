package br.com.victoralvess.sinopcine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;


public class ActionAdventureMovieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_adventure_movie);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void seeSynopsis(View view) {
        int buttonId = view.getId();
        /*
        * Intent intent = new Intent();
        * */
        Toast toast = new Toast(getBaseContext());
        if(buttonId == R.id.btn_logan_details) {
            toast.makeText(getBaseContext(), "LOGAN", Toast.LENGTH_LONG);
        } else if(buttonId == R.id.btn_hitman_details) {
            toast.makeText(getBaseContext(), "HITMAN", Toast.LENGTH_LONG);
        } else if(buttonId == R.id.btn_velozes_details) {
            toast.makeText(getBaseContext(), "FAST", Toast.LENGTH_LONG);
        } else if(buttonId == R.id.btn_ultimo_cacador_details) {
            toast.makeText(getBaseContext(), "CAÇADOR", Toast.LENGTH_LONG);
        } else if(buttonId == R.id.btn_anjos_details) {
            toast.makeText(getBaseContext(), "ANJOS", Toast.LENGTH_LONG);
        } else if(buttonId == R.id.btn_guardioes_details) {
            toast.makeText(getBaseContext(), "GUARDIOES", Toast.LENGTH_LONG);
        } else if(buttonId == R.id.btn_300_details) {
            toast.makeText(getBaseContext(), "300", Toast.LENGTH_LONG);
        } else if(buttonId == R.id.btn_kong_details) {
            toast.makeText(getBaseContext(), "KONG", Toast.LENGTH_LONG);
        } else if(buttonId == R.id.btn_mad_details) {
            toast.makeText(getBaseContext(), "MAD", Toast.LENGTH_LONG);
        } else if(buttonId == R.id.btn_rogue_details) {
            toast.makeText(getBaseContext(), "ONE", Toast.LENGTH_LONG);
        }
    }

    private void buyTicket(View view) {
        int buttonId = view.getId();
        /*
        * Intent intent = new Intent();
        * */
        Toast toast = new Toast(getBaseContext());
        if(buttonId == R.id.btn_logan_buy) {
            toast.makeText(getBaseContext(), "LOGAN", Toast.LENGTH_LONG);
        } else if(buttonId == R.id.btn_hitman_buy) {
            toast.makeText(getBaseContext(), "HITMAN", Toast.LENGTH_LONG);
        } else if(buttonId == R.id.btn_velozes_buy) {
            toast.makeText(getBaseContext(), "FAST", Toast.LENGTH_LONG);
        } else if(buttonId == R.id.btn_ultimo_cacador_buy) {
            toast.makeText(getBaseContext(), "CAÇADOR", Toast.LENGTH_LONG);
        } else if(buttonId == R.id.btn_anjos_buy) {
            toast.makeText(getBaseContext(), "ANJOS", Toast.LENGTH_LONG);
        } else if(buttonId == R.id.btn_guardioes_buy) {
            toast.makeText(getBaseContext(), "GUARDIOES", Toast.LENGTH_LONG);
        } else if(buttonId == R.id.btn_300_buy) {
            toast.makeText(getBaseContext(), "300", Toast.LENGTH_LONG);
        } else if(buttonId == R.id.btn_kong_buy) {
            toast.makeText(getBaseContext(), "KONG", Toast.LENGTH_LONG);
        } else if(buttonId == R.id.btn_mad_buy) {
            toast.makeText(getBaseContext(), "MAD", Toast.LENGTH_LONG);
        } else if(buttonId == R.id.btn_rogue_buy) {
            toast.makeText(getBaseContext(), "ONE", Toast.LENGTH_LONG);
        }
    }
}
