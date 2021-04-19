<!doctype html>
<html>
<head>
	<meta name="layout" content="main"/>
	<title>Receptionist Search</title>
	
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
        <h1>Receptionist Search</h1>
    
 	
	<formset>
    		<legend>Search for patients.</legend>
    		
    		<g:form action="results">
    		
    		<label for="name">Enter patient name, ID or Residence:</label>
    		
    		<g:textField name="name"/>
    		
    		<g:submitButton name="search" value="search" />
    		
    		</g:form>
    		
    	</formset>
        
       
</section>

</div>

  </body>
</html>
