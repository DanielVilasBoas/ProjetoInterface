package telaLogin;

import componentes.Componente;
import pessoas.Cliente;
import pessoas.Endereco;
import pessoas.Funcionario;
import pessoas.Pessoa;
import service.ComponenteService;

import java.lang.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.JTextField;
import javax.swing.JComponent;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.lang.Object;
import javax.swing.BoxLayout;
import javax.swing.UIManager;
import javax.swing.JPanel;
import java.awt.Toolkit;
import java.awt.Image;
import java.awt.Color;
import java.awt.AWTException;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.LinkedList;

public class telaLogin  implements ActionListener{

 	JFrame janela;
 	JTextField caixaLogin;
	JTextField caixaComp1;
	JTextField caixaComp2;
	JTextField caixaComp3;
	JTextField caixaComp4;
	JTextField caixaComp5;
	JTextField caixaComp6;
	JTextField caixaComp7;
	JTextField caixaComp8;
	JTextField caixaComp9;
	JTextField caixaComp10;
	JTextField caixaComp11;
	JTextField caixaComp12;
	JTextField caixaComp13;
	JTextField caixaComp14;
	JTextField caixaComp15;
	JTextField caixaComp16;
	JTextField caixaComp17;
	JTextField caixaComp18;
	JTextField caixaComp19;
	JTextField caixaComp20;
	JTextField caixaComp21;
	JTextField caixaComp22;
	JTextField caixaComp23;
	JTextField caixaComp24;
 	JPasswordField caixaSenha;
 	JButton botaoEntrar;
	JButton botaoSair;
	JButton botaoCalcular;
	JButton botaoAjuda;
	String usuario = "5";
	String chave = "5";
	boolean logado = false;
	JPanel superior = new JPanel();
	JPanel central = new JPanel();
	JPanel inferior = new JPanel();
	JPanel inferiorQ = new JPanel();
	JPanel inferiorV = new JPanel();
	
 public telaLogin(){    
	montarJanela();
 }  //Construtor de TelaLogin

