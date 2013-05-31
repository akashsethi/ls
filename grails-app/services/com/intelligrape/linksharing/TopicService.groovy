package com.intelligrape.linksharing

class TopicService {
    def subscriptionService

    Topic save(Topic topic) {
        if (!(topic?.validate(flush: true) && topic?.save(failOnError: true))) {
            topic = null
        }
        topic
    }

    Topic saveAndSubscribe(Topic topic) {
        if (!(save(topic) && subscriptionService.subscribe(topic))) {
            topic = null
        }
        topic
    }
}
