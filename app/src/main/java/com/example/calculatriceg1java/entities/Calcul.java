package com.example.calculatriceg1java.entities;

public class Calcul extends BaseEntity{
    private Integer premierElement;
    private Integer deuxiemeElement;
    private String symbole;
    private Integer resultat;

    public Integer getPremierElement() {
        return premierElement;
    }

    public void setPremierElement(Integer premierElement) {
        this.premierElement = premierElement;
    }

    public Integer getDeuxiemeElement() {
        return deuxiemeElement;
    }

    public void setDeuxiemeElement(Integer deuxiemeElement) {
        this.deuxiemeElement = deuxiemeElement;
    }

    public String getSymbole() {
        return symbole;
    }

    public void setSymbole(String symbole) {
        this.symbole = symbole;
    }

    public Integer getResultat() {
        return resultat;
    }

    public void setResultat(Integer resultat) {
        this.resultat = resultat;
    }
}
