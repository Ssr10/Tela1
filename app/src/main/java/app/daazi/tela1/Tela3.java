package app.daazi.tela1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Tela3 extends AppCompatActivity {

    private CheckBox ckecked1, checked2, checked3;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        ckecked1 = (CheckBox) findViewById(R.id.checkBox1Id);
        checked2 = (CheckBox) findViewById(R.id.checkBox2Id);
        checked3 = (CheckBox) findViewById(R.id.checkBox3Id);
        btn = (Button) findViewById(R.id.btn1Id);
btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if(ckecked1.isChecked()){
            Toast.makeText(Tela3.this, "Opção 1 checada", Toast.LENGTH_LONG).show();
        } else {
            if(checked2.isChecked()){
                Toast.makeText(Tela3.this, "Opção 2 checada", Toast.LENGTH_LONG).show();
            } else {
                if(checked3.isChecked()){
                    Toast.makeText(Tela3.this, "Opção 3 checada", Toast.LENGTH_LONG).show();
                } else {
                    if((ckecked1.isChecked() && checked2.isChecked())){
                        Toast.makeText(Tela3.this, "Opções 1 & 2 checadas", Toast.LENGTH_LONG).show();
                    } else {
                        if((ckecked1.isChecked() && checked3.isChecked())){
                            Toast.makeText(Tela3.this, "Opções 1 & 3 checadas", Toast.LENGTH_LONG).show();
                        } else {
                            if((checked2.isChecked() && checked3.isChecked())){
                                Toast.makeText(Tela3.this, "Opções 2 & 3 checadas", Toast.LENGTH_LONG).show();
                            } else {
                                if((ckecked1.isChecked() && checked3.isChecked() && checked3.isChecked())){
                                    Toast.makeText(Tela3.this, "Opções 1, 2 & 3 checadas", Toast.LENGTH_LONG).show();
                                }
                            }
                        }
                    }
                }
            }
        }
    }
});

    }
}
