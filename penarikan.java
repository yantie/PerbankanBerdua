import java.util.io*;
import java.util.Scanner;

public class penarikan{
	public static void main (String[]args){
		Scanner input=new Scanner(System.in);
        	System.out.print("Masukkan jumlah penarikan : Rp");
        	double tarik=input.nextDouble();
        	double out=0;
        	if (tarik>saldo){
            		System.out.println("saldo tidak mencukupi");
       		}else{
            		System.out.println("user telah melakukan penarikan sejumlah Rp."+tarik);
            		saldo-=tarik;
            		out= saldo;
        		}
	}
}