package com.intelligrape.linksharing

class ReadingItemService {

    ReadingItem save(ReadingItem readingItem) {
        if (!(readingItem?.validate(flush: true) && readingItem?.save(flush: true, failOnError: true))) {
            readingItem = null
        }
        readingItem
    }

    ReadingItem createAndSave(LinkResource linkResource) {
        ReadingItem readingItem = new ReadingItem(resource: linkResource, user: linkResource?.creator)
        save(readingItem)
    }
}
