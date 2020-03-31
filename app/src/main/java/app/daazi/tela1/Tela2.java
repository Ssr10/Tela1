package app.daazi.tela1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Tela2 extends Activity {

    private RadioGroup radioGroup;
    private Button escolha;
    private RadioButton radioButton1, radioButton2, radioButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        escolha = (Button) findViewById(R.id.escolhaId);
        radioButton1 = (RadioButton) findViewById(R.id.subtrairId);
        radioButton2 = (RadioButton) findViewById(R.id.multiplicarId);
        radioButton3 = (RadioButton) findViewById(R.id.dividirId);

        RadioGroup radios = (RadioGroup) findViewById(R.id.radioGroup2);
        switch (radios.getCheckedRadioButtonId()){
            case R.id.subtrairId:
                Toast.makeText(this, "Você está querendo subtrair", Toast.LENGTH_LONG).show();
            break;
            case R.id.multiplicarId:
                Toast.makeText(this, "Você está querendo multiplicar", Toast.LENGTH_LONG).show();
                break;
            case R.id.dividirId:
                Toast.makeText(this, "Você está querendo dividir", Toast.LENGTH_LONG).show();
                break;
        }
    }

}
