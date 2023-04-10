package com.example.musicapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var playButton = findViewById<ImageButton>(R.id.play_btn)
        mediaPlayer = MediaPlayer.create(this, R.raw.music)
        playButton.setOnClickListener {
                if (!mediaPlayer.isPlaying){
                    mediaPlayer.start()
                    playButton.setImageResource(R.drawable.baseline_pause_24)

                }else{
                    mediaPlayer.pause()
                    playButton.setImageResource(R.drawable.baseline_play_arrow_24)
                }

        }


    }
}