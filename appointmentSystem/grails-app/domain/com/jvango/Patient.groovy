package com.jvango

class Patient {

	String toString(){
		return patientName
	}

	String patientName
	String patientAddress
	String patientResidence
	Date patientDob
	String patientID
	Date dateRegistered
	String patientPhone

    static constraints = {

	/*patientName blank:false, nullable:false
	patientAddress blank:false, nullable:false
	patientResidence blank:false, nullable:false
	patientDob blank:false, nullable:false
	patientID blank:false, nullable:false, unique:true
	dateRegistered blank:false, nullable:false
	patientPhone blank:false, nullable:false*/

    }
	static belongsTo = [surgery:Surgery, doctor:Doctor]

	static hasMany = [appointments:Appointment, prescriptions:Prescription]


}
