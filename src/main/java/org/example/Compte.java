package org.example;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import org.glassfish.jaxb.runtime.XmlAccessorFactory;

//creation of a schema xml
@XmlRootElement(name = "compte")
@XmlAccessorType(XmlAccessType.FIELD)
///////////////////////////////////////
public class Compte {
    public Compte(int code, double solde) {
        this.code = code;
        this.solde = solde;
    }
    private int code;

    private double solde;

    public Compte() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
