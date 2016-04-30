<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <link href="/static/css/bootstrap.css" rel="stylesheet">
    <link href="/static/css/font-awesome.css" rel="stylesheet">
    <link href="/static/css/style.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <!--<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>-->
    <!--<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>-->
    <![endif]-->
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-md-6">
                <div id="accordion" class="panel-group">
                    <div class="panel panel-danger">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a href="#collapse-1" data-parent="#accordion" data-toggle="collapse">Open first slade</a>
                            </h4>
                        </div>
                        <div id="collapse-1" class="panel-collapse collapse-in">
                            <div class="panel-body">
                                <p>Content1 Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aspernatur enim sunt suscipit! Alias consectetur culpa, dignissimos ea enim eos eveniet id illo, neque officiis pariatur porro praesentium quia. Dolor, sapiente.</p>
                            </div>
                        </div>
                    </div>
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a href="#collapse-2" data-parent="#accordion" data-toggle="collapse">Open second slade</a>
                            </h4>
                        </div>
                        <div id="collapse-2" class="panel-collapse collapse">
                            <div class="panel-heading">
                                <p>Content2 Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aspernatur enim sunt suscipit! Alias consectetur culpa, dignissimos ea enim eos eveniet id illo, neque officiis pariatur porro praesentium quia. Dolor, sapiente.</p>
                            </div>
                        </div>
                    </div>
                    <div class="panel panel-info">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a href="#collapse-3" data-parent="#accordion" data-toggle="collapse">Open third slade</a>
                            </h4>
                        </div>
                        <div id="collapse-3" class="panel-collapse collapse">
                            <div class="panel-body">
                                <p>Content3 Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aspernatur enim sunt suscipit! Alias consectetur culpa, dignissimos ea enim eos eveniet id illo, neque officiis pariatur porro praesentium quia. Dolor, sapiente.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-6">

            </div>
        </div>
    </div>

    <a href="<c:url value="/logout" />" class="btn btn-danger btn-sm pull-right"  role="button" >Sign out</a>








    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.js"></script>
</body>
</html>
