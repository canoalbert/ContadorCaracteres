package alberto.cano.contadorcaracteres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextFrase;
    private Button btnContarCaracter;
    private Button btnContarPalabra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Se inicializan los textos y botones.
        initializeComponents();
        /*
        btnContarCaracter.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String frase = editTextFrase.getText().toString();
                if (frase.isEmpty()){
                    Toast.makeText(MainActivity.this, "El texto esta en blanco", Toast.LENGTH_SHORT).show();
                }else{
                    int  numCaracteres = frase.length();
                    Intent intent = new Intent(MainActivity.this, Contador.class);
                    //Toast.makeText(MainActivity.this, "La frase ceontiene el siguiente número de caracteres" + numCaracteres, Toast.LENGTH_SHORT).show();

                }
            }
        });



        //Eesta es la acción del boton de ContarPalabra
        btnContarPalabra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String frase = editTextFrase.getText().toString();
                if (frase.isEmpty()){
                    Toast.makeText(MainActivity.this, "El texto esta en blanco", Toast.LENGTH_SHORT).show();
                }else {
                    String[] palabras = frase.split("\\s+");
                    int numPalabra = palabras.length;
                    Intent intent = new Intent(MainActivity.this, Contador.class);
                    //Toast.makeText(MainActivity.this, "La frase contiene el siguiente número de palabras" + numPalabra, Toast.LENGTH_SHORT).show();
                }
            }
        });*/

    }

    private void initializeComponents() {
        editTextFrase = findViewById(R.id.editTextFrase);
        btnContarCaracter = findViewById(R.id.btnContarCaracter);
        btnContarPalabra = findViewById(R.id.btnContarPalabra);
    }
    public void  onClickBotones(View boton){
        String frase = editTextFrase.getText().toString();
        if (!frase.isEmpty()) {
            Intent intent = new Intent(MainActivity.this, Contador2.class);
            Bundle bundle = new Bundle();
            bundle.putString("FRASE", frase);
            bundle.putInt("OPERACION", boton.getId());
            intent.putExtras(bundle);
            startActivity(intent);

        }else {
            Toast.makeText(this, "FALTA LA FRASE", Toast.LENGTH_SHORT).show();
        }
    }
}