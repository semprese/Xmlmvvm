package com.bignerdranch.android.myapplication.ui.article

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs
import com.bignerdranch.android.myapplication.MainActivity
import com.bignerdranch.android.myapplication.R
import com.bignerdranch.android.myapplication.databinding.FragmentArticleBinding
import com.bignerdranch.android.myapplication.models.Article
import com.bignerdranch.android.myapplication.ui.NewsViewModel

class ArticleFragment : Fragment() {
    lateinit var articleViewModel: NewsViewModel
    lateinit var binding: FragmentArticleBinding
    val args: ArticleFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentArticleBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        articleViewModel = (activity as MainActivity).viewModel


        val article = args.article
        binding.webView.apply {
            webViewClient = WebViewClient()
            loadUrl(article.url)
        }
    }
}
