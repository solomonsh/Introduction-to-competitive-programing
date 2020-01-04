 import java.util.Scanner;
public class watermelon{
 
   public static void main(String args[]){
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
 
            System.out.println(waterMelon(num));
    }
     static String waterMelon (int w){
        if( 1<=w && w<=100){
            if(w != 2 && w%2 == 0){
              return "YES";
            }
            else{
                return "NO";
            }
        }
    
      return "NO";
      } 
   
    
}
