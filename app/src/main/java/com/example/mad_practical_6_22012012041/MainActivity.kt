package com.example.mad_practical_6_22012012041

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var playAudio:FloatingActionButton=findViewById<FloatingActionButton>(R.id.play);
        playAudio.setOnClickListener { startActivity(Intent.ACTION_VIEW).also { this.play()} }
        var shuffleAudio:FloatingActionButton=findViewById<FloatingActionButton>(R.id.shuffle);
        var pkipPrevious:FloatingActionButton=findViewById<FloatingActionButton>(R.id.previous);
        var skipNext:FloatingActionButton=findViewById<FloatingActionButton>(R.id.next);
        var stopAudio:FloatingActionButton=findViewById<FloatingActionButton>(R.id.stop);


    }

    fun play(){
        var mp=MediaPlayer.create(this,R.raw.song);
        mp.prepare();
        mp.start()
    }
}