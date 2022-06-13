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
System.out.println("1.ADD");
System.out.println("2.VIEW");
System.out.println("3.DELETE");
System.out.println("4.Update");
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
}

}}