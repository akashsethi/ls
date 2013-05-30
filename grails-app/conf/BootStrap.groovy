import com.intelligrape.linksharing.Visibility
import com.intelligrape.linksharing.Seriousness

class BootStrap {
    def bootstrapService

    def init = { servletContext ->

        def user = bootstrapService.createUser("Akash", "Sethi", "akash@intelligrape.com", "igdefault", true)
        Visibility visibility = "PUBLIC"
        Seriousness seriousness = "CASUAL"
        def topic = bootstrapService.createTopic("Linksharing", visibility, user)
        bootstrapService.createSubscription(seriousness, user, topic)
        def resource=bootstrapService.createLinkResource(user, "Linksharing", "welcome to linksharing", topic, "http://www.easylinksharing.com")
        bootstrapService.createReadingItem(resource,false,true,user)
    }

    def destroy = {

    }

}
