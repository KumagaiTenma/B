package com.example.tenma.wolkapp2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

public class AppMain extends AppCompatActivity{

    MediaPlayer bgm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.gifView);
        GlideDrawableImageViewTarget target = new GlideDrawableImageViewTarget(imageView);
        Glide.with(this).load(R.raw.gif2).into(target);

        //リソースファイルから再生
        bgm = MediaPlayer.create(this, R.raw.main_b);
        bgm.start();
        bgm.setLooping(true);
    }

    @Override
    protected void onPause() {
        super.onPause();

        bgm.pause();
        bgm.release();
        bgm = null;
    }

    public void back3(View view) {
        //インテントの作成
        Intent intent = new Intent(this, AppTitle.class);
        //遷移先の画面を起動
        startActivity(intent);
    }
    public void back4(View view) {
        Toast toast = Toast.makeText(this, "スタートボタン", Toast.LENGTH_LONG);
        toast.show();
    }
    public void back5(View view) {
        Toast toast = Toast.makeText(this, "ストップボタン", Toast.LENGTH_LONG);
        toast.show();
    }
}
