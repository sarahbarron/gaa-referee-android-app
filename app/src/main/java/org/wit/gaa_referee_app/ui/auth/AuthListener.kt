package org.wit.gaa_referee_app.ui.auth

// whenever we click on a Button on the layout
// It triggers a function in the ViewModel but how we get
// a call back from the ViewModel to the activity to
// display the success/error message we use an interface

interface AuthListener{
    // The login is a network operation so will take time
    // when this operation is started we need to show a
    // progress bar while we wait
    fun onStarted()

    // Function if the auth is successful
    fun onSuccess()

    // Function if the auth is un successful. which
    // takes an error message as an argument
    fun onFailure(message: String)
}