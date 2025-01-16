package com.bignerdranch.android.myapplication.repository

import com.bignerdranch.android.myapplication.api.RetrofitInstance
import com.bignerdranch.android.myapplication.db.ArticleDatabase
import com.bignerdranch.android.myapplication.models.Article
import javax.inject.Inject

class NewsRepository @Inject constructor(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}