 public void montarJanela() {
	 janela = new JFrame("Tela de Login");
 	 janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	 janela.setSize(1366, 768);
 	 janela.setLayout(new BorderLayout());
	 caixaLogin = new JTextField();
 	 caixaSenha = new JPasswordField();
	 caixaComp1 = new JTextField();
	 caixaComp2 = new JTextField();
	 caixaComp3 = new JTextField();
	 caixaComp4 = new JTextField();
	 caixaComp5 = new JTextField();
	 caixaComp6 = new JTextField();
	 caixaComp7 = new JTextField();
	 caixaComp8 = new JTextField();
	 caixaComp9 = new JTextField();
	 caixaComp10 = new JTextField();
	 caixaComp11 = new JTextField();
	 caixaComp12 = new JTextField();
	 caixaComp13 = new JTextField();
	 caixaComp14 = new JTextField();
	 caixaComp15 = new JTextField();
	 caixaComp16 = new JTextField();
	 caixaComp17 = new JTextField();
	 caixaComp18 = new JTextField();
	 caixaComp19 = new JTextField();
	 caixaComp20 = new JTextField();
	 caixaComp21 = new JTextField();
	 caixaComp22 = new JTextField();	
	 caixaComp23 = new JTextField();
	 caixaComp24 = new JTextField();				 
 	 botaoEntrar = new JButton("Entrar");
	 botaoEntrar.addActionListener(this);
	 botaoSair = new JButton("Sair");
	 botaoSair.addActionListener(this);
	 botaoCalcular = new JButton("Calcular");
	 botaoCalcular.addActionListener(this);
	 botaoAjuda = new JButton("Ajuda");
	 botaoAjuda.addActionListener(this);

	

	 //superior Login *********************************************************************
	
	 superior.setLayout(new GridLayout(2,3));
	 superior.add(new JLabel("Login:", new ImageIcon("image/b.png"), SwingConstants.LEFT));
	 superior.add(caixaLogin);
	 superior.add(botaoEntrar);
	 superior.add(new JLabel("Senha:", new ImageIcon("image/a.png"), SwingConstants.LEFT));
	 superior.add(caixaSenha);
	 superior.add(botaoSair);
	 janela.add(superior, BorderLayout.NORTH);

	 //tela central ***********************************************************************
	 //materiais direcionador
	 central.setLayout(new GridLayout(15,4));

	 central.add(new JLabel("Barra de Pinos", SwingConstants.CENTER));
	 central.add(caixaComp1);
	 central.add(new JLabel("Capacitor 100nF", SwingConstants.CENTER));
	 central.add(caixaComp2);
	 central.add(new JLabel("Regulador de Tensão", SwingConstants.CENTER));
	 central.add(caixaComp3);
	 central.add(new JLabel("Microcontrolador ESP8266", SwingConstants.CENTER));
	 central.add(caixaComp4);
	 central.add(new JLabel("LED SMD 0603 AZUL", SwingConstants.CENTER));
	 central.add(caixaComp5);
	 central.add(new JLabel("Placa PCI", SwingConstants.CENTER));
	 central.add(caixaComp6);
	 central.add(new JLabel("Resistor SMD 150R", SwingConstants.CENTER));
	 central.add(caixaComp7);
	 central.add(new JLabel("Resistor SMD 100R", SwingConstants.CENTER));
	 central.add(caixaComp8);
	 central.add(new JLabel("Resistor SMD 330R", SwingConstants.CENTER));
	 central.add(caixaComp10);
	 central.add(new JLabel("Chave HH", SwingConstants.CENTER));
	 central.add(caixaComp11);
	 central.add(new JLabel("Parafuso cabeça cilíndrica M2 x 8", SwingConstants.CENTER));
	 central.add(caixaComp12);
	 central.add(new JLabel("Parafuso escareado phillips M3 x 25", SwingConstants.CENTER));
	 central.add(caixaComp13);
	 central.add(new JLabel("Adesivo", SwingConstants.CENTER));
	 central.add(caixaComp14);


	 //materiais Gerenciador
	 central.add(new JLabel("Conector USB", SwingConstants.CENTER));
	 central.add(caixaComp15);
	 central.add(new JLabel("Capacitor 470nF", SwingConstants.CENTER));
	 central.add(caixaComp16);
	 central.add(new JLabel("Amplificador INA126p", SwingConstants.CENTER));
	 central.add(caixaComp17);
	 //central.add(new JLabel("Regulador de tensão", SwingConstants.CENTER));
	 //central.add(caixaComp17);
	 central.add(new JLabel("Microcontrolador PIC 18F2550", SwingConstants.CENTER));
	 central.add(caixaComp18);
	 central.add(new JLabel("Push button 6x6x9", SwingConstants.CENTER));
	 central.add(caixaComp19);
	 central.add(new JLabel("Resistor SMD 1KR", SwingConstants.CENTER));
	 central.add(caixaComp20);
	 central.add(new JLabel("Resistor SMD 10KR", SwingConstants.CENTER));
	 central.add(caixaComp21);
	 central.add(new JLabel("Gabinete", SwingConstants.CENTER));
	 central.add(caixaComp23);
	 central.add(new JLabel("Raio de bicicleta", SwingConstants.CENTER));
	 central.add(caixaComp24);
	 
	 central.add(botaoCalcular);
	 central.add(botaoAjuda);
	 
	 janela.add(central, BorderLayout.CENTER);

	 //Jpanel inferior Produtos ***********************************************************
	 inferior.setLayout(new GridLayout(3,4));
	 inferior.add(new JLabel("Direcionador", new ImageIcon("image/p1.png"), SwingConstants.LEFT));
	 inferior.add(new JLabel("Gerenciador V1", new ImageIcon("image/p1.png"), SwingConstants.LEFT));
	 inferior.add(new JLabel("Gerenciador V2", new ImageIcon("image/p1.png"), SwingConstants.LEFT));

	 //Jpanel inferior Quantidade
	 inferior.add(new JLabel("Quantidade: "+"num", new ImageIcon("image/p1.png"), SwingConstants.LEFT));
 	 inferior.add(new JLabel("Quantidade: "+" num", new ImageIcon("image/p1.png"), SwingConstants.LEFT));
	 inferior.add(new JLabel("Quantidade: "+"num", new ImageIcon("image/p1.png"), SwingConstants.LEFT));

	 //Jpanel inferior Preço
	 inferior.add(new JLabel("Custo de Produção: "+ "num", new ImageIcon("image/p1.png"), SwingConstants.LEFT));
	 inferior.add(new JLabel("Custo de Produção: "+ "num", new ImageIcon("image/p1.png"), SwingConstants.LEFT));
	 inferior.add(new JLabel("Custo de Produção: "+ "num", new ImageIcon("image/p1.png"), SwingConstants.LEFT));
	 janela.add(inferior, BorderLayout.SOUTH);

	 logged(logado);

}
 
public void exibirFrame() {
 // exibe a janela
 janela.setVisible(true);
 }

