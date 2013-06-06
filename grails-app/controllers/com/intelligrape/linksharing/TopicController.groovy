package com.intelligrape.linksharing

class TopicController {
    def topicService

    def scaffold = true

    def createTopic() {
        User currentUser = User.get(1)
        List<Visibility> visibilities = Visibility.values()
        List<Seriousness> seriousness = Seriousness.values()
        [visibilityConstants: visibilities, seriousnessConstants: seriousness, currentUser: currentUser.id]
    }

    def saveTopic(TopicCommand topicCommand) {
        if (!topicCommand?.hasErrors()) {
            User user = User.get(params.currentUser)
            if (topicService.saveAndSubscribe(new Topic(owner: user, visibility: topicCommand.visibility,
                    topicName: topicCommand.topicTitle), user)) {
                flash.message = g.message(code: 'topic.creation.successful', default: 'topic is created as well as subscribed')
                redirect(controller: "user", action: "dashboard")
                return
            }

        }
        render(view: "createTopic", model: [topicCommand: topicCommand])
    }

}
