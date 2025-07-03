package com.jesse.kohaapp.activities

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        ...
        val username = usernameEditText.text.toString()
        val password = passwordEditText.text.toString()
        val credentials = "Basic " + Base64.encodeToString("$username:$password".toByteArray(), Base64.NO_WRAP)

        val service = ApiClient.retrofit.create(KohaService::class.java)
        service.getProfile(credentials).enqueue(object : Callback<User> {
            override fun onResponse(...) {
                // Navigate to ProfileActivity and pass data
            }
            override fun onFailure(...) {
                // Show error
            }
        })
    }
}