package appointmentsystem

class BootStrap {

    def init = { servletContext ->
    
    //surgery data
    
    def surgery1 = new com.jvango.Surgery (
    name:'Sapcote Surgery',
    address:'21 Hinckley Road',
    postcode:'LE10 7JZ',
    telephone:'0145591736',
    numberOfPatients:'1000',
    description:'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean ante sapien, consequat et diam sit amet',
    openingTime:'8:00'
    ).save()
    
    def surgery2 = new com.jvango.Surgery (
    name:'Sharnford Family Practice',
    address:'21 Wendover Drive',
    postcode:'LE10 7KL',
    telephone:'014553316',
    numberOfPatients:'918',
    description:'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean ante sapien, consequat et diam sit amet',
    openingTime:'8:30'
    ).save()
    
    //Doctor Data
    
    def doctor1 = new com.jvango.Doctor (
    fullName:'Emma Parker',
    qualification:'MSc',
    position:'GP',
    doctorEmail:'emmap@gp.com',
    doctorPhone:'0145592739',
    bio:'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean ante sapien, consequat et diam sit',
    surgery:surgery2
    ).save()
    
    def doctor2 = new com.jvango.Doctor (
    fullName:'Martin Baker',
    qualification:'MSc',
    position:'Head GP',
    doctorEmail:'martinB@gp.com',
    doctorPhone:'01455929289',
    bio:'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean ante sapien, consequat et diam sit',
    surgery:surgery2
    ).save()
    
    //receptionist Data
    
    def receptionist1 = new com.jvango.Receptionist (
	recepName:'Sally Dewfield',
	recepEmail:'sallyD@yahoo.com',	
	recepUserame:'sally',
	recepPassword:'password',
	recepPhone:'011455816',
	surgery:surgery1
	).save()
	
	def receptionist2 = new com.jvango.Receptionist (
	recepName:'Josh Freeman',
	recepEmail:'joshf@hotmail.com',	
	recepUserame:'josh',
	recepPassword:'password',
	recepPhone:'011422816',
	surgery:surgery2
	).save()
	
	//nurse Data
	
	def nurse1 = new com.jvango.Nurse (
	nurseName:'Justine Howe',
	qualifications:'BSc',
	nurseEmail:'justineh@nurse.com',
	nurseOffice:'817',
	nursePhone:'071559092',
	surgery:surgery1
	).save()
	
	def nurse2 = new com.jvango.Nurse (
	nurseName:'Rodney Podney',
	qualifications:'BSc',
	nurseEmail:'rodneyp@nurse.com',
	nurseOffice:'17',
	nursePhone:'0145582729',
	surgery:surgery2
	).save()
	
	//patient Data
	
	def patient1 = new com.jvango.Patient (
	patientName:'Brandy Francis',
	patientAddress:'9 Lisbon Lane',
	patientResidence:'Leicestshire',
	patientDob:new Date('07/05/2000'),
	patientID:111,
	dateRegistered:new Date('06/01/2021'),
	patientPhone:'014557269',
	surgery:surgery1
	).save()

	def patient2 = new com.jvango.Patient (
	patientName:'Lisa Burman',
	patientAddress:'101 Washington Way',
	patientResidence:'Warwickshire',
	patientDob:new Date('12/10/1999'),
	patientID:222,
	dateRegistered:new Date('06/01/2021'),
	patientPhone:'018272892',
	surgery:surgery1
	).save()
	
	//appointment Data
	
	def appointment1 = new com.jvango.Appointment(
	appNumber:10,
	appDate:new Date('10/01/2021'),
	appTime:'10:00am',
	appDuration:20,
	roomNumber:'828',
	surgery:surgery1,
	doctor:doctor1
	).save()	
	
	def appointment2 = new com.jvango.Appointment(
	appNumber:30,
	appDate:new Date('13/01/2021'),
	appTime:'11:30am',
	appDuration:20,
	roomNumber:'87',
	surgery:surgery2,
	doctor:doctor2
	).save()
	
	//Prescription Data
	
	def prescription1 = new com.jvango.Prescription (
	pharmacyName:'Burbage Pharmacy',
	prescripNumber:1,
	medicine:'Ridoccine',
	totalCost:'£5.00',
	dateIssued:new Date('07/02/2021'),
	patientPaying:true,
	patient:patient2,
	doctor:doctor1
	).save()
	
	def prescription2 = new com.jvango.Prescription (
	pharmacyName:'Sharnford Pharmacy',
	prescripNumber:2,
	medicine:'Oxytocin',
	totalCost:'£7.00',
	dateIssued:new Date('08/02/2021'),
	patientPaying:true,
	patient:patient1,
	doctor:doctor2
	).save()
	
    
    }
    def destroy = {
    }
}
