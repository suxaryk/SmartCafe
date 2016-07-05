<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
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
            <div class="col-lg-3 col-md-3 col-sm-3 col-xc-3">
                <div id="accordion" class="panel-group">


                    <%--<div class="panel panel-danger">--%>
                        <%--<div class="panel-heading">--%>
                            <%--<h4 class="panel-title">--%>
                                <%--<a href="#collapse-1" data-parent="#accordion" data-toggle="collapse">Open first slade</a>--%>
                            <%--</h4>--%>
                        <%--</div>--%>
                        <%--<div id="collapse-1" class="panel-collapse collapse">--%>
                            <%--<div class="panel-body">--%>
                                <%--<p>Content1 Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aspernatur enim sunt suscipit! Alias consectetur culpa, dignissimos ea enim eos eveniet id illo, neque officiis pariatur porro praesentium quia. Dolor, sapiente.</p>--%>
                            <%--</div>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="panel panel-primary">--%>
                        <%--<div class="panel-heading">--%>
                            <%--<h4 class="panel-title">--%>
                                <%--<a href="#collapse-2" data-parent="#accordion" data-toggle="collapse">Open second slade</a>--%>
                            <%--</h4>--%>
                        <%--</div>--%>
                        <%--<div id="collapse-2" class="panel-collapse collapse">--%>
                            <%--<div class="panel-heading">--%>
                                <%--<p>Content2 Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aspernatur enim sunt suscipit! Alias consectetur culpa, dignissimos ea enim eos eveniet id illo, neque officiis pariatur porro praesentium quia. Dolor, sapiente.</p>--%>
                            <%--</div>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="panel panel-info">--%>
                        <%--<div class="panel-heading">--%>
                            <%--<h4 class="panel-title">--%>
                                <%--<a href="#collapse-3" data-parent="#accordion" data-toggle="collapse">Open third slade</a>--%>
                            <%--</h4>--%>
                        <%--</div>--%>
                        <%--<div id="collapse-3" class="panel-collapse collapse">--%>
                            <%--<div class="panel-body">--%>
                                <%--<p>Content3 Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aspernatur enim sunt suscipit! Alias consectetur culpa, dignissimos ea enim eos eveniet id illo, neque officiis pariatur porro praesentium quia. Dolor, sapiente.</p>--%>
                            <%--</div>--%>
                        <%--</div>--%>
                    <%--</div>--%>

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


        </div>
    </div>

    <div class="container">
        <div class="row">
            <div class="col-md-6">
                <br>
                <a href="<c:url value="/logout" />" class="btn btn-danger btn-lg col-lg-pull-6  "  role="button" >Sign out</a>
                <br>
                <br>
                <br>
            </div>
        </div>
    </div>










    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script  type="text/javascript" src="/static/js/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script  type="text/javascript" src="/static/js/bootstrap.js"></script>

    <script>
//        $(document).ready(function() {
            for (var i = 1; i < 25; i++) {
                $("#accordion").innerHTML = '' +
                        '<div class="panel panel-info">' +
                                '<div class="panel-heading">' +
                                    '<h4 class="panel-title">' +
                                        '<a href="#collapse-'+ i +'" data-parent="#accordion" data-toggle="collapse"> Стіл №  ' + i + '</a>' +
                                    '</h4>' +
                                '</div>' +
                            '<div id="#collapse-'+ i +'" class="panel-collapse collapse">' +
                                '<div class="panel-body">' +
                                    '<p>order items</p>' +
                                '</div>' +
                            '</div>' +
                        '</div>' +
                        '';
//            }
        };




    </script>
</body>
</html>
