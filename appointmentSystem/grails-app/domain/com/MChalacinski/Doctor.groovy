package com.MChalacinski

class Doctor {
String fullName
String qualification
String position
String doctorEmail
String password
String doctorOffice
String doctorPhone
String bio

String toString(){
return fullName
}

static hasMany=[nurses:Nurse, appointments:Appointment, prescriptions:Prescription, patients:Patient, surgerys:Surgery]
static belongsTo=[Surgery]

    static constraints = {
fullName nullable: false, blank: false
qualification nullable: false, blank:false
position nullable: false, blank:false
doctorEmail nullable: false, blank:false, email:true
password nullable: false, blank:false 
doctorOffice nullable: false, blank:false
doctorPhone nullable: false, blank:false, minSize:8, maxSize:15
bio nullable: false, blank:false
    }
}
