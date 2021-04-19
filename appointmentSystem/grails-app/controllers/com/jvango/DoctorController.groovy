package com.jvango

class DoctorController {

    def scaffold = Doctor
    
    def login(){
    
    }
    
    def validate(){
	
	def user = Doctor.findByDoctorEmail(params.DoctorEmail)


		if(user && user.password == params.DoctorPassword){

		session.user = user

		render view:'home'		

		}
		else{
	
		flash.message = "Invalid username and Password."

		render view:'login'

		}
	}
	
	def logout (){
	session.user = null
	redirect(uri:'/')
	}
	
}
	
	
