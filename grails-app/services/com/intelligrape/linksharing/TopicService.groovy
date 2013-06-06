package com.intelligrape.linksharing

class TopicService {
    def subscriptionService

    Topic save(Topic topic) {
        if (!(topic?.validate(flush: true) && topic?.save(failOnError: true))) {
            topic = null
        }
        topic
    }

    Topic saveAndSubscribe(Topic topic,User user) {
        if (!(save(topic) && subscriptionService.subscribe(topic,user))) {
            topic = null
        }
        topic
    }

    List<Topic> publicTopicList() {
        return Topic.findAllByVisibility(Visibility.PUBLIC)
    }

    List<Topic> ownedTopic(User owner) {
        return Topic.findAllByOwner(owner)
    }

}
