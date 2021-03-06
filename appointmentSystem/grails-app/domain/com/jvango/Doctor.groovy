package com.jvango

class Doctor {

	String fullName
	String qualification
	String position
	String doctorEmail
	String password
	String doctorOffice
	String doctorPhone
	String bio
	
	String toString(){
		return fullName
	}


    static constraints = {
    
    	fullName blank:false, nullable:false
	qualification blank:false, nullable:false
	position blank:false, nullable:false
	doctorEmail blank:false, nullable:false, email:true
	password blank:false, nullable:false, password:true
	doctorOffice blank:false, nullable:false
	doctorPhone blank:false, nullable:false
	bio widget:'textarea'
    }
    
    	static belongsTo = [surgery:Surgery]

	static hasMany = [patients:Patient, appointments:Appointment, 				prescriptions:Prescription, nurses:Nurse]
}
