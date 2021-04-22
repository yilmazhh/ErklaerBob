package de.hspf.benutzer;

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
public class Benutzer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int UserId;
    private String Benutzername;
    private int Benutzeralter;
    private String Passwort;
    private String Email;
    private boolean Administrator;
    private boolean Registriert;

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public String getBenutzername() {
        return Benutzername;
    }

    public void setBenutzername(String Benutzername) {
        this.Benutzername = Benutzername;
    }

    public int getBenutzeralter() {
        return Benutzeralter;
    }

    public void setBenutzeralter(int Benutzeralter) {
        this.Benutzeralter = Benutzeralter;
    }

    public String getPasswort() {
        return Passwort;
    }

    public void setPasswort(String Passwort) {
        this.Passwort = Passwort;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public boolean isAdministrator() {
        return Administrator;
    }

    public void setAdministrator(boolean Administrator) {
        this.Administrator = Administrator;
    }

    public boolean isRegistriert() {
        return Registriert;
    }

    public void setRegistriert(boolean Registriert) {
        this.Registriert = Registriert;
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
        if (!(object instanceof Benutzer)) {
            return false;
        }
        Benutzer other = (Benutzer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "de.hspf.main.Benutzer[ id=" + id + " ]";
    }
  */  

