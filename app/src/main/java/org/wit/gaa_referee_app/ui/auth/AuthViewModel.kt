package org.wit.gaa_referee_app.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel

class AuthViewModel: ViewModel() {
    var email: String? = null
    var password: String? = null

    // Listener
    var authListener: AuthListener? = null

    // Function for when the login button
    // is clicked for click functions pass in the View
    fun onLoginButtonClick(view: View){
        // call the onStarted listener function
        authListener?.onStarted()
        if(email.isNullOrEmpty() || password.isNullOrEmpty())
        {
            // call the onFailure listener function
            authListener?.onFailure("Invalid email or password")
            return
        }

        // call the onSuccess listener function
        authListener?.onSuccess()
        //authenticate
    }
}