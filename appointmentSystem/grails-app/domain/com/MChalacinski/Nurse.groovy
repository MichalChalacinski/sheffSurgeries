package com.MChalacinski

class Nurse {
String nurseName
String qualifications
String nurseEmail
String nurseOffice
String nursePhone

String toString(){
return nurseName
}

static hasMany=[doctors:Doctor, surgerys:Surgery]
static belongsTo=[Surgery,Doctor]


    static constraints = {
nurseName nullable: false, blank: false
qualifications nullable: false, blank: false
nurseEmail nullable: false, blank: false, email:true
nurseOffice nullable: false, blank: false
nursePhone nullable: false, blank: false, minSize:8, maxSize:15

    }
}
