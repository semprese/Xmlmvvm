package com.bignerdranch.android.myapplication.ui.article

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bignerdranch.android.myapplication.ui.MainActivity
import com.bignerdranch.android.myapplication.databinding.FragmentArticleBinding
import com.bignerdranch.android.myapplication.databinding.FragmentFavouritesBinding
import com.bignerdranch.android.myapplication.ui.NewsViewModel
import com.google.android.material.snackbar.Snackbar

class ArticleFragment : Fragment() {
    lateinit var articleViewModel: NewsViewModel
    private var _binding: FragmentArticleBinding? = null
    private val binding get() = _binding!!

    val args: ArticleFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentArticleBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        articleViewModel = (activity as MainActivity).viewModel


        val article = args.article


        println(article.url)
        binding.webView.apply {
            webViewClient = WebViewClient()
            loadUrl(article.url)
        }

        binding.fab.setOnClickListener {
            articleViewModel.saveArticle(article)
            Snackbar.make(view, "Article added", Snackbar.LENGTH_SHORT).show()
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
