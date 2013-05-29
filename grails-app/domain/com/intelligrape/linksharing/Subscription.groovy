package com.intelligrape.linksharing

class Subscription {

    Seriousness seriousness
    Date dateCreated
    Date lastUpdated

    static belongsTo = [subscriber: User, topic: Topic]

    static constraints = {

    }
}
