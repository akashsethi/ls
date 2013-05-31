package com.intelligrape.linksharing

import grails.validation.Validateable

@Validateable
class LoginCommand {

    String username
    String password

    static constraints = {
        username(blank: false, validator: {val ->
            if (!User.findByUsername(val)) {
                return ['loginCommand.user.not.found.message']
            }

        })
        password(blank: false, validator: {val, obj ->
            if (val != User.findByUsername(obj.userName).password) {
                return ['loginCommand.user.not.found.message']
            }
        })

    }


}
