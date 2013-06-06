package com.intelligrape.linksharing

import grails.validation.Validateable

@Validateable
class TopicCommand {
    String topicTitle
    Visibility visibility
    Seriousness seriousness

    static constraints={
        topicTitle(validator: {val->
            if(Topic.countByTopicName(val)){
                return ['default.not.unique.message']
            }
        })
    }
}
