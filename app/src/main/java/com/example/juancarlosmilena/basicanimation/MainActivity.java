package com.example.juancarlosmilena.basicanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView bartImageView, homerImageView;
    View.OnClickListener pulsacion;
    Boolean isBartVisible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bartImageView = findViewById(R.id.bartImageView);
        homerImageView = findViewById(R.id.homerImageView);
        homerImageView.animate().alpha(0);
        isBartVisible = true;

        pulsacion = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isBartVisible){

                    bartImageView.animate().alpha(0).setDuration(2000);
                    homerImageView.animate().alpha(1).setDuration(2000);
                    isBartVisible = false;
                }
                else {
                    bartImageView.animate().alpha(1).setDuration(2000);
                    homerImageView.animate().alpha(0).setDuration(2000);
                    isBartVisible = true;
                }

            }
        };


        bartImageView.setOnClickListener(pulsacion);
        homerImageView.setOnClickListener(pulsacion);



    }

    //Forma alternativa de realizar definiendo el nombre de la funcion
    //en el atributo OnClick de los ImageViews


    /*public void pulsado (){

        if(isBartVisible){

            bartImageView.animate().alpha(0).setDuration(2000);
            homerImageView.animate().alpha(1).setDuration(2000);
            isBartVisible = false;
        }
        else {
            bartImageView.animate().alpha(1).setDuration(2000);
            homerImageView.animate().alpha(0).setDuration(2000);
            isBartVisible = true;
    }

    }*/
}
