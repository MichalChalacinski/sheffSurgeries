package com.MChalacinski

class Surgery {
String name
String address
String postcode
String telephone
int numberOfPatients
String description
String openingTime

String toString(){
return name
}

static hasMany=[patients:Patient, doctors:Doctor, receptionists:Receptionist, appointments:Appointment, nurses:Nurse]

    static constraints = {
name nullable: false, blank: false
address nullable: false, blank:false
postcode nullable: false, blank:false
telephone nullable: false, blank:false
numberOfPatients nullable: false, blank:false
description nullable: false, blank:false, maxSize: 5000, widget: 'textarea'
openingTime nullable: false, blank:false
    }
}
    
