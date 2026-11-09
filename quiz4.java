class Main {
    public static void main(String[] args) {
String employeename ="bashar";
System.out.println ("name is : " + employeename );
System.out.println (employeename.toUpperCase());
int workinghours = 160;
System.out.println ("working hours : " + workinghours);
float hourlyrate = 8.75f;
System.out.println ("hour lyrate : " + hourlyrate);
double salary = workinghours*hourlyrate;
System.out.println ("Salary : "+salary);
int newsalary = (int) salary;
System.out.println ("new salary " +newsalary);
boolean hasbonus = workinghours>=150;
System.out.println ("workinghours>=150? " + hasbonus );
if (hasbonus==true){
    System.out.println ("Eligibility for a 50 bouns");
}
else {
    System.out.println ("Not eligibld for a bouns");
}


   } 
}