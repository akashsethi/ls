package com.intelligrape.linksharing

class LinkResourceController {
    def linkResourceService
    def scaffold = true

    def createLinkResource() {
        [subscribedTopic: params.subscribedTopic]
    }

    def saveLinkResource(LinkResourceCommand linkResourceCommand) {
        if (!linkResourceCommand?.hasErrors()) {
            //TODO: No need to send user id in params. Can be fetched from session.  -done
            User user = User.get(session.currentUser)
            Topic topic = Topic.findByTopicName(params.topic)
            LinkResource linkResource = new LinkResource(creator: user, title: params.title, topic: topic, url: params.url)
            if (linkResourceService.saveAndAddToReadingItem(linkResource)) {
                //TODO: Change redirection   -done
                redirect(controller: "linkResource", action: "listLinkResource")
                return
            }
        }
        render(view: "createLinkResource", model: [linkResourceCommand: linkResourceCommand])

    }

    def listLinkResource() {
        User user = User.get(session.currentUser)
        [listLinkResource: user.linkResourceList()]
    }


}