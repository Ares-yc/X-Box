package com.ares.x_box;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ares.movie.MovieHomeActivity;
import com.ares.music.MusicHomeActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_music,R.id.btn_movie})
    public void intentModule(View view){
        Intent intent = null;
        switch (view.getId()){
            case R.id.btn_music:
                intent = new Intent(MainActivity.this,MusicHomeActivity.class);
                break;
            case R.id.btn_movie:
                intent = new Intent(MainActivity.this, MovieHomeActivity.class);
                break;
        }
        startActivity(intent);
    }
}
