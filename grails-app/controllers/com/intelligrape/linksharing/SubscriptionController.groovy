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
        redirect(controller: "user", action: "dashboard")
    }

    def unSubscribeTopic() {

    }

    def updateSeriousness() {
        Subscription subscription = Subscription.get(params.subscribedTopicId)
        List<Seriousness> seriousnesses = Seriousness.values()
        [subscription: subscription, seriousness: seriousnesses]
    }

    def saveSeriousness() {
        Subscription subscription = Subscription.get(params.subscriptionId)
        subscription.seriousness = params.seriousness
        try {

            subscription.save(flush: true)
            redirect(controller: "user", action: "home")

        }
        catch (Exception e) {

            flash.message = "try again"
            render(view: "updateSeriousness")

        }
    }
}
