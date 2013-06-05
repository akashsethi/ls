package com.intelligrape.linksharing

import grails.validation.Validateable

@Validateable
class LinkResourceCommand {
    String url
    static constraints = {
        url(url: true, validator: {val ->
            if (LinkResource.countByUrl(val)) {
                return ['linkResourceCommand.unique.url.message']
            }
        })
    }


}
