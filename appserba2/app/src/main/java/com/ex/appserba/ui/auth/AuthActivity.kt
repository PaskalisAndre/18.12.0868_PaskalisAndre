package com.ex.appserba.ui.auth

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.ex.appserba.R
import com.ex.appserba.data.model.AuthUser
import com.ex.appserba.databinding.ActivityAuthBinding
import com.ex.appserba.ui.home.MainActivity

class AuthActivity : AppCompatActivity() {
    lateinit var binding: ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_auth)
    }
    fun onSuccess(user: AuthUser?){
    val intet = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}