import java.util.*;
public class anagram {
    public static void main(String[] args) {
        System.out.println("Anagrams.");
        System.out.println("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println("Enter another string:");
        String b=sc.nextLine();
        int counter=0;
        if(a.length()!=b.length()){
            System.out.println("These two strings are not anagrams.");
        }
        else{
            for(int i=0;i<a.length();i++){
                for(int j=0;j<b.length();j++){
                    char ch=a.charAt(i);
                    char ch2=b.charAt(j);
                    if(ch==ch2){
                        counter++;
                        a = a.substring(0, i) + '1' + a.substring(i + 1, a.length());
                        b = b.substring(0, j) + '0' + b.substring(i + 1, b.length());
                    }
                }
            }
            if(counter==a.length()){
                System.out.println("The given two strings are anagrams.");
            }
            else{
                System.out.println("The two strings are not anagrams.");
            }
        }
        sc.close();
    }
    
}
