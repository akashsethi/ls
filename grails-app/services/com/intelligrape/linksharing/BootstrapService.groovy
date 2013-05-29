package com.intelligrape.linksharing

class BootstrapService {
    BootstrapService() {

    }

    def createUser(String firstName, String lastName, String userName, String password, Boolean isMale) {
        User.findByUserName(userName) ?: new User(firstName: firstName, lastName: lastName, userName: userName, password:
                password, isMale: isMale).save(failOnError: true)
    }

    def createTopic(String topicName, Visibility visibility, User owner) {
        new Topic(topicName: topicName, visibility: visibility, owner: owner).save(flush: true, failOnError: true)
    }

    def createSubscription(Seriousness seriousness, User subscriber, Topic topic) {
        new Subscription(seriousness: seriousness, subscriber: subscriber, topic: topic).save(flush: true, failOnError: true)
    }

    def createLinkResource(User creator, String title, String summary, Topic topic, String url) {
        new LinkResource(creator: creator, title: title, summary: summary, topic: topic, url: url).save(flush: true, failOnError: true)
    }


    def createReadingItem(Resource resource, Boolean isRead, Boolean isFavourite, User user) {
        new ReadingItem(resource: resource, isRead: isRead, isFavourite: isFavourite, user: user)
    }

    def serviceMethod() {

    }
}
