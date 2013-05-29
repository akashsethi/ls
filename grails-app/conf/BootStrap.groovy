class BootStrap {
    def bootstrapService

    def init = { servletContext ->

     bootstrapService.createUser("Akash","Sethi","akash@intelligrape.com","igdefault",true)
    }

    def destroy = {

    }

}
