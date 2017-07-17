# swap-char
import java.io.*;
import java.util.*;
public class swap char
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
char str[20],temp=0;
int i;
System.out.println("Enter the String:");
String a=br.readLine();
for(int i=0;i<strlen(str);i=i+2)
{
temp=str[i];
str[i]=str[i+1];
str[i+1]=temp;
}
System.out.println("After swap the string :"+temp);
}
}
