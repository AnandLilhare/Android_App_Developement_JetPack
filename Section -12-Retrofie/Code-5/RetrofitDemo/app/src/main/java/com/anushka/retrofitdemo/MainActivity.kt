package com.anushka.retrofitdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.liveData
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text_view = findViewById<TextView>(R.id.text_view)
        val retService = RetrofitInstance
            .getRetrofitInstance()
            .create(AlbumService::class.java)
        val responseLiveData: LiveData<Response<Albums>> = liveData {
            val response = retService.getAlbums()
            emit(response)
        }
        responseLiveData.observe(this, Observer {
            val albumsList = it.body()?.listIterator()
            if(albumsList!=null){
                while (albumsList.hasNext()){
                    val albumsItem = albumsList.next()
                    val result =" "+"Album Title : ${albumsItem.title}"+"\n"+
                            " "+"Album id : ${albumsItem.id}"+"\n"+
                            " "+"User id : ${albumsItem.userId}"+"\n\n\n"
                    text_view.append(result)
                }
            }
        })
    }
}