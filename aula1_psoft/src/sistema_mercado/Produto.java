package sistema_mercado;

import java.util.UUID;

public class Produto {
	private String idProduto;
	private String nomeProduto;
	private String nomeFabricante;

	public Produto(String nomeProduto, String nomeFabricante) {
		idProduto = UUID.randomUUID().toString();
		this.nomeProduto = nomeProduto;
		this.nomeFabricante = nomeFabricante;
	}

	public String getIdProduto() {
		return idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public String getNomeFabricante() {
		return nomeFabricante;
	}
	public String toString() {
		return "PRODUTO : " + getNomeProduto() + "\nID PRODUTO: " + getIdProduto() + "\nFABRICANTE: " + getNomeFabricante();
	}
	
}
