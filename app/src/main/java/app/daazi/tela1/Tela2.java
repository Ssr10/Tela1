package app.daazi.tela1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;

public class Tela2 extends AppCompatActivity {

    private RadioGroup radios;
    private Button resultado;
    private int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        resultado = (Button) findViewById(R.id.resultadoId)

        RadioGroup radios = (RadioGroup) findViewById(R.id.radios);
        switch (radios.getCheckedRadioButtonId()){
            case R.id.subtrairId:
                resultado = Double.parseDouble(num1.getText().toString()) - Double.parseDouble(num2.getText().toString());
                break;
            case R.id.multiplicarId:
                resultado = Double.parseDouble(num1.getText().toString()) * Double.parseDouble(num2.getText().toString());
                break;
            case R.id.dividirId:
                resultado = (Double.parseDouble(num1.getText().toString()) / Double.parseDouble(num2.getText().toString()));
                break;
        }
    }

}
