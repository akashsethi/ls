package com.intelligrape.linksharing

class ReadingItem {

    Resource resource
    Boolean isRead = false
    Boolean isFavourite = false
    Date dateCreated
    Date lastUpdated

    static belongsTo = [user: User]


    static constraints = {
        user(unique: 'resource')
    }
}
