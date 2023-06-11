package com.example.tmdbclientapp.presentation.tv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.tmdbclientapp.R
import com.example.tmdbclientapp.databinding.ActivityTvBinding

class TvShowActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTvBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_tv)
    }
}