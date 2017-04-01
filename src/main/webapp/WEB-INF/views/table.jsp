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
<div id="top-menu" class="navbar navbar-inverse navbar-static-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#responsive-menu">
                <span class="sr-only">Open Nav</span>

                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>


            </button>
            <a class="navbar-brand" href="#">Smart Cafe </a>
        </div>
        <div class="collapse navbar-collapse" id="responsive-menu">
            <ul class="nav navbar-nav">
                <li><a href="#" class="top-menu-button"><img class="svg-invert" src="/static/img/svg/1/man.svg" alt=""/></a></li>
                <li class="dropdown" >
                    <a href="#" class="category-inv top-menu-button dropdown-toggle" onclick="invertSvg();" data-toggle="dropdown">
                        <!--<b class="caret"></b>-->
                        <img  src="/static/img/svg/1/restaurant.svg" alt=""/></a></a>
                    <ul class="dropdown-menu cat" id="category" >
                        <li >
                            <a href="cat1">
                                    <img src="/static/img/svg/dinner.svg" alt=""/>
                                    <span>${categories}</span>
                            </a>
                        </li>
                        <li>
                            <a href="/cat2"> <img src="/static/img/svg/salad.svg" alt=""/></a>
                        </li>
                        <li>
                            <a href="/cat3"> <img src="/static/img/svg/burger.svg" alt=""/></a>
                        </li>
                        <li>
                            <a href="/cat4"> <img src="/static/img/svg/pan.svg" alt=""/></a>
                        </li>
                        <li>
                            <a href="#"> <img src="/static/img/svg/meat.svg" alt=""/></a>
                        </li>
                        <li>
                            <a href="#"> <img src="/static/img/svg/pizza.svg" alt=""/></a>
                        </li>
                        <li>
                            <a href="#"> <img src="/static/img/svg/sushi.svg" alt=""/></a>
                        </li>
                        <li>
                                <a href="#"> <img src="/static/img/svg/iceCream.svg" alt=""/></a>
                        </li>
                        <li>
                            <a href="#"> <img src="/static/img/svg/cup.svg" alt=""/></a>
                        </li>
                        <li>
                            <a href="#"> <img src="/static/img/svg/beer.svg" alt=""/></a>
                        </li>
                        <li>
                            <a href="#"> <img src="/static/img/svg/alcohol.svg" alt=""/></a>
                        </li>
                        <li>
                            <a href="#"> <img src="/static/img/svg/softDrink.svg" alt=""/></a>
                        </li>
                    </ul>
                </li>
                <li><a href="#" class="top-menu-button"> <img class="svg-invert" src="/static/img/svg/dinner.svg" alt=""/></a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <a class="navbar-brand" href="<c:url value="/logout" />">  <i class="fa fa-sign-in">  Sign out</i> </a>
            </ul>
        </div>
    </div>
</div>


<div class="container">
    <div class="row" id="categories">
        <div class="col-xc-6 col-sm-4 col-md-3 col-lg-2">


    </div>
</div>
</div>


<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="/static/js/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="/static/js/bootstrap.js"></script>
<script src="/static/js/script.js"></script>

<script>
    function createCategries() {
        var html = '';
        for (var i = 1; i <= 12; i++) {
            html += '' +
                    '<div class="col-xc-3 col-sm-4 col-md-3  col-lg-2">' +
                        '<div class="thumbnail" id="table_'+ i +'">' +
                            '<a href="#">' +
                                '<h3 style="margin: 0">' +
                                     '<span style="text-align: justify; display:block;" class="label label-primary ">Стіл № '+i+'</span>' +
                                '</h3>' +
                                '<img src="/static/img/svg/1/table.svg" alt=""/>' +
                                '<h4 style="margin: 0">' +
                                      '<span style="display: inline-block;" class="label label-danger">Чек № '+i+'</span>' +
//                                      '<span style="display: inline-block; float: right" class="label label-danger ">Сума:   '+i+'</span>' +
                                '</h4>' +
                            '</a>' +
                        '</div>' +
                    '</div>'
        }
        return html;
    }
    function run(){
        document.getElementById("categories").innerHTML = createCategries();
//        $("#categories").innerHTML = createCategries();
    }
    function createOrUpdateStorage(){

    }
    window.onload = run;
</script>
</body>
</html>