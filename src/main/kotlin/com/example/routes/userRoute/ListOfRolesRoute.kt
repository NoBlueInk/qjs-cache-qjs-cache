package com.example.routes.userRoute

import com.example.domin.endPoints.UserEndPoint
import io.ktor.server.routing.*

fun Route.listOfRoles(){
    post(UserEndPoint.ListOfRoles.path) {



    }
}