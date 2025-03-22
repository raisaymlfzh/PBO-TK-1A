/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum06032025;

import java.util.Scanner;

/**
 *
 * @author MyBook Z Series
 */
public class perulangan {
    public static void main (String[] agrs){
        Scanner in=new Scanner (System.in);
        int i,n;
        ///pengulangan for
        System.out.print("masukan batasan angka = ");
        n=in.nextInt();
        System.out.print("---menggunakan skema for---");
        for(i=1;i<=n;i++)
            System.out.print(i+"\t");
        //endfor
        System.out.println("---menggunakan skema while---");
        i=1;
        while(i<=n){
            System.out.println(i+"\t");
            i++;
        }
        System.out.println();
        
        System.out.println("---menggunkan skema do while---");
        i=1;
        do{
            System.out.print(i+"\t");
            i++;
        }while(i<=n);
    }
    
}
