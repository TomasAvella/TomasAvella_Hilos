package hilos.example.net.hilos;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity  extends AppCompatActivity {
    //Variables globales
    private EditText entrada;
    private TextView salida;

    @Override //Metodo OnCreate
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entrada = (EditText) findViewById(R.id.entrada);
        salida = (TextView) findViewById(R.id.salida);
    }
    //Metodo para calcular la operación
    public void calcularOperacion(View view) {
        int n = Integer.parseInt(entrada.getText().toString());
        salida.append(n + "! = ");
        int res = factorial(n);
        salida.append(res +"\n");
    }
    //Metodo para calcular el factorial de un numero entero
    public int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++){
            res *= i;
            SystemClock.sleep(1000);
        }
        return res;
    }
}