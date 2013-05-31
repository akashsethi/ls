package com.intelligrape.linksharing

class Subscription {

    Seriousness seriousness = Seriousness.CASUAL
    Date dateCreated
    Date lastUpdated

    static belongsTo = [subscriber: User, topic: Topic]

    static constraints = {

    }

    Subscription(Topic topic, Seriousness seriousness = Seriousness.CASUAL) {
        subscriber = topic?.owner
        this.topic = topic
        this.seriousness = seriousness
    }
}
