package app.daazi.tela1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

//public class Tela4 extends AppCompatActivity implements View.OnClickListener{
//
//    private EditText tv1, tv2, resultado;
//    private Button somar;
//    private Button limpar;
//
//  @Override
//  protected void onCreate(@Nullable Bundle saveInstanceState){
//
//       super.onCreate(saveInstanceState);
//       somar.setOnClickListener(this);
//  }
//
//  public void onClick(View view){
//      somar.setText("Ainda falta programar");
//  }
//}

public class Tela4 extends Activity {

    private EditText tv1, tv2, resultado;
    private Button somar;
    private Button limpar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);

        tv1 = (EditText) findViewById(R.id.numero1Id);
        tv2 = (EditText) findViewById(R.id.numero2Id);
        somar = (Button) findViewById(R.id.btnSomarId);
        limpar = (Button) findViewById(R.id.btnLimparId);

        somar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Double v1, v2, resultado;
                v1 = Double.parseDouble(tv1.getText().toString());
                v2 = Double.parseDouble(tv1.getText().toString());
                resultado = v1 + v2;


                if(TextUtils.isEmpty(tv1.getText().toString())) {
                    tv1.setError("Campo em branco. Digite um número.");
                }else{
                    if(TextUtils.isEmpty(tv2.getText().toString())){
                        tv2.setError("Campo em branco. Digite um número.");
                    }else{
                        somar.setText(resultado.toString());
                    }
                }
            }
        });
        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                limpar.setText(resultado.toString());

            }
        });

    }
}

