package com.example.quizzo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.List;

public class MainGame extends AppCompatActivity {
    public int points;
    public String username;
    public int currentQNum;
    public List<Qustion> questions;
    public List<Answer> possibleAnswers;

    String fileName="Quizzo_ListQA";
    String path;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_layout);
    }

    public void Confirm(View view){
        //
    }

    //metodo per caricare da file le due liste


}




class Qustion{
    public int id;
    public String question;
    public String correctAnswer;
    public Qustion(){

    }

    public Qustion(int ID, String q, String ca){
        this.id=ID;
        this.question=q;
        this.correctAnswer=ca;
    }
}

class Answer{
    public int id;
    public String questionN1;
    public String questionN2;
    public String questionN3;
    public String questionN4;

    public Answer(){

    }

    public Answer(int ID, String a, String b,String c,String d){
        this.id=ID;
        this.questionN1=a;
        this.questionN2=b;
        this.questionN3=c;
        this.questionN4=d;
    }
}


