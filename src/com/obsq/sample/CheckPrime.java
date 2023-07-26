package com.obsq.sample;
import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for prime verification");
        int n = sc.nextInt();
            int i ,count=0;
          for(i=2;i<n;i++){
              if(n%i==0){
                  count++;
                  break;
              }
          }
            if (count ==0) {
                System.out.println("The number is  prime");
            } else {
                System.out.println("the number is not a prime");
            }
        }
    }

