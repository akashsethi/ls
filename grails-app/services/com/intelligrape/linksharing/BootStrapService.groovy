package com.intelligrape.linksharing

class BootStrapService {

    BootStrapService() {

    }

    def bootStrap() {
        User user = new User(firstName: "Akash", lastName: "Sethi", email: "akash@intelligrape.com", password: "igdefault",
                male: true, dateOfBirth: "8-apr-1990").save(failOnError: true)

    }

    def serviceMethod() {

    }
}
