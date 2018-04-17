/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BBDD;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jaime
 */
@Entity
@Table(name = "Contactos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contactos.findAll", query = "SELECT c FROM Contactos c")
    , @NamedQuery(name = "Contactos.findById", query = "SELECT c FROM Contactos c WHERE c.id = :id")
    , @NamedQuery(name = "Contactos.findByName", query = "SELECT c FROM Contactos c WHERE c.name = :name")
    , @NamedQuery(name = "Contactos.findByTelephone", query = "SELECT c FROM Contactos c WHERE c.telephone = :telephone")
    , @NamedQuery(name = "Contactos.findByDescription", query = "SELECT c FROM Contactos c WHERE c.description = :description")
    , @NamedQuery(name = "Contactos.findBySurname", query = "SELECT c FROM Contactos c WHERE c.surname = :surname")})
public class Contactos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "Telephone")
    private String telephone;
    @Size(max = 100)
    @Column(name = "Description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Surname")
    private String surname;

    public Contactos() {
    }

    public Contactos(Integer id) {
        this.id = id;
    }

    public Contactos(Integer id, String name, String telephone, String surname) {
        this.id = id;
        this.name = name;
        this.telephone = telephone;
        this.surname = surname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
        if (!(object instanceof Contactos)) {
            return false;
        }
        Contactos other = (Contactos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BBDD.Contactos[ id=" + id + " ]";
    }
    
}
