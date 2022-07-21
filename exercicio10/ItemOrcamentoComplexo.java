package exercicio10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.Spring;

public class ItemOrcamentoComplexo extends ItemOrcamento{
	
	private ItemOrcamento[] subItem;
	
	public ItemOrcamentoComplexo() {
		
	}
	
	public ItemOrcamentoComplexo(String hostorico, float valor, ItemOrcamento [] subItem) {
		super(historico, valor);
		this.subItem = subItem;
	}
	
	@Override
	public float getValor() {
		float somaTotal = 0;
		for (int i = 0; i < subItem.length; i++) {
			somaTotal = somaTotal + subItem[i].getValor();
		}
		return somaTotal;
	}
	
	public ItemOrcamento localizarItem(String historico){
		boolean achou = false;
		int j = 0;
		ItemOrcamento resultadoAchou = new ItemOrcamento();
		
		for (j = 0; j <subItem.length; j++) {
			if (subItem[j].getHistorico().equalsIgnoreCase(historico)) {
				achou = true;
				resultadoAchou = subItem[j];
				break;
			}
		}
		return achou ? resultadoAchou : null;
		
	}
	
	/*public ItemOrcamentoComplexo() {
		
	}
	static ArrayList<ItemOrcamento> subItem;
	ArrayList<String> subItems = new ArrayList(10);
	
	public ItemOrcamentoComplexo(String historico, float valor, ArrayList<ItemOrcamento> subItem, ArrayList<String> subItems) {
		super(historico, valor);
		this.subItem = subItem;
		this.subItems = subItems;
	}
	int x = 0;
	int j = 0;
	float somaTotal = 0;
	ItemOrcamento localizador = new ItemOrcamento();
	String localiza = null;
	boolean achou = false;
	
	
	@Override
	public float getValor() {
		for (ItemOrcamento subItem: this.subItem) {
			somaTotal = somaTotal + subItem.getValor();
		}
		
		return somaTotal;
	}
	
	@Override
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	/*public String getVerificar(String verificar) {
		for(x=0;x<10;x++)
		{
			if(subItem[x]==verificador)
			{
				System.out.println("\n ");
				System.out.println("ACHEI!!!");
				System.out.println("\n ");
			}else
			{
				System.out.println("NÃO ACHEI");
			}
		}
		return verificar;
	}*/
		
	//public ItemOrcamento encontrarItem(String historico) {
		//for(ItemOrcamento subItem: this.subItem) {
			//if (historico.equals(subItem.getHistorico())) {
				//localizador = subItem;
			//}
		/*if(historico == item)
		{
			System.out.println("\n ");
			System.out.println("ACHEI!!!");
			System.out.println("\n ");
		}else
		{
			System.out.println("NÃO ACHEI");
		}*/
		//}
	//return localizador;
	
		
	//}
	
	//public ItemOrcamento encontrarItems(String historico) {
		//for (j = 0; j < 10 ; j++) {
			//if (subItem[x] == localiza) {
			//	achou = true;
			//}
		//}
		
		//return localiza;
		
			//}

	/*public ArrayList<ItemOrcamento> getSubItem() {
		return subItem;
	}

	public void setSubItem(ArrayList<ItemOrcamento> subItem) {
		this.subItem = subItem;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public float getSomaTotal() {
		return somaTotal;
	}

	public void setSomaTotal(float somaTotal) {
		this.somaTotal = somaTotal;
	}

	public ItemOrcamento getLocalizador() {
		return localizador;
	}

	public void setLocalizador(ItemOrcamento localizador) {
		this.localizador = localizador;
	}
	
	
*/
}
