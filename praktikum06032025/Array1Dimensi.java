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
public class Array1Dimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A[];
        float ratarata;
        int i,uk,jumlah;//i=indeks,uk=ukuran
        Scanner in=new Scanner(System.in);
        System.out.print("masukan ukuran array = ");
        uk=in.nextInt();
        A=new int[uk];
        //mengisi array
        for(i=0;i<=uk;i++){
            System.out.print("masukan data ke "+(i+1)+" = ");
            A[i]=in.nextInt();
        }
        //menampilkan array
        System.out.println("---isi array---");
        for(i=0;i<=uk;i++){
            System.out.println(A[i]+"\t");
        //endfor
        System.out.println();
        
        //menghitung jumlah dan rata rata isi array
        int total = 0;//karna penjumlahan 0 tidak mempengaruhi penjumlahan
        for(i=0;i<=uk;i++)
            total=total+A[i];
        //endfor
        ratarata= (float)total/uk;
        System.out.println("jumlah = " + total);
        System.out.println("rata rata = " + total);
        
        //mencari nilai max min
        //
        int max = A[0];
        for(i=0;i<=uk;i++){
            if(A[i]>max)
            max =A[i];
            //endif
        }
        System.out.println("nilai terbesar = " +max);
            String imax;
        //cara
        int imax=[0];
        for(i=0;i<=uk;i++){
            if(A[i]>A[imax])
                imax= A[i];
            //endfor
        }
        }
    }
}
        

