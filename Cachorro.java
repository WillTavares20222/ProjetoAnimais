package com.mycompany.projetoanimal;
public class Cachorro extends Mamifero{
    
    public void Cachorro(){
        System.out.println("===========Cachorro=========");
    }

    @Override
    public void locomover() {
        System.out.println(" Estou Andando ");
    }

    
    @Override
    public void emetirSom() {
        System.out.println(" Estou Latindo ");
    }
    
}
