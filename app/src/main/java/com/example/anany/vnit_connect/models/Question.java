package com.example.anany.vnit_connect.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by shivali on 25/3/18.
 */

public class Question {


    private static int c = 2;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAutoId() {
        return autoId;
    }

    public void setAutoId(String autoId) {
        this.autoId = autoId;
    }

    private String autoId;

    public String getAbuse() {
        return abuse;
    }

    public void setAbuse(String abuse) {
        this.abuse = abuse;
    }

    private String abuse;
    private String category;
    private int qid;
    private String question, user;
    private List<String> tags = new ArrayList<>();
    private Date timestamp = new Date();

    public Question() {
        qid = ++c;
    }

    public Question(String question, String user, Date ts, List<String> tags) {
        this.question = question;
        this.user = user;
        this.timestamp = ts;
        this.tags = tags;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date date) {
        this.timestamp = date;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }
}
