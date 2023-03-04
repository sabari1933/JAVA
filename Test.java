import java.io.*;
public class Test{
public static void main(String[]args)throwsIOException{

DataInputStream d = new DataInputStream (new 			FileInputStream("E:\\source.txt"));
DataOutputStream out = new DataOutputStream (new 				FileOutputStream("E:\\destinstion.txt"));
String count;
while((count d.readLine()) !=null){
String u = count.toUpperCase();
System.out.println(u);
out.writebytes(u + " ,");
}
d.close();
out.close();
}