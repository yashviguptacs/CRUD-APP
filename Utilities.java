import java.sql.*;
public class Utilities
{
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