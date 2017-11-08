package com.example.tenma.wolkapp2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Tenma on 2017/11/08.
 */

public class AppStatus extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.title_bgm);
        MediaPlayer bgm = MediaPlayer.create(this, uri);
        bgm.start();
    }
    Intent intent = this.getIntent();

}
