<!doctype html>
<html>
<head>
	<meta name="layout" content="main"/>
	<title>Doctor Results</title>
	
	<asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>
</head>
<body>
<g:loginToggle />

<div class="svg" role="presentation">
    <div class="grails-logo-container">
        <asset:image src="nhslogo2.webp" class="grails-logo"/>
    </div>
</div>

<div id="content" role="main">
    <section class="row colset-2-its">
        <h1>Search Results</h1>   
 	
	<p>
	
	Searched ${totalPrescriptions} records
	
	for items matching <em>${term}</em>.
	
	Found <strong>${prescriptions.size()}</strong> prescriptions.
	
	<button type="button" class="btn">
	
	<g:link action='search'>Search Again</g:link>
	
        </button>
	
	</p>
	
	</section>
	<section class="row colset-2-its">
        
       <ul>
       
       <g:each var="prescription" in="${prescriptions}">
       
       <li>
       
       <g:link controller="prescription" action="show" 
       
       id="${prescription.id}">${prescription.medicine}</g:link>
       
       </li>
       
       </g:each>
       
       </ul> 
       </br>
       
</section>
</div>

  </body>
</html>
