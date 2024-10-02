package rj.senac.av1_dados;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumero;
    private Button buttonVerificar;
    private Button buttonVoltar;
    private TextView textViewDicas;
    private int numeroAleatorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializando os elementos da interface
        editTextNumero = findViewById(R.id.editTextNumero);
        buttonVerificar = findViewById(R.id.buttonVerificar);

        // Gerar um número aleatório entre 1 e 100
        Random random = new Random();
        numeroAleatorio = random.nextInt(100) + 1;

        // Configuração do botão "Verificar"
        buttonVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numeroStr = editTextNumero.getText().toString();

                if (numeroStr.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Digite um número!", Toast.LENGTH_SHORT).show();
                    return;
                }

                int numeroDigitado = Integer.parseInt(numeroStr);

                // Verifica se o número digitado é igual ao número gerado
                if (numeroDigitado == numeroAleatorio) {
                    Toast.makeText(MainActivity.this, "Parabéns! Você acertou!", Toast.LENGTH_SHORT).show();
                    buttonVerificar.setEnabled(false); // Desabilita o botão após acertar
                } else {
                    if (numeroDigitado < numeroAleatorio) {
                        Toast.makeText(MainActivity.this, "O número secreto é maior!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "O número secreto é menor!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}