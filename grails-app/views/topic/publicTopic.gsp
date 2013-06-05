<%@ page import="com.intelligrape.linksharing.Subscription" %>
<html>
<head>
    <meta content="bootstrap" name="layout"/>
    <title>list</title>
</head>

<body>
${flash.message}
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
                <g:if test="${Subscription.findBySubscriberAndTopic(user,topic)}">
                    <g:link controller="subscription" action="unSubscribeTopic" params="[topicId:topic.id]">UnSubscribe</g:link>
                </g:if>
                <g:else>
                    <g:link controller="subscription" action="subscribeTopic" params="[topicId:topic.id]">subscribe</g:link>
                </g:else>
            </td>
        </tr>
    </g:each>
    </tbody>
</table>
</body>
</html>