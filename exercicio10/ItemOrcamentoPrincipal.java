package exercicio10;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ItemOrcamentoPrincipal extends ItemOrcamentoComplexo{
	
	// Inclusão das cores alternativas
		public static final String ANSI_RESET = "\u001B[0m";
		public static final String ANSI_BLACK = "\u001B[30m";
		public static final String ANSI_RED = "\u001B[31m";
		public static final String ANSI_GREEN = "\u001B[32m";
		public static final String ANSI_YELLOW = "\u001B[33m";
		public static final String ANSI_BLUE = "\u001B[34m";
		public static final String ANSI_PURPLE = "\u001B[35m";
		public static final String ANSI_CYAN = "\u001B[36m";
		public static final String ANSI_WHITE = "\u001B[37m";

		public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
		public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
		public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
		public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
		public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
		public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
		public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
		public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ItemOrcamento detalhe1 = new ItemOrcamento("Capa", 50);
				//System.out.println(detalhe1.getHistorico());
				//System.out.println(detalhe1.getValor());
				ItemOrcamento detalhe2 = new ItemOrcamento("Lacrado", 100);
				//System.out.println(detalhe2.getHistorico());
				//System.out.println(detalhe2.getValor());
				
				ItemOrcamento[] subItem = {detalhe1, detalhe2};
				
				ItemOrcamentoComplexo jogo1 = new ItemOrcamentoComplexo("The Last Of Us", 150, subItem);
				ItemOrcamentoComplexo jogo2 = new ItemOrcamentoComplexo("The Sims", 150, subItem);
				ItemOrcamentoComplexo jogo3 = new ItemOrcamentoComplexo("Yu-Gi-Oh! Link Evolution", 150, subItem);
				//System.out.println(jogo1.getHistorico());
				//System.out.println(jogo1.getValor());
				//Object itemLocalizado = jogo1.localizarItem("Lacrado");
				//if(itemLocalizado == null) {
					//System.out.print(ANSI_RED);
					//System.out.println("O jogo não está disponivel em estoque, por gentileza, aguarde o reabastecimento!");
					//System.out.print(ANSI_RESET);
				//}
				//else {
					//System.out.print(ANSI_BLUE);
					//System.out.println("O jogo está disponivel em estoque!");
					//System.out.print(ANSI_RESET);
				//}
				
				int op = 0, resposta = 0, op2 = 0, op3 = 0, op4 = 0;
				Scanner leia = new Scanner (System.in);
				String nome = null;
				float localize;
				int estoque1 = 0;
				int estoque2 = 0;
				int estoque3 = 0;
				boolean entrega = false;

				nome = JOptionPane.showInputDialog("Qual é o seu nome?");
				resposta = JOptionPane.showConfirmDialog(null, "O seu nome é " + nome +
				 "?");
				if (resposta == JOptionPane.YES_OPTION) {
				// verifica se o usuário clicou no botão YES
				JOptionPane.showMessageDialog(null, "Seja bem vindo " + nome);
				} else {
				JOptionPane.showMessageDialog(null, "Desculpa o equivoco... Seu nome não é " + nome);
				
			}
				System.out.println("          #######   #####    #####    #####               ##     #####                       ##     ##   ##  #######   #####\r\n"
						+ "           ##   #  ##   ##  ##   ##  ##   ##  ##          ##    ##   ##                     ####    ### ###   ##   #  ##   ##\r\n"
						+ " ##   ##   ## #    #        #        #         ##        ##     #                  ### ##  ##  ##   #######   ## #    #\r\n"
						+ " ## # ##   ####     #####    #####    #####     ##               #####            ##  ##   ##  ##   #######   ####     #####\r\n"
						+ " #######   ## #         ##       ##       ##     ##                  ##           ##  ##   ######   ## # ##   ## #         ##\r\n"
						+ " #######   ##   #  ##   ##  ##   ##  ##   ##      ##            ##   ##            #####   ##  ##   ##   ##   ##   #  ##   ##\r\n"
						+ "  ## ##   #######   #####    #####    #####        ##            #####                ##   ##  ##   ##   ##  #######   #####\r\n"
						+ "                                                                                  #####");
				
				ItemOrcamentoComplexo item1 = new ItemOrcamentoComplexo("Sapato", 50, subItem);
				
				do {
				System.out.println("\nSeja bem vinde ao Verificador das lojas Wesss Games, aqui temos os melhores jogos para você!!"
						+ "todos com o preço incrivel de até R$ 150,00!!!");
					System.out.println("Atualmente, em estoque, temos disponivel: ");
					System.out.print(ANSI_CYAN);
					System.out.println("\n1 - The Last of Us");
					System.out.print(ANSI_RESET);
					System.out.print(ANSI_GREEN);
					System.out.println("\n2 - The Sims");
					System.out.print(ANSI_RESET);
					System.out.print(ANSI_YELLOW);
					System.out.println("\n3 - Yu-Gi-Oh! Link Evolution");
					System.out.print(ANSI_RESET);
					System.out.print(ANSI_PURPLE);
					System.out.println("\n0 - Sair");
					System.out.print(ANSI_RESET);
					op = leia.nextInt();
					
				while(op<0 || op>3) {
					System.out.println("\nATENÇÃO, VALOR INCORRETO!");
					System.out.println("Atualmente, em estoque, temos disponivel: ");
					System.out.print(ANSI_CYAN);
					System.out.println("\n1 - The Last of Us");
					System.out.print(ANSI_RESET);
					System.out.print(ANSI_GREEN);
					System.out.println("\n2 - The Sims");
					System.out.print(ANSI_RESET);
					System.out.print(ANSI_YELLOW);
					System.out.println("\n3 - Yu-Gi-Oh! Link Evolution");
					System.out.print(ANSI_RESET);
					op = leia.nextInt();
				}
				switch (op) {
				case 1:
					estoque1 = 20;
					System.out.println("\nUm otimo jogo, qual opção deseja?"
							+ "\n1 - Verificar Valor e Historico"
							+ "\n2 - Verificar Estoque"
							+ "\n3 - Verificar Disponibilidade de entrega"
							+ "\n4 - Todos de uma vez"
							+ "\n0 - Sair");
					op2 = leia.nextInt();
					while(op2<0 || op2>4) {
						System.out.println("\nATENÇÃO OPÇÃO ERRADA!!! Tente Novamente"
								+ "\nUm otimo jogo, qual opção deseja?"
								+ "\n1 - Verificar Valor e Historico"
								+ "\n2 - Verificar Estoque"
								+ "\n3 - Verificar Disponibilidade de entrega"
								+ "\n4 - Todos de uma vez"
								+ "\n0 - Sair");
						op2 = leia.nextInt();
					}
					if (op2 == 1) {
						Object itemLocalizado = jogo1.localizarItem("Lacrado");
						System.out.println("\nPois bem, seque as informações solicitadas: ");
						System.out.println("\nO histórico do jogo é de: ");
						System.out.println(jogo1.getHistorico());
						System.out.println("\nO valor do jogo é de: ");
						System.out.println(jogo1.getValor());				
					}
					if (op2 == 2) {
						Object itemLocalizado = jogo1.localizarItem("Lacrado");
						System.out.println("\nPois bem, seque as informações solicitadas: ");
						System.out.println("\nTemos em estoque: "+estoque1+ " disponivel!");
					}
					if (op2 == 3) {
						Object itemLocalizado = jogo1.localizarItem("Lacrado");
						System.out.println("\nPois bem, seque as informações solicitadas: ");
						entrega = true;
						if(entrega == true) {
							System.out.print(ANSI_BLUE);
							System.out.println("\nO jogo está disponivel para entrega!!!");
							System.out.print(ANSI_RESET);
						}else {
							System.out.print(ANSI_RED);
							System.out.println("\nO jogo não está disponivel para entrega");
							System.out.print(ANSI_RESET);
						}
					}
					if (op2 == 4) {
						Object itemLocalizado = jogo1.localizarItem("Lacrado");
						System.out.println("\nPois bem, seque as informações solicitadas: ");
						System.out.println("\nO histórico do jogo é de: ");
						System.out.println(jogo1.getHistorico());
						System.out.println("\nO valor do jogo é de: ");
						System.out.println(jogo1.getValor());
						System.out.println("\nTemos em estoque: "+estoque1+ " disponivel!");
						entrega = true;
						if(entrega == true) {
							System.out.print(ANSI_BLUE);
							System.out.println("\nO jogo está disponivel para entrega!!!");
							System.out.print(ANSI_RESET);
						}else {
							System.out.print(ANSI_RED);
							System.out.println("\nO jogo não está disponivel para entrega");
							System.out.print(ANSI_RESET);
						}
						
					}
					if (op2 == 0) {
						System.out.println("\nEsperamos que se divirta!!!"
								+ "\nVolte sempre!!!");
						break;
						
					}
					
				break;
				
				case 2:
					estoque2 = 1500;
					System.out.println("\nUm otimo jogo, qual opção deseja?"
							+ "\n1 - Verificar Valor e Historico"
							+ "\n2 - Verificar Estoque"
							+ "\n3 - Verificar Disponibilidade de entrega"
							+ "\n4 - Todos de uma vez"
							+ "\n0 - Sair");
					op3 = leia.nextInt();
					while(op3<0 || op3>4) {
						System.out.println("\nATENÇÃO OPÇÃO ERRADA!!! Tente Novamente"
								+ "\nUm otimo jogo, qual opção deseja?"
								+ "\n1 - Verificar Valor e Historico"
								+ "\n2 - Verificar Estoque"
								+ "\n3 - Verificar Disponibilidade de entrega"
								+ "\n4 - Todos de uma vez"
								+ "\n0 - Sair");
						op3 = leia.nextInt();
					}
					if (op3 == 1) {
						Object itemLocalizado = jogo2.localizarItem("Lacrado");
						System.out.println("\nPois bem, seque as informações solicitadas: ");
						System.out.println("\nO histórico do jogo é de: ");
						System.out.println(jogo2.getHistorico());
						System.out.println("\nO valor do jogo é de: ");
						System.out.println(jogo2.getValor());				
					}
					if (op3 == 2) {
						Object itemLocalizado = jogo2.localizarItem("Lacrado");
						System.out.println("\nPois bem, seque as informações solicitadas: ");
						System.out.println("\nTemos em estoque: "+estoque2+ " disponivel!");
					}
					if (op3 == 3) {
						Object itemLocalizado = jogo2.localizarItem("Lacrado");
						System.out.println("\nPois bem, seque as informações solicitadas: ");
						entrega = false;
						if(entrega == true) {
							System.out.print(ANSI_BLUE);
							System.out.println("\nO jogo está disponivel para entrega!!!");
							System.out.print(ANSI_RESET);
						}else {
							System.out.print(ANSI_RED);
							System.out.println("\nO jogo não está disponivel para entrega");
							System.out.print(ANSI_RESET);
						}
					}
					if (op3 == 4) {
						Object itemLocalizado = jogo2.localizarItem("Lacrado");
						System.out.println("\nPois bem, seque as informações solicitadas: ");
						System.out.println("\nO histórico do jogo é de: ");
						System.out.println(jogo2.getHistorico());
						System.out.println("\nO valor do jogo é de: ");
						System.out.println(jogo2.getValor());
						System.out.println("\nTemos em estoque: "+estoque2+ " disponivel!");
						entrega = false;
						if(entrega == true) {
							System.out.print(ANSI_BLUE);
							System.out.println("\nO jogo está disponivel para entrega!!!");
							System.out.print(ANSI_RESET);
						}else {
							System.out.print(ANSI_RED);
							System.out.println("\nO jogo não está disponivel para entrega");
							System.out.print(ANSI_RESET);
						}
						
					}
					if (op3 == 0) {
						System.out.println("\nEsperamos que se divirta!!!"
								+ "\nVolte sempre!!!");
						break;
						
					}
				break;
				
				case 3:
					estoque3 = 1001;
					System.out.println("\nUm otimo jogo, qual opção deseja?"
							+ "\n1 - Verificar Valor e Historico"
							+ "\n2 - Verificar Estoque"
							+ "\n3 - Verificar Disponibilidade de entrega"
							+ "\n4 - Todos de uma vez"
							+ "\n0 - Sair");
					op4 = leia.nextInt();
					while(op4<0 || op4>4) {
						System.out.println("\nATENÇÃO OPÇÃO ERRADA!!! Tente Novamente"
								+ "\nUm otimo jogo, qual opção deseja?"
								+ "\n1 - Verificar Valor e Historico"
								+ "\n2 - Verificar Estoque"
								+ "\n3 - Verificar Disponibilidade de entrega"
								+ "\n4 - Todos de uma vez"
								+ "\n0 - Sair");
						op4 = leia.nextInt();
					}
					if (op4 == 1) {
						Object itemLocalizado = jogo2.localizarItem("Lacrado");
						System.out.println("\nPois bem, seque as informações solicitadas: ");
						System.out.println("\nO histórico do jogo é de: ");
						System.out.println(jogo3.getHistorico());
						System.out.println("\nO valor do jogo é de: ");
						System.out.println(jogo3.getValor());				
					}
					if (op4 == 2) {
						Object itemLocalizado = jogo2.localizarItem("Lacrado");
						System.out.println("\nPois bem, seque as informações solicitadas: ");
						System.out.println("\nTemos em estoque: "+estoque3+ " disponivel!");
					}
					if (op4 == 3) {
						Object itemLocalizado = jogo2.localizarItem("Lacrado");
						System.out.println("\nPois bem, seque as informações solicitadas: ");
						entrega = true;
						if(entrega == true) {
							System.out.print(ANSI_BLUE);
							System.out.println("\nO jogo está disponivel para entrega!!!");
							System.out.print(ANSI_RESET);
						}else {
							System.out.print(ANSI_RED);
							System.out.println("\nO jogo não está disponivel para entrega");
							System.out.print(ANSI_RESET);
						}
					}
					if (op4 == 4) {
						Object itemLocalizado = jogo2.localizarItem("Lacrado");
						System.out.println("\nPois bem, seque as informações solicitadas: ");
						System.out.println("\nO histórico do jogo é de: ");
						System.out.println(jogo3.getHistorico());
						System.out.println("\nO valor do jogo é de: ");
						System.out.println(jogo3.getValor());
						System.out.println("\nTemos em estoque: "+estoque3+ " disponivel!");
						entrega = false;
						if(entrega == true) {
							System.out.print(ANSI_BLUE);
							System.out.println("\nO jogo está disponivel para entrega!!!");
							System.out.print(ANSI_RESET);
						}else {
							System.out.print(ANSI_RED);
							System.out.println("\nO jogo não está disponivel para entrega");
							System.out.print(ANSI_RESET);
						}
						
					}
					if (op4 == 0) {
						System.out.println("\nEsperamos que se divirta!!!"
								+ "\nVolte sempre!!!");
						break;
						
					}
				break;
				
				}
				}while (op != 0);
				

			}

	}


