package alberto.cano.contadorcaracteres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.StringTokenizer;

public class Contador2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador2);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null){
            String frase = bundle.getString("FRASE");
            int operacion = bundle.getInt("OPERACION");
            if (operacion == R.id.btnContarCaracter){
                Toast.makeText(this, "La frase tiene el siguiente numero de caracteres  ->"+ frase.length()+ "caracteres", Toast.LENGTH_SHORT).show();
            }else {
                if (operacion == R.id.btnContarPalabra){
                    StringTokenizer palabra = new StringTokenizer(frase);
                    Toast.makeText(this, "La frase contiene el siguiente número de palabras  ->"+palabra.countTokens()+"palabras", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}