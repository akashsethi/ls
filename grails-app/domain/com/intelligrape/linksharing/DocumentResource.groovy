package com.intelligrape.linksharing

class DocumentResource extends Resource {
    String fileName
    String contentType
    byte[] data
    Date dateCreated
    Date lastUpdated

    String toString() {
        return fileName
    }

    static constraints = {
        fileName(blank: false)
        data(maxSize: Constants.fileSize)
    }

}
