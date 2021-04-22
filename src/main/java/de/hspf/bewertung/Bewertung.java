/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hspf.bewertung;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author sirfi
 */
@Entity
public class Bewertung implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int BewertungId;
    private int VideoId;
    private double Bewertungshoehe;

    public int getBewertungId() {
        return BewertungId;
    }

    public void setBewertungId(int BewertungId) {
        this.BewertungId = BewertungId;
    }

    public int getVideoId() {
        return VideoId;
    }

    public void setVideoId(int VideoId) {
        this.VideoId = VideoId;
    }

    public double getBewertungshoehe() {
        return Bewertungshoehe;
    }

    public void setBewertungshoehe(double Bewertungshoehe) {
        this.Bewertungshoehe = Bewertungshoehe;
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
        if (!(object instanceof Bewertung)) {
            return false;
        }
        Bewertung other = (Bewertung) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "de.hspf.main.Bewertung[ id=" + id + " ]";
    }
    */
