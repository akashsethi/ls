package com.intelligrape.linksharing

class UserController {
    def topicService
    def subscriptionService
    def readingItemService
    def scaffold = true

    def dashboard() {
        User currentUser = User.get(session.currentUser)
        List<Topic> publicTopic = topicService.publicTopicList()
        List<Subscription> subscribedTopicList = subscriptionService.subscribedTopicList(currentUser)
        List<ReadingItem> readingItemList = readingItemService.readingItemList(currentUser)
        [publicTopic: publicTopic, user: currentUser, readingItemList: readingItemList, subscribedTopicList: subscribedTopicList]

    }
}
