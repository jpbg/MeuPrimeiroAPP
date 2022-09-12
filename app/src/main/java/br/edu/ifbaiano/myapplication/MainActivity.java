package br.edu.ifbaiano.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtName;
    private Button btnEnviar;
    private TextView txtResult;
    private Button btnCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtName = findViewById(R.id.edtName);
        btnEnviar = findViewById(R.id.btnGo);
        txtResult = findViewById(R.id.txtResult);
        btnCancelar = findViewById(R.id.btnCancelar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTmp = edtName.getText().toString();

                if(nameTmp.isEmpty()){
                   txtResult.setText(R.string.vazio);
                }else{
                    txtResult.setText(nameTmp);
                }
            }
        });

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtName.setText("");
                txtResult.setText("");
            }
        });

    }
}