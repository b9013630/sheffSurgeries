<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Sheffield Surgeries</title>
</head>
<body>


<div class="svg" role="presentation">
    <div class="grails-logo-container">
        <asset:image src="nhslogo2.webp" class="grails-logo"/>
    </div>
</div>

<div id="content" role="main">
    <section class="row colset-2-its">
        <h1>Welcome to Sheffield Surgeries</h1>

        <p>
            Welcome. You are now logged in. The available controllers are below.
            
        </p>
        
        </section>

<section class="row colset-2-its">
        <div id="controllers" role="navigation">
            <h2>Available Controllers:</h2>
            <ul>
                <%-- <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                    <li class="controller">
                        <g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link>
                    </li>
                </g:each>
            </ul> --%>
            
        <button type="button" class="btn">
	<g:link controller="patient" action="create">Add patient</g:link>
	</button>
</br>
</br>
        <button type="button" class="btn">
	<g:link controller="doctor" action="create">Add doctor</g:link>
	</button>	
</br>
</br>
        <button type="button" class="btn">
	<g:link controller="nurse" action="create">Add nurse</g:link>
	</button> 
</br>
</br>
        <button type="button" class="btn">
	<g:link controller="receptionist" action="create">Add receptionist</g:link>
	</button>
           
        </div>
     </section>
</div>

</body>
</html>
