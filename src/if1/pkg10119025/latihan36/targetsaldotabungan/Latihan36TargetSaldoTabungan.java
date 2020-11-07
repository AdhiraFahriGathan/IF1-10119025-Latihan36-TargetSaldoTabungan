/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan36.targetsaldotabungan;

import java.util.Scanner;

/**
 *
 * @author User
 * * NAMA     : ADHIRA FAHRI GATHAN
 * KELAS    : PBO
 * NIM      : 10119025
 * Deskripsi Program : Program ini berisi tentang Target Saldo Tabungan
 */
public class Latihan36TargetSaldoTabungan {
    static Scanner scan = new Scanner(System.in);
    private static Double saldoAwal, bungaAwal, targetSaldo;


    private static void masukkanSaldo(){
        System.out.print("Saldo Awal : Rp. ");
        saldoAwal =  Double.parseDouble(scan.next().replaceAll("[$,.]", ""));
        System.out.print("Bunga/Bulan(%) : ");
        bungaAwal = scan.nextDouble();
        System.out.print("Saldo Target : Rp. ");
        targetSaldo = Double.parseDouble(scan.next().replaceAll("[$,.]", ""));
    }

    public static void main(String[] args) {
        Saldo saldoTarget = new Saldo();
        masukkanSaldo();
        saldoTarget.hitungSaldo(bungaAwal, saldoAwal, targetSaldo);
        System.out.println("Developed by : Adhira Fahri Gathan");
    }
}
