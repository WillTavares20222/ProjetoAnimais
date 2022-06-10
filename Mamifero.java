package com.mycompany.projetoanimal;
public class Mamifero extends Animais {
    private String corPelo;

    @Override
    public void locomover() {
        System.out.println(" Correndo ");
    }

    @Override
    public void alimentar() {
        System.out.println(" Mamando ");
    }

    @Override
    public void emetirSom() {
        System.out.println(" Som de mamifero ");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

   
    
    
}
