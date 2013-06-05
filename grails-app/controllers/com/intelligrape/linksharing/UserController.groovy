package com.intelligrape.linksharing

class UserController {
    def topicService
    def subscriptionService
    def userService
    def readingItemService
    def scaffold = true
    static defaultAction = "login"

    def login() {}

    def register(RegisterCommand registerCommand) {
        if (!registerCommand?.hasErrors()) {
            User user = new User(username: registerCommand.userName, firstName: registerCommand.firstName,
                    password: registerCommand.password)
            if (userService.save(user)) {
                flash.message = "Registered Successfully, Please login"
                render view: "login"
            }
        }
        render view: "login", model: [registerCommand: registerCommand]
    }

    def loginHandler() {
        User user = User.findByUsernameAndPassword(params.username, params.password)
        if (user) {
            session.currentUser = user.id
            render(view: "home")
        }
        else {
            flash.messages = "invalid username/password"
            render view: "login"
        }
    }

    def home() {
        if (session.currentUser) {
            User currentUser = User.get(session.currentUser)
            List<Topic> publicTopic = topicService.publicTopicList()
            List<Subscription> subscribedTopicList = subscriptionService.subscribedTopicList(currentUser)
            List<ReadingItem> readingItemList = readingItemService.readingItemList(currentUser)
            [publicTopic: publicTopic, user: currentUser, readingItemList: readingItemList, subscribedTopicList: subscribedTopicList]
        }
    }
}
