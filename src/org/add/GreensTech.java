package org.add;

public class GreensTech {
  private void greensPerungudi(int noOfStudents) {
	  this.greensPerungudi(10, "Sunday");
  System.out.println("No of students : "+noOfStudents);
}
  private void greensPerungudi(String tutorName,int phone) {
  System.out.println("Tutor name is "+tutorName+"\n"+"Phone number is "+phone);
}
  private void greensPerungudi(int workingHours,String leaves) {
  System.out.println("Working hours : "+workingHours+"\n"+"Leaves on "+leaves);
  this.greensPerungudi("Vaishnavi", 986745870);
}
  public static void main(String[] args) {
	  GreensTech g = new GreensTech();
	  g.greensPerungudi(250);
}
}
