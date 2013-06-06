package com.intelligrape.linksharing

class ReadingItemController {

    def scaffold = true

    def markRead() {
        ReadingItem readingItem = ReadingItem.get(params.readingItemId)
        try {
            readingItem.isRead = true
            readingItem.save(flush: true)
            redirect(controller: "user", action: "dashboard")
        }
        catch (Exception e) {
            render "failed"
        }
    }

}
