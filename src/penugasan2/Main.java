/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penugasan2;
import java.util.Scanner;
import penugasan2.ruang.Balok;
import penugasan2.ruang.Tabung;
/**
 *
 * @author HP
 */
public class Main {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        boolean pilihan = false;
        int ulangi;
        System.out.println("Nama    : Regita Amelia Asnawi Putri");
        System.out.println("NIM     : 123200024");
        System.out.println("Kelas   : IF - F");
        do{
            int pilmenu;
            double panjang, lebar, tinggiBalok, jari, tinggiTabung;
            System.out.println("\n========= INPUT =========");
            System.out.println("1. BALOK");
            System.out.println("2. TABUNG");
            System.out.println("3. EXIT");
            System.out.print("PILIH MENU: ");
            pilmenu = input.nextInt();
            System.out.println("=========================");

            if(pilmenu==1){
                System.out.print("Input Panjang   : "); 
                panjang = input.nextInt();
                System.out.print("Input Lebar     : "); 
                lebar = input.nextInt();
                System.out.print("Input Tinggi    : "); 
                tinggiBalok = input.nextInt();

                Balok balok = new Balok(tinggiBalok,panjang,lebar);

                System.out.println("\n========= OUTPUT =========");
                System.out.println("Luas Persegi Panjang        : " + balok.luas());
                System.out.println("Keliling Persegi Panjang    : " + balok.keliling());
                System.out.println("Volume Balok                : " + balok.volume());
                System.out.println("Luas Permukaan Balok        : " + balok.luasPermukaan());
                System.out.println("==========================");
            }
            else if (pilmenu == 2){
                System.out.print("Input Jari-jari Tabung : "); 
                jari = input.nextInt();
                System.out.print("Input Tinggi Tabung    : "); 
                tinggiTabung = input.nextInt();

                Tabung tabung = new Tabung(tinggiTabung,jari);

                System.out.println("\n========= OUTPUT =========");
                System.out.println("Luas Lingkaran         : " + tabung.luas());
                System.out.println("Keliling Lingkaran     : " + tabung.keliling());
                System.out.println("Volume Tabung          : " + tabung.volume());
                System.out.println("Luas Permukaan Tabung  : " + tabung.luasPermukaan());
                System.out.println("==========================");
            }
            else if (pilmenu == 3){
                pilihan = false;
            }
            else{
                System.out.println("Silahkan Input Ulang!!!");
                pilihan = true;
            }
            System.out.print("Ulangi?? (Ya: 1 || Tidak: 0) = ");
            ulangi = input.nextInt();
            if(ulangi == 1){
                pilihan =  true;
                System.out.println("\n");
            }
            else if (ulangi == 0){
                System.exit(0);
            }
       }while(pilihan = true);
    }
}
