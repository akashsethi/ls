package com.intelligrape.linksharing

class LinkResourceService {

  LinkResource save(LinkResource linkResource){
      if(!(linkResource?.validate(flush:true)&& linkResource?.save(flush: true))){
          linkResource=null
      }
      linkResource

  }
}
