package com.example.android.notepad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.w3c.dom.NodeList;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTheme(android.R.style.Theme_Black_NoTitleBar_Fullscreen);//隐藏标题栏实现全屏

        Timer timer =new Timer();
        TimerTask task=new TimerTask(){//实例化计时器
            @Override
            public void run(){
                //activity跳转
                Intent intent =new Intent(MainActivity.this, NotesList.class);
                startActivity(intent);
                finish();
            }
        };
        //设置时间
        timer.schedule(task,1500);

    }
}
