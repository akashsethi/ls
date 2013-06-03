package com.intelligrape.linksharing

class RegisterController {

    def bootstrapService
    static defaultAction = "login"

    def login() {
    }

    def registerNewUser(RegisterCommand registerCommand) {
        try {
            bootstrapService.createUser(registerCommand.firstName, registerCommand.lastName, registerCommand.userName
                    , registerCommand.password, registerCommand.isMale)
            flash.message = "Succefully Registered"
            render view: "/user/login"
        }
        catch (Exception e) {
            render view: "/user/login", model: [registerCommand: registerCommand]
        }
    }

}
