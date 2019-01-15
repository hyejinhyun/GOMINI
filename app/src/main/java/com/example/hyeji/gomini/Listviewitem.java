package com.example.hyeji.gomini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Listviewitem extends AppCompatActivity {
    private String image;
    private String content;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Listviewitem(String image, String content) {
        this.image = image;
        this.content = content;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item);
    }
}
