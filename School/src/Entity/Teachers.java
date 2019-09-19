/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Logger;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Teachers implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String Dolzhnost;
    @Temporal(TemporalType.TIMESTAMP)
    private Date Stazh;

    public Teachers(Long id, String name, String Dolzhnost, Date Stazh) {
        this.id = id;
        this.name = name;
        this.Dolzhnost = Dolzhnost;
        this.Stazh = Stazh;
    }
    private static final Logger LOG = Logger.getLogger(Teachers.class.getName());

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDolzhnost() {
        return Dolzhnost;
    }

    public void setDolzhnost(String Dolzhnost) {
        this.Dolzhnost = Dolzhnost;
    }

    public Date getStazh() {
        return Stazh;
    }

    public void setStazh(Date Stazh) {
        this.Stazh = Stazh;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.id);
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + Objects.hashCode(this.Dolzhnost);
        hash = 43 * hash + Objects.hashCode(this.Stazh);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Teachers other = (Teachers) obj;
        if (this.Stazh != other.Stazh) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.Dolzhnost, other.Dolzhnost)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Teachers{" + "id=" + id + ", name=" + name + ", Dolzhnost=" + Dolzhnost + ", Stazh=" + Stazh + '}';
    }


}
