<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>List</title>
    <meta content="main" name="layout"/>
</head>

<body>
<div class="tab-pane">
    <table class="table-striped table-hover table table-bordered">
        <thead><tr><th>Topic</th><th>Link</th></tr></thead>
        <tbody>
        <g:each in="${listLinkResource}" var="link">
            <tr>
                <td>${link.topic.topicName}</td>
                <td>
                    <a href="${link.url}">${link.url}</a>
                </td>

            </tr>
        </g:each>
        </tbody>
    </table>
</div>
</body>
</html>