public class HutStar {  
    static void printHutStar(int n)  
    {  
        int i, j;  
    for (i = 0; i < n; i++) {  
     for (j = i + 1; j < n; j++)  
       System.out.print(" ");  
        for (j = 0; j < (2 * i + 1); j++)
          System.out.print("*");  
           System.out.println();  
        }  

        for (i = 0; i < 3; i++) {  
            for (j = 0; j < 3; j++)  
                System.out.print("*");    
              for (j = 0; j < (2 * n - 7); j++)  
                  System.out.print(" ");  
                     for (j = 0; j < 3; j++)  
                        System.out.print("*");  
                         System.out.println();  
        }  
    }  
    
    public static void main(String args[])  
    {  
        int n = 7;  
         printHutStar(n);  
    }  
}  