<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title><g:layoutTitle default="login"/></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="${resource(dir: 'images', file: 'link.jpg')}" type="">
    <link rel="apple-touch-icon" href="${resource(dir: 'images', file: 'apple-touch-icon.png')}">
    <link rel="apple-touch-icon" sizes="114x114" href="${resource(dir: 'images', file: 'apple-touch-icon-retina.png')}">
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'bootstrap.css')}" type="text/css">
    <style>
    body {
        padding-top: 150px;
    }

    </style>
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'bootstrap-responsive.css')}" type="text/css">
    <g:layoutHead/>
    <r:layoutResources />
</head>
<body style="background-color: #f5f5f5;">

<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <div class="media hidden-phone">
                <a class="brand" href="${createLink(uri: "/")}">
                    <img class="media-object" width="64" data-src="holder.js/64x64" src="${resource(dir: 'images', file: 'link.jpg')}">

                </a>

                <div class="media-body">
                    <h2 class="media-heading">Link Sharing</h2>
                    Resources at one place
                </div>
            </div>

            <a href="#" class="brand hidden-desktop">Link Sharing</a>


                <div class="nav-collapse collapse">
                    <ul class="nav">

                        <li class="active"><g:link controller='user' action="readingitem" >Reading Item</g:link></li>
                        <li><g:link controller="topic" action="createTopic">New Topic</g:link></li>
                        <li><g:link controller="topic" action="publicTopic">Browse Topic</g:link></li>
                        <li><g:link controller='user' action="logout" >Logout</g:link></li>
                    </ul>
                </div><!--/.nav-collapse -->

        </div>
    </div>
</div>




<div class="container-fluid">
    <g:layoutBody/>
</div>

<div class="footer" role="contentinfo"></div>
<g:javascript library="application"/>
<div id="spinner" class="spinner" style="display:none;"><g:message code="spinner.alt" default="Loading&hellip;"/></div>
<r:layoutResources />
</body>
</html>