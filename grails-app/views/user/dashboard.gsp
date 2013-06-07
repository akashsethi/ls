<%@ page import="com.intelligrape.linksharing.Subscription" contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta content="main" name="layout"/>
    <script src="${resource(dir: "js", file: "jquery-1.7.2.js")}"></script>
    <script type="text/javascript" src="${resource(dir: "js", file: "bootstrap-tab.js")}"></script>
    <script type="text/javascript" src="${resource(dir: "js", file: "bootstrap-dropdown.js")}"></script>
    <title>Home</title>
</head>

<body>

<div class="tab-pane span6" >
    <table class="table-striped table-hover table table-bordered">
        <thead><tr><th>Subscribed Topic</th></tr></thead>
        <tbody>
        <g:each in="${subscribedTopicList}" var="subscribedTopic">
            <tr>
                <td><a href="#">${subscribedTopic.topic.topicName}</a></td>
            </tr>
        </g:each>
        </tbody>
    </table>
</div>

<div class="tab-pane span6" >
    <table class="table-striped table-hover table table-bordered">
        <thead><tr><th>Top Public Topic</th></tr></thead>
        <tbody>
        <g:each in="${topPublicTopic}" var="topic">
            <tr>
                <td><a href="#">${topic}</a></td>

            </tr>
        </g:each>
        </tbody>
    </table>
</div>

<div class="tab-pane span6">
    <table class="table-striped table-hover table table-bordered">
        <thead><tr><th>Unread Items</th></tr></thead>
        <tbody>
        <g:each in="${topUnreadItems}" var="resource">
            <tr>
                <td><a href="#">${resource}</a></td>
            </tr>
        </g:each>
        </tbody>
    </table>
</div>

</body>
</html>