package me.reim.multimodulesample.core.network

import kotlinx.coroutines.Deferred
import me.reim.multimodulesample.model.Article
import retrofit2.http.GET
import retrofit2.http.Query

interface QiitaApi {
    @GET("items")
    fun getItems(@Query("query") query: String): Deferred<List<Article>>
}
