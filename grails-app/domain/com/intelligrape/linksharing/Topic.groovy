package com.intelligrape.linksharing
class Topic {
    String topicName
    TopicVisibilityEnum visibility
    Date dateCreated
    Date lastUpdated

    String toString() {
        return topicName
    }

    static belongsTo = [owner: User]

    static hasMany = [resources: Resource]

    static constraints = {
        topicName(unique: true, blank: false)
    }
}
