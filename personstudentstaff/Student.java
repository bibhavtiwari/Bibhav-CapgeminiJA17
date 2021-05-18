package personstudentstaff;

public class Student extends Person {
	private  String Program;
	private int year;
	private double fee;
	public String getProgram() {
		return Program;
	}
	public void setProgram(String program) {
		Program = program;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	
	public String toString(){
		return "Student[Person[name= " + getName() + ", address= " + getAddress() + ", program= " + getProgram() + ", year= " + getYear() + ", fee= " + getFee(); 
}}
