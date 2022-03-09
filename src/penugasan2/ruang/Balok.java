/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penugasan2.ruang;
import penugasan2.bidang.PersegiPanjang;
/**
 *
 * @author HP
 */
public class Balok extends PersegiPanjang implements MenghitungRuang{
    private double tinggi;

    public Balok(double tinggi, double panjang, double lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
      return luas()*tinggi;
    }

    @Override
    public double luasPermukaan() {
       return (luas()+(getPanjang()*tinggi+getLebar()*tinggi))*2;
    }
}
