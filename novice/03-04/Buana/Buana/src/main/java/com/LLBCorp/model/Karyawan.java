package com.LLBCorp.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
// import javax.persistence.Date;
import java.util.Date;
@Entity
@Table(name="karyawan")
public class Karyawan {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String nama;

    private String jabatan;

    private Long gaji;

    private Date mulaiKerja;

    public Long getId() {
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }

    public Long getGaji() {
        return gaji;
    }
    public void setGaji(Long gaji){
        this.gaji = gaji;
    }

    public Date getMulaiKerja() {
        return mulaiKerja;
    }
    public void setMulaiKerja(Date mulaiKerja){
        this.mulaiKerja = mulaiKerja;
    }
}