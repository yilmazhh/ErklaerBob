/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hspf.archiv_kommentar;

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
public class Archiv_Kommentar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int KommentarId;
    private String Text;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date Veroeffentlichungsdatum;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date Geloescht_am;

    public int getKommentarId() {
        return KommentarId;
    }

    public void setKommentarId(int KommentarId) {
        this.KommentarId = KommentarId;
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

    public Date getGeloescht_am() {
        return Geloescht_am;
    }

    public void setGeloescht_am(Date Geloescht_am) {
        this.Geloescht_am = Geloescht_am;
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
        if (!(object instanceof Archiv_Kommentar)) {
            return false;
        }
        Archiv_Kommentar other = (Archiv_Kommentar) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "de.hspf.main.Archiv_Kommentar[ id=" + id + " ]";
    }
    */

