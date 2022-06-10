
package com.mycompany.projetoanimal;
public abstract class Animais {
   protected float peso;
   protected int idade;
   protected int menbros;
   
   public abstract void locomover();
   public abstract void alimentar();
   public abstract void emetirSom();

   
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMenbros() {
        return menbros;
    }

    public void setMenbros(int menbros) {
        this.menbros = menbros;
    }

    @Override
    public String toString() {
        return "Animais{" + "peso=" + peso + ", idade=" + idade + ", menbros=" + menbros + '}';
    }
   
   
}
