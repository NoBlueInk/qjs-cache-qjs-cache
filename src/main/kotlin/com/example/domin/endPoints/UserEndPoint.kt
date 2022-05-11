package com.example.domin.endPoints

sealed class UserEndPoint(val path:String){
    object Root: UserEndPoint(path = "/")
    object SignUp: UserEndPoint(path = "user/add_user")
    object SignIn: UserEndPoint(path = "user/sign_in")
    object Authenticate: UserEndPoint