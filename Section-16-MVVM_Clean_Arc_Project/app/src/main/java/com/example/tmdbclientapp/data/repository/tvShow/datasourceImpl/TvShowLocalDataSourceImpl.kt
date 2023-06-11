package com.anushka.tmdbclient.data.repository.tvshow.datasourceImpl


import com.example.tmdbclientapp.data.repository.tvShow.datasource.TvShowLocalDataSource
import com.example.tmdbclientapp.data.db.TvShowDao
import com.example.tmdbclientapp.data.model.tvshow.TvShow
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TvShowLocalDataSourceImpl(private val tvDao: TvShowDao):
    TvShowLocalDataSource {
    override suspend fun getTvShowsFromDB(): List<TvShow> {
       return tvDao.getTvShows()
    }

    override suspend fun saveTvShowsToDB(tvShows: List<TvShow>) {
        CoroutineScope(Dispatchers.IO).launch {
            tvDao.saveTvShows(tvShows)
        }
    }

    override suspend fun clearAll() {
       CoroutineScope(Dispatchers.IO).launch {
           tvDao.deleteAllTvShows()
       }
    }
}