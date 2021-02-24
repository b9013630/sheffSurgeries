package com.jvango

class Prescription {

	String toString(){
		return prescripNumber
	}

	String pharmacyName
	Integer prescripNumber
	String medicine
	String totalCost
	Date dateIssued
	Boolean patientPaying

    static constraints = {
	pharmacyName blank:false, nullable:false
	prescripNumber blank:false, nullable:false, unique:True
	medicine blank:false, nullable:false
	totalCost blank:false, nullable:false
	dateIssued blank:false, nullable:false
	patientPaying blank:false, nullable:false

    }
	static belongsTo = [patient:Patient]

}
