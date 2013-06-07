package com.intelligrape.linksharing

class SubscriptionController {

    def subscriptionService
    def scaffold = true

    def subscribeTopic() {
        Topic topic = Topic.get(params.topicId)
        User currentUser = User.get(params.userId)
        if (subscriptionService.subscribe(topic, currentUser)) {
            flash.message = g.message(code: 'subscription.success', default: "Subscription Successful")
        }
        redirect(controller: "topic", action: "listPublicTopic")
    }

    def saveSeriousness() {
        Subscription subscription = Subscription.get(params.subscriptionId)
        subscription.seriousness = params.seriousness
        //TODO: use subscriptionService save method -done
        if (subscriptionService.save(subscription)) {
            redirect(controller: "subscription", action: "listSubscribedTopics")
            return
        }
        flash.message = "try again"
        render(view: "updateSeriousness")
    }

    def unSubscribeTopic() {

    }

    def updateSeriousness() {
        Subscription subscription = Subscription.get(params.subscribedTopicId)
        //TODO: Rename seriousness to seriousnessList in model -Done
        [subscription: subscription, seriousnessList: Seriousness.values()]
    }

    //TODO: Rename to listSubscribedTopics() -done
    def listSubscribedTopics() {
        User currentUser = User.get(session.currentUser)
        List<Subscription> subscribedTopicList = currentUser.subscribedTopicList()
        [subscribedTopicList: subscribedTopicList]
    }
}
