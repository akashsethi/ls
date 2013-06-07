<%@ page import="com.intelligrape.linksharing.Subscription" contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
    <meta content="main" name="layout"/>
</head>

<body>

    <div class="tab-pane">
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
                                    params="[topicId: topic.id, userId: user.id]">subscribe</g:link>
                        </g:else>
                    </td>
                </tr>
            </g:each>
            </tbody>
        </table>
    </div>

</body>
</html>