package com.example.tenma.wolkapp2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;

public class AppTitle extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.title_bgm);
        MediaPlayer bgm = MediaPlayer.create(this, uri);
        bgm.start();
    }

    public void button1(View view) {
        Toast.makeText(this, "ボタン1がおされたよ", Toast.LENGTH_SHORT).show();
    }

    public void button2(View view) {
        Toast.makeText(this, "ボタン2がおされたよ", Toast.LENGTH_SHORT).show();
    }

    public void button3(View view) {
        Toast.makeText(this, "ボタン3がおされたよ", Toast.LENGTH_SHORT).show();
        //インテントの作成
        Intent intent = new Intent(this, AppStatus.class);
        //遷移先の画面を起動
        startActivity(intent);

    }
}