package com.intelligrape.linksharing

abstract class Resource {
    String title
    Date dateCreated
    Date lastUpdated

    static belongsTo = [topic: Topic]

    static constraints = {
        title(unique: true)
    }
    static mapping = {

    }
}
