<!DOCTYPE html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title><g:layoutTitle default="Grails"/></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.ico')}" type="image/x-icon">
    <link rel="apple-touch-icon" href="${resource(dir: 'images', file: 'apple-touch-icon.png')}">
    <link rel="apple-touch-icon" sizes="114x114" href="${resource(dir: 'images', file: 'apple-touch-icon-retina.png')}">
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'bootstrap.css')}" type="text/css">
    <script type="text/javascript" src="${resource(dir: 'js', file: 'jquery.js')}"></script>
    <script type="text/javascript" src="${resource(dir: 'js', file: 'bootstrap-tab.js')}"></script>
    <script type="text/javascript" src="${resource(dir: 'js', file: 'jquery.validate.js')}"></script>
    <style type="text/css">
    body {
        padding-top: 60px;
        padding-bottom: 40px;
    %{--background-image: url("${resource(dir: 'images',file: 'login.jpg')}")--}%
    }

    </style>
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'bootstrap-responsive.css')}" type="text/css">
    <g:layoutHead/>
    <r:layoutResources/>
</head>

<body>
<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <g:if test="${session.currentUser}">
                <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
            </g:if>

            <a class="brand" href="${createLink(controller: "user", action: "dashboard")}">LinkSharing</a>

            <g:if test="${session.currentUser}">

                <div class="tabbable">

                    <ul class="nav nav-tabs">
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#">Topic</a>
                            <ul class="dropdown-menu" role="menu" aria-labelledby="dLabel">
                                <li><g:link controller="topic" action="createTopic">New Topic</g:link></li>
                                <li><g:link controller="subscription"
                                            action="listSubscribedTopics">Subscribed Topic</g:link></li>
                                <li>
                                    <g:link controller="topic" action="listPublicTopic">Public Topic</g:link>
                                </li>

                            </ul>
                        </li>

                    </ul>

                    <ul class="nav nav-tabs">
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#">Reading Item</a>
                            <ul class="dropdown-menu" role="menu" aria-labelledby="dLabel">
                                <li><g:link controller="readingItem" action="readingItems">Reading Items</g:link></li>
                            </ul>
                        </li>
                    </ul>

                    <ul class="nav nav-tabs">
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#">Options</a>
                            <ul class="dropdown-menu" role="menu" aria-labelledby="dLabel">
                                <li><g:link controller="logout" action="logout">Sign Out</g:link></li>
                            </ul>
                        </li>
                    </ul>

                    <ul class="nav nav-tabs">
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#">Resource</a>
                            <ul class="dropdown-menu" role="menu" aria-labelledby="dLabel">
                                <li><g:link controller="linkResource"
                                            action="listLinkResource">Link Resource</g:link></li>
                                <li><g:link controller="documentResource" action="#">Document Resource</g:link></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </g:if>



        <!--/.nav-collapse -->
        </div>
    </div>
</div>


<div class="container-fluid">
    <g:layoutBody/>
</div>

<div class="footer" role="contentinfo"></div>
<g:javascript library="application"/>
<div id="spinner" class="spinner" style="display:none;"><g:message default="Loading&hellip;"/></div>
<r:layoutResources/>
</body>
</html>
