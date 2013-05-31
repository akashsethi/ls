package com.intelligrape.linksharing

class ReadingItemService {

    ReadingItem saveReadingItem(ReadingItem readingItem) {
        if (!(readingItem?.validate(flush: true) && readingItem?.save(flush: true, failOnError: true))) {
            readingItem=null
        }
        readingItem
    }
}
