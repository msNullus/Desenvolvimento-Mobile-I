package com.example.quiz10perguntas;

import android.content.Intent;
import android.app.Activity;
import android.os.Parcelable;
import android.widget.EditText;


public class Funcoes {

    protected void irPara(Activity atualActivity, Class activityDestino, Parcelable parametro) {
        Intent destino = new Intent(atualActivity, activityDestino);

        destino.putExtra("jogador", parametro);

        atualActivity.startActivity(destino);
    }

    protected String pegarTextoDaEdt(EditText edt) {
        return edt.getText().toString();
    }
    
    protected int obterRespostaCorreta(String questao) {
        int respostaCorreta;

        switch(questao) {
            
            case "questao-01":
                respostaCorreta = R.id.rdbQuestao01RespostaC;
                break;
                
            case "questao-02":
                respostaCorreta = R.id.rdbQuestao02RespostaA;
                break;
                
            case "questao-03":
                respostaCorreta = R.id.rdbQuestao03RespostaD;
                break;
                
            case "questao-04":
                respostaCorreta = R.id.rdbQuestao04RespostaC;
                break;
                
            case "questao-05":
                respostaCorreta = R.id.rdbQuestao05RespostaD;
                break;
                
            case "questao-06":
                respostaCorreta = R.id.rdbQuestao06RespostaA;
                break;
                
            case "questao-07":
                respostaCorreta = R.id.rdbQuestao07RespostaC;
                break;
                
            case "questao-08":
                respostaCorreta = R.id.rdbQuestao03RespostaC;
                break;
                
            case "questao-09":
                respostaCorreta = R.id.rdbQuestao09RespostaD;
                break;
                
            case "questao-10":
                respostaCorreta = R.id.rdbQuestao10RespostaC;
                break;
            
            default:
                respostaCorreta = 0;
                break;
        }
        
        return respostaCorreta;
    }
    
}
