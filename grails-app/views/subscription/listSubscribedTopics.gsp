<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta content="main" name="layout"/>
    <title></title>
</head>

<body>
<div class="tab-pane">
    <table class="table-striped table-hover table table-bordered">
        <thead><tr><th>Subscribed Topic</th><th>Seriousness</th><th>LinkResource</th><th>DocumentResource</th></tr>
        </thead>
        <tbody>
        <g:each in="${subscribedTopicList}" var="subscribedTopic">
            <tr>
                <td><a href="#">${subscribedTopic.topic.topicName}</a></td>
                <td><g:link controller="subscription" action="updateSeriousness"
                            params="[subscribedTopicId: subscribedTopic.id]">
                    ${subscribedTopic.seriousness}</g:link></td>
                <td><g:link controller="linkResource" action="createLinkResource"
                            params="[subscribedTopic: subscribedTopic.topic]">Add Link</g:link></td>
                <td><g:link controller="documentResource" action="createDocumentResource">Add Document</g:link></td>
            </tr>
        </g:each>
        </tbody>
    </table>
</div>
</body>
</html>