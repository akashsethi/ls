<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Create Topic</title>
    <meta content="main" name="layout"/>
    <style type="text/css">
        body{
            margin: 150px
        }
    </style>
</head>

<body>
<div class="row-fluid">
    <div class="span6 offset3 well">
        <g:form class="form-horrizontal" action="loginHandler">
            ${flash.message}
            <legend>Please specify topic details.</legend>

            <div class="control-group">
                <label class="control-label" for="email">Name:</label>

                <div class="controls">
                    <input type="text" name="email"/>
                </div>
            </div>

            <div class="control-label">
                <label class="control-label" for="password">Password:</label>

                <div class="controls">
                    <input type="password" name="password"/></div>
            </div>

            <div class="control-group">
                <div class="controls">
                    <input class="btn btn-primary" type="submit" name="login"/></div>
                <g:link action="passwordChange">forgot password</g:link>
            </div>
        </g:form>
    </div>
</body>
</html>