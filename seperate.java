import java.util.*;
public class seperate {
    public static void main(String[] args) {
        System.out.println("Seperating individual characters from a String.");
        System.out.println("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println("These are the seperated characters of the given string:");
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            System.out.print(ch+ " ");
        }
        sc.close();
    }
    
}
