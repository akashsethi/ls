package com.intelligrape.linksharing

class BootstrapService {

    def userService
    def topicService
    def subscriptionService
    def linkResourceService

    def createUsers() {
        User user = null
        10.times {
            user = new User(username: "User${it}@gmail.com", password: "igdefault")
            if (!userService.save(user)) {
                println user.errors.allErrors
            }
        }
    }


    def createTopics() {
        Topic topic = null
        Subscription subscription = null
        User.list().eachWithIndex {user, index ->
            topic = new Topic(owner: user, topicName: "Topic${index}", visibility: Visibility.PUBLIC)
            if (!(topicService.saveAndSubscribe(topic))) {
                println topic.errors.allErrors
                println subscription.errors.allErrors
            }
        }
    }

    def createLinkResource() {
        LinkResource linkResource = null
        Subscription subscription=null
        Topic.list().eachWithIndex {topic, index ->
            linkResource = new LinkResource(title: "title${index}", creator: topic.owner, topic: topic, url: "http://www.linking${index}.com")
            if (!(linkResourceService.saveAndAddToReadingItem(linkResource))) {
                println linkResource.errors.allErrors
                println subscription.errors.allErrors

            }

        }

    }
}
