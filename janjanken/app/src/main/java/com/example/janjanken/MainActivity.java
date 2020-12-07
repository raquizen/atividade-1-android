package com.example.janjanken;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
        private ImageButton papelButton;
        private ImageButton pedraButton;
        private ImageButton tesouraButton;
        private TextView  vitoriaView;
        private TextView derrotaView;
        private TextView maquinaView;
        private TextView voceView;
        int contador, contado1;
        String tipoEscolha,tipoMaquinaEscolha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vitoriaView = (TextView) findViewById(R.id.vitoria);
        derrotaView=( TextView) findViewById(R.id.derrota) ;
        maquinaView=( TextView) findViewById(R.id.maquina) ;
        voceView=( TextView) findViewById(R.id.vc) ;

       papelButton =(ImageButton) findViewById(R.id.papel);
       papelButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

               int minhaEscolha = 1;
               tipoEscolha = "Papel";
                voceView.setText(String.valueOf(tipoEscolha));
                Random random = new Random();
                int escolhaMaquina = random.nextInt(4 - 1) +1;
                if((minhaEscolha - escolhaMaquina) == -1){
                    contador++;
                    String result = "Voce ganhou";
                    tipoMaquinaEscolha = "Pedra";
                    maquinaView.setText(String.valueOf(tipoMaquinaEscolha));
                    vitoriaView.setText(String.valueOf(contador));
                    Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();
                }else if((minhaEscolha - escolhaMaquina) == -2){
                    contado1++;
                    String result = "Voce Perdeu";
                    tipoMaquinaEscolha = "Tesoura";
                    maquinaView.setText(String.valueOf(tipoMaquinaEscolha));
                    derrotaView.setText(String.valueOf(contado1));
                    Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();
                }else{
                    String result = "Empate";
                    tipoMaquinaEscolha = "Papel";
                    maquinaView.setText(String.valueOf(tipoMaquinaEscolha));
                    Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();
                }


            }
        });
        pedraButton =(ImageButton) findViewById(R.id.pedra);
        pedraButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                int minhaEscolha = 2;
                tipoEscolha = "Pedra";
                voceView.setText(String.valueOf(tipoEscolha));
                Random random = new Random();
                int escolhaMaquina = random.nextInt(4 - 1) +1;
                if((minhaEscolha - escolhaMaquina) == -1){
                    contador++;
                    String result = "Voce ganhou";

                    tipoMaquinaEscolha = "Tesoura";
                    vitoriaView.setText(String.valueOf(contador));
                    maquinaView.setText(String.valueOf(tipoMaquinaEscolha));
                    Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();
                }else if((minhaEscolha - escolhaMaquina) == 1){
                    contado1++;
                    String result = "Voce Perdeu";
                    tipoMaquinaEscolha = "Papel";
                    derrotaView.setText(String.valueOf(contado1));
                    maquinaView.setText(String.valueOf(tipoMaquinaEscolha));
                    Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();
                }else{
                    String result = "Empate";
                    tipoMaquinaEscolha = "Pedra";
                    maquinaView.setText(String.valueOf(tipoMaquinaEscolha));
                    Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();
                }

            }
        });
        tesouraButton =(ImageButton) findViewById(R.id.tesoura);
        tesouraButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                int minhaEscolha = 3;
                tipoEscolha = "Tesoura";
                voceView.setText(String.valueOf(tipoEscolha));
                Random random = new Random();
                int escolhaMaquina = random.nextInt(4 - 1) +1;
                if((minhaEscolha - escolhaMaquina) == 2){
                    contador++;
                    String result = "Voce ganhou";
                    tipoMaquinaEscolha = "Papel";
                    vitoriaView.setText(String.valueOf(contador));
                    maquinaView.setText(String.valueOf(tipoMaquinaEscolha));
                    Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();
                }else if((minhaEscolha - escolhaMaquina) == 1){
                    contado1++;
                    String result = "Voce Perdeu";
                    tipoMaquinaEscolha = "Pedra";
                    derrotaView.setText(String.valueOf(contado1));
                    maquinaView.setText(String.valueOf(tipoMaquinaEscolha));
                    Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();
                }else{
                    String result = "Empate";
                    tipoMaquinaEscolha = "Tesoura";
                    maquinaView.setText(String.valueOf(tipoMaquinaEscolha));
                    Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
