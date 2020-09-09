package com.LLBCorp.model;


import javax.persistence.Entity;
import javax.persistence.Table  ;
import javax.persistence.Id;

@Entity
@Table(name="sekolah")
public class Sekolah {

    @Id
    private Long nomor_sekolah;

    private String nama_sekolah;

    public Integer getNomorSekolah() {
        return nomor_sekolah;
    }
    public void setNomorSekolah(Long nomor_sekolah){
        this.nomor_sekolah = nomor_sekolah;
    }

    public String getNamaSekolah() {
        return nama_sekolah;
    }
    public void setNamaSekolah(String nama_sekolah){
        this.nama_sekolah = nama_sekolah;
    }
}