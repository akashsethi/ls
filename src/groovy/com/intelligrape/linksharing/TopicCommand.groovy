package com.intelligrape.linksharing

import grails.validation.Validateable

@Validateable
class TopicCommand {
    String topicTitle
    Visibility visibility
    Seriousness seriousness
}
