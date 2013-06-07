package com.intelligrape.linksharing

class UserController {
    def topicService
    def subscriptionService
    def readingItemService
    def scaffold = true

    def dashboard() {

        User currentUser = User.get(session.currentUser)
        List<Subscription> subscribedTopicList =currentUser.subscribedTopicList()
        List maxSubscribedTopic = Subscription.createCriteria().list {
            projections {
                groupProperty("topic")
                count("topic", "countMaxTopic")
            }
            'topic' {
                eq('visibility', Visibility.PUBLIC)
            }
            order('countMaxTopic', 'desc')
            maxResults 9

        }
        List<Topic> topics = []
        maxSubscribedTopic.each {topicCountPair ->
            topics.add(topicCountPair[0])
        }

        List topUnreadItems = ReadingItem.createCriteria().list {
            eq("isRead", false)
            eq("user", currentUser)
            order("dateCreated", "desc")
            maxResults(5)
        }
        [subscribedTopicList: subscribedTopicList, topPublicTopic: topics, topUnreadItems: topUnreadItems.resource]
    }
}
