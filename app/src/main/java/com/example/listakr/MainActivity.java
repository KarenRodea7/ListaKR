package com.example.listakr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    ImageView imagenes;
    TextView desc, desc2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.Spinner1);
        imagenes = findViewById(R.id.imagen);
        desc = findViewById(R.id.desc);
        desc2 = findViewById(R.id.desc2);

        final String[] planetas= {"Mercurio","Venus","Tierra","Marte","Júpiter","Saturno","Urano","Neptuno"};
        final Integer[]  imagen= {R.drawable.mercurio, R.drawable.venus, R.drawable.tierra, R.drawable.marte, R.drawable.jupiter, R.drawable.saturno, R.drawable.urano, R.drawable.neptuno};
        String[] descripciones ={"Es el planeta más cercano al Sol y también el más pequeño del sistema solar.","Es el planeta más parecido a la Tierra en cuanto a tamaño, composición y masa.","Es el mayor de los planetas rocosos del sistema solar y una de sus características es que cuenta con su propio satélite, la Luna.","El planeta rojo es el segundo menor del sistema solar y cuenta con dos satélites: Fobos y Deimos.","Se trata del primero de los planetas exteriores, también conocidos como planetas gaseosos.","Es el único planeta con un sistema de anillos que podemos ver desde la Tierra y, probablemente, el que cuenta con más satélites.","Es un gigante gaseoso y está compuesto principalmente por agua congelada, metano y amoniaco.","Se trata del planeta más alejado del Sol, y por ello es también el más frío. "};
        String[] info = {"Mercurio es solo un poco más grande que la Luna de la Tierra. Desde la superficie de Mercurio, el Sol parecería más de tres veces más grande que cuando se ve desde la Tierra, y la luz solar sería hasta siete veces más brillante.","Es el planeta más popular de nuestro sistema solar, y a veces se le llama gemelo de la Tierra por su parecido, pero su temperatura y sus condiciones atmosféricas son radicalmente diferentes e incompatibles con la vida.","Es el quinto planeta más grande. Una de sus características es que cuenta con su propio satélite, la Luna. La Tierra es el único mundo en nuestro sistema solar con agua líquida en la superficie y es el único lugar que conocemos habitado por seres vivos.","Este planeta dinámico tiene estaciones, casquetes polares, volcanes extintos, cañones y clima. Recientemente, se ha descubierto que también contó en algún momento con agua en estado líquido. Cuenta con dos satélites: Fobos y Deimos.","Es el planeta más grande de nuestro sistema solar – si fuera un caparazón hueco, 1,000 Tierras podrían caber dentro. También es el planeta más antiguo, formándose a partir del polvo y los gases que quedaron de la formación del Sol hace 4.500 millones de años.","Es también un gigante gaseoso, y está rodeado por un espectacular sistema de anillos y tiene docenas de lunas por lo que probablemente es el planeta que cuenta con más satélites.","Tiene el tercer diámetro más grande de planetas en el sistema solar. Es un gigante gaseoso pero, a diferencia de Júpiter y Saturno, que están formados mayormente por helio e hidrógeno, Urano está compuesto principalmente por agua congelada, metano y amoniaco.","Oscuro, frío y azotado por vientos supersónicos, el gigante de hielo Neptuno está más de 30 veces más lejos del Sol que la Tierra. Es el menor de los cuatro gigantes gaseosos."};
        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,planetas);
        spinner.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,planetas));

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                imagenes.setImageResource(imagen[position]);
                desc.setText(descripciones[position]);
                desc2.setText(info[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}