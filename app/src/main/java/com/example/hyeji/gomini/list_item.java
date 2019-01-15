package com.example.hyeji.gomini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class list_item extends AppCompatActivity {

    private String profile_image;
    private String content;

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public list_item(String profile_image, String content) {
        this.profile_image = profile_image;
        this.content = content;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item);
    }
}
