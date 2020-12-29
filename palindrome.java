import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        System.out.println("Palindrome.");
        System.out.println("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String s=new String();
        String s1=new String();
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            s=String.valueOf(ch);
        }
        for(int j=a.length()-1;j>=0;j--){
            char ch1=a.charAt(j);
            s1=String.valueOf(ch1);
        }
        if(s.equals(s1)){
            System.out.println("The given string is a palindrome.");
        }
        else{
            System.out.println("The given string is not a palindrome.");
        }
        sc.close();
    }
    
}
