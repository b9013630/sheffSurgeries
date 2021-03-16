package com.jvango

class ReceptionistController {

    def scaffold = Receptionist
    
    def login(){
    
    }
    
    def validate(){
    	
    def user = Receptionist.findByRecepUsername(params.username)
    	
    if (user && user.recepPassword == params.password){
    	
    	session.user = user
    	render view:'home'
    	}
    	
    else{flash.message = "Invalid username and password."
    
    render view:'login'}}
    

	def logout = {
	session.user = null
	redirect(uri:'/')}
	
}
