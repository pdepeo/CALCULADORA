package com.example.calculadoradsa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    boolean decimal = false;
    boolean suma = false;
    boolean resta = false;
    boolean multiplicacion = false;
    boolean division = false;
    boolean radianes = false;
    boolean sin = false;
    boolean cos = false;
    boolean tan = false;
    Double[] numero = new Double[20];
    Double dato;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Botones numeros
        Button button0 = (Button) findViewById(R.id.button0);
        button0.setOnClickListener(this);
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);
        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);
        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(this);
        Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(this);
        Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(this);
        Button buttonComa = (Button) findViewById(R.id.button11);
        buttonComa.setOnClickListener(this);

        //Operaciones básicas
        Button buttonSuma = (Button) findViewById(R.id.button16);
        buttonSuma.setOnClickListener(this);
        Button buttonResta = (Button) findViewById(R.id.button15);
        buttonResta.setOnClickListener(this);
        Button buttonDivision = (Button) findViewById(R.id.button13);
        buttonDivision.setOnClickListener(this);
        Button buttonMultiplicacion = (Button) findViewById(R.id.button14);
        buttonMultiplicacion.setOnClickListener(this);

        //Operaciones trigonometricas
        Button buttonSin = (Button) findViewById(R.id.button);
        buttonSin.setOnClickListener(this);
        Button buttonCos = (Button) findViewById(R.id.button10);
        buttonCos.setOnClickListener(this);
        Button buttonTan = (Button) findViewById(R.id.button18);
        buttonTan.setOnClickListener(this);

        //Switch
        Switch switchRad = (Switch) findViewById(R.id.switch1);
        switchRad.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked == true){
                    radianes = true;
                    Toast.makeText(getBaseContext(),"TRUE",Toast.LENGTH_SHORT).show();
                }
                else {
                    radianes = false;
                    Toast.makeText(getBaseContext(), "FALSE", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //Añadir algo?


        Button buttonIgual = (Button) findViewById(R.id.button17);
        buttonIgual.setOnClickListener(this);
        Button buttonAC = (Button) findViewById(R.id.button12);
        buttonAC.setOnClickListener(this);

    }

    public void onClick(View view) {
        TextView screen = (TextView) findViewById(R.id.textView);
        int selector = view.getId();
        String x = screen.getText().toString();

        try {
            switch (selector) {
                case R.id.button0:
                    screen.setText(x + "0");
                    break;
                case R.id.button1:
                    screen.setText(x + "1");
                    break;
                case R.id.button2:
                    screen.setText(x + "2");
                    break;
                case R.id.button3:
                    screen.setText(x + "3");
                    break;
                case R.id.button4:
                    screen.setText(x + "4");
                    break;
                case R.id.button5:
                    screen.setText(x + "5");
                    break;
                case R.id.button6:
                    screen.setText(x + "6");
                    break;
                case R.id.button7:
                    screen.setText(x + "7");
                    break;
                case R.id.button8:
                    screen.setText(x + "8");
                    break;
                case R.id.button9:
                    screen.setText(x + "9");
                    break;
                case R.id.button11: //Decimal
                    if (decimal == false) {
                        screen.setText(x + ".");
                        decimal = true;
                    } else return;
                    break;
                case R.id.button12: //AC
                    screen.setText("");
                    decimal = false;
                    break;
                case R.id.button13: //Division
                    division = true;
                    numero[0] = Double.parseDouble(x);
                    screen.setText("");
                    decimal = false;
                    break;
                case R.id.button14: //Multiplicación
                    multiplicacion = true;
                    numero[0] = Double.parseDouble(x);
                    screen.setText("");
                    decimal = false;
                    break;
                case R.id.button15: //Resta
                    resta = true;
                    numero[0] = Double.parseDouble(x);
                    screen.setText("");
                    decimal = false;
                    break;
                case R.id.button16: //Suma
                    suma = true;
                    numero[0] = Double.parseDouble(x);
                    screen.setText("");
                    decimal = false;
                    break;


                case R.id.button://SIN
                    numero[0] = Double.parseDouble(x);
                    screen.setText("");
                    decimal = false;
                    if(radianes == true) {
                        dato = Math.sin(numero[0]);
                    }
                    else
                        dato = Math.sin(Math.toRadians(numero[0]));
                    screen.setText(String.valueOf(dato));
                    break;
                case R.id.button10://COS
                    numero[0] = Double.parseDouble(x);
                    screen.setText("");
                    decimal = false;
                    if(radianes == true) {
                        dato = Math.cos(numero[0]);
                    }
                    else
                        dato = Math.cos(Math.toRadians(numero[0]));
                    screen.setText(String.valueOf(dato));
                    break;
                case R.id.button18://TAN
                    numero[0] = Double.parseDouble(x);
                    screen.setText("");
                    decimal = false;
                    if(radianes == true) {
                        dato = Math.tan(numero[0]);
                    }
                    else
                        dato = Math.tan(Math.toRadians(numero[0]));
                    screen.setText(String.valueOf(dato));
                    break;

                case R.id.button17: //IGUAL
                    numero[1] = Double.parseDouble(x);
                    if (suma == true) {
                        dato = numero[0] + numero[1];
                        screen.setText(String.valueOf(dato));
                    } else if (resta == true) {
                        dato = numero[0] - numero[1];
                        screen.setText(String.valueOf(dato));
                    } else if (multiplicacion == true) {
                        dato = numero[0] * numero[1];
                        screen.setText(String.valueOf(dato));
                    } else if (division == true) {
                        dato = numero[0] / numero[1];
                        screen.setText(String.valueOf(dato));
                    } 


                    decimal = false;
                    suma = false;
                    division = false;
                    multiplicacion = false;
                    resta = false;

                    //screen.setText(x + "");
                    break;
            }


        } catch (Exception e) {
            screen.setText("Error");
        }


    }


}