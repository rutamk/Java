package Codes;
import java.util.*;
public class ButterflyPatternOwnMethod {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter length : ");
      int l = sc.nextInt();
      for(int i=0; i<l/2; i++){
        for(int j=0; j<l; j++){
          if (j>=l-1-i || j<=i) {
            System.out.print("*"); 
          }
          else{
            System.out.print(" ");
          }
        } System.out.println(); 
      }
      for(int i=0; i<l/2; i++){
        for(int j=0; j<l; j++){
          if (j>=(l/2)-i && j<(l/2)+i) {
            System.out.print(" "); 
          }
          else{
            System.out.print("*");
          }
        } System.out.println(); 
      }
    }
  }
  
