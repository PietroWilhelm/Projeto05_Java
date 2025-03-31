package br.com.fiap.bean;

public class Arcondicionado {
    public int temperatura;
    public String modo;
//teste
    public void aumentarTemperatura(){
        temperatura++;
    }

    public void diminuirTemperatura(){
        temperatura--;
    }

    public void trocarModo(String novoModo){
        modo = novoModo;
    }
}
