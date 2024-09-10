package com.ramon.exercicio1;

public class No<T> {
    private T elemento;
    private No proximo;
    private No anterior;

    public No() {

    }

    public No(T elemento2) {
        this.elemento = elemento2;
        this.anterior = null;
        this.proximo = null;
    }

    public No(No anterior, T elemento, No proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
        this.anterior = anterior;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "No [elemento=" + elemento + "]";
    }

}
