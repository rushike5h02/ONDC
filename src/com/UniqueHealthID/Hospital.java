package com.UniqueHealthID;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

//Hospital....Health Care Facility ......class
//	 Deserialized.....data of respective...patient
// 	Deserialize .....data of respective...doctor

public class Hospital {

	public static void main(String[] args) {
		
			
		try {
			
			FileInputStream fis = new FileInputStream("E:\\UHID Java\\Patient.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
		    
			Object obj = ois.readObject();
			
			Patient p = (Patient) obj;
			
			System.out.println("The Patient Name = " +p.getPatientName());
			System.out.println("The Patient ID = " +p.getPatientID());
			System.out.println("The Patients Contact Info = " +p.getPatientNumber());
			System.out.println("The Disease to be Treated = " +p.getDisease());
			System.out.println("The Treatment Performed = " +p.getTreatment());
			System.out.println("The OPD Doctor Name = " +p.getOpdDoctor());
			System.out.println("The Prescriptions Given = " + p.getMedicine());
			
			System.out.println();
			System.out.println("Patient Data Downloaded Succesfull");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
