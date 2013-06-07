package com.intelligrape.linksharing

class User {
    String username
    String firstName
    String lastName
    Date dateOfBirth
    String password
    Boolean isMale = true
    Date dateCreated
    Date lastUpdated

    def readingItemList() {
        return ReadingItem.findAllByUserAndIsRead(this, false)
    }

    def subscribedTopicList() {
        Subscription.findAllBySubscriber(this)
    }

    def linkResourceList() {
        LinkResource.findAllByCreator(this)
    }

    static hasMany = [topics: Topic, subscriptions: Subscription, readingItems: ReadingItem]

    static constraints = {
        firstName(nullable: true)
        lastName(nullable: true)
        username(unique: true, email: true, blank: false)
        password(blank: false)
        subscriptions(unique: true)
    }
}
