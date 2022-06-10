package com.mycompany.projetoanimal;
public class ProjetoAnimal {
    public static void main(String[] args) {
        //Programa Principal
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();   
        
        p.peixe();
        p.locomover();
        p.alimentar();
        p.emetirSom();
        p.soltarBolha();
        
        a.Ave();
        a.locomover();
        a.fazerNinho();
        a.alimentar();
        a.emetirSom();
        
        c.Canguru();
        c.alimentar();
        c.emetirSom();
        c.locomover();
        c.usarBolsa();
        
        k.Cachorro();
        k.alimentar();
        k.emetirSom();
        k.locomover();
        
        j.Cobra();
        j.alimentar();
        j.emetirSom();
        j.locomover();
        
        t.Tartaruga();
        t.alimentar();
        t.emetirSom();
        t.locomover();
        
        g.Goldfish();
        g.alimentar();
        g.emetirSom();
        g.locomover();
        g.soltarBolha();
        
        e.Arara();
        e.alimentar();
        e.emetirSom();
        e.locomover();
    }
    
}
