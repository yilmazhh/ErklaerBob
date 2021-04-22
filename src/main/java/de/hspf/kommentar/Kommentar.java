/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hspf.kommentar;

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
public class Kommentar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int KommentarId;
    private int  VideoId;
    private boolean Status;
    private String Text;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date Veroeffentlichungsdatum;

    public int getKommentarId() {
        return KommentarId;
    }

    public void setKommentarId(int KommentarId) {
        this.KommentarId = KommentarId;
    }

    public int getVideoId() {
        return VideoId;
    }

    public void setVideoId(int VideoId) {
        this.VideoId = VideoId;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    public String getText() {
        return Text;
    }

    public void setText(String Text) {
        this.Text = Text;
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
        if (!(object instanceof Kommentar)) {
            return false;
        }
        Kommentar other = (Kommentar) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "de.hspf.main.Kommentar[ id=" + id + " ]";
    }*/
    

