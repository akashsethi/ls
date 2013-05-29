package com.intelligrape.linksharing

abstract class Resource {
    User creator
    String title
    String summary
    Date dateCreated
    Date lastUpdated

    static belongsTo = [topic: Topic]

    static constraints = {
        title(unique: true)
    }
    static mapping = {

    }
}
