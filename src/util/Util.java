package util;

import loja.Loja;
import solicitacao.Solicitacao;

public class Util {
	
	
	
	public Util() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void calculaTotalSemana(Solicitacao solicitacao,Loja loja) {
		if(solicitacao.getTipo().equalsIgnoreCase("premium")) {
			loja.setTotal(loja.getValorDiaSemanaFidelidade()+loja.getTotal());
		}else {
			loja.setTotal(loja.getValorDiaSemanaRegular()+loja.getTotal());
	
		}
	}
	
	public void calculaTotalFinalDeSemana(Solicitacao solicitacao,Loja loja) {
		if(solicitacao.getTipo().equalsIgnoreCase("premium")) {
			loja.setTotal(loja.getValorFimDeSemanaFidelidade()+loja.getTotal());
		}else {
			loja.setTotal(loja.getValorFimDeSemanaRegular()+loja.getTotal());
	
		}
	}
	
	public Loja verificaMenorValor(Loja loja1,Loja loja2,Loja loja3,Integer quantidade) {
		Loja menorValor = loja1;
		
		//levando em consideracao que 1 passageiro serve para carros das 3 lojas, 
			//verifico quais das 3 lojas tem o menor valor para os dias informados.
		
		if(quantidade<=loja2.getLimite()) {
			if(loja2.getTotal()<=loja1.getTotal()) {
				menorValor = loja2;
			}else {
				if(loja3.getTotal()<loja2.getTotal())
					menorValor=loja3;
			}
		}else {
				//levando em consideracao que 4 passageiros servem para carros das 2 lojas(WestCar,NorthCar), 
				//verifico quais das lojas tem o menor valor para os dias informados.
			if(quantidade<=loja1.getLimite()) {
				if(loja3.getTotal()<=loja1.getTotal()) {
					menorValor=loja3;
				}else {
					menorValor=loja1;
				}
			}else
				//se a quantidade for maior que 5 e menor ou igual a 7, a loja escolhida é a NorthCar.
				menorValor=loja3;
		}
		return menorValor;
	}
	
	public void calculaValorDeAcordoComQauntidadeDePassageiros(Solicitacao solicitacao,Loja southCar,Loja westCar,Loja northCar) {
		calculaQtsCarros(solicitacao,southCar);
		calculaQtsCarros(solicitacao,westCar);
		calculaQtsCarros(solicitacao,northCar);
	}
	
	public void calculaQtsCarros(Solicitacao solicitacao,Loja loja) {
		if(Integer.parseInt(solicitacao.getQuantidade().trim())>loja.getLimite()) {
			Integer valor = (int)Math.ceil(Double.parseDouble(solicitacao.getQuantidade().trim())/loja.getLimite());
			loja.setTotal(loja.getTotal()*valor);
		}else {
			loja.setTotal(loja.getTotal()*1);
		}
	}

}
