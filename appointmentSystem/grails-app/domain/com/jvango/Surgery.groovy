package com.jvango

class Surgery {

	String name
	String address
	String postcode
	String telephone
	String numberOfPatients
	String description
	String openingTime
	
    static constraints = {
    
    	name blank:false, nullable:false
	address blank:false, nullable:false
	postcode blank:false, nullable:false
	telephone blank:false, nullable:false
	numberOfPatients blank:false, nullable:false
	description blank:false, nullable:false, widget:'textarea'
	openingTime blank:false, nullable:false
    }
    
	static hasMany = [doctors:Doctor, receptionists:Receptionist, patients:Patient, nurses:Nurse, appointments:Appointment]
    
}
