package askar.s.pertemuandts1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button buttonCek;
    TextView tvResult;
    EditText etBilangan1, etBilangan2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonCek = findViewById(R.id.buttonCek);
        tvResult = findViewById(R.id.tvResult);
        etBilangan1 = findViewById(R.id.etBilangan1);
        etBilangan2 = findViewById(R.id.etBilangan2);

        buttonCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cek();
            }
        });
    }

    private void cek(){
        if (etBilangan1.getText().length() > 0 && etBilangan2.getText().length() > 0){
            float bilangan1 = Float.parseFloat(etBilangan1.getText().toString());
            float bilangan2 = Float.parseFloat(etBilangan2.getText().toString());

            if (bilangan1 == bilangan2){
                tvResult.setText("Bilangan 1 sama besar dengan Bilangan 2");
            }else{
                if (bilangan1 > bilangan2){
                    tvResult.setText("Bilangan 1 lebih besar dari Bilangan 2");
                }else{
                    tvResult.setText("Bilangan 2 lebih besar dari Bilangan 1");
                }
            }
        }else{
            Toast.makeText(this, "Lengkapi bilangan terlebih dahulu", Toast.LENGTH_SHORT).show();
        }
    }
}