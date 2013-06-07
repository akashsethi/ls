package com.intelligrape.linksharing

class LogoutController {

    def logout() {
        session.invalidate()
        flash.message = g.message(code: 'Logout.message', default: 'logout successfully')
        redirect(controller: "login", action: "index")
    }

}
