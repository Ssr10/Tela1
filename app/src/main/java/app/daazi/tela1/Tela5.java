package app.daazi.tela1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Tela5 extends Activity {

    private String[] telasNomes = new String[]{"Tela1", "Tela2", "Tela3"};
    private int[] temasImgs = {R.drawable.img1, R.drawable.img2, R.drawable.img3};
    private Spinner sp;
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela5);
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1Id);
        iv = (ImageView) findViewById(R.id.imageViewTela5Id);
       // spinner1.setOnItemSelectedListener(ouvinteSpinner);

        ArrayList<String> dadosSpinner = new ArrayList<>();


        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_item, telasNomes
        );
        sp = (Spinner) findViewById(R.id.spinner1Id);
        sp.setAdapter(adapter);


        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()

        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                iv.setImageResource(temasImgs[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

}
        public void showElemento(View view){
            String nome = (String) sp.getSelectedItem();
            long id = sp.getSelectedItemId();
            int posicao = sp.getSelectedItemPosition();

            Toast.makeText(this, "Nome: "+ nome+ " Id -> "+ id + " Posição: " + posicao, Toast.LENGTH_LONG).show();
        }
}


