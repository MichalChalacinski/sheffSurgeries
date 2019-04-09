package com.MChalacinski

class BootStrap {

    def init = { servletContext ->


def surgery1=new Surgery(
name: 'Flying Scotsman Centre',
address: '21 Marble Street Sheffield', 
postcode: 'SN1 12PK', 
telephone: '1234 222 1111', 
numberOfPatients: 75,
description:'''Zombies reversus ab inferno, nam malum cerebro. De carne animata corpora quaeritis. Summus sit​​, morbo vel maleficia?''', 
openingTime:'8am-8pm'
).save()

def surgery2=new Surgery(
name: 'Lying Frog Centre',
address: '24 Cain Street Sheffield', 
postcode: 'SN1 34LP', 
telephone: '1234 333 1111', 
numberOfPatients: 80,
description:'''Zombie ipsum reversus ab viral inferno, nam rick grimes malum cerebro. De carne lumbering animata corpora quaeritis.''', 
openingTime:'9am-6pm'
).save()

def doctor1=new Doctor(
fullName: 'Joe Doe',
qualification: 'MBChB(Sheffield)', 
position: 'GP, Surgeon', 
doctorEmail: 'doctor@yahoo.com', 
password: 'password',
doctorOffice:'D-090', 
doctorPhone:'0114 222 4444',
bio:'''Cupcake ipsum dolor sit amet gummies donut tootsie roll lollipop. Danish apple pie apple pie gummi bears chocolate bar bear claw lemon drops marzipan. Cupcake pie toffee soufflé apple pie.'''
).save()

def doctor2=new Doctor(
fullName: 'Ben Zen',
qualification: 'MBChB(Sheffield)', 
position: 'Neurologist', 
doctorEmail: 'doctor@gmail.com', 
password: 'password',
doctorOffice:'N-140', 
doctorPhone:'0114 222 3333',
bio:'''Cupcake ipsum dolor sit amet gummi bears. Lemon drops pudding donut tart wafer jelly beans. Biscuit candy canes chocolate cake lemon drops bonbon chocolate caramels tart.''' 
).save()

def patient1=new Patient(
patientName: 'Tom Scott',
patientAddress: '2 One Way Street, Sheffield', 
patientResidence: 'Sheffield', 
patientDob: new Date('20/09/2018'), 
patientId: 'E2555',
dateRegistered:new Date('26/02/2018'), 
patientPhone:'0114 111 5555'
).save()

def patient2=new Patient(
patientName: 'Bob Ross',
patientAddress: '5 Two Way Street, Sheffield', 
patientResidence: 'Sheffield', 
patientDob: new Date('20/07/2018'), 
patientId: 'E2444',
dateRegistered:new Date('24/02/2018'), 
patientPhone:'0114 333 5555'
).save()

def receptionist1=new Receptionist(
recepName: 'Jane Doe',
recepEmail: 'j.doe@email.com', 
recepUsername: 'recep1', 
recepPassword: 'password',  
recepPhone:'0115 333 5555'
).save()

def receptionist2=new Receptionist(
recepName: 'Kane Zoe',
recepEmail: 'k.zoe@email.com', 
recepUsername: 'recep2', 
recepPassword: 'password',  
recepPhone:'0115 333 7777'
).save()

def nurse1=new Nurse(
nurseName: 'Tom Cruz',
qualifications: 'Registered General Nurse', 
nurseEmail: 'cruz@email.com', 
nurseOffice: 'N-113',  
nursePhone:'0115 888 7777'
).save()

def nurse2=new Nurse(
nurseName: 'Brad Pitt',
qualifications: 'Registered General Nurse', 
nurseEmail: 'pitt@email.com', 
nurseOffice: 'N-115',  
nursePhone:'0115 999 7777'
).save()

def appointment1=new Appointment(
appDate: new Date('11/05/2019'),
appTime: '3pm', 
appDuration: '60', 
roomNumber: 'D-123'  
).save()

def appointment2=new Appointment(
appDate: new Date('14/05/2019'),
appTime: '2pm', 
appDuration: '45', 
roomNumber: 'B-115'  
).save()

def prescription1=new Prescription(
pharmacyName: 'St.Dorian Pharmacy',
prescripNumber: '12345', 
medicine: 'Codeine 60mg', 
totalCost: '£12.50',  
dateIssued: new Date('12/02/2019'),
patientPaying:'no'
).save()

def prescription2=new Prescription(
pharmacyName: 'Lovecrafts Happy Little Pharmacy',
prescripNumber: '54321', 
medicine: 'Fluoxetine', 
totalCost: '£22.50',  
dateIssued: new Date('14/02/2019'),
patientPaying:'no'
).save()

surgery1.addToDoctors(doctor1)
surgery2.addToDoctors(doctor2)

surgery1.addToNurses(nurse1)
surgery2.addToNurses(nurse2)

surgery1.addToReceptionists(receptionist1)
surgery2.addToReceptionists(receptionist2)

surgery1.addToPatients(patient1)
surgery2.addToPatients(patient2)

surgery1.addToAppointments(appointment1)
surgery2.addToAppointments(appointment2)

doctor1.addToPrescriptions(prescription1)
doctor2.addToPrescriptions(prescription2)

doctor1.addToAppointments(appointment1)
doctor2.addToAppointments(appointment2)

doctor1.addToNurses(nurse1)
doctor2.addToNurses(nurse2)

doctor1.addToPatients(patient1)
doctor2.addToPatients(patient2)

patient1.addToPrescriptions(prescription1)
patient2.addToPrescriptions(prescription2)

patient1.addToAppointments(appointment1)
patient2.addToAppointments(appointment2)

    }
    def destroy = {
    }
}
