package com.intelligrape.linksharing

class ReadingItem {

    Boolean isRead
    Boolean isFavourite
    Resource resource
    Date dateCreated
    Date lastUpdated

    static belongsTo = [user: User]

    static constraints = {
    }
}
