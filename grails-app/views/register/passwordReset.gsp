<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
    <meta content="main" name="layout"/>
    <script type="text/javascript">
        $().ready(function () {

            $("#passwordValidation").validate();
        });

    </script>

</head>

<body>
<g:form id="passwordValidation" name="" action="savePassword">
    <g:hiddenField name="userId" value="${user.id}"/>
    <div class="controls">
        <g:textField name="username" value="${user.username}" readonly=""/>
    </div>
    <g:passwordField name="password" placeholder="Password" required=""/>
    <g:passwordField name="conformPassword" placeholder="Conform" required=""/>
    <g:renderErrors bean="${passwordCommand}" as="list" field="conformPassword"/>
    <g:submitButton name="submit" value="save"/>
</g:form>
</body>
</html>