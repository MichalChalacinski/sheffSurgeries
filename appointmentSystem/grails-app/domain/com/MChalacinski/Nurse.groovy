package com.MChalacinski

class Nurse {
String nurseName
String qualifications
String nurseEmail
String nurseOffice
int nursePhone


    static constraints = {
nurseName nullable: false, blank: false
qualifications nullable: false, blank: false
nurseEmail nullable: false, blank: false, email:true
nurseOffice nullable: false, blank: false
nursePhone nullable: false, blank: false, minSize:8, maxSize:15

    }
}
