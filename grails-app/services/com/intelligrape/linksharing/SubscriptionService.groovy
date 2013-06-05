package com.intelligrape.linksharing

class SubscriptionService {

    Subscription save(Subscription subscription) {
        if (!(subscription.validate(flush: true) && subscription?.save(flush: true))) {
            subscription = null
        }
        subscription
    }

    Subscription subscribe(Topic topic, Seriousness seriousness = Seriousness.CASUAL) {
        save(new Subscription(topic, seriousness))
    }

    List<Subscription> subscribedTopicList(User subscriber){
      return   Subscription.findAllBySubscriber(subscriber)
    }




}
