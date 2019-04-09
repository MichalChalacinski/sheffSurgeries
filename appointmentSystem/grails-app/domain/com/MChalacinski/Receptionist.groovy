package com.MChalacinski

class Receptionist {
String recepName
String recepEmail
String recepUsername
String recepPassword
String recepPhone

String toString(){
return recepName
}

static hasMany=[surgerys:Surgery]
static belongsTo=[Surgery]
    static constraints = {
recepName nullable: false, blank: false
recepEmail nullable: false, blank: false, email:true
recepUsername nullable: false, blank: false
recepPassword nullable: false, blank: false
recepPhone nullable: false, blank: false, minSize:8, maxSize:15
    }
}
