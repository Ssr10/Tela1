package app.daazi.tela1;

import androidx.appcompat.app.AlertDialog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela1 extends Activity {

    private Button buttonAlert;
    //private Button confirmado;
    AlertDialog.Builder alerta;

     public void Confirmado (View view){
         Intent intent = new Intent(Tela1.this, Tela3.class);
         startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        buttonAlert = findViewById(R.id.button2Id);
        buttonAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nome = buttonAlert.getText().toString();
                alerta = new AlertDialog.Builder(Tela1.this);
                alerta.setTitle("Diálogo de Cadastro");
                alerta = alerta.setMessage("Usuário: " + nome);
                alerta.setNeutralButton("Ok", null);
                alerta.show();

            }


        });
    }


}
