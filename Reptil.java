package com.mycompany.projetoanimal;
public class Reptil  extends Animais {
    private String corEscama;
    
    @Override
    public void locomover() {
        System.out.println(" Rastejando ");
    }

    @Override
    public void alimentar() {
        System.out.println(" Comendo vegetais ");
    }

    @Override
    public void emetirSom() {
        System.out.println(" Som de reptil ");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public String toString() {
        return "Reptil{" + "corEscama=" + corEscama + '}';
    }
    
}
