/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bputs;
public class cTransaksi {
    private int kode;
    private cPembeli pembeli;
    private cBarang brg[];
    private cBarang barang;
    private int jbrg, maksbrg;

    cTransaksi(int k, int n){
        kode=k; maksbrg=n; brg = new cBarang[n];
        jbrg=0;
        System.out.println("Object transaksi dibuat...");
    }
    cTransaksi(int k, cPembeli p, cBarang b){
        pembeli=p;
        barang=b;
        kode=k;
        System.out.println("Objek transaksi dibuat");
    }
    public void isiPembeli (cPembeli p){
        pembeli = p;
        
        System.out.println("Isi pembeli sukses...");
    }
    public void tambahBarang(cBarang brgs){
        if(jbrg>=maksbrg){
            System.out.println("Kapasitas penuh!");
        } else {
            brg[jbrg]=brgs;
            jbrg++;
            System.out.println("Penambahan sukses..");
        }
    }
    public void lihatBarang(){
        System.out.println("Daftar Menu yang dipesan");
        if(pembeli!=null)
            System.out.println(pembeli.ToString());
        else
            System.out.println("Pembeli belum ada");
        for(int i =0; i < jbrg; i++){
            System.out.println((i+1)+". "+brg[i].ToString());
        }
    }
    public void hapusBarang(String m){
        if(jbrg<=0){
            System.out.println("Makanan kosong!");
        } else {
            boolean ada=false;
            for (int i = 0; i < jbrg; i++) {
                if(m.equalsIgnoreCase(brg[i].getNama())){
                    ada=true;
                    brg[i]=null;
                    //geser maju elemen
                    for (int j = i; j < jbrg; j++) {
                        if(i==jbrg-1){
                            brg[i]=null;
                        } else{
                            brg[j]=brg[j+1]; 
                        }
                    }
                    System.out.println("Penghapusan sukses..");
                    jbrg--;
                    break;
                }
            }
            if(ada==false){
                System.out.println("Makanan tidak ada!");
            }
        }
    }
    public String ToString(){
        String t="";
        t=t+barang.getNama()+"\t";
        t=t+barang.getHarga()+"\n";
        return t;
    }
    public void setBarang(cBarang brg){
        barang=brg;
    }
    public void setPembeli(cPembeli pbl){
        pembeli=pbl;
    }
    public void setKode(int k){
        kode=k;
    }
    public cBarang getBarang(){
        return barang;
    }
    public cPembeli getPembeli(){
        return pembeli;
    }
    public int getKode(){
        return kode;
    }
}
