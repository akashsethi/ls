package com.intelligrape.linksharing

import grails.validation.Validateable
@ Validateable
class PasswordCommand {
    String password
    String conformPassword

    static constraints={
        conformPassword(validator: {val,obj->
            if(val!=obj.password){
                return false
            }
        })
    }
}
