package com.intelligrape.linksharing

class User {
    String firstName
    String lastName
    Date dateOfBirth
    String email
    String password
    Boolean isMale
    Date dateCreated
    Date lastUpdated

    String toString() {
        return firstName
    }

    static hasMany = [topics: Topic, subscriptions: Subscription, readingItems: ReadingItem]

    static constraints = {
        firstName(blank: false)
        lastName(blank: false)
        email(unique: true, email: true, blank: false)
        password(blank: false)
        subscriptions(unique: true)

    }
}
