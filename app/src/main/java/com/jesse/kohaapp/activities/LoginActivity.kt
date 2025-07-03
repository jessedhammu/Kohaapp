package com.jesse.kohaapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jesse.kohaapp.models.User
import com.jesse.kohaapp.network.ApiClient
import com.jesse.kohaapp.network.KohaService
import retrofit2.Callback
import java.util.Base64

private val LoginActivity.usernameEditText: Any

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