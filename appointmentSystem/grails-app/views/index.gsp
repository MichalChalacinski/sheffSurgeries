<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
</head>
<body>
<content tag="nav">
<div class="row">
<asset:image src="healthcare-banner.jpg"/>
</div>


<div id="content" role="main">
    <section class="row colset-2-its">
        <h1>Welcome to Sheffield Surgeries</h1>

        <p>
Lorem ipsum dolor amet quinoa brunch taxidermy, banjo blue bottle readymade irony prism craft beer. 
Pug ennui church-key poke hella ut intelligentsia typewriter cloud bread quinoa deserunt. DIY affogato tacos lomo live-edge bitters. Kale chips ugh ethical officia chambray exercitation swag tumblr master cleanse authentic tattooed brunch pug.
        </p>

        <div id="controllers" role="navigation">
            <h2>Controllers:</h2>
            <ul>
                <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                    <li class="controller">
                        <g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link>
                    </li>
                </g:each>
            </ul>
        </div>
    </section>
</div>

</body>
</html>
