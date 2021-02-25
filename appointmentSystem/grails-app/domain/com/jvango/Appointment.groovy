package com.jvango

class Appointment {

 	String toString(){
		return appNumber
	}

	Integer appNumber
	Date appDate
	String appTime
	Integer appDuration
	String roomNumber


    static constraints = {
	/*appNumber blank:flase, nullable:false, unique: true
	appDate blank:false, nullable:false
	appTime blank:false, nullable:false
	appDuration blank:false, nullable:false
	roomNumber blank:false, nullable:false*/

    }
	static belongsTo = [patient:Patient, surgery:Surgery, doctor:Doctor]

}
