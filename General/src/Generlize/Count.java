package Generlize;

public class Count 
{  
    public static void main(String[] args) {  
        String string = "Swati Kamble";  
        int c = 0;  
       
        for(int i = 0; i < string.length(); i++) {  
           if(string.charAt(i) !=' ')  
                c++;  
        }  
          
       
        System.out.println("Total number of characters in a string: " +c);  
    }  
}  
