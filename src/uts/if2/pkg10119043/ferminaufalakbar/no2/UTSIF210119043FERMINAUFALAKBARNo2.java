/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119043.ferminaufalakbar.no2;
import java.util.Scanner;
/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program Tabungan
 */
public class UTSIF210119043FERMINAUFALAKBARNo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukan Saldo Awal : ");
        int saldoAwal = scanner.nextInt();
        Tabungan tabungan = new Tabungan(saldoAwal);
        
        System.out.print("Jumlah uang yang diambil : ");
        int ambilUang = scanner.nextInt();
        
        System.out.println("Saldo Ando Sekarang : " + tabungan.ambilUang(ambilUang));
    }
    
}
