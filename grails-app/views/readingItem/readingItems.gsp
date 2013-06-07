<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
    <meta content="main" name="layout"/>
</head>

<body>
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
</body>
</html>