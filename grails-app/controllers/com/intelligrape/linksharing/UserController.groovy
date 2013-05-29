package com.intelligrape.linksharing

class UserController {
    def scaffold = true
    def login(){
       render(view: "login")
    }
}
