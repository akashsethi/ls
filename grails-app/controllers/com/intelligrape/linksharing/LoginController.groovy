package com.intelligrape.linksharing

class LoginController {
    static defaultAction = "loginHanler"

    def loginHandler(LoginCommand loginCommand) {
        (loginCommand.validate()) ? render("hello") :
            redirect(controller: "register", action: "login")
        flash.messages = "invalid username/password"
    }
}