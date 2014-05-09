package br.com.caelum.tdd.exercicio2;

import java.util.Arrays;
import java.util.List;

public class GeradorDeNotaFiscal {

	private final List<AcaoAposGeracaoDaNota> acoes;

	public GeradorDeNotaFiscal(AcaoAposGeracaoDaNota... acoes) {
		this.acoes = Arrays.asList(acoes);
	}
	
	public NotaFiscal gera(Fatura fatura) {
		
		double valor = fatura.getValorMensal();
		
		NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));
		
		executaAcoes(nf);
		
		return nf;
	}

	private double impostoSimplesSobreO(double valor) {
		return valor * 0.06;
	}
	
	private void executaAcoes(NotaFiscal nf){
		for(AcaoAposGeracaoDaNota acao : acoes){
			acao.executa(nf);
		}
	}
}
