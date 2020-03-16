package app.daazi.tela1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonAlert;
  //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAlert = findViewById(R.id.button2Id);
        buttonAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nome = buttonAlert.getText().toString();
                AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                alerta.setTitle("Diálogo de Cadastro");
                alerta = alerta.setMessage("O usuario: " + nome);
                alerta.setNeutralButton("Ok", null);
                alerta.show();

            }
        });
    }

}
