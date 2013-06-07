package com.intelligrape.linksharing

class LinkResource extends Resource {

    String url
    Date dateCreated
    Date lastUpdated

    String toString() {
        return url
    }

    static constraints = {
        url(url: true, unique: true)
    }


}
