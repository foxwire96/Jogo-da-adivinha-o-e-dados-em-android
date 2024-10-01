package rj.senac.av1_dados;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class randomNum {
    private TextView textViewNome;
    private EditText editTextNumero;
    private Button buttonVerificar;
    private TextView textViewResultado;
    private Button buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewNome = findViewById(R.id.textViewNome);
        editTextNumero = findViewById(R.id.editTextNumber);
        buttonVerificar = findViewById(R.id.button);
        textViewResultado = findViewById(R.id.textViewResultado);
        buttonVoltar = findViewById(R.id.buttonVoltar);

        buttonVerificar.setOnClickListener(v-> {
            String numeroStr = editTextNumero.getText().toString();
            if("33".equals(numeroStr)) {
                textViewResultado.setText("Você acertou!");
            } else {
                textViewResultado.setText("Tente novamente");
            }
        }
    });
        buttonVoltar.setOnClickListener(v->finish());
}
