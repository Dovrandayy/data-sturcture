package data_structure_exp.exp1.que6system;

import java.util.Iterator;
import java.util.Scanner;

public class TestMyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int N = 6;
		boolean flag = true;
		Scanner scn = new Scanner(System.in);
		MyArrayList<Student> myArraylist = new MyArrayList<>();
		Student[] stu = new Student[6];
		String sno = null;
		String name = null;
		Student s = null;
		
		stu[0] = new Student( "2018001","Alan","F",93,88);
		stu[1] = new Student( "2018002","Danie","M",75,69);
		stu[2] = new Student( "2018003","Helen","M",56,77);
		stu[3] = new Student( "2018004","Bill","F",87,90);
		stu[4] = new Student( "2018005","Peter","M",79,86);
		stu[5] = new Student( "2018006","Amy","F",68,75);
		for( int i = 0; i < stu.length; i++ ) {
			myArraylist.add(stu[i]);
		}
		
		System.out.println("There are five operations to be selected:");
		System.out.println("1.Search.");
		System.out.println("2.Modify.");
		System.out.println("3.Insert.");
		System.out.println("4.Delete.");
		System.out.println("5.Exit.");		
		while(flag) {
			System.out.println();
			System.out.print("Please enter a number between 1 and 5: ");
			int k = scn.nextInt();			
			switch(k) {
				case 1:					
					// Search: Find a student on a special condition, such as sno					
					System.out.println("11.Searching by sno.");
					System.out.println("12.Searching by name.");
					System.out.println("13.Exit search.");
					boolean flag2 = true;
					while(flag2) {
						System.out.print("Please enter a number between 11 and 13: ");
						int t = scn.nextInt();	
						switch(t) {
							case 11:
							//Search: Find a student by sno.
								System.out.println("Please enter the sno to be searched:");
								sno = scn.next();									
								SearchBySno(sno, myArraylist);
								break;
							case 12:
								//Search: Find a student by name.
									System.out.println("Please enter name sno to be searched:");
									name = scn.next();
									SearchByName(name, myArraylist);
									break;
							case 13:
								//exit the search operation
								flag2 = false;
								System.out.println("Exit the search operation.");
								break;
							default:
								//enter error
								System.out.println("enter error.");					
						}
				}
				case 2:
					// Modify: Modify the scores according to the sno. for one course.
					System.out.println("Please enter the student's sno to be modified");
					sno = scn.next();					
					//ModifyNode(sno,myArraylist);
					break;
				case 3:
					//Insert
					System.out.println("Please provide the inserted student's information");
					s = new Student( "2018007","Tony","M",81,79);
					//InsertNode(s,myArraylist);
					break;	
				case 4:
					//Delete
					System.out.println("Please provide the deleted student's sno:");
					sno = scn.next();
					//DeleteNode(sno,myArraylist);
					break;
				case 5:	
					//exit the system
					flag = false;
					System.out.println("Exit the system.");
					break;
				default:
					//enter error
					System.out.println("enter error.");					
			}
		}
		scn.close();
	}	
	//Search by the entered sno
	public static void SearchBySno(String sno, MyArrayList<Student> myArraylist) {
    	Iterator<Student> it = myArraylist.iterator();
		int pos = 0;
		boolean flag = false; 		 
		while(it.hasNext()) {
			Student s = (Student)it.next();			
			if(s.getSno().equals(sno)) {
				flag = true;
				break;
			}
			pos++;
		}
		if(flag) {
			System.out.println("The position of " + sno + " in arraylist is " + pos);
		}
		else {
			System.out.println( sno + " in arraylist is not found." );
		}	    	
    }
	//Search By the entered name
	public static void SearchByName(String name, MyArrayList<Student> myArraylist) {
		Iterator<Student> it = myArraylist.iterator();
		int pos = 0;
		boolean flag = false; 
		while(it.hasNext()) {
			Student s = it.next();
			if(s.getName().equals(name)) {
				flag = true;
				break;
			}
			pos++;
		}
		if(flag) {
			System.out.println("The position of " + name + " in arraylist is " + pos);
		}
		else {
			System.out.println( name + " in arraylist is not found." );
		}		   	
    }
	/*
	public static void ModifyNode(String sno, MyArrayList<Student> myArraylist) {
		Iterator<Student> it = myArraylist.iterator();
		int pos = 0;
		boolean flag = false; 			
		
		while(it.hasNext()) {
			Student s = it.next();
			if(s.getSno().equals(stu.getSno())) {
				flag = true;
				break;
			}
			pos++;
		}
		if(flag) {
			myArraylist.set(pos, stu);	
		}	
		it = myArraylist.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}			
		//myArraylist.printMyArraylist();
    }
		
		// Insert: Insert a new stu Information
		public static void InsertNode(Student stu, MyArrayList<Student> myArraylist) {
			Iterator<Student> it = myArraylist.iterator();			
			myArraylist.add(1, stu);				
			System.out.print("All students information after finish insertion are:");
			while(it.hasNext()) {
				Student s = it.next();
				System.out.println(s);
			}							   	
	    }
		// Delete: Delete the Information of a dropout stu.
		public static void DeleteNode(String name, MyArrayList<Student> myArraylist) {
			Iterator<Student> it = myArraylist.iterator();		
			int pos = 0;
			boolean flag = false;
			
			while(it.hasNext()) {
				Student s = it.next();
				if(s.getName().equals(name)) {
					flag = true;
					break;
				}
				pos++;
			}
			if(flag) {
				myArraylist.remove(pos);
			}
			else {
				System.out.println( name + " in arraylist is not found." );
			}			
			
			it = myArraylist.iterator();
			while(it.hasNext()) {
				Student s = it.next();
				System.out.println(s);
			}			
	    }
	*/	
}
