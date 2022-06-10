package com.mycompany.projetoanimal;
public class Ave  extends Animais{
    private String corPena;
    
    public void Ave(){
        System.out.println(" ============Ave==========");
    }
    
    public void fazerNinho(){
        System.out.println(" Construiu um Ninho. ");
    }
    
    @Override
    public void locomover() {
        System.out.println(" Voando. ");
    }

    @Override
    public void alimentar() {
        System.out.println(" Comendo Frutas. ");
    }

    @Override
    public void emetirSom() {
        System.out.println(" Emetindo som de Ave. ");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
