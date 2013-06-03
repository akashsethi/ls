<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
    <meta content="main" name="layout"/>
    <script type="text/javascript">
        $().ready(function () {
            // validate the comment form when it is submitted
            $("#topicValidation").validate();
        });
    </script>
</head>

<body>

<div class="row-fluid">
    <div class="span6 offset4 well" style="margin-top: 100px">
        <div class="span6 offset1">
            ${flash.message}
            <g:form id="topicValidation" action="saveTopic">
                <legend>Please provide Topic details</legend>
                <g:hiddenField name="currentUser" value="${currentUser}"/>
                <div><label>Title</label><g:textField name="topicTitle" required="required"/></div>

                <div><label>visibility</label><g:select name="visibility" from="${visibilityConstants}"></g:select>
                </div>

                <div><label>visibility</label><g:select name="seriousness" from="${seriousnessConstants}"></g:select>
                </div>

                <div><g:submitButton name="save" value="save"/></div>
            </g:form>
        </div>
</body>
</html>