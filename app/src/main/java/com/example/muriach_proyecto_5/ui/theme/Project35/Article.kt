package com.example.muriach_proyecto_5.ui.theme.Project35

class Article (
    val name: String,
    val price: Double
) {
    override fun toString(): String {
        return "$name - Price: $price"
    }
}

class ArticleFunction {
    companion object {
        fun showArticles(articles: Array<Article>) {
            for (article in articles) {
                println(article)
            }
        }
    }
}