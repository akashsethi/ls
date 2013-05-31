package com.intelligrape.linksharing


class UserService {

    User save(User user) {
        if (!(user?.validate(flush: true) && user?.save(flush: true))) {
            user = null
        }
        user
    }
}