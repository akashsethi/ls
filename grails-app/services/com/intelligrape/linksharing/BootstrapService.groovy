package com.intelligrape.linksharing

class BootstrapService {

    def userService

    def createUsers() {
        User user = null
        10.times {
            user = new User(username: "User${it}@gmail.com", password: 'igdefault')
            if (userService.save(user)) {
                log.error user.errors.allErrors?.join("\n")
            }
        }
    }

    def createTopic(String topicName, Visibility visibility, User owner) {
        return new Topic(topicName: topicName, visibility: visibility, owner: owner).save(flush: true, failOnError: true)
    }

    def createSubscription(Seriousness seriousness, User subscriber, Topic topic) {
        return new Subscription(seriousness: seriousness, subscriber: subscriber, topic: topic).save(flush: true, failOnError: true)
    }

    def createLinkResource(User creator, String title, String summary, Topic topic, String url) {
        new LinkResource(creator: creator, title: title, summary: summary, topic: topic, url: url).save(flush: true, failOnError: true)
    }


    def createReadingItem(Resource resource, Boolean isRead, Boolean isFavourite, User user) {
        new ReadingItem(resource: resource, isRead: isRead, isFavourite: isFavourite, user: user)
    }
}
