/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bputs;
public class cBarang {
    private int kode;
    private String nama;
    private double harga;
    
    cBarang(int k, String n, int h){
       kode= k; nama=n; harga=h;
       System.out.println("Objek "+nama+" dibuat...");
    }
    public void setHarga(int h){
        harga=h;
    }
    public void setNama(String n){
        nama=n;
    }
    public void setKode(int k){
        kode=k;
    }
    public String getNama(){
        return nama;
    }
    public double getHarga(){
        return harga;
    }
    public int getKode(){
        return kode;
    }
    public String ToString(){
        return  "Barang "+kode+" "+nama+" ["+harga+"]";
    }
}
