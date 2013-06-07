package com.intelligrape.linksharing

class ReadingItemService {

    ReadingItem save(ReadingItem readingItem) {
        if (!(readingItem?.validate(flush: true) && readingItem?.save(flush: true, failOnError: true))) {
            readingItem = null
        }
        readingItem
    }

    ReadingItem createAndSave(LinkResource linkResource, Boolean isRead = false, Boolean isFavourite = false) {
        save(new ReadingItem(resource: linkResource, isFavourite: isFavourite, isRead: isRead, user: linkResource.creator))
    }


}
