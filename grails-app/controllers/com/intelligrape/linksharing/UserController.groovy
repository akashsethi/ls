package com.intelligrape.linksharing

class UserController {
    def userService
    def scaffold = true
    static defaultAction = ""

    def login() {}

    def registerNewUser(RegisterCommand registerCommand) {
        User user = userService.save(new User(username: registerCommand.userName, firstName: registerCommand.firstName,
                password: registerCommand.password))
        if (user) {
            flash.message = "Registered Successfully, Please login"
            render view: "login"
        }
        else{
            flash.message="please retry"
            render view: "login"
        }
    }


}
