package controller;

import componentes.Componente;

import java.util.LinkedList;

public class ComponenteController {

    private LinkedList<Componente> listaComponentes = new LinkedList<>();

    public LinkedList<Componente> popularComponentes() {
        Componente barraPinos = new Componente();
        barraPinos.setNome("Barra pinos");
        barraPinos.setPreco(2.40);
        barraPinos.setDescricao("necessária para a conexão do microcontrolador");

        listaComponentes.add(barraPinos);

        Componente capacitor100nF = new Componente();
        capacitor100nF.setNome("capacitor100nF");
        capacitor100nF.setPreco(0.30);
        capacitor100nF.setDescricao("capacitor de 100nF");

        listaComponentes.add(capacitor100nF);

        Componente reguladorTensao = new Componente();
        reguladorTensao.setNome("reguladorTensao");
        reguladorTensao.setPreco(1.90);
        reguladorTensao.setDescricao("regulador de Tensao");

        listaComponentes.add(reguladorTensao);

        Componente ESP8266 = new Componente();
        ESP8266.setNome("ESP3266");
        ESP8266.setPreco(35);
        ESP8266.setDescricao("microcontrolador ESP3266");

        listaComponentes.add(ESP8266);

        Componente LedAzul = new Componente();
        LedAzul.setNome("LedAzul");
        LedAzul.setPreco(0.20);
        LedAzul.setDescricao("LED SMD 0603 AZUL");

        listaComponentes.add(LedAzul);

        Componente placaPCI = new Componente();
        placaPCI.setNome("placaPCI");
        placaPCI.setPreco(3.50);
        placaPCI.setDescricao("placa de circuito impresso");

        listaComponentes.add(placaPCI);

        Componente resistor150R = new Componente();
        resistor150R.setNome("Resistor150R");
        resistor150R.setPreco(0.05);
        resistor150R.setDescricao("Resistor SMD 150 Ohm");

        listaComponentes.add(resistor150R);

        Componente resistor100R = new Componente();
        resistor100R.setNome("resistor100R");
        resistor100R.setPreco(0.05);
        resistor100R.setDescricao("Resistor SMD 100 Ohm");

        listaComponentes.add(resistor100R);

        Componente resistor330R = new Componente();
        resistor330R.setNome("resistor330R");
        resistor330R.setPreco(0.05);
        resistor330R.setDescricao("Resistor SMD 330 Ohm");

        listaComponentes.add(resistor330R);

        Componente chaveHH = new Componente();
        chaveHH.setNome("chaveHH");
        chaveHH.setPreco(0.60);
        chaveHH.setDescricao("Chave HH");

        listaComponentes.add(chaveHH);

        Componente parafusoM28 = new Componente();
        parafusoM28.setNome("Parafuso M2x8");
        parafusoM28.setPreco(0.20);
        parafusoM28.setDescricao("Parafuso cabeca cilindrica M2x8");

        listaComponentes.add(parafusoM28);

        Componente parafusoM325 = new Componente();
        parafusoM325.setNome("Parafuso M3x25");
        parafusoM325.setPreco(0.25);
        parafusoM325.setDescricao("Parafuso escareado phillips M3x25");

        listaComponentes.add(parafusoM325);

        Componente adesivo = new Componente();
        adesivo.setNome("Adesivo");
        adesivo.setPreco(2.0);
        adesivo.setDescricao("Adesivo único modelo utilizado");

        listaComponentes.add(adesivo);

        Componente capacitor470nF = new Componente();
        capacitor470nF.setNome("capacitor470nF");
        capacitor470nF.setPreco(1.0);
        capacitor470nF.setDescricao("capacitor de 470nF");

        listaComponentes.add(capacitor470nF);

        Componente amplificador = new Componente();
        amplificador.setNome("Amplificador");
        amplificador.setPreco(35.0);
        amplificador.setDescricao("Amplificador INA126p");

        listaComponentes.add(amplificador);

        Componente pushButton = new Componente();
        pushButton.setNome("Push Button");
        pushButton.setPreco(2.0);
        pushButton.setDescricao("Push button 6x6x9");

        listaComponentes.add(pushButton);

        Componente resistor1KR = new Componente();
        resistor1KR.setNome("Resistor1KR");
        resistor1KR.setPreco(0.05);
        resistor1KR.setDescricao("Resistor SMD 1KR Ohm");

        listaComponentes.add(resistor1KR);

        Componente Resistor10KR = new Componente();
        Resistor10KR.setNome("Resistor10KR");
        Resistor10KR.setPreco(0.05);
        Resistor10KR.setDescricao("Resistor SMD 10KR Ohm");

        listaComponentes.add(Resistor10KR);

        Componente raioBicicleta = new Componente();
        raioBicicleta.setNome("raioBicicleta");
        raioBicicleta.setPreco(2.0);
        raioBicicleta.setDescricao("Raio de bicicleta");

        listaComponentes.add(raioBicicleta);

        Componente gabinete = new Componente();
        gabinete.setNome("Gabinete");
        gabinete.setPreco(50.0);
        gabinete.setDescricao("Gabinete");

        listaComponentes.add(gabinete);

        Componente usb = new Componente();
        usb.setNome("Usb");
        usb.setPreco(11.0);
        usb.setDescricao("Conector USB");

        listaComponentes.add(usb);

        Componente PIC18F2550 = new Componente();
        PIC18F2550.setNome("PIC18F2550");
        PIC18F2550.setPreco(160.0);
        PIC18F2550.setDescricao("Microcontrolador PIC18F2550");

        listaComponentes.add(PIC18F2550);

        return listaComponentes;
    }

}
