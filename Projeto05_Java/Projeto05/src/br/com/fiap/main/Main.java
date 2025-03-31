package br.com.fiap.main;

import br.com.fiap.bean.Arcondicionado;
import br.com.fiap.bean.Televisor;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Televisor tv = new Televisor();
        tv.canal = 5;
        tv.volume = 8;
        tv.trocarCanal(3);
        tv.diminuirVolume();
        tv.diminuirVolume();
        System.out.printf("Teste Televisor\nCanal Atual : %d\n Volume atual: %d ", tv.canal, tv.volume);

        Arcondicionado arcondicionado = new Arcondicionado();
        arcondicionado.modo = "Ventilar";
        arcondicionado.temperatura = 23;
        arcondicionado.trocarModo("Resfriar");
        arcondicionado.diminuirTemperatura();
        arcondicionado.diminuirTemperatura();
        arcondicionado.diminuirTemperatura();
        String mensagem = String.format("\nTeste Arcondicionado\n Modo Atual: %s\n Temperatura Atual: %dºC", arcondicionado.modo, arcondicionado.temperatura);
        System.out.println(mensagem);
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
