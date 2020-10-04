package com.company;

public class Fraction {
    private int numerateur;
    private int denominateur;

    public Fraction(int a,int b){
        numerateur = a;
        denominateur = b;

    }


    public String toString(){
        String resultat = "[" + numerateur + "," + denominateur + "]";
        return resultat;

    }

}
