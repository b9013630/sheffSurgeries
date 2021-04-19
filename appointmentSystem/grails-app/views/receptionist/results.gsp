<!doctype html>
<html>
<head>
	<meta name="layout" content="main"/>
	<title>Receptionist Results</title>
	
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
	
	Searched ${totalPatients} records
	
	for items matching <em>${term}</em>.
	
	Found <strong>${patients.size()}</strong> patients.
	
	<button type="button" class="btn">
	
	<g:link action='search'>Search Again</g:link>
	
        </button>
	
	</p>
	
	</section>
	<section class="row colset-2-its">
        
       <ul>
       
       <g:each var="patient" in="${patients}">
       
       <li>
       
       <g:link controller="patient" action="show" 
       
       id="${patient.id}">${patient.patientName}</g:link>
       
       </li>
       
       </g:each>
       
       </ul> 
       </br>
       
</section>
</div>

  </body>
</html>
