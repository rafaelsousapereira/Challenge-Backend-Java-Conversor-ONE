package br.com.one.conversor.moeda.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ConversorMenu extends JFrame {
	private static final long serialVersionUID = 1L;

	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem opcaoConversorMoeda;
	private JMenuItem opcaoConversorTemperatura;
	private JMenuItem opcaoSair;
	private String conversorDeMoeda = "Conversor de Moeda";
	private String conversorDeTemperatura = "Conversor de Temperatura";

	public ConversorMenu() {
		setSize(400, 300);
		setTitle("Menu");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// inicializar atributos
		this.menuBar = new JMenuBar();
		this.menu = new JMenu("Escolha uma operação:");
		this.opcaoConversorMoeda = new JMenuItem(this.conversorDeMoeda);
		this.opcaoConversorTemperatura = new JMenuItem(this.conversorDeTemperatura);
		this.opcaoSair = new JMenuItem("Sair");

		// adiciona as itens do menu/opções no menu
		this.menu.add(opcaoConversorMoeda);
		this.menu.add(opcaoConversorTemperatura);
		this.menu.add(opcaoSair);

		// adiociona o menu em menubar
		this.menuBar.add(menu);

		JPanel painel = new JPanel();

		this.exibeMenu();
		painel.add(this.menuBar);
		add(painel);
	}

	private void exibeMenu() {
		this.opcaoConversorMoeda.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String input = JOptionPane.showInputDialog("Insira um valor:");

				/**
				 * TODO: 
				 * 1. Converter a entrada do usuário para valor monetário (Double ou BigInteger);
				 * 2. Fazer a lógica para a conversão das moedas;
				 */
				chamarMenuDeEscolha(input);
			}
		});

		this.opcaoSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Tem certeza que deseja sair?");
				System.exit(0);
			}
		});
	}

	private void chamarMenuDeEscolha(String input) {
		Object[] opcoes = { "De Reais a Dólares", "De Reais a Euros", "De Reais a Libras", "De Dólares a Reais",
				"De Euro a Reais", "De Libras a Reais" };

		JOptionPane.showInputDialog(null, "Escolha a moeda para a qual você deseja girar seu dinheiro:", "Conversão",
				JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
	}
}
