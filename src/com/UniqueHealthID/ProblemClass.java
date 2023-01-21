package com.UniqueHealthID;

public class ProblemClass {
	
//	Patient...class
	// enterPatientInfo..to get input of info...such as..Name, id, contactinfo, diseases, treatment, doctorallocated, medicines
	// getPatientInfo....store info
	// store info for ....multiple patients....serialized
	
//  Doctor.....class
	// enterDoctorInfo....to get input of....such as...DoctorName, doctorID, Facility Name
	// getDoctorInfo.....to store info
	// store info....multiple Doctors....Serialized
	
//  Hospital....Health Care Facility ......class
	// Deserialized.....data of respective...patient
	// Deserialize .....data of respective...doctor
	
	
	
//	package com.UniqueHealthID;
//
//	import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//	import java.io.Serializable;
//	import java.util.Scanner;
//
//	//Patient...class
//		// enterPatientInfo..to get input of info...such as..Name, id, contactinfo..patient number, diseases, treatment, doctorallocated..opd, medicines
//		// getPatientInfo....store info
//		// store info for ....multiple patients....serialized
//
//
//	public class Patient implements Serializable{
//		
//		String patientName;
//		int patientID;
//		long patientNumber;
//		String disease;
//		String treatment;
//		String opdDoctor;
//		String medicine;
//		
//		public String getPatientName() {
//			return patientName;
//		}
//		public void setPatientName(String patientName) {
//			this.patientName = patientName;
//		}
//		public int getPatientID() {
//			return patientID;
//		}
//		public void setPatientID(int patientID) {
//			this.patientID = patientID;
//		}
//		public long getPatientNumber() {
//			return patientNumber;
//		}
//		public void setPatientNumber(long patientNumber) {
//			this.patientNumber = patientNumber;
//		}
//		public String getDisease() {
//			return disease;
//		}
//		public void setDisease(String disease) {
//			this.disease = disease;
//		}
//		public String getTreatment() {
//			return treatment;
//		}
//		public void setTreatment(String treatment) {
//			this.treatment = treatment;
//		}
//		public String getOpdDoctor() {
//			return opdDoctor;
//		}
//		public void setOpdDoctor(String opdDoctor) {
//			this.opdDoctor = opdDoctor;
//		}
//		public String getMedicine() {
//			return medicine;
//		}
//		public void setMedicine(String medicine) {
//			this.medicine = medicine;
//		}
//
//		
//		public Patient enterPatientInfo() {
//			
//			Scanner scEnterPatient = new Scanner(System.in);
//			
//			System.out.println("Enter The Patient Name = ");
//			patientName = scEnterPatient.nextLine();
//			
//			System.out.println("Enter The Disease to be Treated = ");
//			disease = scEnterPatient.nextLine();
//			
//			System.out.println("Enter The Treatment Performed = ");
//			treatment = scEnterPatient.nextLine();
//			
//			System.out.println("Enter The OPD Doctor Name = ");
//			opdDoctor = scEnterPatient.nextLine();
//			
//			System.out.println("Enter The Prescriptions Given = ");
//			medicine = scEnterPatient.nextLine();
//			
//			System.out.println("Enter The Patient ID = ");
//			patientID = scEnterPatient.nextInt();
//			
//			System.out.println("Enter The Patients Contact Info = ");
//			patientNumber = scEnterPatient.nextLong();
//			
//			Patient patient = new Patient();
//			
//			patient.setPatientName(patientName);
//			patient.setPatientID(patientID);
//			patient.setPatientNumber(patientNumber);
//			patient.setDisease(disease);
//			patient.setTreatment(treatment);
//			patient.setOpdDoctor(opdDoctor);
//			patient.setMedicine(medicine);
//			
//			
//			getPatientInfo(patient);
//			return patient;
//			
//		}
//		private void getPatientInfo(Patient patient) {
//			
//			System.out.println("The Patient Name = " +getPatientName());
//			System.out.println("The Patient ID = " +getPatientID());
//			System.out.println("The Patients Contact Info = " +getPatientNumber());
//			System.out.println("The Disease to be Treated = " +getDisease());
//			System.out.println("The Treatment Performed = " +getTreatment());
//			System.out.println("The OPD Doctor Name = " +getOpdDoctor());
//			System.out.println("The Prescriptions Given = " + getMedicine());
//		}
//		
//		
//		
//		
//		public static void main(String[] args) {
//			
//			Patient patient = new Patient();
//			
//			Scanner scmain = new Scanner(System.in);
//			System.out.println("Enter the Number Of Patients = ");
//			int num = scmain.nextInt();
//			
//			for (int i=1; i<=num; i++) {
//			
//			patient.enterPatientInfo();
//			
//			try {
//				
//				FileOutputStream fos = new FileOutputStream("E:\\UHID Java\\Patient.txt");
//				ObjectOutputStream oos = new ObjectOutputStream(fos);
//				oos.writeObject(patient);
//				oos.flush();
//				
//				System.out.println("Patient Data Upload Succesfull");
//				
//			}catch (Exception e) {
//				e.printStackTrace();
//			}
//			
//			}
//
//		}
//
//	}
//
//
//	
//	public class Hospital {
//
//		public static void main(String[] args) {
//			
//			Patient patient = new Patient();
//			
//			try {
//				
//				FileInputStream fis = new FileInputStream("E:\\UHID Java\\Patient.txt");
//				ObjectInputStream ois = new ObjectInputStream(fis);
//			    
//				Object obj = ois.readObject();
//				
//				Patient p = (Patient) obj;
//				
//				System.out.println("The Patient Name = " +p.getPatientName());
//				System.out.println("The Patient ID = " +p.getPatientID());
//				System.out.println("The Patients Contact Info = " +p.getPatientNumber());
//				System.out.println("The Disease to be Treated = " +p.getDisease());
//				System.out.println("The Treatment Performed = " +p.getTreatment());
//				System.out.println("The OPD Doctor Name = " +p.getOpdDoctor());
//				System.out.println("The Prescriptions Given = " + p.getMedicine());
//				
//				
//				System.out.println("Patient Data Downloaded Succesfull");
//				
//			}catch (Exception e) {
//				e.printStackTrace();
//			}
//			
//			
//
//		}

}
