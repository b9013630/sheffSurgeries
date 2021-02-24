package com.jvango

class Surgery {

String toString(){
		return name
	}

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
	postcode blank:false, nullable:false, matches:'([Gg][Ii][Rr] 0[Aa]{2})|((([A-Za-z][0-9]{1,2})|(([A-Za-z][A-Ha-hJ-Yj-y][0-9]{1,2})|(([A-Za-z][0-9][A-Za-z])|([A-Za-z][A-Ha-hJ-Yj-y][0-9][A-Za-z]?))))s?[0-9][A-Za-z]{2})'
	telephone blank:false, nullable:false
	numberOfPatients blank:false, nullable:false
	description blank:false, nullable:false, widget:'textarea'
	openingTime blank:false, nullable:false
    }
	static hasMany = [doctors:Doctor, receptionists:Receptionist, patients:Patient, nurses:Nurse, appointments:Appointment]
	
	static belongsTo = [name:Surgery]

}
