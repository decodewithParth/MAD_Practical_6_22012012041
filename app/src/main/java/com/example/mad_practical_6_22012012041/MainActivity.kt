package com.example.mad_practical_6_22012012041

import android.content.Intent
import android.media.AudioAttributes
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var playAudio:FloatingActionButton=findViewById<FloatingActionButton>(R.id.play);
        playAudio.setOnClickListener { play() }
        var stopAudio:FloatingActionButton=findViewById<FloatingActionButton>(R.id.stop);
        stopAudio.setOnClickListener { stop() };
    }

    fun play(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply { startService(this) };
    }

    fun stop(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply { stopService(this) };
    }
}