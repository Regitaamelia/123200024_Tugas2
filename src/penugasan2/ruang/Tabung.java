/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penugasan2.ruang;
import penugasan2.bidang.Lingkaran;
/**
 *
 * @author HP
 */
public class Tabung extends Lingkaran implements MenghitungRuang{
    private double tinggi;

    public Tabung(double tinggi, double jariJari) {
        super(jariJari);
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
        return (luas()*tinggi);
       
    }

    @Override
    public double luasPermukaan() {
      return (2*luas())+ (2*Math.PI*getJari()*tinggi);
    }
}
