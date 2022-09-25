package com.example.weightaandmassconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConverterGram();
        ConverterKilogram();
        ConverterTonne();
        ConverterPound();
        Reset();
    }


    public void ConverterGram(){
        Button btn1=findViewById(R.id.button4);
        Button btn2=findViewById(R.id.button3);
        Button btn3=findViewById(R.id.button1);
        Button btn4=findViewById(R.id.button2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.editText);
                EditText editText1=findViewById(R.id.editText1);
                EditText editText2=findViewById(R.id.editText2);
                EditText editText3=findViewById(R.id.editText3);


                float GramToKiloGram=Float.parseFloat(editText.getText().toString());
                float GramToKG=GramToKiloGram/1000;

                editText1.setText(String.valueOf(GramToKG));


                float GramToTonne=Float.parseFloat(editText.getText().toString());
                float GramToTon= GramToTonne/1000000;

                editText2.setText(String.valueOf(GramToTon));


                float GramToPound=Float.parseFloat(editText.getText().toString());
                float GroPound= (float) (GramToPound/453.6);

                editText3.setText(String.valueOf(GroPound));
            }
        });


    }
    public void ConverterKilogram() {
        Button btn1 = findViewById(R.id.button4);
        Button btn2 = findViewById(R.id.button3);
        Button btn3 = findViewById(R.id.button1);
        Button btn4 = findViewById(R.id.button2);



        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.editText);
                EditText editText1=findViewById(R.id.editText1);
                EditText editText2=findViewById(R.id.editText2);
                EditText editText3=findViewById(R.id.editText3);


                float KilogramToGram=Float.parseFloat(editText1.getText().toString());
                float KGToGram= KilogramToGram*1000;
                editText.setText(String.valueOf(KGToGram));


                float KilogramToTonne=Float.parseFloat(editText1.getText().toString());
                float KGToTonne=KilogramToTonne/1000;
                editText2.setText(String.valueOf(KGToTonne));


                float KilogramToPound=Float.parseFloat(editText1.getText().toString());
                float KGToPound= (float) (KilogramToPound*2.205);
                editText3.setText(String.valueOf(KGToPound));

            }
        });
    }


    public void ConverterTonne() {
        Button btn1 = findViewById(R.id.button4);
        Button btn2 = findViewById(R.id.button3);
        Button btn3 = findViewById(R.id.button1);
        Button btn4 = findViewById(R.id.button2);



        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.editText);
                EditText editText1=findViewById(R.id.editText1);
                EditText editText2=findViewById(R.id.editText2);
                EditText editText3=findViewById(R.id.editText3);


                float TonneToGram=Float.parseFloat(editText2.getText().toString());
                float TnToGram= TonneToGram*1000000;
                editText.setText(String.valueOf(TnToGram));


                float TonneToKilogram=Float.parseFloat(editText2.getText().toString());
                float TonneToKG=TonneToKilogram*1000;
                editText1.setText(String.valueOf(TonneToKG));


                float TonneToPound=Float.parseFloat(editText2.getText().toString());
                float TonToPound= TonneToPound*2205;
                editText3.setText(String.valueOf(TonToPound));

            }

        });

    }

    public void ConverterPound() {
        Button btn1 = findViewById(R.id.button4);
        Button btn2 = findViewById(R.id.button3);
        Button btn3 = findViewById(R.id.button1);
        Button btn4 = findViewById(R.id.button2);



        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.editText);
                EditText editText1=findViewById(R.id.editText1);
                EditText editText2=findViewById(R.id.editText2);
                EditText editText3=findViewById(R.id.editText3);


                float PoundToGram=Float.parseFloat(editText3.getText().toString());
                float PoundToG= (float) (PoundToGram*453.6);
                editText.setText(String.valueOf(PoundToG));


                float PoundToKilogram=Float.parseFloat(editText3.getText().toString());
                float PoundToKG= (float) (PoundToKilogram/2.205);
                editText1.setText(String.valueOf(PoundToKG));


                float PoundToTonne=Float.parseFloat(editText3.getText().toString());
                float PoundToTon=PoundToTonne/2205;
                editText2.setText(String.valueOf(PoundToTon));

            }

        });

    }

    public void Reset(){
        Button resetbtn=findViewById(R.id.resetbtn);
        resetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.editText);
                EditText editText1=findViewById(R.id.editText1);
                EditText editText2=findViewById(R.id.editText2);
                EditText editText3=findViewById(R.id.editText3);


                editText.setText(null);
                editText1.setText(null);
                editText2.setText(null);
                editText3.setText(null);

            }
        });


    }




}