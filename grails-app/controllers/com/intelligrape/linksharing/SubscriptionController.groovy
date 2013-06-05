package com.intelligrape.linksharing

class SubscriptionController {
    def subscriptionService
    def scaffold = true

    def subscribeTopic() {

        Topic topic = Topic.get(params.topicId)
        subscriptionService.subscribe(topic)
        redirect(controller: "user", action: "home")
    }

    def unSubscribeTopic() {

    }


}
