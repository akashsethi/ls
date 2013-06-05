package com.intelligrape.linksharing
class Topic {
    String topicName
    Visibility visibility
    Date dateCreated
    Date lastUpdated

    static belongsTo = [owner: User]

    static hasMany = [resources: Resource]

    static constraints = {
        topicName(unique: true, blank: false)
    }
    String toString(){
        return topicName
    }
}
