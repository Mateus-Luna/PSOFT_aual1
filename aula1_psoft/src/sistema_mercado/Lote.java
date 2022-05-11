package sistema_mercado;

import java.util.Date;
import java.util.UUID;

public class Lote {
	private String idLote;
	private Produto produto;
	private Long numItens;
	private Date dataFabricacao;
	private Date dataValidade;
	
	public Lote(Produto produto, Long numItens) {
		idLote = UUID.randomUUID().toString();
		this.produto = produto;
		this.numItens = numItens;
	}

	public String getIdLote() {
		return idLote;
	}

	public Produto getProduto() {
		return produto;
	}
	
	public Long getNumItens() {
		return numItens;
	}
	
	public Date getDataFabricacao() {
		return dataFabricacao;
	}
	
	public Date getDataValidade() {
		return dataValidade;
	}
	
	public String toString() {
	return "ID DO LOTE: " + getIdLote() + "\n- PRODUTO: " + getProduto() + "\n QUANTIDADE: " 
	+ getNumItens() + "itens";
	}


}
