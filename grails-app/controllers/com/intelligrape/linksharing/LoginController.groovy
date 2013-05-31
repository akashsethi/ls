package com.intelligrape.linksharing

class LoginController {
    static defaultAction = "loginHanler"

    def loginHandler(LoginCommand loginCommand) {
        (loginCommand.validate()) ?
           render(view: "", session.user=User.findByUsername(loginCommand.userName).id ):
            redirect(controller: "register", action: "login")
        flash.messages = "invalid username/password"
    }
}