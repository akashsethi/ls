<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>create link resource</title>
    <meta content="main" name="layout"/>
</head>

<body>
<div class="row-fluid">
    <div class="span5 offset4 well" style="margin-top: 60px">
        <div class="span6 offset1">

            <g:form class="" name="createLinkResource" action="saveLinkResource">
                <legend>Add Link Resource</legend>
                <div class="control-group">
                    <div class="controls">
                        <g:textField name="title" placeholder="Title" required="required"/>
                    </div>
                </div>

                <div class="control-group">
                    <div class="controls">
                        <g:textField name="topic" value="${subscribedTopic}" readonly=""/>
                    </div>
                </div>

                <div class="control-group">
                    <div class="controls">
                        <input name="url" placeholder="URL" required="required"/>
                        <g:renderErrors bean="${linkResourceCommand}" as="list" field="url"/>
                    </div>
                </div>

                <div>
                    <g:submitButton class="btn btn-large btn-primary" name="save" value="Save"/>
                </div>

            </g:form>
        </div>
    </div>
</div>
</body>
</html>