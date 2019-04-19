package com.example.quizzo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.security.Key;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainGame extends AppCompatActivity {
    public int points;
    public String username;
    public int currentQNum;
    public Map<String, Question> questions;
    public Map<String, Answer> possibleAnswers;

    String fileName="Quizzo_ListQA";
    String path;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_layout);
        points=0;
        username=getIntent().getExtras().getString("user_name");
        currentQNum=1;
        questions=getQuestions();
        possibleAnswers=getAnswers();
    }

    public Context CheckAnswer(View view){
        Context currentContext=getApplicationContext();

        return currentContext;
    }


    //metodo per caricare da file le due liste

    public Map<String, Question> getQuestions() {
        Map<String, Question> questions = new HashMap<String, Question>();
        questions.put("#1", new Question(1, "Nome del robottino aiutante di Archimede","Edy"));
        questions.put("#3", new Question(3, "Città veneta famopsa per la grappa", "Bassano"));
        questions.put("#2", new Question(2, "Cosa mangia pippo per diventare superpippo?", "arachide"));
        questions.put("#4", new Question(4, "Uccise il minotauro", "Teseo"));
        questions.put("#5", new Question(5, "Come si chiama la strega in perenne lotta con Paperon de Paperoni?", "Amelia"));
        questions.put("#6", new Question(6, "Figlio di Ulisse", "Telemaco"));
        return questions;
    }

    public Map<String, Answer> getAnswers(){
        Map<String, Answer> answers=new HashMap<String, Answer>();
        answers.put("#1", new Answer(1, "Rob", "Edy", "C-18", "R2D2"));
        answers.put("#2", new Answer(2, "mela", "fagiolo", "arachide", "cereali"));
        answers.put("#3", new Answer(3, "Legnano", "Chioggia", "Rovigo", "Bassano"));
        answers.put("#4", new Answer(4, "Androgeo", "Teseo", "Minosse", "Egeo"));
        answers.put("#5", new Answer(5, "Amelia", "Circe", "Ursula", "Maga Magò"));
        answers.put("#6", new Answer(6, "Odisseo", "Teseo", "Telemaco", "Argo"));

        return answers;
    }

}




class Question{
    public int id;
    public String question;
    public String correctAnswer;
    public Question(){

    }

    public Question(int ID, String q, String ca){
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


