package com.intelligrape.linksharing

class TopicController {
    def topicService

    def scaffold = true

    def createTopic() {
        User currentUser = User.get(1)
        println currentUser.class
        List<Visibility> visibilities = Visibility.values()
        List<Seriousness> seriousness = Seriousness.values()
        [visibilityConstants: visibilities, seriousnessConstants: seriousness, currentUser: currentUser.id]
    }

    //TODO: Move to Topic Controller  03-06   --done

    def saveTopic(TopicCommand topicCommand) {
        try {
            User user = User.get(params.currentUser)
            Topic topic = topicService.saveAndSubscribe(new Topic(owner: user, visibility: topicCommand.visibility,
                    topicName: topicCommand.topicTitle))
            render "topic created As Well As subscribed"
        }
        catch (Exception e) {
            render e.message
        }
    }

    //TODO: Move to topic controller 03-06     --done
    def listTopics() {
        User user = User.get(1)
        List<Topic> ownedTopic = Topic.findAllByOwner(user)
        render ownedTopic
    }

}
