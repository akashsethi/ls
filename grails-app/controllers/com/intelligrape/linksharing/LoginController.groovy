package com.intelligrape.linksharing

class LoginController {
    static defaultAction = "index"

    def index() {
        render(view: "index")
    }

    def auth() {
        User user = User.findByUsernameAndPassword(params.username, params.password)
        if (user) {
            session.currentUser = user.id
            redirect(controller: "user", action: "dashboard")
            return
        }
        flash.message = g.message(code: 'login.fail', default: 'invalid username/password')
        render view: "index"
    }

    def logout(){
        session.invalidate()
        flash.message=g.message(code: 'Logout.message',default: 'logout successfully')
        redirect(controller: "login",action: "index")
    }

}
