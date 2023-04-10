package com.example.musicapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val playButton = findViewById<ImageButton>(R.id.play_btn)
        val mediaplayer : MediaPlayer = MediaPlayer.create(this, R.raw.music)
        playButton.setOnClickListener {
                if (!mediaplayer.isPlaying){
                    mediaplayer.start()
                    playButton.setImageResource(R.drawable.baseline_pause_24)

                }else{
                    mediaplayer.pause()
                    playButton.setImageResource(R.drawable.baseline_play_arrow_24)
                }

        }


    }
}