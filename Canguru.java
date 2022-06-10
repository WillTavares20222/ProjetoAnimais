package com.mycompany.projetoanimal;
public class Canguru extends Mamifero {

    public void Canguru(){
        System.out.println("===========Canguru=========");
    }
    
    @Override
    public void locomover() {
        System.out.println(" Esta Saltando ");
    }
    public void usarBolsa(){
        System.out.println(" Estou usando a bolsa. ");
    }
}
