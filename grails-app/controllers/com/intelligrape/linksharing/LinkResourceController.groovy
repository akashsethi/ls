package com.intelligrape.linksharing

class LinkResourceController {
    def linkResourceService
    def scaffold = true

    def createLinkResource() {
        if (session.currentUser) {
            User currentUser = User.get(session.currentUser)
            List<Subscription> subscriptionList = Subscription.findAllBySubscriber(currentUser)
            [subscribedTopic: subscriptionList.topic, creator: currentUser.id]
        }
    }

    def saveLinkResource(LinkResourceCommand linkResourceCommand) {
        if (!linkResourceCommand?.hasErrors()) {
            User user = User.get(params.userId)
            Topic topic = Topic.findByTopicName(params.topic)
            LinkResource linkResource = new LinkResource(creator: user, title: params.title, topic: topic, url: params.url)
           if (linkResourceService.saveAndAddToReadingItem(linkResource)){
               redirect(controller: "user",action: "home")
           }
        }
        chain(controller: "linkResource",action: "createLinkResource",model: [linkResourceCommand:linkResourceCommand])

    }


}