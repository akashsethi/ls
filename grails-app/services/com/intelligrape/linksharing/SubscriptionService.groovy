package com.intelligrape.linksharing

class SubscriptionService {

    Subscription save(Subscription subscription) {
        if (!(subscription.validate(flush: true) && subscription?.save(failOnError: true))) {
            subscription = null
        }
        subscription
    }

    Subscription subscribe(Topic topic, Seriousness seriousness = Seriousness.CASUAL) {
        save(new Subscription(topic, seriousness))
    }
}
