package com.intelligrape.linksharing

class ApplicationFilters {

    def filters = {
        all(controller: '*', action: '*') {
            before = {
                if (!session.currentUser && !actionName.equals("index") && !actionName.equals("auth")
                        && !actionName.equals("index") && !actionName.equals("resetPassword") && !actionName.equals("forgotPassword")
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

        checkForAlreadyLoggedIn(controller: 'login',action: '*') {
            before = {
               if(session.currentUser && controllerName.equals("login")){
                   redirect(controller: "user",action: "dashboard")
               }
            }
        }
    }
}
