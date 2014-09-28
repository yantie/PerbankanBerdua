import java.util.io.*;
import java.util.Scanner;
public class menabung {
    public static void main(String[]args){
        String a,b,c,j;
        int d;
        int e=0;
        Scanner input1=new Scanner(System.in);
        Scanner input2=new Scanner(System.in);
        Scanner input3=new Scanner(System.in);
        Scanner input4=new Scanner(System.in);
        Scanner lagi=new Scanner(System.in);
        proses wew=new proses();
        
        do{
        System.out.println("masukan nomor rekening   : ");
            a=input1.nextLine();
                wew.setRek(a,e);
        System.out.println("masukan nama anda        : ");
            b=input2.nextLine();
                wew.setNasab(b,e);
        System.out.println("masukan jenis saldo[D/R] : ");
            c=input3.nextLine();
                 wew.setJenis(c,e);
        System.out.println("masukan jumlah saldo     : ");
            d=input4.nextInt();
                wew.setSaldo(d,e);
        e++;
        System.out.print("apakah anda ingin masukan data lagi(Y/T) ?? ");
        j=lagi.nextLine();
        }while("y".equalsIgnoreCase(j));
        
        wew.getJumlah();
        wew.getJenis(e);
        System.out.println();
        System.out.println("jumlah nasabah deposito     ="+wew.getJumlahDep());
        System.out.println("jumlah total saldo deposito ="+wew.getTotalDep());
        System.out.println("jumlah nasabah reguler      ="+wew.getJumlahReg());
        System.out.println("jumlah total saldo reguler  ="+wew.getTotalReg());
        }
}