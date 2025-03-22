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
public class tugasPermutasiKombinasi {
public static void main(String[] args) {
        int n, r, i;
        int mutasi=1, kombi=1, x=1;

        Scanner in = new Scanner(System.in);

        System.out.println("--------------------");
        System.out.print("Maasukkan nilai n: ");
        n = in.nextInt();
        System.out.print("Maasukkan nilai r: ");
        r = in.nextInt();
        System.out.println("===================");

        for (i=n; i>(n-r); i--) {
            mutasi *= i;
        }
        for (i=r; i>1; i--) {
            x *= i;
        }

        kombi = mutasi / x;

        System.out.println("Nilai Permutasi: "+mutasi);
        System.out.println("Nilai Kombinasi: "+kombi);
        System.out.println("--------------------");
    }
}

        // TODO code application logic here
    
    

