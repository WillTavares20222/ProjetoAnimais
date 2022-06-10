package com.mycompany.projetoanimal;
public class Peixe extends Animais {
    private String corEscama;

    
    public void peixe(){
        System.out.println("============Peixe========");
    }
    
    public void soltarBolha(){
        System.out.println(" Soltando Bolhas");
    }
    
    @Override
    public void locomover() {
        System.out.println(" Nadando ");
    }

    @Override
    public void alimentar() {
        System.out.println(" Frutas ");
    }

    @Override
    public void emetirSom() {
        System.out.println(" Peixe não emite Som ");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
