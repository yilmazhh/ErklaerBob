/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hspf.video;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author sirfi
 */
@Entity
public class Video implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int VideoId;
    private int UserId;
    private int KategorieId;
    private boolean Status;
    private String Titel;
    private int Anzahl_Aufrufe;
    private double Dauer;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date Veroeffentlichungsdatum;

    public int getVideoId() {
        return VideoId;
    }

    public void setVideoId(int VideoId) {
        this.VideoId = VideoId;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public int getKategorieId() {
        return KategorieId;
    }

    public void setKategorieId(int KategorieId) {
        this.KategorieId = KategorieId;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    public String getTitel() {
        return Titel;
    }

    public void setTitel(String Titel) {
        this.Titel = Titel;
    }

    public int getAnzahl_Aufrufe() {
        return Anzahl_Aufrufe;
    }

    public void setAnzahl_Aufrufe(int Anzahl_Aufrufe) {
        this.Anzahl_Aufrufe = Anzahl_Aufrufe;
    }

    public double getDauer() {
        return Dauer;
    }

    public void setDauer(double Dauer) {
        this.Dauer = Dauer;
    }

    public Date getVeroeffentlichungsdatum() {
        return Veroeffentlichungsdatum;
    }

    public void setVeroeffentlichungsdatum(Date Veroeffentlichungsdatum) {
        this.Veroeffentlichungsdatum = Veroeffentlichungsdatum;
    }
    
    
    }
    
    /*private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Video)) {
            return false;
        }
        Video other = (Video) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "de.hspf.main.Video[ id=" + id + " ]";
    }*/
    

