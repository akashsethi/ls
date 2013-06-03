package com.intelligrape.linksharing

class LinkResourceService {
  def readingItemService
  LinkResource save(LinkResource linkResource){
      if(!(linkResource?.validate(flush:true)&& linkResource?.save(flush: true))){
          linkResource=null
      }
      linkResource
  }

  LinkResource saveAndAddToReadingItem(LinkResource linkResource) {
       if(!save(linkResource) && readingItemService.createAndSave(linkResource)) {
           linkResource=null
       }
      linkResource
  }
}
