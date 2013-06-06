<%@ page import="com.intelligrape.linksharing.Subscription" contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta content="main" name="layout"/>
    <script src="${resource(dir: "js",file: "jquery-1.7.2.js")}"></script>
    <script type="text/javascript" src="${resource(dir: "js", file: "bootstrap-tab.js")}"></script>
    <script type="text/javascript" src="${resource(dir: "js", file: "bootstrap-dropdown.js")}"></script>
    <title>Home</title>
</head>

<body>

<div class="tabbable">
    <ul class="nav nav-tabs">
        <li class="active"><a href="#tab1" data-toggle="tab">About</a></li>
        <li><a href="#tab2" data-toggle="tab">Public Topic</a></li>
        <li><a href="#tab3" data-toggle="tab">Subscribed Topics</a></li>
        <li><a href="#tab4" data-toggle="tab">Reading Items</a></li>
        <li class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="#">Dropdown</a>
            <ul class="dropdown-menu" role="menu" aria-labelledby="dLabel">
                <li><g:link controller="topic" action="createTopic">New Topic</g:link></li>
                <li><g:link controller="login" action="logout">SignOut</g:link></li>
            </ul>

        </li>

    </ul>


    <div class="tab-content">
        <div id="tab1" class="tab-pane active">tab1 content</div>

        <div id="tab2" class="tab-pane">
            <table class="table-striped table-hover table table-bordered">
                <thead><tr><th>Name</th><th>Owner</th><th>Subscribe/unSubscribe</th></tr></thead>
                <tbody>
                <g:each in="${publicTopic}" var="topic">
                    <tr>
                        <td>${topic.topicName}</td>
                        <td>
                            ${topic.owner.username}
                        </td>
                        <td>
                            <g:if test="${Subscription.findBySubscriberAndTopic(user, topic)}">
                                <g:link controller="subscription" action="unSubscribeTopic"
                                        params="[topicId: topic.id]">UnSubscribe</g:link>
                            </g:if>
                            <g:else>
                                <g:link controller="subscription" action="subscribeTopic"
                                        params="[topicId: topic.id,userId:user.id]">subscribe</g:link>
                            </g:else>
                        </td>
                    </tr>
                </g:each>
                </tbody>
            </table>
        </div>

        <div id="tab3" class="tab-pane">
            <table class="table-striped table-hover table table-bordered">
                <thead><tr><th>Subscribed Topic</th><th>Seriousness</th><th>Resource</th></tr></thead>
                <tbody>
                <g:each in="${subscribedTopicList}" var="subscribedTopic">
                    <tr>
                        <td><a href="${subscribedTopic}">${subscribedTopic.topic.topicName}</a></td>
                        <td><g:link controller="subscription" action="updateSeriousness"
                                    params="[subscribedTopicId: subscribedTopic.id]">
                            ${subscribedTopic.seriousness}</g:link></td>
                        <td><g:link controller="resource" action="createResource">Add Resource</g:link></td>
                    </tr>
                </g:each>
                </tbody>
            </table>
        </div>

        <div id="tab4" class="tab-pane">
            <table class="table-striped table-hover table table-bordered">
                <thead><tr><th>Mark Read</th><th>Title</th><th>Reading Item</th><th>isFavourite</th></tr></thead>
                <tbody>
                <g:each in="${readingItemList}" var="readingItem">
                    <tr>
                        <td><g:link controller="readingItem" action="markRead"
                                    params="[readingItemId: readingItem.id]">mark Read</g:link></td>
                        <td>${readingItem.resource.title}</td>
                        <td><a href="${readingItem.resource}">${readingItem.resource}</a></td>
                        <td>
                            <g:if test="${readingItem.isFavourite}">
                                Yes
                            </g:if>
                            <g:else>
                                No
                            </g:else>
                        </td>
                        <td>

                        </td>
                    </tr>
                </g:each>
                </tbody>
            </table>
        </div>
    </div>
</div>

</body>
</html>