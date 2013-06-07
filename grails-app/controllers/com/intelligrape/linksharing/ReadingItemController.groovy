package com.intelligrape.linksharing

class ReadingItemController {
    def readingItemService
    def scaffold = true

    def markRead() {
        ReadingItem readingItem = ReadingItem.get(params.readingItemId)
        readingItem.isRead = true
        if (readingItemService.save(readingItem)) {
            redirect(controller: "user", action: "dashboard")
            return
        }
        redirect(action: "readingItems")
    }

    def readingItems() {
        User currentUser = User.get(session.currentUser)
        //TODO: Do-not use reading item service, instead move readingItemList method to user domain and use user.listReadingItems()
        List<ReadingItem> readingItemList =currentUser.readingItemList()
        [readingItemList: readingItemList]
    }

}
