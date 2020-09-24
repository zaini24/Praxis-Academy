package com.LLBCorp.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name="jenissampah")
public class JenisSampah{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name= "Karton")
    private String karton;

    @Column(name= "BotolPlastik")
    private String botol_plastik;

    @Column(name= "BotolKaca")
    private String botol_kaca;

    @Column(name= "BarangBekas")
    private String barang_bekas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKarton() {
        return karton;
    }
    public void setKarton(String karton) {
        this.karton = karton;
    }

    public String getBotol_plastik() {
        return botol_plastik;
    }
    public void setBotol_plastik(String botol_plastik) {
        this.botol_plastik = botol_plastik;
    }

    public String getBotol_kaca() {
        return botol_kaca;
    }
    public void setBotol_kaca(String botol_kaca) {
        this.botol_kaca = botol_kaca;
    }

    public String getBarang_bekas() {
        return barang_bekas;
    }
    public void setBarang_bekas(String barang_bekas) {
        this.barang_bekas = barang_bekas;
    }

    
}