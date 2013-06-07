<%--
  Created by IntelliJ IDEA.
  User: akash
  Date: 5/6/13
  Time: 10:04 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
    <meta content="main" name="layout"/>
</head>

<body>
<div class="row-fluid">
    <div class="span5 offset4 well" style="margin-top: 60px">
        <div class="span6 offset1">
            ${flash.message}
            <g:form class="form-signin" name="register" action="saveSeriousness">
                <legend>Update Seriousness</legend>
                <g:hiddenField name="subscriptionId" value="${subscription.id}"/>
                <div class="control-group">
                    <g:textField name="topicName" value="${subscription.topic.topicName}" readonly=""/>
                </div>

                <div class="control-group">
                    <g:select name="seriousness" from="${seriousnessList}"/>
                </div>

                <div>
                    <g:submitButton class="btn btn-large btn-primary" name="save" value="Update"/>
                </div>
            </g:form>
        </div>
    </div>
</div>
</body>
</html>