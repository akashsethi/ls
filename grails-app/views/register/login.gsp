<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
    <meta content="main" name="layout"/>
    <style type="text/css">
    ul {
        list-style-type: none;
    }

    li {
        color: #ff0000;
    }

    select {
        width: 90px
    }
    </style>
</head>

<body>
<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>

            %{--<div class="media hidden-phone">--}%
                <a class="brand" href="${createLink(uri: "/")}">LinkSharing

                </a>

                <div class="nav-collapse collapse">

                    <g:form class="navbar-form pull-right" controller="login" action="loginHandler">
                        <span>${flash.messages}</span>
                        <g:textField class="span2" name="username" placeholder="Email"/>

                        <g:passwordField class="span2" name="password" placeholder="Password"/>
                        <g:submitButton name="submit" value="signIn" class="btn btn-small btn-primary"/>
                        <a href="#">forgot password?</a>
                    </g:form>

                </div><!--/.nav-collapse -->
            </div>
        </div>
    </div>

    <div class="row-fluid">
        <div class="span5 offset7 well">
            <div class="span6 offset1">
                ${flash.message}
                <g:form class="form-signin" name="register" action="registerNewUser">
                    <legend>Register</legend>

                    <div class="control-group">

                        <g:textField class="input-block-level" name="userName" placeholder="Choose Email"></g:textField>
                        <g:renderErrors bean="${registerCommand}" as="list" field="userName"/>

                    </div>

                    <div class="control-label">

                        <div class="controls">
                            <g:passwordField class="input-block-level" name="password" placeholder="Password"/>
                            <g:renderErrors bean="${registerCommand}" as="list" field="password"/>
                        </div>
                    </div>

                    <div class="control-label">

                        <div class="controls">
                            <g:passwordField class="input-block-level" name="conformPassword"
                                             placeholder="Conform Password"/>
                            <g:renderErrors bean="${registerCommand}" as="list" field="conformPassword"/>
                        </div>
                    </div>

                    <div class="control-group">

                        <div class="controls">
                            <g:textField class="input-block-level" name="firstName" placeholder="First Name"/>
                            <g:renderErrors bean="${registerCommand}" as="list" field="firstName"/>
                        </div>
                    </div>

                    <div class="control-group">

                        <div class="controls">
                            <g:textField class="input-block-level" name="lastName" placeholder="Last Name"/>
                            <g:renderErrors bean="${registerCommand}" as="list" field="lastName"/>
                        </div>
                    </div>

                    <div class="control-group">
                        <div class="controls">
                            <input type="radio" name="isMale" value="true" checked="checked"/>Male
                            <input type="radio" name="isMale" value="false"/>Female
                        </div>
                    </div>

                    <div style="float:left;width:500px">
                        <label>DateOfBirth</label>
                        <g:datePicker style="width:30px" name="dateOfBirth" precision="day"
                                      noSelection="['': 'choose']"/>
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