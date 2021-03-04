package com.jvango

class Receptionist {

	String recepName
	String recepEmail
	String recepUsername
	String recepPassword
	String recepPhone
	
    static constraints = {
    
    	recepName blank:false, nullable:false
	recepEmail blank:false, nullable:false, email:true
	recepUsername blank:false, nullable:false
	recepPassword blank:false, nullable:false, password:true
	recepPhone blank:false, nullable:false
    }
    
     	//static belongsTo = [surgery:Surgery]
}
