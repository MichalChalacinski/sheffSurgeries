package com.MChalacinski

class Patient {
String patientName
String patientAdress
String patientResidence
Date patientDob
String patientId
Date dateRegistered
int patientPhone

    static constraints = {
patientName nullable: false, blank: false
patientAdress nullable: false, blank: false
patientResidence nullable: false, blank: false
patientDob nullable: false, blank: false
patientId nullable: false, blank: false, unique:true
dateRegistered nullable: false, blank: false
patientPhone nullable: false, blank: false, minSize:8, maxSize:15
    }
}
