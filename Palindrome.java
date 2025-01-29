import java.util.Scanner;
public class Palindrome{
  // Start your code here
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String str1="";
    for(int i=str.length()-1;i>=0;i--){
      str1=str1+str.charAt(i);
    }
    if(str.equals(str1)){
      System.out.println("The string \"" +str+ "\" is a palindrome.");
    }
    else{
      System.out.println("The string \""+str+"\" is not a palindrome.");
    }
    sc.close();
  }
}
