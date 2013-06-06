package com.intelligrape.linksharing

class ApplicationFilters {

    def filters = {
        all(controller: '*', action: '*') {
            before = {
                if (!session.currentUser && !actionName.equals("index") && !actionName.equals("auth")
                        && !actionName.equals("register") && !actionName.equals("passwordReset") && !actionName.equals("forgotPassword")
                        && !actionName.equals("savePassword")) {
                    flash.message = "Not Signed"
                    redirect(controller: "login", action: "index")
                    return false
                }
            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }
    }
}
