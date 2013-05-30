package com.intelligrape.linksharing

import grails.validation.Validateable

@Validateable
class LoginCommand {

    String userName
    String password

    static constraints = {
        userName(blank: false, validator: {val ->
            if (!User.findByUserName(val)) {
                return ['loginCommand.user.not.found.message']
            }
        })
        password(blank: false, validator: {val, obj ->
            if (val != User.findByUserName(obj.userName).password) {
                return ['loginCommand.user.not.found.message']
            }
        })

    }

}
