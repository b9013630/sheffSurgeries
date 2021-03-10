package com.jvango

class Nurse {

	String nurseName
	String qualifications
	String nurseEmail
	String nurseOffice
	String nursePhone
	
	String toString(){
		return nurseName
	}


    static constraints = {
    
    	nurseName blank:false, nullable:false
	qualifications blank:false, nullable:false
	nurseEmail blank:false, nullable:false
	nurseOffice blank:false, nullable:false
	nursePhone blank:false, nullable:false
    }
    
     	static belongsTo = [surgery:Surgery]
     	
     	static hasMnay = [doctors:Doctor]
}
