package data_structure_exp.exp1.que6system;

public class Student {
	String sno;
	String name;  
	String gender;
	int collegeEnglish;
	int advancedMathematics;
	
	public Student(String sno,String name,String gender,
			int collegeEnglish,int advancedMathematics) {
		this.sno = sno;
		this.name = name;
		this.gender = gender;
		this.collegeEnglish = collegeEnglish;
		this.advancedMathematics = advancedMathematics;
	}
	
	public String getSno() {
		return sno;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public int getCollegeEnglish() {
		return collegeEnglish;
	}
	
	public int getAdvancedMathematics() {
		return advancedMathematics;
	}
	
	public void setCollegeEnglish( int collegeEnglish ) {
		this.collegeEnglish = collegeEnglish;
	}
	
	public void setAdvancedMathematics( int advancedMathematics ) {
		this.advancedMathematics = advancedMathematics;
	}	
	public String toString() {
		return getSno()+", "+getName()+", "+getGender()+", "+getCollegeEnglish()+", "+getAdvancedMathematics();
	}
}
