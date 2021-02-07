package org.wit.gaa_referee_app.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import org.wit.gaa_referee_app.R
import org.wit.gaa_referee_app.databinding.ActivityLoginBinding
import org.wit.gaa_referee_app.util.toast

class LoginActivity : AppCompatActivity(), AuthListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Bind the layout to the ViewModel
        // ActivityLoginBinding - naming convention is to use the layout
        // name activity_login and CamelCase it to ActivityLogin and add Binding
        // this = this activity LoginActivity
        // 2nd parameter is the layout we want to bind too
        val binding: ActivityLoginBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_login)

        // get the ViewModel
        val viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)

        // bind our data from our viewModel to the layout activity_login
        binding.viewmodel = viewModel

        // Bind the authListener to our viewModel (this current class contains our
        // AuthListener declare at the top with the class)
        viewModel.authListener = this
    }

    override fun onStarted() {
        toast("Login Started")
    }

    override fun onSuccess() {
        toast("Login Success")

    }

    override fun onFailure(message: String) {
        toast(message)

    }
}