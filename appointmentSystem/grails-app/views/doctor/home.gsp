<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Sheffield Surgeries</title>
</head>
<body>
<g:doctorLoginToggle />

<div class="svg" role="presentation">
    <div class="grails-logo-container">
        <asset:image src="nhslogo2.webp" class="grails-logo"/>
    </div>
</div>

<div id="content" role="main">
    <section class="row colset-2-its">
        <h1>Welcome to Sheffield Surgeries</h1>

        <h2 class="welcomeText">
            Welcome. You are now logged in. The available controllers are below.
            
        </h2>
        
        </section>

<section class="row colset-2-its">
        <div id="controllers" role="navigation">
            <p>Available Functions:</p>
            <ul>
            
	<button type="button" class="btn">
	<g:link controller="doctor" action="search">Search for prescription</g:link>
	</button> 
</br>
</br>        
        <button type="button" class="btn">
	<g:link controller="prescription" action="create">Create prescription</g:link>
	</button>
</br>
</br>
        <button type="button" class="btn">
	<g:link controller="prescription" action="index">Show prescriptions</g:link>
	</button>	         
</br>
</br>
        <button type="button" class="btn">
	<g:link controller="appointments" >Show appointments</g:link>
	</button>
           
        </div>
     </section>
</div>

</body>
</html>
