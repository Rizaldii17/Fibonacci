package fibonacci;

import java.util.Scanner;


public class Fibonacci {

    public static void main(String[] args) {
   int a=0,b=0,hasil=1,c,hasiljumlah=0,y=0;
   int jumlah[] = new int[10];
   Scanner input = new Scanner (System.in);
   System.out.print ("Masukan Deret Fibonacci  : ");
        c = input.nextInt ();
        for(int i=1; i<=c; i++){           
    a=b;
    b=hasil;
    jumlah[i] = hasil;
    hasil=a+b;
    y++;
    }
    for(int i=y; i>0; i--){
        System.out.print(jumlah[i]+" ");
      } 
    }
}