 public void esconderFrame() {
 // esconde a janela
 janela.setVisible(false);
 }

 public void logged(boolean logado){
	 if(logado){
			central.setVisible(true);
			inferior.setVisible(true);
			inferiorQ.setVisible(true);
			inferiorV.setVisible(true);
		}
		else{
			central.setVisible(false);
			inferior.setVisible(false);
			inferiorQ.setVisible(false);
			inferiorV.setVisible(false);
	}
}


 @Override
 public void actionPerformed(ActionEvent e) {
 	 // recuperando o login e senha das caixas de texto
	 if (e.getSource() == botaoEntrar) {
	 	String login = caixaLogin.getText();
 	 	String senha = new String(caixaSenha.getPassword());
	 	if(login.equals(usuario) && senha.equals(chave)){
			JOptionPane.showMessageDialog(janela, "Usuario e senha corretos");
			logado = true;
			logged(logado);
		}
 	 	else{
			JOptionPane.showMessageDialog(janela, "Usuario e senha errados");
	 	}
 	 }
 	else if (e.getSource() == botaoSair) {
		logado = false;
		JOptionPane.showMessageDialog(janela, "Você escolheu sair");
		logged(logado);
 	}
	else if (e.getSource() == botaoAjuda){
		//exibe mensagem de ajuda
		JOptionPane.showMessageDialog(janela, "Digite as quantidades e click em Calcular");
 	}
	else if (e.getSource() == botaoCalcular) {
		//salva os valores
		 try {
			 LinkedList<Integer> listaOrdenada = new LinkedList<>();
			 ComponenteService cs = new ComponenteService();

			 String QbarPinos = caixaComp1.getText();
			 String Qcap100nF = caixaComp2.getText();
			 String Qregulador = caixaComp3.getText();
			 String Qesp8266 = caixaComp4.getText();
			 String Qledazul = caixaComp5.getText();
			 String Qpci = caixaComp6.getText();
			 String Qres150R = caixaComp7.getText();
			 String Qres100R = caixaComp8.getText();
			 String Qres330R = caixaComp10.getText();
			 String QchaveHH = caixaComp11.getText();
			 String Qparafcil = caixaComp12.getText();
			 String Qparafesc = caixaComp13.getText();
			 String Qadesivo = caixaComp14.getText();
			 String Qusb = caixaComp15.getText();
			 String Qcap470nF = caixaComp16.getText();
			 String Qamplificador = caixaComp17.getText();
			 String Qpic182550 = caixaComp18.getText();
			 String Qpushbotton = caixaComp19.getText();
			 String Qres1KR = caixaComp20.getText();
			 String Qres10kR = caixaComp21.getText();
			 String Qgabinete = caixaComp23.getText();
			 String QraioBicicleta = caixaComp24.getText();

			 int iQbarPinos = Integer.parseInt(QbarPinos.isEmpty() ? "0" : QbarPinos);
			 listaOrdenada.add(iQbarPinos);
			 int iQcap100nF = Integer.parseInt(Qcap100nF.isEmpty() ? "0" : Qcap100nF);
			 listaOrdenada.add(iQcap100nF);
			 int iQregulador = Integer.parseInt(Qregulador.isEmpty() ? "0" : Qregulador);
			 listaOrdenada.add(iQregulador);
			 int iQledazul = Integer.parseInt(Qledazul.isEmpty() ? "0" : Qledazul);
			 listaOrdenada.add(iQledazul);
			 int iQesp8266 = Integer.parseInt(Qesp8266.isEmpty() ? "0" : Qesp8266);
			 listaOrdenada.add(iQesp8266);
			 int iQpci = Integer.parseInt(Qpci.isEmpty() ? "0" : Qpci);
			 listaOrdenada.add(iQpci);
			 int iQres150R = Integer.parseInt(Qres150R.isEmpty() ? "0" : Qres150R);
			 listaOrdenada.add(iQres150R);
			 int iQres100R = Integer.parseInt(Qres100R.isEmpty() ? "0" : Qres100R);
			 listaOrdenada.add(iQres100R);
			 int iQres330R = Integer.parseInt(Qres330R.isEmpty() ? "0" : Qres330R);
			 listaOrdenada.add(iQres330R);
			 int iQchaveHH = Integer.parseInt(QchaveHH.isEmpty() ? "0" : QchaveHH);
			 listaOrdenada.add(iQchaveHH);
			 int iQparafcil = Integer.parseInt(Qparafcil.isEmpty() ? "0" : Qparafcil);
			 listaOrdenada.add(iQparafcil);
			 int iQparafesc = Integer.parseInt(Qparafesc.isEmpty() ? "0" : Qparafesc);
			 listaOrdenada.add(iQparafesc);
			 int iQadesivo = Integer.parseInt(Qadesivo.isEmpty() ? "0" : Qadesivo);
			 listaOrdenada.add(iQadesivo);
			 int iQusb = Integer.parseInt(Qusb.isEmpty() ? "0" : Qusb);
			 listaOrdenada.add(iQusb);
			 int iQcap470nF = Integer.parseInt(Qcap470nF.isEmpty() ? "0" : Qcap470nF);
			 listaOrdenada.add(iQcap470nF);
			 int iQamplificador = Integer.parseInt(Qamplificador.isEmpty() ? "0" : Qamplificador);
			 listaOrdenada.add(iQamplificador);
			 int iQpic182550 = Integer.parseInt(Qpic182550.isEmpty() ? "0" : Qpic182550);
			 listaOrdenada.add(iQpic182550);
			 int iQpushbotton = Integer.parseInt(Qpushbotton.isEmpty() ? "0" : Qpushbotton);
			 listaOrdenada.add(iQpushbotton);
			 int iQres1KR = Integer.parseInt(Qres1KR.isEmpty() ? "0" : Qres1KR);
			 listaOrdenada.add(iQres1KR);
			 int iQres10kR = Integer.parseInt(Qres10kR.isEmpty() ? "0" : Qres10kR);
			 listaOrdenada.add(iQres10kR);
			 int iQgabinete = Integer.parseInt(Qgabinete.isEmpty() ? "0" : Qgabinete);
			 listaOrdenada.add(iQgabinete);
			 int iQraioBicicleta = Integer.parseInt(QraioBicicleta.isEmpty() ? "0" : QraioBicicleta);
			 listaOrdenada.add(iQraioBicicleta);

			 double resultado = cs.calcularTotal(listaOrdenada);
			 String valorTotal = cs.toString();


			 JOptionPane.showMessageDialog(janela, valorTotal);
		 } catch (RuntimeException error) {
			 JOptionPane.showMessageDialog(null, "Não é possível calcular com String, tente novamente! \n" + error, "Erro", JOptionPane.ERROR_MESSAGE);
		 }

 	}
 }
 }