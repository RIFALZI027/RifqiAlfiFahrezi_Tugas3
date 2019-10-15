/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAsistensi3;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class KendaraanMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Efektivitas Mobil");
        System.out.println("2. Efektivitas Sepeda Motor");
        Kendaraan k = new Kendaraan();
        Mobil mbl1 = new Mobil();
        SepedaMotor sm1 = new SepedaMotor();

        System.out.print("\nMasukkan pilihan (1/2)\t\t: ");
        int pilih = in.nextInt();
        switch (pilih) {

            case 1:

                System.out.println("\n===============Data Mobil===============");

                System.out.print("Masukkan Nama Kendaraan\t\t: ");
                String namaKendaraan1 = in.next();
                mbl1.setNamaKendaraan(namaKendaraan1);

                System.out.print("Masukkan Tipe Kendaraan\t\t: ");
                String tipeKendaraan1 = in.next();
                mbl1.setTipeKendaraan(tipeKendaraan1);

                System.out.print("Masukkan Kapasitas Mesin\t: ");
                int kapasitasMesin1 = in.nextInt();
                mbl1.setKapasitasMesin(kapasitasMesin1);

                System.out.print("Masukkan Bahan Bakar\t\t: ");
                float bahanBakar1 = in.nextFloat();
                mbl1.setBahanBakar(bahanBakar1);

                System.out.print("Masukkan ID Kendaraan\t\t: ");
                int idKendaraan1 = in.nextInt();
                mbl1.setIdKendaraan(idKendaraan1);

                System.out.print("Masukkan Jarak Tempuh Awal\t: ");
                float jarakTempuhAwal1 = in.nextFloat();
                mbl1.setJarakTempuhAwal(jarakTempuhAwal1);

                System.out.print("Masukkan Jarak Tempuh\t\t: ");
                float jarakTempuh1 = in.nextFloat();
                mbl1.setJarakTempuh(jarakTempuh1);

                System.out.println();
                mbl1.infoMobil();

                break;

            case 2:
                System.out.println("\n===============Data Sepeda Motor===============");

                System.out.print("Masukkan Nama Kendaraan\t\t: ");
                String namaKendaraan2 = in.next();
                sm1.setNamaKendaraan(namaKendaraan2);

                System.out.print("Masukkan Tipe Kendaraan\t\t: ");
                String tipeKendaraan2 = in.next();
                sm1.setTipeKendaraan(tipeKendaraan2);

                System.out.print("Masukkan Kapasitas Mesin\t: ");
                int kapasitasMesin2 = in.nextInt();
                sm1.setKapasitasMesin(kapasitasMesin2);

                System.out.print("Masukkan Bahan Bakar\t\t: ");
                float bahanBakar2 = in.nextFloat();
                sm1.setBahanBakar(bahanBakar2);

                System.out.print("Masukkan ID Kendaraan\t\t: ");
                int idKendaraan2 = in.nextInt();
                sm1.setIdKendaraan(idKendaraan2);

                System.out.print("Masukkan Jarak Tempuh Awal\t: ");
                float jarakTempuhAwal2 = in.nextFloat();
                sm1.setJarakTempuhAwal(jarakTempuhAwal2);

                System.out.print("Masukkan Jarak Tempuh\t\t: ");
                float jarakTempuh2 = in.nextFloat();
                sm1.setJarakTempuh(jarakTempuh2);
                System.out.println("");

                System.out.println("");
                sm1.infoSepedaMotor();

                break;
        }

    }

}
