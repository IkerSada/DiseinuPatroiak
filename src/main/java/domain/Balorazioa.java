package domain;

import java.io.*;

// import javax.persistence.*; // Comentamos temporalmente
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@SuppressWarnings("serial")
@XmlAccessorType(XmlAccessType.FIELD)
// @Entity  <-- comentar esta línea para que ObjectDB no la considere
public class Balorazioa implements Serializable {

    @XmlID
    // @Id  <-- comentar temporalmente
    @XmlJavaTypeAdapter(IntegerAdapter.class)
    // @GeneratedValue  <-- comentar temporalmente
    private Integer balorazioZenbaki;

    private Integer puntuazioa;
    private String deskripzioa;
    private User user;

    public Balorazioa() {
        super();
    }

    public Balorazioa(int p, String desk, User nork) {
        puntuazioa = p;
        deskripzioa = desk;
        user = nork;
    }

    public Integer getBalorazioZenbaki() {
        return balorazioZenbaki;
    }

    public void setBalorazioZenbaki(Integer balorazioZenbaki) {
        this.balorazioZenbaki = balorazioZenbaki;
    }

    public Integer getPuntuazioa() {
        return puntuazioa;
    }

    public void setPuntuazioa(Integer puntuazioa) {
        this.puntuazioa = puntuazioa;
    }

    public String getDeskripzioa() {
        return deskripzioa;
    }

    public void setDeskripzioa(String deskripzioa) {
        this.deskripzioa = deskripzioa;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUserEmail() {
        return user.getEmail();
    }

}
