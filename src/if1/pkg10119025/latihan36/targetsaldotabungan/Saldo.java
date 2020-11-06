/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan36.targetsaldotabungan;

import java.util.Locale;

/**
 *
 * @author User
 */
public class Saldo {
    Locale locale = Locale.forLanguageTag("id");
    private double bunga;

    private void hitungBunga(double bungaAwal){
        bunga = bungaAwal / 100;
    }

    public void hitungSaldo(Double bungaAwal, Double saldo, Double target   ){
        hitungBunga(bungaAwal);
        int num = 1;
        while(saldo <= target){
            saldo = saldo + (saldo * bunga);
            tampilSaldo(saldo, num);
            num++;
        }
    }

    private void tampilSaldo(double saldo, int num){
        System.out.print("Saldo di bulan ke-"+num+" Rp. ");
        System.out.printf(locale, "%,.0f%n", saldo);
    }
}
