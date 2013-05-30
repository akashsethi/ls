package com.intelligrape.linksharing

import grails.validation.Validateable

@Validateable
class RegisterCommand {

    String userName
    String firstName
    String lastName
    String password
    String conformPassword
    Date dateOfBirth
    Boolean isMale

    static constraints = {
        userName(blank: false, email: true, validator: {val ->
            if (User.countByUserName(val)) {
                return ['registerCommand.userName.unique.message']
            }
        })
        firstName(blank: false)
        lastName(blank: false)
        password(blank: false)
        conformPassword(validator: {val, obj ->
            if (val != obj.password) {
                return ['registerCommand.password.mismatch.message']
            }
        })

    }
}
