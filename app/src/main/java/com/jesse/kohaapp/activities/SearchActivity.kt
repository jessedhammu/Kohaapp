package com.jesse.kohaapp.activities

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        ...
        searchButton.setOnClickListener {
            val query = searchEditText.text.toString()
            val service = ApiClient.retrofit.create(KohaService::class.java)
            service.searchBooks(query).enqueue(object : Callback<List<Book>> {
                override fun onResponse(...) {
                    // Display books in RecyclerView
                }
                override fun onFailure(...) {
                    // Show error
                }
            })
        }
    }
}