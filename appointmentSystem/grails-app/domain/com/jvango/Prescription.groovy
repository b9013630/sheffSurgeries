package com.jvango

class Prescription {

	String pharmacyName
	Integer prescripNumber
	String medicine
	String totalCost
	Date dateIssued
	Boolean patientPaying

    static constraints = {
    
    	pharmacyName blank:false, nullable:false
	prescripNumber blank:false, nullable:false, unique:true
	medicine blank:false, nullable:false
	totalCost blank:false, nullable:false
	dateIssued blank:false, nullable:false
	patientPaying blank:false, nullable:false
    }
    
     	//static belongsTo = [patient:Patient]
}
