/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAsistensi3;

/**
 *
 * @author lenovo
 */
public class Kendaraan {

    private int idKendaraan;
    protected float jarakTempuhAwal, jarakTempuh, bahanBakar;

    public Kendaraan() {
    }

    public void setIdKendaraan(int idKendaraan) {
        this.idKendaraan = idKendaraan;
    }

    public int getIdKendaraan() {
        return idKendaraan;
    }

    public void setJarakTempuhAwal(float jarakTempuhAwal) {
        this.jarakTempuhAwal = jarakTempuhAwal;
    }

    public float getJarakTempuhAwal() {
        return jarakTempuhAwal;
    }

    public void setJarakTempuh(float jarakTempuh) {
        this.jarakTempuh = jarakTempuh;
    }

    public float getJarakTempuh() {
        return jarakTempuh;
    }

    public void setBahanBakar(float bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public float getBahanBakar() {
        return bahanBakar;
    }

    public float totalJarak() {
        float total;
        total = getJarakTempuhAwal() + getJarakTempuh();
        return total;
    }

    public float efektifitas() {
        float E, x, y;
        x = getJarakTempuh();
        y = getBahanBakar();
        E = (float) Math.exp(x / y) * (float) Math.log10(2);
        return E;
    }

    public String getEfektifitas() {
        String efektifitas;
        if (efektifitas() > 0 && efektifitas() <= 0.5) {
            efektifitas = "Efektif";
        } else {
            efektifitas = "Tidak Efektif";
        }
        return efektifitas;
    }

    public void infoKendaraan() {
        System.out.println("ID Kendaraan\t\t\t: " + getIdKendaraan());
        System.out.println("Jarak Tempuh Awal\t\t: " + getJarakTempuhAwal());
        System.out.println("Jarak Tempuh\t\t\t: " + getJarakTempuh());
        System.out.println("Total Jarak\t\t\t: " + totalJarak());
        System.out.println("Keefektifitasan Mesin\t\t: " + efektifitas());
        System.out.println("Keefektifitasan Mesin\t\t: " + getEfektifitas());
    }
}

class Mobil extends Kendaraan {

    private String namaKendaraan, tipeKendaraan;
    private int kapasitasMesin;
    private float bahanBakar;

    public Mobil() {
    }

    public void setNamaKendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public void setTipeKendaraan(String tipeKendaraan) {
        this.tipeKendaraan = tipeKendaraan;
    }

    public String getTipeKendaraan() {
        return tipeKendaraan;
    }

    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    public void setBahanBakar(float bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public float getBahanBakar() {
        return bahanBakar;
    }

    public void infoMobil() {
        System.out.println("Nama Kendaraan\t\t\t: " + getNamaKendaraan());
        System.out.println("Tipe Kendaraan\t\t\t: " + getTipeKendaraan());
        System.out.println("Kapasitas Mesin\t\t\t: " + getKapasitasMesin());
        System.out.println("Bahan Bakar\t\t\t: " + getBahanBakar());
        super.infoKendaraan();
    }
}

class SepedaMotor extends Kendaraan {

    private String namaKendaraan, tipeKendaraan;
    private int kapasitasMesin;
    private float bahanBakar;

    public SepedaMotor() {
    }

    public void setNamaKendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public void setTipeKendaraan(String tipeKendaraan) {
        this.tipeKendaraan = tipeKendaraan;
    }

    public String getTipeKendaraan() {
        return tipeKendaraan;
    }

    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    public void setBahanBakar(float bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public float getBahanBakar() {
        return bahanBakar;
    }

    public void infoSepedaMotor() {
        System.out.println("Nama Kendaraan\t\t\t: " + getNamaKendaraan());
        System.out.println("Tipe Kendaraan\t\t\t: " + getTipeKendaraan());
        System.out.println("Kapasitas Mesin\t\t\t: " + getKapasitasMesin());
        System.out.println("Bahan Bakar\t\t\t: " + getBahanBakar());
        super.infoKendaraan();
    }
}
