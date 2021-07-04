package com.pahnal.newsapp.ui

import androidx.lifecycle.ViewModel
import com.pahnal.newsapp.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
): ViewModel() {

}