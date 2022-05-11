package com.example.domin.endPoints

sealed class UserEndPoint(val path:String){
    object Root: UserEndPoint(path = "/")
    object SignUp: UserEndPoint(path = "user/add_user")
    object SignIn: UserEndPoint(path = "user/sign_in")
    object Authenticate: UserEndPoint(path = "user/authenticate")
    object Secret: UserEndPoint(path = "user/secret")
    object UpdatePassword: UserEndPoint(path = "user/update_password")
    object Dele