package Assignement;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Process {


	public static void main(String[] args) throws EOFException  {
		
		Map<RegularEmployee,Set<Certification>>regEmp=new HashMap<>();
		
		Map<ContractEmployee,Set<Certification>>contEmp=new HashMap<>();
		
		

		
		Set<Certification> set1Cert=new HashSet<>();
		set1Cert.add(new Certification(10,"CCNA",15));
		set1Cert.add(new Certification(12,"java",10));
		set1Cert.add(new Certification(21,"Python",5));
		
		
		Set<Certification> set2Cert=new HashSet<>();
		set2Cert.add(new Certification(10,"Devops",15));
		set2Cert.add(new Certification(12,"GCDL",10));
		
		Set<Certification> set3Cert=new HashSet<>();
		set3Cert.add(new Certification(30,"NPTL",20));
		
		Set<Certification> set4Cert=new HashSet<>();
		set4Cert.add(null);
		
		RegularEmployee e1,e2,e3,e4;
		
		 e1= new RegularEmployee(101,"punyakoti",20,"MAMUM00641480000001258");
		 e2=new RegularEmployee(102,"Akash",10,"MAMUM00641480000001276");
		 e3=new RegularEmployee(103,"Suraj",20,"MAMUM00641480000003989");
		 e4=new RegularEmployee(104,"Deva",10,"MAMUM006414800000089788");
		 
		 //Adding the Employee details and the certification
		 regEmp.put(e1,set1Cert);
		 regEmp.put(e2,set2Cert);
		 regEmp.put(e3,set3Cert);
		 regEmp.put(e4,set4Cert);
		 System.out.println(regEmp);
		 
		 
		 System.out.println("\nRegularEmployee");
		for(Map.Entry<RegularEmployee, Set<Certification>> mapEntry : regEmp.entrySet())
		{
			System.out.println(mapEntry.getKey()+" : "+mapEntry.getValue());
		}
		
		
		
		
		
		//ContractEmployee Process
		
		ContractEmployee c1,c2,c3,c4;
		
		 c1= new ContractEmployee(101,"Pardhu",20,1000);
		 c2=new ContractEmployee(102,"Madhu",10,1004);
		 c3=new ContractEmployee(103,"Venkatesh",20,2003);
		 c4=new ContractEmployee(104,"Siva",10,2134);
		 
		 contEmp.put(c1,set1Cert);
		 contEmp.put(c2,set2Cert);
		 contEmp.put(c3,set3Cert);
		 contEmp.put(c4,set4Cert);
		 System.out.println(contEmp);

		 System.out.println("\nContractEmployee");
		 for(Map.Entry<ContractEmployee,Set<Certification>>entries : contEmp.entrySet())
		 {
			 System.out.println(entries.getKey()+" : "+entries.getValue());
			 
		 }
		 System.out.println();
		 
		 
		 //Serializing
		 try {
				FileOutputStream fos=new FileOutputStream("C:\\Users\\Punyakoti Reddy\\Desktop\\RegularEmp.ser");
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				oos.writeObject(regEmp);
				oos.writeObject(contEmp);
				System.out.println("Successfully serialized");
			} 
		 
		 catch (FileNotFoundException e) {
				e.printStackTrace();
			} 
		 
		 catch (IOException e) {
					e.printStackTrace();
			}
		 
		 //DeSerializing
		 System.out.println("-".repeat(100));
		 System.out.println("Deserialize Objects\n");
		 try(FileInputStream fis=new FileInputStream("C:\\Users\\Punyakoti Reddy\\Desktop\\RegularEmp.ser"))
				 {
			 ObjectInputStream ois=new ObjectInputStream(fis);
			 
			 while(true)
			 {
				 try
				 {
					 Object res=ois.readObject();
					 System.out.println(res+"\n");
				 }
				 catch (Exception e) {
					 break;
				}	 
			 }//while End
			 
				 } 
		 catch (Exception e) {
						e.printStackTrace();
				}
		 
				 
	}

}
