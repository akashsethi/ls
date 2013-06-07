package com.intelligrape.linksharing

class RegisterController {
    def userService

    def index(RegisterCommand registerCommand) {
        if (!registerCommand?.hasErrors()) {
            User user = new User(username: registerCommand.userName, firstName: registerCommand.firstName,
                    password: registerCommand.password)
            if (userService.save(user)) {
                flash.message = g.message(code: 'register.successful', default: 'successfully registered')
                render view: "/login/index"
            }
        }
        render view: "/login/index", model: [registerCommand: registerCommand]
    }

    def forgotPassword() {}

    def resetPassword() {
        User user = User.findByUsernameAndDateOfBirth(params.userName, params.dateOfBirth)
        if (user) {
            render(view: "resetPassword", model: [user: user])
            return
        }
        flash.message = "not found"
        redirect(action: "forgotPassword")
    }

    def savePassword(PasswordCommand passwordCommand) {
        if (!passwordCommand?.hasErrors()) {
            User user = User.get(params.userId)
            user.password = passwordCommand.password
            if (user.save(flush: true)) {
                redirect(controller: "login", action: "index")
                return
            }
        }
        render view: "resetPassword", model: [passwordCommand: passwordCommand]
    }
}
