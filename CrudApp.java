import java.io.*;
import java.util.*;
class CrudApp
{
public static void main(String[] args)
{
System.out.println("CRUD sc USING JAVA");
Scanner sc=new Scanner(System.in);
while(true)
{
System.out.println("1. ADD");
System.out.println("2. UPDATE");
System.out.println("3. DELETE");
System.out.println("4. VIEW");
System.out.println("5. VIEW ALL");
System.out.println("0. EXIT");
int ans=sc.nextInt();
if(ans==1)
{
System.out.print("Enter ID: ");
int id= sc.nextInt();
sc.nextLine();
System.out.print("Enter Name: ");
String name=sc.nextLine();
System.out.print("Enter Aadhar Number: ");
String aadharNumber=sc.nextLine();
System.out.print("Enter Mobile Number: ");
String mobileNumber=sc.nextLine();
System.out.print("Is Indian: ");
String isIndian=sc.nextLine();
Student s=new Student();
// 's' object k liye setId() function call kara and so on....
// setter function use krke attributes ko value assign kari
s.setId(id);
s.setName(name);
s.setAadharNumber(aadharNumber);
s.setMobileNumber(mobileNumber);
s.setIsIndian(isIndian);
Utilities.add(s);
// Utilities class h aur add function uska part h, Direct call kara kyuki add function static declared h aur add function ko 's' object pass kara h as an argument

}
if(ans==2)
{
System.out.print("Enter ID: ");
int id= sc.nextInt();
sc.nextLine();
System.out.print("Enter Name: ");
String name=sc.nextLine();
System.out.print("Enter Aadhar Number: ");
String aadharNumber=sc.nextLine();
System.out.print("Enter Mobile Number: ");
String mobileNumber=sc.nextLine();
System.out.print("Is Indian: ");
String isIndian=sc.nextLine();
Student s=new Student();
// 's' object k liye setId() function call kara and so on....
// setter function use krke attributes ko value assign kari
s.setId(id);
s.setName(name);
s.setAadharNumber(aadharNumber);
s.setMobileNumber(mobileNumber);
s.setIsIndian(isIndian);
Utilities.update(s);
// Utilities class h aur add function uska part h, Direct call kara kyuki add function static declared h aur add function ko 's' object pass kara h as an argument

}
if(ans==3)
{
System.out.print("Enter ID: ");
int id= sc.nextInt();
Utilities.delete(id);
}

if(ans==4)
{
System.out.print("Enter ID: ");
int id= sc.nextInt();
Student s=Utilities.getStudent(id);
//System.out.println(s);
if(s==null)
{
System.out.println("This id does'nt exist!!");
continue;
}
System.out.println("ID: "+s.getId());
System.out.println("Name: "+s.getName());
System.out.println("Aadhar Number: "+s.getAadharNumber());
System.out.println("Mobile Number: "+s.getMobileNumber());
System.out.println("Is Indian: "+s.getIsIndian());

}

if(ans==5)
{
Utilities.viewAll();
}

if(ans==0) break;

} //while loop here ending

} //main here ends

} //class ends here
