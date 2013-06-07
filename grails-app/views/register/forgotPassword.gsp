<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
    <meta content="main" name="layout"/>
    <script type="text/javascript">
        $().ready(function () {

            $("#passwordReset").validate();
        });

    </script>
    <style type="text/css">
    select {
        width: 90px
    }
    </style>
</head>

<body>
<div class="row-fluid">
    <div class="span6 offset4 well" style="margin-top: 100px">
        <div class="span6 offset1">
            ${flash.message}
            <g:form id="passwordReset" action="resetPassword">
                <legend>Password Reset</legend>

                <div class="controls">
                    <input class="input-block-level" name="userName" type="email" placeholder="Username*" required/>
                </div>

                <div class="controls">
                    <g:datePicker style="width:30px" name="dateOfBirth" precision="day" noSelection="[' ': 'choose']"/>
                </div>

                <div>
                    <g:submitButton class="btn btn-large btn-primary" name="save" value="Submit"/>
                </div>
            </g:form>
        </div>
    </div>
</div>
</body>
</html>