/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bputs;

public class cPembeli {
    private String nama;
    private String alamat;
    private int ID;
    cPembeli(){
        System.out.println("Objek pembeli dibuat...");
    }
    cPembeli(int i, String nm, String al){
        ID=i; nama=nm; alamat=al;
        System.out.println("Objek "+nama+" dibuat...");
    }
    public void setNama(String n){
        nama=n;
    }
    public void setID(int i){
        ID=i;
    }
    public void setAlamat(String al){
        alamat=al;
    }
    public String getNama(){
        return nama;
    }
    public int getID(){
        return ID;
    }
    public String getAlamat(){
        return alamat;
    }
    public String ToString(){
        return ID+" : "+nama+"\n"+alamat;
    }
}
