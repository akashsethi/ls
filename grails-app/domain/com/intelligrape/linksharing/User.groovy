package com.intelligrape.linksharing

class User {
    String firstName
    String lastName
    Date dateOfBirth
    String username
    String password
    Boolean isMale
    Date dateCreated
    Date lastUpdated

    String toString() {
        return firstName
    }

    static hasMany = [topics: Topic, subscriptions: Subscription, readingItems: ReadingItem]

    static constraints = {
        firstName(nullable: true)
        lastName(nullable: true)
        username(unique: true, email: true, blank: false)
        password(blank: false)
        subscriptions(unique: true)
        dateOfBirth(nullable: true)
        isMale(nullable: true)
    }
}
