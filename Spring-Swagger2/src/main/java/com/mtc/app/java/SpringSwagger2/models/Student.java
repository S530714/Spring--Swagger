package com.mtc.app.java.SpringSwagger2.models;

public class Student {
	     
	    private String firstname;
	    private String lastname;
	    private String email;
	    
	    
		public Student() {
			super();
		}
		public Student(String firstname, String lastname, String email) {
			super();
			this.firstname = firstname;
			this.lastname = lastname;
			this.email = email;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		@Override
		public String toString() {
			return "Student [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + "]";
		}
	    
	 

	}

