package Assignment3;

public class Student extends Person {
	public String program;
    public int year;
    public double fee;


    public String getProgram() { return program; }
    public int getYear() { return year; }
    public double getFee() { return fee; }


    public void setProgram(String program) { this.program = program; }
    public void setYear(int year) { this.year = year; }
    public void setFee(double fee) { this.fee = fee; }


    public String toString() { return "Student[Person[name= " + getName() + ", address= " + getAddress() + ", program= " + getProgram() + ", year= " + getYear() + ", fee= " + getFee(); }
}


