import java.util.*;
public class reverse {
    public static void main(String[] args) {
        System.out.println("Reverse");
        System.out.println("Enter a string");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String s=new String();
        System.out.println("The reversed string is " );
        for(int i=a.length()-1;i>=0;i--){
            char ch=a.charAt(i);
            s=String.valueOf(ch);
            System.out.print(s);
        }
        sc.close();
    }
}
