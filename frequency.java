import java.util.*;
public class frequency{
    public static void main(String[] args) {
        System.out.println("Minimum and maximum occuring character in a string.");
        System.out.println("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            int counter=0;
            for(int j=0;j<s.length();j++){
                
                char b=s.charAt(j);
                if(a==b){
                    counter++;
                }

            }
            System.out.println("The character " +a+ " occurs " +counter+ " times.");
        }
        sc.close();
    }
}