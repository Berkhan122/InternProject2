package com.bilgeadam.bilgeadamproject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employees")
public class Employees {

    @Id
    @Column(name="Id")
    private int Id;
    @Column(name="Yas")
    private String Yas;
    @Column(name = "Ad")
    private String Ad;
    @Column(name = "Soyad")
    private String Soyad;
    @Column(name = "TelefonNo")
    private String TelefonNo;
    @Column(name = "TCKNO")
    private String TCKNO;
    @Column(name = "Departman")
    private String Departman;
    @Column(name = "Gorev")
    private String Gorev;


    public Employees(){}

    public Employees(int id, String ad, String soyad, String telefonno, String tckno,
                     String departman, String gorev, String yas){

        this.Id = id;
        this.Ad = ad;
        this.Soyad = soyad;
        this.TelefonNo = telefonno;
        this.TCKNO = tckno;
        this.Departman = departman;
        this.Gorev = gorev;
        this.Yas = yas;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getYas() {
        return Yas;
    }

    public void setYas(String yas) {
        Yas = yas;
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String ad) {
        Ad = ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String soyad) {
        Soyad = soyad;
    }

    public String getTelefonNo() {
        return TelefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        TelefonNo = telefonNo;
    }

    public String getTCKNO() {
        return TCKNO;
    }

    public void setTCKNO(String TCKNO) {
        this.TCKNO = TCKNO;
    }

    public String getDepartman() {
        return Departman;
    }

    public void setDepartman(String departman) {
        Departman = departman;
    }

    public String getGorev() {
        return Gorev;
    }

    public void setGorev(String gorev) {
        Gorev = gorev;
    }
}
