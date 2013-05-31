import com.intelligrape.linksharing.Visibility
import com.intelligrape.linksharing.Seriousness
import com.intelligrape.linksharing.User

class BootStrap {
    def bootstrapService

    def init = { servletContext ->
        if (!User.count()) {
            bootstrapService.createUsers()
            bootstrapService.createTopics()
            bootstrapService.createLinkResource()
        }

    }

    def destroy = {

    }

}
