package de.hspf.beschreibung;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
public class Beschreibung implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int BeschreibungId;
    private int VideoId;
    private String Text;

    public int getBeschreibungId() {
        return BeschreibungId;
    }

    public void setBeschreibungId(int BeschreibungId) {
        this.BeschreibungId = BeschreibungId;
    }

    public int getVideoId() {
        return VideoId;
    }

    public void setVideoId(int VideoId) {
        this.VideoId = VideoId;
    }

    public String getText() {
        return Text;
    }

    public void setText(String Text) {
        this.Text = Text;
    }
    
        }
    
    /* private Long id;

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
        if (!(object instanceof Beschreibung)) {
            return false;
        }
        Beschreibung other = (Beschreibung) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "de.hspf.main.Beschreibung[ id=" + id + " ]";
    }*/
    

