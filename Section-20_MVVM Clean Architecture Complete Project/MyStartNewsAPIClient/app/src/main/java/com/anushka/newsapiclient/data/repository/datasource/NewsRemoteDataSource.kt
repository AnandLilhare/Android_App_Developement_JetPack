package com.anushka.newsapiclient.data.repository.datasource

import com.anushka.newsapiclient.data.model.APIResponse
import retrofit2.Response

interface NewsRemoteDataSource {
    suspend fun getTopHeadlines():Response<APIResponse>
}