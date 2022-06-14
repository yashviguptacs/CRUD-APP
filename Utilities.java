import java.sql.*;
public class Utilities
{
public static void viewAll()
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c;
c=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","yashvi","yashvi");

Statement s;
s=c.createStatement();
ResultSet set=s.executeQuery("select * from student" );
while(set.next())
{
int id=set.getInt(1);
String name=set.getString(2);
String aadharNumber=set.getString(3);
String mobileNumber=set.getString(4);
String isIndian=set.getString(5);

System.out.println(id);
System.out.println(name);
System.out.println(aadharNumber);
System.out.println(mobileNumber);
System.out.println(isIndian);
System.out.println("--------------------------------------------------------------------");
}

set.close();
s.close();
c.close();


}catch(Exception e)
{
System.out.println(" ");

}

}



public static Student getStudent(int id)
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c;
c=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","yashvi","yashvi");
Student st=null;
Statement s;
s=c.createStatement();
ResultSet set=s.executeQuery("select * from student where id="+id);
while(set.next())
{
set.getInt(1);
String name=set.getString(2);
String aadharNumber=set.getString(3);
String mobileNumber=set.getString(4);
String isIndian=set.getString(5);
st= new Student();
st.setId(id);
st.setName(name);
st.setAadharNumber(aadharNumber);
st.setMobileNumber(mobileNumber);
st.setIsIndian(isIndian);
}

set.close();
s.close();
c.close();
return st;

}catch(Exception e)
{
System.out.println(id+ " This id does'nt exist!!!");
return null;
}

}


public static void delete(int id)
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c;
c=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","yashvi","yashvi");
Statement s;
s=c.createStatement();
s.executeUpdate("delete from student where id="+id);
s.close();
c.close();

}catch(Exception e)
{
System.out.println(id+ " This id does'nt exist!!!");
}


}
public static void update(Student s)
{
try
{
//create local variable for fetching data from s


//Load the driver
Class.forName("com.mysql.cj.jdbc.Driver");
// Establish Connection
Connection c;
c=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","yashvi","yashvi");
//create statement
PreparedStatement p;
p=c.prepareStatement("update student set name=?,aadhar=?,mobileNumber=?,isIndian=? where id=?");
p.setInt(5,s.getId());
p.setString(1,s.getName());
p.setString(2,s.getAadharNumber());
p.setString(3,s.getMobileNumber());
String str=s.getIsIndian();
if(str=="y") str="Y";
if(str=="n") str="N";
p.setString(4,str);
p.executeUpdate();
p.close();
c.close();
}
catch(Exception sqle)
{
System.out.println(sqle.getMessage());
}
}

public static void add(Student s)
{
try
{
//create local variable for fetching data from s
//Load the driver
Class.forName("com.mysql.cj.jdbc.Driver");
// Establish Connection
Connection c;
c=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","yashvi","yashvi");
//create statement
PreparedStatement p;
p=c.prepareStatement("Insert into student (id,name,aadhar,mobileNumber,isIndian) values(?,?,?,?,?)");
p.setInt(1,s.getId());
p.setString(2,s.getName());
p.setString(3,s.getAadharNumber());
p.setString(4,s.getMobileNumber());
String str=s.getIsIndian();
if(str=="y") str="Y";
if(str=="n") str="N";
p.setString(5,str);
p.executeUpdate();
p.close();
c.close();
}
catch(Exception sqle)
{
System.out.println(sqle.getMessage());
}
}
}
