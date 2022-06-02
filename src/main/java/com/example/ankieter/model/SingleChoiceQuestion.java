package com.example.ankieter.model;

import com.google.gson.*;
import javax.persistence.*;

@Entity
public class SingleChoiceQuestion extends Question {

    SingleChoiceQuestion() {
        this.type = "singleChoice";
    }

    @Column(name = "answers")
    private String answers; // json z tablicą odpowiedzi

    public String[] getAnswers() {
        return new Gson().fromJson(answers, String[].class);
    }

    public void setAnswers(String[] answers) {
        this.answers = new Gson().toJson(answers);
    }

    public String getType() {
        return this.type;
    }
}
