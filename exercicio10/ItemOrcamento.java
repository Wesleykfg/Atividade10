package exercicio10;

public class ItemOrcamento {
	public static String historico; // histórico do item
	public float valor; //valor do item
	
	public ItemOrcamento(String historico, float valor) {
		this.historico = historico;
		this.valor = valor;
	}

	public ItemOrcamento() {
		// TODO Auto-generated constructor stub
	}

	public String getHistorico() {
		return historico;
	}

	public void setHistorico(String historico) {
		this.historico = historico;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
}
